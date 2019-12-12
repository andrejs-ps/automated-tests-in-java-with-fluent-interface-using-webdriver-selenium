package pluralsight.m5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static pluralsight.DriverFactory.getChromeDriver;

public class HomePage {

    private WebDriver driver = getChromeDriver();

    private HomePage(){
        // hide it
    }
    public static HomePage getHomePage(){
        return new HomePage();
    }

    public void search(String value){

        WebElement search = driver.findElement(By.className("header_search--input"));
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);
    }
}
