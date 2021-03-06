package jsonHelper;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static io.restassured.RestAssured.given;

public interface ReadJson {


    default int responseCode(String currentUrl) {
        RestAssured.baseURI = currentUrl;
        RequestSpecification req = (RequestSpecification) RestAssured.given();
        Response response = req.given().contentType(ContentType.JSON)
                .when().get()
                .then().extract().response();
        return response.statusCode();
    }

    default void getJson(String URL) {
        RestAssured.baseURI = URL;
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then().contentType(ContentType.JSON)
                .extract().response();

        String json = new Gson().toJson((Map) response.jsonPath().get());

        JSONObject jsonObject = new JSONObject(json);
        JSONObject data = jsonObject.getJSONObject("data");
        JSONArray jsonArray = data.getJSONArray("content");
        JSONObject array1 = jsonArray.getJSONObject(0);
        int id = array1.getInt("id");
        System.out.println(id);
    }


    default void readBody(String currentUrl) throws IOException, InterruptedException {

        String responseURL = currentUrl;



        RestAssured.baseURI = "https://gatewaydev.onee.com/message-services/send-sms";
        RequestSpecification req = (RequestSpecification) RestAssured.given();
        Response response = req.given().contentType(ContentType.JSON)
                .when().get()
                .then().extract().response();
        ArrayList data = response.jsonPath().getJsonObject("data");
        System.out.println(data);

        String[] arrOfStr = data.get(0).toString().split(" ");
        System.out.println(arrOfStr[0]);
        System.out.println("Response Body is =>  " + data.get(0));

//        System.out.println("Response Body length =>  " + data);
    }
}
