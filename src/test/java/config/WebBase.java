package config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebBase extends Utilities{

    public static PageInstantiator page;

    public static RemoteWebDriver driver;

    @Rule
    public ScreenshotOnFailure failure = new ScreenshotOnFailure(driver);

    @BeforeClass
    public static void setupAll() {

        String browserType;
        if(System.getProperty("browser") != null) {
            browserType = System.getProperty("browser");
        } else {
            browserType = "chrome";
        }
        if(browserType.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver","src/test/resources/driver/firefox/0.26/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chrome/78.0.3/chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.get("http://www.wikipedia.org/");

        page = new PageInstantiator(driver);
    }

    @AfterClass
    public static void After(){
        driver.quit();
    }
}
