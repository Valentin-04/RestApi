package reqres;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PatchUpdateTest {

    @Test
    public void patchUpdate() {
        given().
                header("Content-Type", "application/json").
                body("{\"name\": \"morpheus\",\"job\": \"zion resident\"}").
        when().
                patch("https://reqres.in/api/users/2").
        then().
                log().all().
                statusCode(200).
                body("name", equalTo("morpheus"),
                        "job", equalTo("zion resident"));
    }
}
