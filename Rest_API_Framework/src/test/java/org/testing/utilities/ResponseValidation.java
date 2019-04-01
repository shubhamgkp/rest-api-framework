package org.testing.utilities;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseValidation {
	
	Response res;
	public ResponseValidation(Response res) {
		
		this.res=res;
	}

	public void responseValidate(int expectedStatusCode, String expectedContentType) {
		
		int actualStatusCode=res.statusCode();
		String actualContentType = res.contentType();
		Assert.assertEquals(actualStatusCode, expectedStatusCode);
		Assert.assertEquals(actualContentType, expectedContentType);
	}
	
	public String responseParse(String jsonpath) {
		
		return res.jsonPath().getString(jsonpath);
	}
}
