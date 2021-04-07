package hh;

import com.google.gson.Gson;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class HeadHunterTest {

    Gson gson = new Gson();

    @Test
    public void test() {
        //https://api.hh.ru/vacancies?text=QA

        String rex = when().
                get("https://api.hh.ru/vacancies?text=QA").
        then().
                extract().body().asString();

        HHResponse response = gson.fromJson(rex, HHResponse.class);

        System.out.println(response);
    }
}
