package restassuredtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Newclass {
	@Test
	void testGetUsersList() {
		
		Response rsp = RestAssured.get("https://reqres.in/api/users/2");
		
		//validating status code
				System.out.println(rsp.getStatusCode());
				Assert.assertEquals(rsp.getStatusCode(), 200);
				
				//getting response body
				System.out.println(rsp.getBody().asString());
				System.out.println("The response body is : /n " +  rsp.body().asString());
				
				//response time
				System.out.println("The response time is : " +  rsp.getTime());
				
				//get header
				System.out.println("Content type header is : " + rsp.header("content-type"));
				System.out.println("Response headres are : " + rsp.headers());
				
				//get session id
				System.out.println(rsp.getSessionId());

}
}