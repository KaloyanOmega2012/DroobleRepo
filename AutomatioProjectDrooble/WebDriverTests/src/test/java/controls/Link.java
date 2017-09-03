package controls;

import com.drooble.interfaces.Clickable;
import com.drooble.waiters.ElementWaiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.concurrent.TimeUnit;

public class Link implements Clickable
{
    private String baseCssSelector;
    private String elementSelector = "a";
    private String actualSelector;
    private String fullSelector;

    private WebElement element;

    public Link(WebDriver drv, final String baseCssSelector, final String actualSelector)
    {
        this.baseCssSelector = baseCssSelector;
        fullSelector = baseCssSelector + " " + elementSelector + actualSelector;

        ElementWaiter waiter = new ElementWaiter(drv);
        element = waiter.waitForElement(fullSelector);

        //element = drv.findElement(By.cssSelector(fullSelector));
    }
    public void click() {
        element.click();
    }

    public String getText() {
        return element.getText();
    }
}
