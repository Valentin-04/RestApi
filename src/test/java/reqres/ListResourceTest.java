package reqres;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ListResourceTest {

    @Test
    public void getListResource() {
        given().
                header("Content-Type", "application/json").
        when().
                get("https://reqres.in/api/unknown").
        then().
                log().all().
                statusCode(200).
                body("data[0].name", equalTo("cerulean"),
                        "data[4].name", equalTo("tigerlily"));
    }
}
