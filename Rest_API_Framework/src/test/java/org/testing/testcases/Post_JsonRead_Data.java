package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.json.simple.parser.ParseException;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JSONRead;
import org.testing.utilities.PropertiesLoad;
import org.testing.utilities.ResponseValidation;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class Post_JsonRead_Data {

	@Test
	public void postDataOfJsonRead() throws IOException, ParseException {

		Properties prop = PropertiesLoad.propLoad();
		HTTPMethods httpMet = new HTTPMethods();
		Response res = httpMet.postRequest(prop);
		ResponseValidation resVal = new ResponseValidation(res);
		resVal.responseValidate(201, "application/json; charset=utf-8");

		System.out.println(res.asString()); System.out.println(res.getStatusCode());
		System.out.println(res.getContentType());
	}
}
