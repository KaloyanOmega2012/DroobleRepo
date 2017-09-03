package pages;

import controls.ModalDialog;
import controls.TopNavigationHeader;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {
    private WebDriver drv;
    private String url = "https://drooble.com/";

    //controls
    private TopNavigationHeader topNavigationHeader;
    private ModalDialog modalDialog;

    //ctor
    public LoginPage(WebDriver drv)
    {
        this.drv = drv;
    }

    //content
    public TopNavigationHeader getTopNavigationHeader()
    {
        return topNavigationHeader = new TopNavigationHeader(drv);
    }
    public ModalDialog getModalDialog(){
        return modalDialog = new ModalDialog(drv);
    }

    //actions
    public void navigateTo()
    {
        drv.get("https://drooble.com/");
    }

    public String getUrl() {
        return url;
    }
}
