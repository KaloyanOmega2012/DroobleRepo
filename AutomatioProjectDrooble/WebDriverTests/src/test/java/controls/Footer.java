package controls;

import com.drooble.interfaces.Clickable;
import org.openqa.selenium.WebDriver;

public class Footer {
    private WebDriver drv;
    private String baseCssSelector = "#footer";

    //ctor
    public Footer(WebDriver drv){
        this.drv = drv;
    }
    //child controls
    private Clickable aboutUsLink;

    public Clickable getAboutUsLinkUsLink()
    {
        return aboutUsLink = new Link(drv, baseCssSelector,"#footer-about");
    }

}
