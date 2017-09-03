package controls;

import com.drooble.interfaces.Clickable;
import com.drooble.waiters.ElementWaiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button implements Clickable {

    private String baseCssSelector;
    private String elementSelector = "button";
    private String actualSelector;

    private WebElement element;

    public Button(WebDriver drv, String baseCssSelector, String actualSelector)
    {
        this.baseCssSelector = baseCssSelector;

        element = drv.findElement(By.cssSelector(baseCssSelector + " " + elementSelector + actualSelector));

    }
    public void click() {
        element.click();
    }

    public String getText() {
       return element.getText();
    }
}
