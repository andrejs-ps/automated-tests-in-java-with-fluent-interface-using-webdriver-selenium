package pluralsight.m6.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static pluralsight.DriverFactory.getChromeDriver;

public abstract class AbstractPage {

    protected WebDriver driver = getChromeDriver();

    public AbstractPage verifyIsDisplayed(By element){
        Assert.assertTrue(driver.findElement(element).isDisplayed());
        return this;
    }

    public AbstractPage verifyIsNotDisplayed(By element){
        // your code ...
        return this;
    }
}
