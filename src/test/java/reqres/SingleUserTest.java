package reqres;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class SingleUserTest {

    @Test
    public void getSingleUser() {
        given().
                header("Content-Type", "application/json").
        when().
                get("https://reqres.in/api/users/2").
        then().
                log().all().
                statusCode(200).
                body("data.email", equalTo("janet.weaver@reqres.in"));
    }
}
