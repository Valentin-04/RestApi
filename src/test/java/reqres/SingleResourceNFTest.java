package reqres;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SingleResourceNFTest {

    @Test
    public void getSingleResourceNF() {
        given().
                header("Content-Type", "application/json").
        when().
                get("https://reqres.in/api/unknown/23").
        then().
                log().all().
                statusCode(404);
    }
}
