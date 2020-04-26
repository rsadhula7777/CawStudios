package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETAPITestCAW {

	@Test(priority=1)
	public void getUsersAPITestPositiveScenerio() {

		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request = RestAssured.given().log().all();

		request.header("Authorization", "Bearer icxlWeVs-S3N_Xs2jWHkiMrDH6gD-j6TBpSC");

		Response response = request.get("/public-api/users");

		// System.out.println(response);

		System.out.println(response.asString());
		System.out.println(response.prettyPrint());

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);

		String server = response.getHeader("Server");

		Assert.assertEquals(server, "nginx");

	}
	
	@Test(priority=2)
	public void getUsersAPITestNegativeScenerio() {

		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request = RestAssured.given().log().all();

		request.header("Authorization", "Bearer icxlWeVs-S3N_Xs2jWHkiMrDH6gD-j6TBpSC");

		Response response = request.get("/public-api/users");

		// System.out.println(response);

		System.out.println(response.asString());
		System.out.println(response.prettyPrint());

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 201);

		String server = response.getHeader("Server");

		Assert.assertEquals(server, "nginx");

	}

	

}
