package pages;

import commonPagesBehavior.BrowserActions;

public abstract class BasePage {

    public BrowserActions getBrowserActions()
    {
        return new BrowserActions();
    }

    abstract String getUrl();
}
