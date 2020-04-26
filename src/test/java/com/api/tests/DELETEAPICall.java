package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DELETEAPICall {

	@Test(priority = 1)
	public void deleteUserWithDELETEAPI() {
		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request = RestAssured.given().log().all();
		request.header("Authorization", "Bearer icxlWeVs-S3N_Xs2jWHkiMrDH6gD-j6TBpSC");
		Response response = request.delete("/public-api/users/789");

		System.out.println(response.prettyPrint());

		Assert.assertEquals(response.getStatusCode(), 200);

	}
}
