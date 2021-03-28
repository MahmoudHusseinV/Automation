
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import io.restassured.RestAssured;

import java.util.HashMap;
import java.util.Map;

public class ReUsableMethods {

    public static final String body="";
    public static final String title="";
    public static final String userId="";

    public static JsonPath rawToJson(String response) {

        JsonPath js1 = new JsonPath(response);

        return js1;
    }

    public static JSONObject UserBody() {

        JSONObject Bodyrequest = new JSONObject();
        Bodyrequest.put(title, "foo");
        Bodyrequest.put(body, "bar");
        Bodyrequest.put(userId, 2);
       return Bodyrequest;
    }
}
