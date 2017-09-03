package com.drooble.waiters;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ElementWaiter {
    private WebDriver drv;

    public ElementWaiter(WebDriver drv){
        this.drv = drv;
        }

    public WebElement waitForElement(final String fullSelector){
            WebDriverWait wait = new WebDriverWait(drv, 20);
            WebElement el;
            el = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(fullSelector)));
            return  el;
        }

    public void waitPageToLoad(WebDriver drv) {
        new WebDriverWait(drv, 30).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }


}
