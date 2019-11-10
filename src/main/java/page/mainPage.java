package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class mainPage {

    WebDriver driver;

    @FindBy(id="searchInput")
    private WebElement searchBar;

    @FindBy(css = "button[type=submit]")
    private WebElement searchButton;

    public mainPage(WebDriver driver){
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,30);
        PageFactory.initElements(factory, this);
    }

    public void searchFor(String searchCriteria){
        searchBar.sendKeys(searchCriteria);
        searchButton.click();
    }
}
