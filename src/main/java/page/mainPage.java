package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class mainPage {

    RemoteWebDriver driver;

    @FindBy(id="searchInput")
    private WebElement searchBar = null;

    @FindBy(css = "button[type=submit]")
    private WebElement searchButton = null;

    public mainPage(RemoteWebDriver driver){
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,30);
        PageFactory.initElements(factory, this);
    }

    public void searchFor(String searchCriteria){
        searchBar.sendKeys(searchCriteria);
        searchButton.click();
    }
}
