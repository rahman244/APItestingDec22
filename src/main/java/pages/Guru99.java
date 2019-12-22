package pages;

import base.Comman;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Guru99 extends Comman {
    public void test(){

      //  WebElement email=driver.findElement(By.xpath("//input[@id=\"email\"]"));
        //email.sendKeys("alamkx@yahoo.com");

       // WebElement password=driver.findElement(By.xpath("//input[@id=\"passwd\"]"));
       // password.sendKeys("12345");

      //  WebElement signin= driver.findElement(By.xpath(" //button[@id=\"SubmitLogin\"]"));
       // signin.click();

        WebElement radiobox=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
        radiobox.click();

        WebElement checkbox=driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
        checkbox.click();

        WebElement checkbox1=driver.findElement(By.xpath("//input[@id='vfb-6-2']"));
        checkbox1.click();
    }
}
