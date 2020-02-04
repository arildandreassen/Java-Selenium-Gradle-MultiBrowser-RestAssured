package config;

import org.openqa.selenium.remote.RemoteWebDriver;
import page.*;

public class PageInstantiator {

    public ArticlePage article;
    public MainPage main;
    public HomePage home;
    public SideMenu sideMenu;
    public CommunityPortal communityPortal;

    public PageInstantiator(RemoteWebDriver driver){
        article = new ArticlePage(driver);
        main = new MainPage(driver);
        home = new HomePage(driver);
        sideMenu = new SideMenu(driver);
        communityPortal = new CommunityPortal(driver);
    }
}
