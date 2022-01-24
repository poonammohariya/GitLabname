package restassuredtestcases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequest {
//	{
//	    "name": "John",
//	    "job": "teacher"
//	}
//	uri= /api/users

	@Test
	public void testPostCreateuser() {
		
	 baseURI = "https://reqres.in/api";
     JSONObject reqData = new JSONObject();
     reqData.put("name", "John");
     reqData.put("job", "teacher");
     
     System.out.println(reqData.toJSONString());
     given()
     .header("Content-Type","application/json")
     .header("Connection","keep-alive")
     .contentType(ContentType.JSON)
     .accept(ContentType.JSON)
     .body(reqData.toJSONString())
     .when()
     .post("/users")
     .then()
     .statusCode(201)
     //.log().body();
     .log().all();
}
}