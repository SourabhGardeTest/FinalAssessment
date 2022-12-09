package ApiPOST_TestCases_Ques10;

import static io.restassured.RestAssured.given;

import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtRepManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class QuestionTen {

	ResponseSpecification respSpecification;
	RequestSpecification reqSpecification;
	
	JSONObject jsonObj1;
	String str=" ";
	
	
	@BeforeClass
	public void setSpecification() {
		respSpecification = RestAssured.expect();

		respSpecification.statusLine("HTTP/1.1 200 OK");

		respSpecification.contentType(ContentType.JSON);
		//ExtRepManager.createReport("API Report");

		InputStream data = null;
		try {
			String fnm = "Data10/QuesTenApi.json";
			data = getClass().getClassLoader().getResourceAsStream(fnm);
			JSONTokener tokener = new JSONTokener(data);
			jsonObj1 = new JSONObject(tokener);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 1)
	public void Valid_loginuser() {
		//ExtRepManager.startTest("TestCase_login");
		HashMap<String, String> params = new HashMap<String, String>();
		String nmValue = jsonObj1.getJSONObject("Valid").getString("username");
		String passValue = jsonObj1.getJSONObject("Valid").getString("password");
		System.out.println(nmValue);
		params.put("username", nmValue);
		params.put("password", passValue);
		RestAssured.baseURI = "https://arcadia.pisystindia.com/";
		/*
		 * ExtRepManager.extTest.log(LogStatus.INFO, "Base url used:",
		 * RestAssured.baseURI); ExtRepManager.extTest.log(LogStatus.INFO,
		 * "Header used:", "Authorization:" + str);
		 * ExtRepManager.extTest.log(LogStatus.INFO, "Endpoint used:", "api/login");
		 * ExtRepManager.extTest.log(LogStatus.INFO, "Expected content type:",
		 * ContentType.JSON.toString());
		 */
		Response resp = given().when().contentType("application/json").body(params).post("api/login").then().contentType(ContentType.JSON).extract().response();
		System.out.println("op is" + resp.asPrettyString());
		LinkedHashMap<String, Object> payload = resp.body().jsonPath().get("payload");

		System.out.println(payload.toString());

	}

	@Test(priority = 2)
	public void blank() {
		//ExtRepManager.startTest("TestCase_login");
		HashMap<String, String> params = new HashMap<String, String>();

		String nmValue = jsonObj1.getJSONObject("blank").getString("username");

		String passValue = jsonObj1.getJSONObject("blank").getString("password");
		System.out.println(nmValue);
		params.put("username", nmValue);
		params.put("password", passValue);
		RestAssured.baseURI = "https://arcadia.pisystindia.com/";
		/*
		 * ExtRepManager.extTest.log(LogStatus.INFO, "Base url used:",
		 * RestAssured.baseURI); ExtRepManager.extTest.log(LogStatus.INFO,
		 * "Header used:", "Authorization:" + str);
		 * ExtRepManager.extTest.log(LogStatus.INFO, "Endpoint used:", "api/login");
		 * ExtRepManager.extTest.log(LogStatus.INFO, "Expected content type:",
		 * ContentType.JSON.toString());
		 */
		Response resp = given().when().contentType("application/json").body(params).post("api/login").then().contentType(ContentType.JSON).extract().response();
		System.out.println("op is" + resp.asPrettyString());
		LinkedHashMap<String, Object> payload = resp.body().jsonPath().get("payload");

		System.out.println(payload.toString());

	}



	@AfterMethod
	public void tearDown() {
		//ExtRepManager.extReport.endTest(ExtRepManager.extTest);
	}

	@AfterClass
	public void closeReport() {
		//ExtRepManager.extReport.flush();
	}
}
