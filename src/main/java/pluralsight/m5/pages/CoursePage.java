package pluralsight.m5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pluralsight.DriverFactory.getChromeDriver;

public class CoursePage extends AbstractPage {

    private WebDriver driver = getChromeDriver();

    private CoursePage(){
        // hide it
    }

    public static CoursePage getCoursePage(){
        return new CoursePage();
    }


    public static By freeTrialButton(){
        return By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][1]");
    }

    public static By coursePreviewButton(){
        return By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][2]");
    }

    public static By someOtherElement(){
        return By.xpath("your xPath here");
    }
}
