package pages;

import base.Comman;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class SearchPage extends Comman {
    // @FindBy(how = How.ID, using ="twotabsearchtextbox")
    //public static WebElement searchInputWebElement;


    public void test() throws InterruptedException {
        WebElement dd = driver.findElement(By.id("//input[@id='zip']"));
        driver.findElement(By.xpath("//input[@id='zip']"));
        dd.sendKeys("75080");


    }

}