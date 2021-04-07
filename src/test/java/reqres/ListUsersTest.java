package reqres;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ListUsersTest {

    @Test
    public void getListUsers() {
        given().
                header("Content-Type", "application/json").
        when().
                get("https://reqres.in/api/users?page=2").
        then().
                log().all().
                statusCode(200).
                body("data[0].email", equalTo("michael.lawson@reqres.in"),
                        "data[5].email", equalTo("rachel.howell@reqres.in"));
    }
}
