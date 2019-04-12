package org.testing.teststeps;

import static com.jayway.restassured.RestAssured.*;

import java.io.IOException;
import java.util.Properties;

import org.json.simple.parser.ParseException;
import org.testing.utilities.JSONRead;
import org.testing.utilities.Payload;
import org.testing.utilities.PropertiesLoad;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HTTPMethods {


	public Response postRequest(Properties pr) throws IOException, ParseException {

		Payload pload = new Payload();
		pload.setId(6543);
		pload.setAuthor("Shubham123456");
		pload.setTitle("Content Writer");
		
		String jsonReadDataBody = JSONRead.readJSON("./dummy.json");

		Response res = 
				given()
				.contentType(ContentType.JSON)		
				//.body(pload)
				.body(jsonReadDataBody)
				
				.when()
				.post(pr.getProperty("qa_uri"));
		return res;		
	}

	public Response getRequest(Properties pr, String id) {

		Response res = 
				given()
				.contentType(ContentType.JSON)		

				.when()
				.get(pr.getProperty("qa_uri")+id);
		return res;		
	}
	
	public Response deleteRequest(Properties pr, String id) {

		Response res = 
				given()
				.contentType(ContentType.JSON)		

				.when()
				.delete(pr.getProperty("qa_uri")+id);
		return res;		
	}

}
