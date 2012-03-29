package com.wireframesketcher.model;

/**
 * A FontSize represents font sizes that are specified either in pixels or in
 * points. A point is 1/72nd of an inch.
 * <p>
 * Font sizes should be generally specified in pixels to ensure cross-platform
 * compatibility. Font sizes can also be specified in points for backward
 * compatibility. When specified in points the font size will be converted to
 * pixels relative to current screen density.
 * <p>
 * Font sizes are immutable.
 */
public final class FontSize {
	/**
	 * Enumeration for font size units
	 */
	public enum Unit {
		/**
		 * Pixels unit
		 */
		PIXELS("px"),
		/**
		 * Points unit
		 */
		POINTS("pt");

		static Unit[] ALL = new Unit[] { PIXELS, POINTS };

		private final String suffix;

		private Unit(String suffix) {
			if (suffix == null)
				throw new NullPointerException();
			this.suffix = suffix;
		}
	}

	private final int size;

	private final Unit unit;

	private FontSize(int size, Unit unit) {
		if (unit == null)
			throw new NullPointerException();

		this.size = size;
		this.unit = unit;
	}

	/**
	 * Returns the size. The size should be interpreted using {@link #getUnit()}
	 * value.
	 * 
	 * @return the size
	 * @see #getUnit()
	 */
	public int getSize() {
		return size;
	}

	public Unit getUnit() {
		return unit;
	}

	@Override
	public String toString() {
		return Integer.toString(size) + unit.suffix;
	}

	/**
	 * Converts this font size to string, optionally omitting the unit suffix.
	 * 
	 * @param defaultUnit
	 *            the default unit for which the suffix should be omitted.
	 * @return the string
	 */
	public String toString(Unit defaultUnit) {
		if (defaultUnit == unit)
			return Integer.toString(size);
		else
			return Integer.toString(size) + unit.suffix;
	}

	/**
	 * Parses a font size from string. Units default to points if no explicit
	 * unit is specified.
	 * 
	 * @param s
	 *            a string
	 * @return parsed font size. Can be <code>null</code>.
	 * @throws NumberFormatException
	 *             if value could not be parsed
	 */
	public static FontSize createFromString(String s)
			throws NumberFormatException {
		// Default to points to keep backward compatibility
		// With no-unit font sizes
		return createFromString(s, Unit.POINTS);
	}

	/**
	 * Parses a font size from string.
	 * 
	 * @param s
	 *            a string
	 * @param defaultUnit
	 *            unit to default to if no explicit unit is specified
	 * @return parsed font size. Can be <code>null</code>.
	 * @throws NumberFormatException
	 *             if value could not be parsed
	 */
	public static FontSize createFromString(String s, Unit defaultUnit)
			throws NumberFormatException {
		if (s == null)
			return null;

		s = s.trim();

		if (s.length() == 0)
			return null;

		Unit unit = defaultUnit;

		Unit[] units = Unit.ALL;

		for (int i = 0; i < units.length; i++) {
			Unit u = units[i];

			if (s.endsWith(u.suffix)) {
				unit = u;
				s = s.substring(0, s.length() - u.suffix.length());
				break;
			}
		}

		int size;
		try {
			size = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Invalid font size format: " + s);
		}

		return new FontSize(size, unit);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof FontSize))
			return false;

		FontSize other = (FontSize) obj;
		return size == other.size && unit == other.unit;
	}

	@Override
	public int hashCode() {
		return size * 37 + unit.hashCode();
	}

	/**
	 * Helper factory method that creates font sizes with pixel unit
	 * 
	 * @param size
	 *            font size in pixels
	 * @return font size value
	 */
	public static FontSize inPixels(int size) {
		return new FontSize(size, Unit.PIXELS);
	}

	/**
	 * Helper factory method that creates font sizes with points unit
	 * 
	 * @param size
	 *            font size in points
	 * @return font size value
	 */
	public static FontSize inPoints(int size) {
		return new FontSize(size, Unit.POINTS);
	}

	/**
	 * Converts this font size to points
	 * 
	 * @param dpi
	 *            vertical dots per inch screen density
	 * @return points
	 */
	public int toIntPoints(int dpi) {
		if (unit == Unit.POINTS || dpi == 72)
			return size;

		return (int) Math.round((size * 72.0f) / dpi);
	}

	/**
	 * Converts this font size to points
	 * 
	 * @param dpi
	 *            vertical dots per inch screen density
	 * @return font size in points
	 */
	public FontSize toPoints(int dpi) {
		if (unit == Unit.POINTS)
			return this;

		return inPoints(toIntPoints(dpi));
	}

	/**
	 * Converts this font size to pixels
	 * 
	 * @param dpi
	 *            vertical dots per inch screen density
	 * @return pixels
	 */
	public int toIntPixels(int dpi) {
		if (unit == Unit.PIXELS || dpi == 72)
			return size;

		return (int) Math.round((size * dpi) / 72.0f);
	}

	/**
	 * Converts this font size to pixels
	 * 
	 * @param dpi
	 *            vertical dots per inch screen density
	 * @return font size in pixels
	 */
	public FontSize toPixels(int dpi) {
		if (unit == Unit.PIXELS)
			return this;

		return inPixels(toIntPixels(dpi));
	}

	/**
	 * Returns a new font size value obtained by changing the size of this font
	 * size. The same unit is preserved.
	 * 
	 * @param newSize
	 *            new size
	 * @return new font size
	 */
	public FontSize toSize(int newSize) {
		if (newSize == size)
			return this;

		return new FontSize(newSize, unit);
	}
}
