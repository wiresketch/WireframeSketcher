package com.wireframesketcher.model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * A LineHeight represents a line height specified either in ems, pixels or
 * percents.
 * <p>
 * Line height objects are immutable.
 */
public final class LineHeight {
	private static final int NORMAL_VALUE = -1;

	private static final String NORMAL_VALUE_STRING = "normal";

	/**
	 * Normal value
	 */
	public static final LineHeight NORMAL = new LineHeight(NORMAL_VALUE,
			Unit.EM);

	private static final NumberFormat EM_FORMAT;

	static {
		DecimalFormat format = (DecimalFormat) DecimalFormat
				.getNumberInstance();
		format.setMinimumFractionDigits(1);
		format.setMaximumFractionDigits(2);
		format.setDecimalSeparatorAlwaysShown(true);
		DecimalFormatSymbols symbols = format.getDecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		format.setDecimalFormatSymbols(symbols);
		EM_FORMAT = format;
	}

	/**
	 * Enumeration for line height units
	 */
	public enum Unit {
		/**
		 * Pixels unit
		 */
		PIXELS("px"),
		/**
		 * Percents unit
		 */
		PERCENTS("%"),
		/**
		 * Em unit
		 */
		EM("em");

		static Unit[] ALL = new Unit[] { PIXELS, PERCENTS, EM };

		private final String suffix;

		private Unit(String suffix) {
			if (suffix == null)
				throw new NullPointerException();
			this.suffix = suffix;
		}
	}

	private final int value;

	private final Unit unit;

	private LineHeight(int value, Unit unit) {
		if (unit == null)
			throw new NullPointerException();

		this.value = value;
		this.unit = unit;
	}

	public boolean isNormal() {
		return value == NORMAL_VALUE;
	}

	/**
	 * Returns the value. The value should be interpreted using
	 * {@link #getUnit()} value.
	 * 
	 * @return the value
	 * @see #getUnit()
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Returns the unit
	 * 
	 * @return the unit
	 */
	public Unit getUnit() {
		return unit;
	}

	@Override
	public String toString() {
		return toString(null);
	}

	/**
	 * Converts this line height to string, optionally omitting the unit suffix.
	 * 
	 * @param defaultUnit
	 *            the default unit for which the suffix should be omitted.
	 * @return the string
	 */
	public String toString(Unit defaultUnit) {
		if (defaultUnit == unit || isNormal())
			return convertValueToString();
		else
			return convertValueToString() + unit.suffix;
	}

	private String convertValueToString() {
		if(isNormal())
			return NORMAL_VALUE_STRING;
		
		if (unit == Unit.EM)
			return EM_FORMAT.format(((double) value) / 100);
		else
			return Integer.toString(value);
	}

	/**
	 * Parses a line height from string. Units default to em if no explicit unit
	 * is specified.
	 * 
	 * @param s
	 *            a string
	 * @return parsed font size. Can be <code>null</code>.
	 * @throws NumberFormatException
	 *             if value could not be parsed
	 */
	public static LineHeight createFromString(String s)
			throws NumberFormatException {
		return createFromString(s, Unit.EM);
	}

	/**
	 * Parses a line height from string.
	 * 
	 * @param s
	 *            a string
	 * @param defaultUnit
	 *            unit to default to if no explicit unit is specified
	 * @return parsed line height. Can be <code>null</code>.
	 * @throws NumberFormatException
	 *             if value could not be parsed
	 */
	public static LineHeight createFromString(String s, Unit defaultUnit)
			throws NumberFormatException {
		if (s == null)
			return null;

		s = s.trim();

		if (s.length() == 0)
			return null;

		if (NORMAL_VALUE_STRING.equals(s))
			return NORMAL;

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
			if (unit == Unit.EM) {
				size = (int) Math.round(Double.parseDouble(s) * 100);
			} else {
				size = Integer.parseInt(s);
			}
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Invalid line height format: " + s);
		}

		return new LineHeight(size, unit);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof LineHeight))
			return false;

		LineHeight other = (LineHeight) obj;
		return value == other.value && unit == other.unit;
	}

	@Override
	public int hashCode() {
		return value * 37 + unit.hashCode();
	}

	/**
	 * Helper factory method that creates line height with pixel unit
	 * 
	 * @param height
	 *            line height in pixels
	 * @return line height value
	 */
	public static LineHeight inPixels(int height) {
		return new LineHeight(height, Unit.PIXELS);
	}

	/**
	 * Helper factory method that creates line height with percent unit
	 * 
	 * @param height
	 *            line height in percents
	 * @return line height value
	 */
	public static LineHeight inPercents(int height) {
		return new LineHeight(height, Unit.PERCENTS);
	}

	/**
	 * Helper factory method that creates line height with em unit
	 * 
	 * @param height
	 *            line height in em
	 * @return line height value
	 */
	public static LineHeight inEm(double height) {
		return new LineHeight((int) Math.round(height * 100), Unit.EM);
	}

	/**
	 * Converts this line height to pixels by taking font size in account
	 * 
	 * @param fontSize
	 *            the font size that must be specified in pixels
	 * @return line height in pixels
	 */
	public int toIntPixels(int fontSize) {
		if(isNormal())
			throw new IllegalStateException();
		
		if (unit == Unit.PIXELS)
			return value;

		return (fontSize * value) / 100;
	}

	/**
	 * Converts this line height to em units
	 * 
	 * @return line height in em
	 */
	public LineHeight toEm() {
		if(isNormal())
			return this;
		if (unit == Unit.PIXELS)
			throw new IllegalStateException();
		if (unit == Unit.EM)
			return this;
		return new LineHeight(value, Unit.EM);
	}
}
