package controls;

import com.drooble.interfaces.InputField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextInputField implements InputField {

    private String baseCssSelector;
    private String elementSelector = "input";
    private String actualSelector;

    private WebElement element;

    public TextInputField(WebDriver drv, String baseCssSelector,String actualSelector){
        this.baseCssSelector = baseCssSelector;
        element = drv.findElement(By.cssSelector(baseCssSelector + " " + elementSelector + actualSelector));
    }
    public void setText(String value) {
      element.sendKeys(value);
    }

    public void click() {
        element.click();
    }

    public String getText() {
        return element.getText();
    }
}
