package controls;

import com.drooble.interfaces.Clickable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopNavigationHeader {
    private WebDriver drv;

    //child controls
    private Clickable loginLink;

    private String baseCssSelector = "#nav";

    public TopNavigationHeader(WebDriver drv){
        this.drv = drv;
    }

    public Clickable getLoginLink()
    {
        return loginLink = new Link(drv, baseCssSelector,".login-btn");
    }
}
