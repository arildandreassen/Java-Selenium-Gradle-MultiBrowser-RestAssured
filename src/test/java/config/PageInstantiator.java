package config;

import org.openqa.selenium.remote.RemoteWebDriver;
import page.*;

public class PageInstantiator {

    public articlePage article;
    public mainPage main;

    public PageInstantiator(RemoteWebDriver driver){
        article = new articlePage(driver);
        main = new mainPage(driver);



    }
}
