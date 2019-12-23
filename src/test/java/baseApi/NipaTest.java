package baseApi;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NipaTest {
@Test
    public void TexasWeather(){
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification requ = RestAssured.given();
        Response resp = requ.request(Method.GET,"/Plano");
        String ss = resp.getBody().asString();
        System.out.println("this is my weather => "+ ss);

    }
}
