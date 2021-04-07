package reqres;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class SingleResourceTest {

    @Test
    public void getSingleResource() {
        given().
                header("Content-Type", "application/json").
        when().
                get("https://reqres.in/api/unknown/2").
        then().
                log().all().
                statusCode(200).
                body("data.name", equalTo("fuchsia rose"));
    }
}
