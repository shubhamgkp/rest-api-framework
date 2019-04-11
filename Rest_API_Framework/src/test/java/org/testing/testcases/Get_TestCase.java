package org.testing.testcases;

import static com.jayway.restassured.RestAssured.given;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Get_TestCase {

	@Test
	public void secondTestCase() throws IOException {
		
		Properties prop = PropertiesLoad.propLoad();
		HTTPMethods httpMet = new HTTPMethods();
		Post_TestCase tc1 = new Post_TestCase();
		
		Post_TestCase postObj = new Post_TestCase();
		String getId=postObj.firstTestCase();
		Response res = httpMet.getRequest(prop,getId);
		System.out.println(res.asString());		
	}
}
