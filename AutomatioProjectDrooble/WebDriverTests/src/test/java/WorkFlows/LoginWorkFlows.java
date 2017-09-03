package WorkFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginWorkFlows {

    private WebDriver drv;
    private LoginPage loginPage;
    public LoginWorkFlows(WebDriver drv,LoginPage loginPage)
    {
        this.drv = drv;
        this.loginPage=loginPage;
    }
    public void loginIfNotLogged()
    {
        boolean isLogged=false;
        try {
            if(drv.findElement(By.cssSelector(".user-info")).isDisplayed())
            {
                isLogged= true;
                drv.get(loginPage.getUrl());
            }
        }catch (NoSuchElementException e){
            System.out.println("User is not logged in");
        }

        if (!isLogged)
        {
            loginPage.navigateTo();
            loginPage.getTopNavigationHeader().getLoginLink().click();
            loginPage.getModalDialog().getUserName().setText("tchipilev9@gmail.com");
            loginPage.getModalDialog().getPassWord().setText("Test12345");
            loginPage.getModalDialog().getLogInButton().click();
        }

    }
}
