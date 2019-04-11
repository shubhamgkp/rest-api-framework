package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class JSONToXML {

	public static String jsonToXmlConversion(String json) {
		
		JSONObject js = new JSONObject(json);
		String str = XML.toString(js);
		return str;
	}
}
