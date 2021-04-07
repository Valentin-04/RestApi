package reqres;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SingleUserNFTest {

    @Test
    public void getSingleUserNF() {
        given().
                header("Content-Type", "application/json").
        when().
                get("https://reqres.in/api/users/23").
        then().
                log().all().
                statusCode(404);
    }
}
