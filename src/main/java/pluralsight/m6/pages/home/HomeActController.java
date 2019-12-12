package pluralsight.m6.pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static pluralsight.DriverFactory.getChromeDriver;

public class HomeActController {

    private WebDriver driver = getChromeDriver();

    public HomeActController search(String value){

        WebElement search = driver.findElement(By.className("header_search--input"));
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);
        return this;
    }

    public void clickLogin() {
        driver.findElement(By.className("home_login")).click();
    }

}
