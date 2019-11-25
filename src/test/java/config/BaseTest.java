package config;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import page.*;

public class BaseTest {

    public static page.mainPage mainPage;
    public static page.articlePage articlePage;

    public static RemoteWebDriver driver;

    @Rule
    public ScreenshotOnFailure failure = new ScreenshotOnFailure(driver);

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chrome/78.0.3/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("http://www.wikipedia.org/");

        mainPage = new mainPage(driver);
        articlePage = new articlePage(driver);
    }

    @AfterClass
    public static void After(){
        driver.quit();
    }
}
