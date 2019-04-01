package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;
import org.testing.utilities.ResponseValidation;

import com.jayway.restassured.response.Response;

public class TC_001 {

	public void firstTestCase() throws IOException {
		
		Properties prop = PropertiesLoad.propLoad();
		HTTPMethods httpMet = new HTTPMethods();
		Response res = httpMet.postRequest(prop);
		ResponseValidation resVal = new ResponseValidation(res);
		resVal.responseValidate(201, "application/json; charset=utf-8");
		
	}
}
