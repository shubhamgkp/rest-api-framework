package org.testing.teststeps;

import static com.jayway.restassured.RestAssured.*;

import java.util.Properties;

import org.testing.utilities.Payload;
import org.testing.utilities.PropertiesLoad;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HTTPMethods {
	
	
	public Response postRequest(Properties pr) {
		
		Payload pload = new Payload();
		pload.setId(1234);
		pload.setAuthor("Shubham");
		pload.setTitle("Content Writer");
		
		Response res = 
		given()
		.contentType(ContentType.JSON)		
		.body(pload)
		
		.when()
		.post(pr.getProperty("qa_uri"));
		return res;		
	}

}
