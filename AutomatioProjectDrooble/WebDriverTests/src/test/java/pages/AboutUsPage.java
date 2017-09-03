package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsPage extends BasePage {
    private String url ="https://drooble.com/drooble/about";
    WebDriver drv;

    //ctr
    public AboutUsPage(WebDriver drv){
        this.drv = drv;
    }

    public String getUrl() {
        return url;
    }
}
