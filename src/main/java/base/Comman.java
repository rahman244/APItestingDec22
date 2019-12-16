package base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;


import java.io.IOException;


import java.util.concurrent.TimeUnit;


public class Comman {

    //Browser SetUp
    public static WebDriver driver = null;

    public static ExtentReports extent;
    private static ThreadLocal parentTest = new ThreadLocal();
    private static ThreadLocal test = new ThreadLocal();

    @BeforeSuite
    public void beforeSuite() {
        extent = ExtentManager.createInstance("extentReport.html");
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
        extent.attachReporter(htmlReporter);
    }

@Parameters("mybrowser")
    @BeforeMethod
    public void setUp(String mybrowser) throws InterruptedException {
    String projectPath=System.getProperty("user.dir");
        if(mybrowser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver",projectPath+ "\\browser-driver\\chromedriver.exe");


           // System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammad.haque01\\Desktop\\Testing\\AmazanAutomation\\browser-driver\\chromedriver.exe");

            driver = new ChromeDriver();

        }
        else if(mybrowser.equalsIgnoreCase("firefox")){
            //System.setProperty("webdriver.gecko.driver",projectPath+ "\\browser-driver\\geckodriver.exe");
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\mohammad.haque01\\Desktop\\Testing\\AmazanAutomation\\browser-driver\\geckodriver2.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette",true);
            driver= new FirefoxDriver(capabilities);
           // driver= new FirefoxDriver();

        }

       // driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();


    }
    @AfterMethod
    public  void afterMethod() throws IOException {
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");

        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");


    }

@AfterSuite
    public  void afterSuite(){

    extent.flush();

    }





}

