package reqres;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteTest {

    @Test
    public void delete() {
        given().
                header("Content-Type", "application/json").
        when().
                delete("https://reqres.in/api/users/2").
        then().
                log().all().
                statusCode(204);
    }
}
