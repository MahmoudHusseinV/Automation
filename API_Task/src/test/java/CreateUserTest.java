import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateUserTest {
    @Test
    public void postRequest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";
        Response response = given()
                .body(ReUsableMethods.UserBody())
                .when()
                .post().then().extract().response();


        Assert.assertEquals(201, response.getStatusCode());
        Assert.assertEquals("101", response.getBody().jsonPath().getString("id"));
    }
}
