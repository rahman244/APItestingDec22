package pagesTest;

import base.Comman;
import org.testng.annotations.Test;
import pages.SearchPage;
import pages.SearchPage2;


public class SearchPageTest2 extends Comman {
    @Test
    public void search() throws InterruptedException {
        SearchPage2 search =new SearchPage2();
       // SearchPage search = PageFactory.initElements(driver, SearchPage.class);

        search.test();
    }
}
