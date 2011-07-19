package com.wireframesketcher.model;

import java.util.HashMap;
import java.util.Map;

public final class ColorDesc {
	public final static ColorDesc white = new ColorDesc(255, 255, 255, "white");
	public final static ColorDesc lightGray = new ColorDesc(192, 192, 192,
			"lightGray");
	public final static ColorDesc gray = new ColorDesc(128, 128, 128, "gray");
	public final static ColorDesc darkGray = new ColorDesc(64, 64, 64,
			"darkGray");
	public final static ColorDesc black = new ColorDesc(0, 0, 0, "black");
	public final static ColorDesc red = new ColorDesc(255, 0, 0, "red");
	public final static ColorDesc orange = new ColorDesc(255, 196, 0, "orange");
	public final static ColorDesc yellow = new ColorDesc(255, 255, 0, "yellow");
	public final static ColorDesc green = new ColorDesc(0, 255, 0, "green");
	public final static ColorDesc lightGreen = new ColorDesc(96, 255, 96,
			"lightGreen");
	public final static ColorDesc darkGreen = new ColorDesc(0, 127, 0,
			"darkGreen");
	public final static ColorDesc cyan = new ColorDesc(0, 255, 255, "cyan");
	public final static ColorDesc lightBlue = new ColorDesc(127, 127, 255,
			"lightBlue");
	public final static ColorDesc blue = new ColorDesc(0, 0, 255, "blue");
	public final static ColorDesc darkBlue = new ColorDesc(0, 0, 127,
			"darkBlue");

	public static final Map<String, ColorDesc> namedColors = new HashMap<String, ColorDesc>();

	static {
		registerNamedColor(white);
		registerNamedColor(lightGray);
		registerNamedColor(gray);
		registerNamedColor(darkGray);
		registerNamedColor(black);
		registerNamedColor(red);
		registerNamedColor(orange);
		registerNamedColor(yellow);
		registerNamedColor(green);
		registerNamedColor(lightGreen);
		registerNamedColor(darkGreen);
		registerNamedColor(cyan);
		registerNamedColor(lightBlue);
		registerNamedColor(blue);
		registerNamedColor(darkBlue);
	}

	private static final void registerNamedColor(ColorDesc color) {
		namedColors.put(color.toString().toLowerCase(), color);
	}

	private final String name;

	private final int r, g, b;

	public ColorDesc(int r, int g, int b) {
		this(r, g, b, null);
	}

	public ColorDesc(int r, int g, int b, String name) {
		this.r = r;
		this.g = g;
		this.b = b;
		this.name = name;
	}

	public int getRed() {
		return r;
	}

	public int getGreen() {
		return g;
	}

	public int getBlue() {
		return b;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (!(obj instanceof ColorDesc))
			return false;

		final ColorDesc other = (ColorDesc) obj;

		return r == other.r && g == other.g && b == other.b;
	}

	public int hashCode() {
		return (r * 37 + g) * 37 + b;
	}

	public String toString() {
		if (name != null)
			return name;

		String hex = Integer.toHexString((r << 16) | (g << 8) | b)
				.toLowerCase();
		if (hex.length() > 6)
			hex = hex.substring(hex.length() - 6);
		else if (hex.length() < 6)
			hex = "000000".substring(0, 6 - hex.length()) + hex;

		return "#" + hex;
	}

	/**
	 * Parses a color string. Handles the following formats:
	 * <ul>
	 * <li>#AAAAAA
	 * <li>#AAA
	 * <li>red, blue, ...
	 * 
	 * @param s
	 *            the color string
	 * @return the color or <tt>null</tt> if color could not be parsed
	 */
	public static ColorDesc createFromString(String s) {
		if (s == null)
			return null;

		s = s.trim();

		if (s.length() == 0)
			return null;

		s = s.toLowerCase();

		ColorDesc color;

		if (s.startsWith("#")) {
			color = createFromHexString(s.substring(1));
		} else {
			color = createFromColorName(s);
			if (color == null)
				color = createFromHexString(s);
		}

		return color;
	}

	private static ColorDesc createFromColorName(String s) {
		return namedColors.get(s);
	}

	private static ColorDesc createFromHexString(String s) {
		int hex;
		try {
			hex = Integer.parseInt(s, 16);
		} catch (NumberFormatException e) {
			return null;
		}

		if (s.length() == 3) {
			int r = ((hex >> 8) & 0xF) | ((hex >> 4) & 0xF0);
			int g = ((hex >> 4) & 0xF) | (hex & 0xF0);
			int b = (hex & 0xF) | ((hex << 4) & 0xF0);
			return new ColorDesc(r, g, b);
		} else if (s.length() == 6) {
			int r = (hex >> 16) & 0xFF;
			int g = (hex >> 8) & 0xFF;
			int b = (hex) & 0xFF;
			return new ColorDesc(r, g, b);
		}

		return null;
	}
}
