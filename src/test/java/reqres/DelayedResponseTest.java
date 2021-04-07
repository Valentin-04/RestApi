package reqres;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DelayedResponseTest {

    @Test
    public void delayedResponse() {
        given().
                header("Content-Type", "application/json").
        when().
                get("https://reqres.in/api/users?delay=3").
        then().
                log().all().
                statusCode(200).
                body("data[0].email", equalTo("george.bluth@reqres.in"),
                        "data[3].email", equalTo("eve.holt@reqres.in"));
    }
}
