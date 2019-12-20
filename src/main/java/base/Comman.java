package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class Comman {

    //Browser SetUp
    public static WebDriver driver = null;
    @Parameters("mybrowser")
    @BeforeMethod()
    public void setUp(@Optional("chrome") String mybrowser) throws InterruptedException {
    String projectPath=System.getProperty("user.dir");
        if(mybrowser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver",projectPath+ "\\browser-driver\\chromedriver.exe");


           //System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammad.haque01\\Desktop\\Testing\\AmazanAutomation\\browser-driver\\chromedriver.exe");

            driver = new ChromeDriver();

        }
        else if(mybrowser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",projectPath+ "\\browser-driver\\geckodriver.exe");

           // System.setProperty("webdriver.firefox.marionette","C:\\Users\\Sunzida\\Desktop\\ProjectKATeam\\SeleniumTestNGextentReport\\browser-driver\\geckodriver.exe");
            driver = new FirefoxDriver();

        }

        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.get("https://www.walmart.com/");
        driver.manage().window().maximize();


    }
    @AfterMethod
    public  void afterMethod()  {

driver.close();
    }

}

