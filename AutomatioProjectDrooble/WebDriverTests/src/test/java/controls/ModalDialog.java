package controls;

import com.drooble.interfaces.Clickable;
import com.drooble.interfaces.InputField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModalDialog  {
    private WebDriver drv;

    //child controls
    private InputField userName;
    private InputField passWord;
    private InputField logInButton;


    private WebElement element;
    private String baseCssSelector = ".modal-dialog";

    public ModalDialog(WebDriver drv){
        this.drv = drv;
    }

    public InputField getUserName(){
        return userName = new TextInputField(drv,baseCssSelector,"#user-email");
    }

    public InputField getPassWord() {
        return passWord = new TextInputField(drv,baseCssSelector,"#user-password");
    }
    public InputField getLogInButton(){
        return logInButton = new TextInputField(drv,baseCssSelector,"#loginButton");
    }
}
