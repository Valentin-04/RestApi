package reqres;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CreateTest {

    @Test
    public void create() {
        given().
                header("Content-Type", "application/json").
                body("{\"name\": \"morpheus\",\"job\": \"leader\"}").
        when().
                post("https://reqres.in/api/users").
        then().
                log().all().
                statusCode(201).
                body("name", equalTo("morpheus"),
                        "job", equalTo("leader"));
    }
}
