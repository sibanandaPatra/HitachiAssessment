package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavigation extends BasePage {
    public TopNavigation(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#menu-item-295 > button")
    private WebElement industriesSubmenu;

    @FindBy(linkText = "Construction")
    private WebElement construction;

    @FindBy(css = ".resource-title")
    private WebElement titleText;

    @FindBy(css = "h2")
    private WebElement heading;
    @FindBy(css = ".label")
    private WebElement label;

    public void clickIndustries(){
        industriesSubmenu.click();
    }
    public void clickConstruction(){
        construction.click();
    }
    public String resourceTitle(){
        return titleText.getText();
    }
    public void navigateTo() {
        driver.get("https://global.hitachi-solutions.com/industry/constructions/");
    }
    public String getHeading() {
        return heading.getText();
    }
    public String getLabel() {
        return label.getText();
    }

}
