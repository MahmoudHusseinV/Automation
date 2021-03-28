import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetAllPostsTest {
@Test
        public void GetAllRecordsResponse ()

        {
            RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";

            String response =
                    given().when().get().then().log().all().assertThat().statusCode(200).extract().response()
                            .asString();

            JsonPath js = ReUsableMethods.rawToJson(response);
            System.out.println(response);

                int Count = js.get("data.size()");
                Assert.assertEquals(Count, 100);
            }

        }


