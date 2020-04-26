package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTAPICall {

	@Test(priority=1)
	public void tokenPostAPI() {

		RestAssured.baseURI = "https://gorest.co.in/";
		RequestSpecification request = RestAssured.given().log().all();
		request.header("Authorization", "Bearer icxlWeVs-S3N_Xs2jWHkiMrDH6gD-j6TBpSC");

		String payload = "{\"first_name\" : \"Raju67\",\"last_name\" : \"Ravi89\",\"gender\" : \"male\",\"dob\" : \"1991-06-07\",\"email\" : \"Raj85@gmail.com\"}";

		request.contentType("application/json");
		request.body(payload);
		Response response = request.post("public-api/users");
		System.out.println(response.asString());
		System.out.println(response.prettyPrint());
		
		System.out.println(response.getStatusCode());

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 201);

		String server = response.getHeader("Server");

		Assert.assertEquals(server, "nginx");
	}
	

}
