package controls;

import com.drooble.interfaces.Clickable;
import org.openqa.selenium.WebDriver;

public class LeftNavigationMenu {
    private WebDriver drv;
    private String baseCssSelector = "#right-sidebar";

    //ctor
    public LeftNavigationMenu(WebDriver drv){
        this.drv = drv;
    }
    //child controls
    private Clickable freeAps;

    public Clickable getFreeAps(){
    return freeAps = new Link(drv,baseCssSelector,"#right-menu-apps.ajaxy");
    }
}
