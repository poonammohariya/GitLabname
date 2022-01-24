package restassuredtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {
	
	@Test
	void testGetUsersList() {
		
		System.out.println("******* Test 1 **********");
		
		Response rsp = RestAssured.get("https://reqres.in/api/users?page=2");
		
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
	@Test
	void testGetUserDetails() {
		 System.out.println("******** 2 ********");
		 
		 String userid = "2";
		 Response rsp = RestAssured.get("https://reqres.in/api/users/"+userid);
		 
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
