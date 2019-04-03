package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class Delete_TestCase {

	@Test
	public void thirdTestCase() throws IOException {

		Properties prop = PropertiesLoad.propLoad();
		HTTPMethods httpMet = new HTTPMethods();				
		Response res = httpMet.deleteRequest(prop,"98766789");
		System.out.println(res.asString());
	}			
}
