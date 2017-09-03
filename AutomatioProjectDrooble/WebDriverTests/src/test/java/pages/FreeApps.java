package pages;

import controls.Footer;
import controls.LeftNavigationMenu;
import org.openqa.selenium.WebDriver;

public class FreeApps extends BasePage {
    private WebDriver drv;
    private String url = "https://drooble.com/drooble-apps";

    //ctr
    public FreeApps(WebDriver drv){
        this.drv = drv;
    }

    //child ctr
    private LeftNavigationMenu leftNavigationMenu;
    private Footer footer;

    public Footer getFooter(){return footer = new Footer(drv);}

    public LeftNavigationMenu getLeftNavigationMenu() {
        return  leftNavigationMenu = new LeftNavigationMenu(drv);
    }

    String getUrl() {
        return url;
    }
}
