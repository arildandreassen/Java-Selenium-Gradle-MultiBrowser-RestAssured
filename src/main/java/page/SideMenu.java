package page;

import enums.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SideMenu {

    RemoteWebDriver driver;

    public SideMenu(RemoteWebDriver driver){
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,30);
        PageFactory.initElements(factory, this);
    }

    public SideMenu clickLink(Interaction interaction){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e){

        }
        String locator = "//*[@id='p-interaction']//a[contains(text(),'" + interaction+ "')]";
        WebElement element = driver.findElement(By.xpath(locator));
        element.click();
        return this;
    }
}
