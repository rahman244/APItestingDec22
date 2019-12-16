package pagesTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class firefoxtest {
   @Test
    public void setup(){
       WebDriver driver=null;
       String projectPath=System.getProperty("user.dir");
            System.setProperty("webdriver.gecko.driver",projectPath+ "\\browser-driver\\geckodriver.exe");
           // System.setProperty("webdriver.gecko.driver", "C:\\Users\\mohammad.haque01\\Desktop\\Testing\\AmazanAutomation\\browser-driver\\geckodriver2.exe");
          //  DesiredCapabilities capabilities = DesiredCapabilities.firefox();
           // capabilities.setCapability("marionette",true);
            //driver= new FirefoxDriver(capabilities);
             driver= new FirefoxDriver();
       // driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
       driver.get("https://www.amazon.com/");
       driver.manage().window().maximize();



    }
}
