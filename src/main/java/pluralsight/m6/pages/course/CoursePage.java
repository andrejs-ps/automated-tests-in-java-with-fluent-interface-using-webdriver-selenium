package pluralsight.m6.pages.course;

import org.openqa.selenium.By;
import pluralsight.m6.pages.AbstractPage;

public class CoursePage extends AbstractPage {

    private CourseActController act;
    private CourseVerifyController verify;

    public CourseActController act(){
        return act;
    }

    public CourseVerifyController verify(){
        return verify;
    }

    private CoursePage(){
        // hide it
    }

    private CoursePage(CourseActController act, CourseVerifyController verify){
        this.act = act;
        this.verify = verify;
    }

    public static CoursePage getCoursePage(){
        return new CoursePage(new CourseActController(),
                              new CourseVerifyController());
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
