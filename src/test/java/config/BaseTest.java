package config;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import page.*;

public class BaseTest {


    public page.mainPage mainPage;
    public page.articlePage articlePage;

    WebDriver driver;
    @Before
    public void beforeEeach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chrome/78.0.3/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("http://www.wikipedia.org/");

        mainPage = new mainPage(driver);
        articlePage = new articlePage(driver);
    }

    @After
    public void AfterEach(){
        driver.quit();
    }
}
