package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class JSONRead {
	
	public static String readJSON(String path) throws IOException, ParseException {

		JSONParser jsonparser = new JSONParser(); 
		File file = new File(path);
		FileReader fr = new FileReader(file);
		JSONObject jsonObj=(JSONObject) jsonparser.parse(fr);
		
		return jsonObj.toString();		 
	} 
}
