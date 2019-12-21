package pages;

import base.Comman;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;




public class SearchPage extends Comman {
    // @FindBy(how = How.ID, using ="twotabsearchtextbox")
    //public static WebElement searchInputWebElement;
    //WebElement dd = driver.findElement(By.id("//input[@id='zip']"));y("webdriver.chrome.driver","C:\\Users\\Sunzida\\Desktop\\ProjectKATeam\\SeleniumTestNGextentReport\\browser-driver\\chromedriver.exe");
   WebElement searchbox=driver.findElement(By.xpath("//input[@name='search']"));



    public void test1() throws InterruptedException {

  searchbox.sendKeys("camry");
  searchbox.sendKeys(Keys.ENTER);

  WebElement searchbox=driver.findElement(By.xpath("//select[@class='form-control select']"));
  Select sel = new Select(searchbox);



  sel.selectByVisibleText("Price: High to Low");

  WebElement radiobutton=driver.findElement(By.id("inventory-listing1-facet-anchor-year-1"));
  radiobutton.click();

  WebElement con=driver.findElement(By.xpath("//div[@id='inventory-listing1-collapse-content-compositeType']"));
  con.click();

//used radio //input[@name="compositeType"]
    }



}