package restassuredtestcases;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class qwe {
	@Test
	public void testPostRegisterSuccessfull() {
		baseURI = "https://reqres.in/api";
		JSONObject requestData1 = new JSONObject();
		requestData1.put("email", "eve.holt@reqres.in");
		requestData1.put("password", "pistol");
		System.out.println(requestData1.toJSONString());
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
	     .accept(ContentType.JSON)
	     .body(requestData1.toJSONString())
	     .when()
	     .post("/register")
	     .then()
	     .statusCode(200)
	     .log().all();
	}

}
