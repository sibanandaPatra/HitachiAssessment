package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.TopNavigation;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NegativeNavigationTest extends BaseTest {

  @Test
  public void wNavigation() {
    TopNavigation topNavigation = new TopNavigation(driver);
    topNavigation.clickIndustries();
    topNavigation.clickConstruction();
    topNavigation.navigateTo();
    Assert.assertEquals(topNavigation.getHeading(), "Oops, something's gone wrong");
    Assert.assertEquals(topNavigation.getLabel(), "404");
  }
}
