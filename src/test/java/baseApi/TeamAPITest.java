package baseApi;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class TeamAPITest {
       @Test
    public void getWeather() {
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification R = RestAssured.given();
        Response Res = R.request(Method.GET, "/Pabna");
        String Body = Res.getBody().asString();
        System.out.println("Weather is =>  " + Body);

           String contentType =Res.header("Content-Type");
           String ss =Res.header("Server");
           System.out.println(ss);

           System.out.println(contentType);

           Assert.assertEquals(contentType,"application/json1");




           // Get the status line from the Response and store it in a variable called statusLine
          // String statusLine = Res.getStatusLine();

           //System.out.println(Res.getStatusLine() );
           //Assert.assertEquals(statusLine /*actual value*/, "HTTP/1.1 200 OK" /*expected value*/, "Correct status code returned");






/*
           int statusCode = Res.getStatusCode();
           System.out.println("StatusCode is =>" + statusCode);
          // Assert.assertEquals(statusCode,400);

           if (statusCode==200){

               System.out.println("you are dead!!");


       }
           else{
               System.out.println("you are great!!");

           }
*/
           }
    }

