package ApiGET_TestCases_Ques9;

import static io.restassured.RestAssured.given;

import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;
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

public class QuestionNine {

	ResponseSpecification respSpecification;
	RequestSpecification reqSpecification;
	
	String str="";
	
	
	@BeforeClass
	public void setSpecification() {
		respSpecification = RestAssured.expect();

		respSpecification.statusLine("HTTP/1.1 200 OK");

		respSpecification.contentType(ContentType.JSON);
		ExtRepManager.createReport("API Report");

		
	}
	
	
	@Test(priority = 1)
	public void getValidBanner() {
		ExtRepManager.startTest("TestCase_getBanner");
		RestAssured.baseURI = "https://arcadia.pisystindia.com/";

		ExtRepManager.extTest.log(LogStatus.INFO, "Base url used:", RestAssured.baseURI);
		ExtRepManager.extTest.log(LogStatus.INFO, "Header used:", "Authorization:" + str);
		ExtRepManager.extTest.log(LogStatus.INFO, "Endpoint used:", "api/getBanner");
		ExtRepManager.extTest.log(LogStatus.INFO, "Expected content type:", ContentType.JSON.toString());

		Response resp = given().header("Authorization", str).when().get("api/getBanner").then()
				.contentType(ContentType.JSON).extract().response();
		ExtRepManager.extTest.log(LogStatus.INFO, "Expected output:", resp.asPrettyString());
		ExtRepManager.extTest.log(LogStatus.INFO, "Response time:", resp.getTimeIn(TimeUnit.SECONDS) + "");

		JSONObject obj = new JSONObject(resp.body().asPrettyString());
		JSONArray arr = obj.getJSONArray("payload");

		if (arr.length() == 3) {
			ExtRepManager.extTest.log(LogStatus.PASS, "Expected banners:3", "actual banner:" + arr.length());

		} else {
			ExtRepManager.extTest.log(LogStatus.FAIL, "Expected banners:3", "actual banner:" + arr.length());

		}

		System.out.println("GetBanner output:" + resp.body().asPrettyString());
	}
	@Test(priority = 2)
	public void getFAQ() {
		ExtRepManager.startTest("TestCase_getFAQ");
		RestAssured.baseURI = "https://arcadia.pisystindia.com/";

		ExtRepManager.extTest.log(LogStatus.INFO, "Base url used:", RestAssured.baseURI);
		ExtRepManager.extTest.log(LogStatus.INFO, "Header used:", "Authorization:" + str);
		ExtRepManager.extTest.log(LogStatus.INFO, "Endpoint used:", "api/getFAQ");
		ExtRepManager.extTest.log(LogStatus.INFO, "Expected content type:", ContentType.JSON.toString());

		Response resp = given().header("Authorization", str).when().get("api/getFAQ").then()
				.contentType(ContentType.JSON).extract().response();
		ExtRepManager.extTest.log(LogStatus.INFO, "Expected output:", resp.asPrettyString());
		ExtRepManager.extTest.log(LogStatus.INFO, "Response time:", resp.getTimeIn(TimeUnit.SECONDS) + "");

		JSONObject obj = new JSONObject(resp.body().asPrettyString());
		JSONArray arr = obj.getJSONArray("payload");

		if (arr.length() == 3) {
			ExtRepManager.extTest.log(LogStatus.PASS, "Expected banners:3", "actual banner:" + arr.length());

		} else {
			ExtRepManager.extTest.log(LogStatus.FAIL, "Expected banners:3", "actual banner:" + arr.length());

		}

		System.out.println("GetFAQ output:" + resp.body().asPrettyString());
	}

	@AfterMethod
	public void tearDown() {
		ExtRepManager.extReport.endTest(ExtRepManager.extTest);
	}

	@AfterClass
	public void closeReport() {
		ExtRepManager.extReport.flush();
	}
}
