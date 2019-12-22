package BaseAPIKA;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITestingKA {

    @Test
    public void GetWeather1(){
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification Req = RestAssured.given();
        Response Resp = Req.request(Method.GET, "Richardson");
        String RespBody = Resp.getBody().asString();
        System.out.println("Weather for city is =>   " + RespBody);
    }
    @Test
    public void GetWeather2(){
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification Req = RestAssured.given();
        Response Resp = Req.request(Method.GET, "New York");
        String RespBody = Resp.getBody().asString();
        System.out.println("Weather for city is =>   " + RespBody);
}
    @Test
    public void GetWeather3(){
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification Req = RestAssured.given();
        Response Resp = Req.request(Method.GET, "Miami");
        String RespBody = Resp.getBody().asString();
        System.out.println("Weather for city is =>" + RespBody);
}

    @Test
    public void GetWeather4(){

        RestAssured.baseURI =  "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification Req = RestAssured.given();
        Response Resp = Req.request(Method.GET, "Atlanta");
        String RespBody = Resp.getBody().asString();
        System.out.println("Weather for city is =>   " + RespBody);
    }

    @Test
    public void WetWeather5(){

        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification Req = RestAssured.given();
        Response Resp = Req.request(Method.GET, "Denver");
        String RespBody = Resp.getBody().asString();
        System.out.println("Weather for city is =>    " + RespBody);


    }

}
