package pages;

import controls.LeftNavigationMenu;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private WebDriver drv;
    private String url = "https://drooble.com/drooble-apps";

    public HomePage(WebDriver drv){
        this.drv = drv;
    }

    //child ctr
    private LeftNavigationMenu leftNavigationMenu;

    public LeftNavigationMenu getLeftNavigationMenu() {
        return  leftNavigationMenu = new LeftNavigationMenu(drv);
    }

    public String getUrl(){
        return url;
    }

}
