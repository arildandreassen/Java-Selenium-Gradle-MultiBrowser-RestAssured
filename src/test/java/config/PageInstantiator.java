package config;

import org.openqa.selenium.remote.RemoteWebDriver;
import page.articlePage;
import page.mainPage;

public class PageInstantiator {

    public articlePage article;
    public mainPage main;

    public PageInstantiator(RemoteWebDriver driver){
        article = new articlePage(driver);
        main = new mainPage(driver);



    }
}
