package search;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseTest {

    @Test(priority = 0,dataProvider = "search")
    public void testingRelevantSearchResults(String searchWord)  {
        homePage.closePopUp();
        var searchResultsPage=homePage.search(searchWord);
        Assert.assertTrue(searchResultsPage.assertSearchResults(searchWord));
    }
    @Test(priority = 1,description = "just used for git")
    public void testitestngRelevantSearchResults(String searchWord)  {
        homePage.closePopUp();
        var searchResultsPage=homePage.search(searchWord);
        Assert.assertTrue(searchResultsPage.assertSearchResults(searchWord));
    }


}
