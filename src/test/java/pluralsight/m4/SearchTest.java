package pluralsight.m4;

import org.testng.annotations.Test;
import pluralsight.m4.pages.CoursePage;
import pluralsight.m4.pages.HomePage;
import pluralsight.m4.pages.SearchPage;


public class SearchTest extends BaseTestClass {

    HomePage home = new HomePage();
    SearchPage search = new SearchPage();
    CoursePage course = new CoursePage();

    @Test
    public void basicFilterByTest() {

        home.search("Java");

        search.filterBySkillLevel("Beginner")
                .filterByRole("Software Development")
                .selectTabCourse()
                .selectCourse("Java Fundamentals: The Java Language");

       course.verifyCoursePreviewIsDisplayed()
               .verifyFreeTrialIsDisplayed();

    }

}
