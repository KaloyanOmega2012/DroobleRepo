package kchipilev.drooble.com;

import WorkFlows.LoginWorkFlows;
import com.drooble.waiters.ElementWaiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AboutUsPage;
import pages.FreeApps;
import pages.HomePage;
import pages.LoginPage;

public class DroobleTests {

    private WebDriver drv;

    @BeforeClass // Runs this method before the first test method in the current class is invoked
    public void setUp() {
        // Create a new instance of the Firefox driver
        drv = new ChromeDriver();
        drv.manage().window().maximize();
    }

    @Test
    public void loginWithValidCredentials(){

        LoginPage LoginPage = new LoginPage(drv);
        HomePage HomePage = new HomePage(drv);
        LoginWorkFlows LoginWorkFlows = new LoginWorkFlows(drv,LoginPage);

        LoginWorkFlows.loginIfNotLogged();
        HomePage.getLeftNavigationMenu().getFreeAps().click();

        Assert.assertEquals("Testerfn",drv.findElement(By.cssSelector("a.name.ajaxy")).getText());
        Assert.assertEquals(HomePage.getUrl(),drv.getCurrentUrl());
    }

    @Test
    public void checkFooterButtonExist()
    {
        LoginPage LoginPage = new LoginPage(drv);
        HomePage HomePage = new HomePage(drv);
        FreeApps FreeApsPage = new FreeApps(drv);
        AboutUsPage AboutUsPage = new AboutUsPage(drv);
        ElementWaiter waiter = new ElementWaiter(drv);
        LoginWorkFlows LoginWorkFlows = new LoginWorkFlows(drv,LoginPage);

        LoginWorkFlows.loginIfNotLogged();
        HomePage.getLeftNavigationMenu().getFreeAps().click();
        FreeApsPage.getFooter().getAboutUsLinkUsLink().click();
        waiter.waitPageToLoad(drv);

        Assert.assertEquals("Testerfn",drv.findElement(By.cssSelector("a.name.ajaxy")).getText());
        Assert.assertEquals(AboutUsPage.getUrl(),drv.getCurrentUrl());
    }

    @AfterClass // Runs this method after all the test methods in the current class have been run
    public void tearDown() {
        // Close all browser windows and safely end the session
        drv.quit();
    }

}

