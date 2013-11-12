package com.wireframesketcher.model;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/**
 * Version descriptor
 */
public class VersionDesc implements Comparable<VersionDesc> {
	public static final VersionDesc NO_VERSION = new VersionDesc(0, 0, 0);

	private static final String SEPARATOR = ".";

	private final int major, minor, micro;
	private final String qualifier;

	public VersionDesc(int major, int minor, int micro) {
		this(major, minor, micro, null);
	}

	public VersionDesc(int major, int minor, int micro, String qualifier) {
		if (qualifier == null)
			qualifier = "";

		this.major = major;
		this.minor = minor;
		this.micro = micro;
		this.qualifier = qualifier;
	}

	/**
	 * Parses version string
	 * 
	 * @param version
	 *            version string
	 * @return {@link #NO_VERSION} if <code>null</code> version, or parsed
	 *         version
	 * @throws IllegalArgumentException
	 *             if a parsing error occurs
	 */
	public static VersionDesc parseVersion(String version)
			throws IllegalArgumentException {
		if (version == null || version.length() == 0)
			return NO_VERSION;

		int major = 0;
		int minor = 0;
		int micro = 0;
		String qualifier = "";

		try {
			StringTokenizer st = new StringTokenizer(version, SEPARATOR);
			major = Integer.parseInt(st.nextToken());

			if (st.hasMoreTokens()) {
				minor = Integer.parseInt(st.nextToken());

				if (st.hasMoreTokens()) {
					micro = Integer.parseInt(st.nextToken());

					if (st.hasMoreTokens()) {
						qualifier = st.nextToken();
					}
				}
			}
		} catch (NoSuchElementException e) {
			throw new IllegalArgumentException("Invalid version: " + version);
		}

		return new VersionDesc(major, minor, micro, qualifier);
	}

	public int getMajor() {
		return major;
	}

	public int getMinor() {
		return minor;
	}

	public int getMicro() {
		return micro;
	}

	public String getQualifier() {
		return qualifier;
	}

	public String toString() {
		StringBuffer buf = new StringBuffer(20 + qualifier.length());
		buf.append(major);
		buf.append(SEPARATOR);
		buf.append(minor);
		buf.append(SEPARATOR);
		buf.append(micro);
		if (qualifier.length() > 0) {
			buf.append(SEPARATOR);
			buf.append(qualifier);
		}
		return buf.toString();
	}

	public int hashCode() {
		return (major << 24) + (minor << 16) + (micro << 8)
				+ qualifier.hashCode();
	}

	public boolean equals(Object object) {
		if (object == this)
			return true;

		if (!(object instanceof VersionDesc))
			return false;

		VersionDesc other = (VersionDesc) object;
		return (major == other.major) && (minor == other.minor)
				&& (micro == other.micro) && qualifier.equals(other.qualifier);
	}

	public int compareTo(VersionDesc other) {
		int result = major - other.major;
		if (result == 0) {
			result = minor - other.minor;
			if (result == 0) {
				result = micro - other.micro;
				if (result == 0)
					result = qualifier.compareTo(other.qualifier);
			}
		}

		return result;
	}
}
