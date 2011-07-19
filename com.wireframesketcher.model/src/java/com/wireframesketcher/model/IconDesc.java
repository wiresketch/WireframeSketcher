package com.wireframesketcher.model;

public final class IconDesc {
	private final String name;

	private final IconSize size;

	public IconDesc(String name, IconSize size) {
		if (name == null)
			throw new NullPointerException("name");
		if (size == null)
			throw new NullPointerException("size");

		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public IconSize getSize() {
		return size;
	}

	public IconDesc resize(IconSize newSize) {
		if(size == newSize)
			return this;
		
		return new IconDesc(name, newSize);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (!(obj instanceof IconDesc))
			return false;

		final IconDesc other = (IconDesc) obj;

		return name.equals(other.name) && size == other.size;
	}

	public int hashCode() {
		return name.hashCode() * 37 + size.getValue();
	}

	public String toString() {
		return name + " (" + size.getLiteral() + ")";
	}

	public static IconDesc createFromString(String s) {
		if (s == null || s.length() == 0)
			return null;

		int openParenIdx = s.indexOf('(');

		if (openParenIdx == -1)
			return new IconDesc(s.trim(), IconSize.SMALL_LITERAL);

		String name = s.substring(0, openParenIdx).trim();
		int closeParenIdx = s.indexOf(')', openParenIdx + 1);
		String sizeLiteral;

		if (closeParenIdx == -1)
			sizeLiteral = s.substring(openParenIdx + 1).trim();
		else
			sizeLiteral = s.substring(openParenIdx + 1, closeParenIdx).trim();

		IconSize size = IconSize.get(sizeLiteral);
		if (size == null)
			size = IconSize.SMALL_LITERAL;

		return new IconDesc(name, size);
	}
}