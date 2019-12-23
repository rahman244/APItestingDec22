//package baseApi;

import com.sun.xml.xsom.impl.RestrictionSimpleTypeImpl;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.TestSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;



   /* public void getWeather() {

          RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
           RequestSpecification R = RestAssured.given();
           Response Res = R.request(Method.GET, "/Pabna");
           String Body = Res.getBody().asString();
           System.out.println("Weather is =>  " + Body);



           String contentType = Res.header("contentType");
           System.out.println("application/json; ");

          /* String contentType =Res.header("Content-Type");
           String ss =Res.header("Server");
           System.out.println(ss);

           System.out.println(contentType);

           Assert.assertEquals(contentType,"application/json1");/*

              RestAssured.baseURI = "http;
              RestSpecification rest = RestAssured.given();

               Response resp = rest.request(Method Get, "/Plano";
              // String ss = restbody.getBody().as string();

               Sout ("what is it => + restbody);
           */






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


          // public void weather(){

         /*  RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
           RequestSpecification rest = RestAssured.given();

           Response res = rest.request(Method.GET,"/Plano");
           String nipa = res.getBody().asString();

            System.out.println("Weather is =>" + nipa);*/









