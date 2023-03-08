package tests;

import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SearchPage;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
public class NegativeSearchTest extends BaseTest {

  @Test
  public void negativeSearchTest() {
    SearchPage searchPage = new SearchPage(driver);
    searchPage.clickSearch();
    searchPage.sendSearchText("aaaassssddddffff");
    searchPage.finalSearchAction();
    searchPage.searchResultText();
    Assert.assertEquals(searchPage.searchResultText(), "Sorry, your search didn't return any results.");

  }
}
