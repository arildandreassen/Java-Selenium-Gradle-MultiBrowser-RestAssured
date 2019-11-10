package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class articlePage {

    WebDriver driver;

    @FindBy(id = "firstHeading")
    private WebElement firstHeading;

    public articlePage(WebDriver driver){
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,30);
        PageFactory.initElements(factory, this);
    }

    public String getFirstHeaderText(){
        return firstHeading.getText();
    }

}
