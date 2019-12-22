package pages;

import base.Comman;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DropDownCheckBox extends Comman {

    public void radiobox(){

        WebElement radio= driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
        radio.click();
    }

public void checkbox(){

        WebElement check1=driver.findElement(By.xpath("//input[@id='vfb-6-1'] "));
        check1.click();

        WebElement check2=driver.findElement(By.xpath("//input[@id='vfb-6-2'] "));
        check2.click();

}

}
