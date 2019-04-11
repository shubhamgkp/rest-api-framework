package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class XMLToJSON {

	public static JSONObject xmlToJsonConversion(String xml) {
		
		JSONObject js=XML.toJSONObject(xml);
		return js;
		
	}
}
