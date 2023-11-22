package org.login;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample {
	
	public static void main(String[] args) {
		/*RestAssured.baseURI="https://reqres.in/";
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.queryParam("page", "2");
		
		Response response = requestSpecification.request(Method.GET,"/api/users");
		
		System.out.println(response.statusCode());
		System.out.println(response.getBody().asPrettyString());*/


		/*RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification requestSpecification = RestAssured.given();
		
		JSONObject js = new JSONObject();
		js.put("name", "morpheus");
		js.put("job", "leader");
		requestSpecification.body(js.toJSONString());
		Response response = requestSpecification.request(Method.POST,"/api/users");
		
		int statusCode = response.statusCode();
		String asPrettyString = response.getBody().asPrettyString();
		
		System.out.println(statusCode);
		System.out.println(asPrettyString);*/
		
		
		
		
		RestAssured.baseURI="https://reqres.in/";
		 RequestSpecification requestSpecification = RestAssured.given();
		 
		 requestSpecification.pathParam("name", "2");
		 
		 JSONObject js = new JSONObject();
		 js.put("name", "morpheus");
		 js.put("job", "zion resident");
		 requestSpecification.body(js.toJSONString());
		 
		 Response response = requestSpecification.request(Method.PUT,"api/users/{name}");
		 
		 System.out.println(response.statusCode());
		 System.out.println(response.getBody().asPrettyString());
		  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		//https://petstore.swagger.io/v2/pet
		
	
		 
		 
		 
		
		
		
		 
	}	
}
