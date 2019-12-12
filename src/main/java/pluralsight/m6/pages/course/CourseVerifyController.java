package pluralsight.m6.pages.course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static pluralsight.DriverFactory.getChromeDriver;

public class CourseVerifyController {

    private WebDriver driver = getChromeDriver();

    // Note: also exist in Common Verifier
    public CourseVerifyController freeTrialIsDisplayed(){
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][1]"))
                .isDisplayed());
        return this;
    }

    public CourseVerifyController coursePreviewIsDisplayed(){
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][2]"))
                .isDisplayed());
        return this;
    }
}
