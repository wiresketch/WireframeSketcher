package com.wireframesketcher.model;

import java.util.HashMap;
import java.util.Map;

public final class ColorDesc {
	public final static ColorDesc white;
	public final static ColorDesc lightGray;
	public final static ColorDesc gray;
	public final static ColorDesc darkGray;
	public final static ColorDesc black;
	public final static ColorDesc red;
	public final static ColorDesc orange;
	public final static ColorDesc yellow;
	public final static ColorDesc green;
	public final static ColorDesc lightGreen;
	public final static ColorDesc darkGreen;
	public final static ColorDesc cyan;
	public final static ColorDesc lightBlue;
	public final static ColorDesc blue;
	public final static ColorDesc darkBlue;

	public static final Map<String, ColorDesc> namedColors = new HashMap<String, ColorDesc>();

	static {
		registerNamedColor(black = new ColorDesc(0x00, 0x00, 0x00, "black"));
		registerNamedColor(new ColorDesc(0x00, 0x00, 0x80, "navy"));
		registerNamedColor(darkBlue = new ColorDesc(0x00, 0x00, 0x8B,
				"darkBlue"));
		registerNamedColor(new ColorDesc(0x00, 0x00, 0xCD, "mediumBlue"));
		registerNamedColor(blue = new ColorDesc(0x00, 0x00, 0xFF, "blue"));
		registerNamedColor(darkGreen = new ColorDesc(0x00, 0x64, 0x00,
				"darkGreen"));
		registerNamedColor(green = new ColorDesc(0x00, 0x80, 0x00, "green"));
		registerNamedColor(new ColorDesc(0x00, 0x80, 0x80, "teal"));
		registerNamedColor(new ColorDesc(0x00, 0x8B, 0x8B, "darkCyan"));
		registerNamedColor(new ColorDesc(0x00, 0xBF, 0xFF, "deepSkyBlue"));
		registerNamedColor(new ColorDesc(0x00, 0xCE, 0xD1, "darkTurquoise"));
		registerNamedColor(new ColorDesc(0x00, 0xFA, 0x9A, "mediumSpringGreen"));
		registerNamedColor(new ColorDesc(0x00, 0xFF, 0x00, "lime"));
		registerNamedColor(new ColorDesc(0x00, 0xFF, 0x7F, "springGreen"));
		registerNamedColor(new ColorDesc(0x00, 0xFF, 0xFF, "aqua"));
		registerNamedColor(cyan = new ColorDesc(0x00, 0xFF, 0xFF, "cyan"));
		registerNamedColor(new ColorDesc(0x19, 0x19, 0x70, "midnightBlue"));
		registerNamedColor(new ColorDesc(0x1E, 0x90, 0xFF, "dodgerBlue"));
		registerNamedColor(new ColorDesc(0x20, 0xB2, 0xAA, "lightSeaGreen"));
		registerNamedColor(new ColorDesc(0x22, 0x8B, 0x22, "forestGreen"));
		registerNamedColor(new ColorDesc(0x2E, 0x8B, 0x57, "seaGreen"));
		registerNamedColor(new ColorDesc(0x2F, 0x4F, 0x4F, "darkSlateGray"));
		registerNamedColor(new ColorDesc(0x32, 0xCD, 0x32, "limeGreen"));
		registerNamedColor(new ColorDesc(0x3C, 0xB3, 0x71, "mediumSeaGreen"));
		registerNamedColor(new ColorDesc(0x40, 0xE0, 0xD0, "turquoise"));
		registerNamedColor(new ColorDesc(0x41, 0x69, 0xE1, "royalBlue"));
		registerNamedColor(new ColorDesc(0x46, 0x82, 0xB4, "steelBlue"));
		registerNamedColor(new ColorDesc(0x48, 0x3D, 0x8B, "darkSlateBlue"));
		registerNamedColor(new ColorDesc(0x48, 0xD1, 0xCC, "mediumTurquoise"));
		registerNamedColor(new ColorDesc(0x4B, 0x00, 0x82, "indigo"));
		registerNamedColor(new ColorDesc(0x55, 0x6B, 0x2F, "darkOliveGreen"));
		registerNamedColor(new ColorDesc(0x5F, 0x9E, 0xA0, "cadetBlue"));
		registerNamedColor(new ColorDesc(0x64, 0x95, 0xED, "cornflowerBlue"));
		registerNamedColor(new ColorDesc(0x66, 0xCD, 0xAA, "mediumAquaMarine"));
		registerNamedColor(new ColorDesc(0x69, 0x69, 0x69, "dimGray"));
		registerNamedColor(new ColorDesc(0x69, 0x69, 0x69, "dimGrey"));
		registerNamedColor(new ColorDesc(0x6A, 0x5A, 0xCD, "slateBlue"));
		registerNamedColor(new ColorDesc(0x6B, 0x8E, 0x23, "oliveDrab"));
		registerNamedColor(new ColorDesc(0x70, 0x80, 0x90, "slateGray"));
		registerNamedColor(new ColorDesc(0x77, 0x88, 0x99, "lightSlateGray"));
		registerNamedColor(new ColorDesc(0x7B, 0x68, 0xEE, "mediumSlateBlue"));
		registerNamedColor(new ColorDesc(0x7C, 0xFC, 0x00, "lawnGreen"));
		registerNamedColor(new ColorDesc(0x7F, 0xFF, 0x00, "chartreuse"));
		registerNamedColor(new ColorDesc(0x7F, 0xFF, 0xD4, "aquamarine"));
		registerNamedColor(new ColorDesc(0x80, 0x00, 0x00, "maroon"));
		registerNamedColor(new ColorDesc(0x80, 0x00, 0x80, "purple"));
		registerNamedColor(new ColorDesc(0x80, 0x80, 0x00, "olive"));
		registerNamedColor(gray = new ColorDesc(0x80, 0x80, 0x80, "gray"));
		registerNamedColor(new ColorDesc(0x87, 0xCE, 0xEB, "skyBlue"));
		registerNamedColor(new ColorDesc(0x87, 0xCE, 0xFA, "lightSkyBlue"));
		registerNamedColor(new ColorDesc(0x8A, 0x2B, 0xE2, "blueViolet"));
		registerNamedColor(new ColorDesc(0x8B, 0x00, 0x00, "darkRed"));
		registerNamedColor(new ColorDesc(0x8B, 0x00, 0x8B, "darkMagenta"));
		registerNamedColor(new ColorDesc(0x8B, 0x45, 0x13, "saddleBrown"));
		registerNamedColor(new ColorDesc(0x8F, 0xBC, 0x8F, "darkSeaGreen"));
		registerNamedColor(lightGreen = new ColorDesc(0x90, 0xEE, 0x90,
				"lightGreen"));
		registerNamedColor(new ColorDesc(0x93, 0x70, 0xDB, "mediumPurple"));
		registerNamedColor(new ColorDesc(0x94, 0x00, 0xD3, "darkViolet"));
		registerNamedColor(new ColorDesc(0x98, 0xFB, 0x98, "paleGreen"));
		registerNamedColor(new ColorDesc(0x99, 0x32, 0xCC, "darkOrchid"));
		registerNamedColor(new ColorDesc(0x9A, 0xCD, 0x32, "yellowGreen"));
		registerNamedColor(new ColorDesc(0xA0, 0x52, 0x2D, "sienna"));
		registerNamedColor(new ColorDesc(0xA5, 0x2A, 0x2A, "brown"));
		registerNamedColor(darkGray = new ColorDesc(0xA9, 0xA9, 0xA9,
				"darkGray"));
		registerNamedColor(lightBlue = new ColorDesc(0xAD, 0xD8, 0xE6,
				"lightBlue"));
		registerNamedColor(new ColorDesc(0xAD, 0xFF, 0x2F, "greenYellow"));
		registerNamedColor(new ColorDesc(0xAF, 0xEE, 0xEE, "paleTurquoise"));
		registerNamedColor(new ColorDesc(0xB0, 0xC4, 0xDE, "lightSteelBlue"));
		registerNamedColor(new ColorDesc(0xB0, 0xE0, 0xE6, "powderBlue"));
		registerNamedColor(new ColorDesc(0xB2, 0x22, 0x22, "fireBrick"));
		registerNamedColor(new ColorDesc(0xB8, 0x86, 0x0B, "darkGoldenRod"));
		registerNamedColor(new ColorDesc(0xBA, 0x55, 0xD3, "mediumOrchid"));
		registerNamedColor(new ColorDesc(0xBC, 0x8F, 0x8F, "rosyBrown"));
		registerNamedColor(new ColorDesc(0xBD, 0xB7, 0x6B, "darkKhaki"));
		registerNamedColor(new ColorDesc(0xC0, 0xC0, 0xC0, "silver"));
		registerNamedColor(new ColorDesc(0xC7, 0x15, 0x85, "mediumVioletRed"));
		registerNamedColor(new ColorDesc(0xCD, 0x5C, 0x5C, "indianRed"));
		registerNamedColor(new ColorDesc(0xCD, 0x85, 0x3F, "peru"));
		registerNamedColor(new ColorDesc(0xD2, 0x69, 0x1E, "chocolate"));
		registerNamedColor(new ColorDesc(0xD2, 0xB4, 0x8C, "tan"));
		registerNamedColor(lightGray = new ColorDesc(0xD3, 0xD3, 0xD3,
				"lightGray"));
		registerNamedColor(new ColorDesc(0xD8, 0xBF, 0xD8, "thistle"));
		registerNamedColor(new ColorDesc(0xDA, 0x70, 0xD6, "orchid"));
		registerNamedColor(new ColorDesc(0xDA, 0xA5, 0x20, "goldenRod"));
		registerNamedColor(new ColorDesc(0xDB, 0x70, 0x93, "paleVioletRed"));
		registerNamedColor(new ColorDesc(0xDC, 0x14, 0x3C, "crimson"));
		registerNamedColor(new ColorDesc(0xDC, 0xDC, 0xDC, "gainsboro"));
		registerNamedColor(new ColorDesc(0xDD, 0xA0, 0xDD, "plum"));
		registerNamedColor(new ColorDesc(0xDE, 0xB8, 0x87, "burlyWood"));
		registerNamedColor(new ColorDesc(0xE0, 0xFF, 0xFF, "lightCyan"));
		registerNamedColor(new ColorDesc(0xE6, 0xE6, 0xFA, "lavender"));
		registerNamedColor(new ColorDesc(0xE9, 0x96, 0x7A, "darkSalmon"));
		registerNamedColor(new ColorDesc(0xEE, 0x82, 0xEE, "violet"));
		registerNamedColor(new ColorDesc(0xEE, 0xE8, 0xAA, "paleGoldenRod"));
		registerNamedColor(new ColorDesc(0xF0, 0x80, 0x80, "lightCoral"));
		registerNamedColor(new ColorDesc(0xF0, 0xE6, 0x8C, "khaki"));
		registerNamedColor(new ColorDesc(0xF0, 0xF8, 0xFF, "aliceBlue"));
		registerNamedColor(new ColorDesc(0xF0, 0xFF, 0xF0, "honeyDew"));
		registerNamedColor(new ColorDesc(0xF0, 0xFF, 0xFF, "azure"));
		registerNamedColor(new ColorDesc(0xF4, 0xA4, 0x60, "sandyBrown"));
		registerNamedColor(new ColorDesc(0xF5, 0xDE, 0xB3, "wheat"));
		registerNamedColor(new ColorDesc(0xF5, 0xF5, 0xDC, "beige"));
		registerNamedColor(new ColorDesc(0xF5, 0xF5, 0xF5, "whiteSmoke"));
		registerNamedColor(new ColorDesc(0xF5, 0xFF, 0xFA, "mintCream"));
		registerNamedColor(new ColorDesc(0xF8, 0xF8, 0xFF, "ghostWhite"));
		registerNamedColor(new ColorDesc(0xFA, 0x80, 0x72, "salmon"));
		registerNamedColor(new ColorDesc(0xFA, 0xEB, 0xD7, "antiqueWhite"));
		registerNamedColor(new ColorDesc(0xFA, 0xF0, 0xE6, "linen"));
		registerNamedColor(new ColorDesc(0xFA, 0xFA, 0xD2,
				"lightGoldenRodYellow"));
		registerNamedColor(new ColorDesc(0xFD, 0xF5, 0xE6, "oldLace"));
		registerNamedColor(red = new ColorDesc(0xFF, 0x00, 0x00, "red"));
		registerNamedColor(new ColorDesc(0xFF, 0x00, 0xFF, "fuchsia"));
		registerNamedColor(new ColorDesc(0xFF, 0x00, 0xFF, "magenta"));
		registerNamedColor(new ColorDesc(0xFF, 0x14, 0x93, "deepPink"));
		registerNamedColor(new ColorDesc(0xFF, 0x45, 0x00, "orangeRed"));
		registerNamedColor(new ColorDesc(0xFF, 0x63, 0x47, "tomato"));
		registerNamedColor(new ColorDesc(0xFF, 0x69, 0xB4, "hotPink"));
		registerNamedColor(new ColorDesc(0xFF, 0x7F, 0x50, "coral"));
		registerNamedColor(new ColorDesc(0xFF, 0x8C, 0x00, "darkorange"));
		registerNamedColor(new ColorDesc(0xFF, 0xA0, 0x7A, "lightSalmon"));
		registerNamedColor(orange = new ColorDesc(0xFF, 0xA5, 0x00, "orange"));
		registerNamedColor(new ColorDesc(0xFF, 0xB6, 0xC1, "lightPink"));
		registerNamedColor(new ColorDesc(0xFF, 0xC0, 0xCB, "pink"));
		registerNamedColor(new ColorDesc(0xFF, 0xD7, 0x00, "gold"));
		registerNamedColor(new ColorDesc(0xFF, 0xDA, 0xB9, "peachPuff"));
		registerNamedColor(new ColorDesc(0xFF, 0xDE, 0xAD, "navajoWhite"));
		registerNamedColor(new ColorDesc(0xFF, 0xE4, 0xB5, "moccasin"));
		registerNamedColor(new ColorDesc(0xFF, 0xE4, 0xC4, "bisque"));
		registerNamedColor(new ColorDesc(0xFF, 0xE4, 0xE1, "mistyRose"));
		registerNamedColor(new ColorDesc(0xFF, 0xEB, 0xCD, "blanchedAlmond"));
		registerNamedColor(new ColorDesc(0xFF, 0xEF, 0xD5, "papayaWhip"));
		registerNamedColor(new ColorDesc(0xFF, 0xF0, 0xF5, "lavenderBlush"));
		registerNamedColor(new ColorDesc(0xFF, 0xF5, 0xEE, "seaShell"));
		registerNamedColor(new ColorDesc(0xFF, 0xF8, 0xDC, "cornsilk"));
		registerNamedColor(new ColorDesc(0xFF, 0xFA, 0xCD, "lemonChiffon"));
		registerNamedColor(new ColorDesc(0xFF, 0xFA, 0xF0, "floralWhite"));
		registerNamedColor(new ColorDesc(0xFF, 0xFA, 0xFA, "snow"));
		registerNamedColor(yellow = new ColorDesc(0xFF, 0xFF, 0x00, "yellow"));
		registerNamedColor(new ColorDesc(0xFF, 0xFF, 0xE0, "lightYellow"));
		registerNamedColor(new ColorDesc(0xFF, 0xFF, 0xF0, "ivory"));
		registerNamedColor(white = new ColorDesc(0xFF, 0xFF, 0xFF, "white"));
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
