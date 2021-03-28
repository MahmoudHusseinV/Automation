import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUserByID {

        @Test
        public void GetUserID ()

        {
            RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";

            Response response =
                    given().when().get("/35").then().extract().response();


            Assert.assertEquals(200, response.getStatusCode());
            Assert.assertEquals("35", response.getBody().jsonPath().getString("id"));
            Assert.assertEquals("4", response.getBody().jsonPath().getString("userId"));
            Assert.assertEquals(StringUtils.normalizeSpace("id nihil consequatur molestias animi provident"),
                    StringUtils.normalizeSpace(response.getBody().jsonPath().getString("title")));
            Assert.assertEquals(StringUtils.normalizeSpace("nisi error delectus possimus ut eligendi vitae placeat eos harum cupiditate facilis reprehenderit voluptatem beatae modi ducimus quo illum voluptas eligendi et nobis quia fugit")
                    , StringUtils.normalizeSpace(response.getBody().jsonPath().getString("body")));



    }



}
