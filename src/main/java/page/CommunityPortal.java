package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CommunityPortal {

    RemoteWebDriver driver;

    @FindBy(id = "firstHeading")
    private WebElement firstHeading = null;

    public CommunityPortal(RemoteWebDriver driver){
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,30);
        PageFactory.initElements(factory, this);
    }

    public String getFirstHeaderText(){
            return firstHeading.getText();
    }
}
