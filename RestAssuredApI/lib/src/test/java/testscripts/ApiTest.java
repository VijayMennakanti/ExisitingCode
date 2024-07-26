package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;

public class ApiTest {

	@Test
	public void getUserPageTwo() {

		Response response = given().when().get("https://reqres.in/api/users?page=2");

		int actualStaus = response.statusCode();

		Assert.assertEquals(actualStaus, 200);

	}
	@Test
	public void getSingleUser() {
		
		
		Response response = given().when().get("https://reqres.in/api/users/2");
		
		ResponseBody responseBody = response.getBody();
	String actualResponseBody = responseBody.asString();
	
	Assert.assertTrue(actualResponseBody.contains("Janet"));
		
	}

}
