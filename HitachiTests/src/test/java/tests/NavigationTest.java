package tests;


import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.TopNavigation;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
public class NavigationTest extends BaseTest {
  @Test
  public void navigation() {
    TopNavigation topNavigation = new TopNavigation(driver);
    topNavigation.clickIndustries();
    topNavigation.clickConstruction();
    Assert.assertEquals(topNavigation.resourceTitle(), "Construction");
  }
}
