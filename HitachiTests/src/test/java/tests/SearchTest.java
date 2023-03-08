package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
public class SearchTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeClass
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterClass
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void searchTest() {
    driver.get("https://global.hitachi-solutions.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.id("open-global-search")).click();
    {
      WebElement element = driver.findElement(By.id("site-search-keyword"));
      Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
      assertTrue(isEditable);
    }
    driver.findElement(By.id("site-search-keyword")).sendKeys("solution");
    driver.findElement(By.cssSelector(".gsearch")).click();
    assertThat(driver.findElement(By.cssSelector(".results")).getText(), is("Search results for: solution"));
    driver.findElement(By.linkText("Power Platform INSIGHTS — How to Build Your Toolbox of Low Code Business Solutions")).click();
  }
}
