package reqres;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PutUpdateTest {

    @Test
    public void putUpdate() {
        given().
                header("Content-Type", "application/json").
                body("{\"name\": \"morpheus\",\"job\": \"zion resident\"}").
        when().
                put("https://reqres.in/api/users/2").
        then().
                log().all().
                statusCode(200).
                body("name", equalTo("morpheus"),
                        "job", equalTo("zion resident"));
    }
}
