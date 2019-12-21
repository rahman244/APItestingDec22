package pagesTest;

import base.Comman;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPage;

import java.io.IOException;


public class SearchPageTest extends Comman {
    @Test
    public void search() throws InterruptedException, IOException {

        SearchPage searchPage =new SearchPage();
       // SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.test1();
    }
}


