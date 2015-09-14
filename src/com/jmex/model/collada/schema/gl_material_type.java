/**
 * gl_material_type.java
 *
 * This file was generated by XMLSpy 2007sp2 Enterprise Edition.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the XMLSpy Documentation for further details.
 * http://www.altova.com/xmlspy
 */


package com.jmex.model.collada.schema;

import com.jmex.xml.types.SchemaString;

public class gl_material_type extends SchemaString {
	public static final int EEMISSION = 0; /* EMISSION */
	public static final int EAMBIENT = 1; /* AMBIENT */
	public static final int EDIFFUSE = 2; /* DIFFUSE */
	public static final int ESPECULAR = 3; /* SPECULAR */
	public static final int EAMBIENT_AND_DIFFUSE = 4; /* AMBIENT_AND_DIFFUSE */

	public static String[] sEnumValues = {
		"EMISSION",
		"AMBIENT",
		"DIFFUSE",
		"SPECULAR",
		"AMBIENT_AND_DIFFUSE",
	};

	public gl_material_type() {
		super();
	}

	public gl_material_type(String newValue) {
		super(newValue);
		validate();
	}

	public gl_material_type(SchemaString newValue) {
		super(newValue);
		validate();
	}

	public static int getEnumerationCount() {
		return sEnumValues.length;
	}

	public static String getEnumerationValue(int index) {
		return sEnumValues[index];
	}

	public static boolean isValidEnumerationValue(String val) {
		for (int i = 0; i < sEnumValues.length; i++) {
			if (val.equals(sEnumValues[i]))
				return true;
		}
		return false;
	}

	public void validate() {

		if (!isValidEnumerationValue(toString()))
			throw new com.jmex.xml.xml.XmlException("Value of gl_material_type is invalid.");
	}
}
