package pluralsight.m3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static pluralsight.DriverFactory.getChromeDriver;

public class CoursePage {

    private WebDriver driver = getChromeDriver();

    public void verifyFreeTrialIsDisplayed(){
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][1]"))
                .isDisplayed());
    }

    public void verifyCoursePreviewIsDisplayed(){
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][2]"))
                .isDisplayed());
    }
}
