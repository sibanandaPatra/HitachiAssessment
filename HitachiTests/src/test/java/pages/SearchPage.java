package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "open-global-search")
    private WebElement globalSearchBtn;
    @FindBy(id = "site-search-keyword")
    private WebElement searchTextBox;
    @FindBy(css = ".gsearch")
    private WebElement searchBtn;
    @FindBy(css = ".results")
    private WebElement searchOutputText; //
    @FindBy(linkText = "Power Platform INSIGHTS — How to Build Your Toolbox of Low Code Business Solutions")
    private WebElement resultLink;

    public void clickSearch(){
        globalSearchBtn.click();
    }
    public void sendSearchText(String searchContent){
        searchTextBox.sendKeys(searchContent);
    }
    public void finalSearchAction(){
        searchBtn.click();
    }
    public String searchResultText(){
        return searchOutputText.getText();
    }
    public void clickResultLink(){
        resultLink.click();
    }
}
