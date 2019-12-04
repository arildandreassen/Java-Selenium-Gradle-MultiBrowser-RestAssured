package config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebBase extends Utilities{

    public static PageInstantiator page;

    public static RemoteWebDriver driver;

    @Rule
    public ScreenshotOnFailure failure = new ScreenshotOnFailure(driver);

    @BeforeClass
    public static void setupAll() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chrome/78.0.3/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("http://www.wikipedia.org/");

        page = new PageInstantiator(driver);
    }

    @AfterClass
    public static void After(){
        driver.quit();
    }
}
