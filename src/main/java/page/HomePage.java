package page;

import enums.Language;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage {

    RemoteWebDriver driver;

    public HomePage(RemoteWebDriver driver){
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,30);
        PageFactory.initElements(factory, this);
    }

    public HomePage selectLanguage(Language language){
        String selector = "div[lang='"+language+"']";
        WebElement element = driver.findElement(By.cssSelector(selector));
        element.click();
        return this;
    }
}
