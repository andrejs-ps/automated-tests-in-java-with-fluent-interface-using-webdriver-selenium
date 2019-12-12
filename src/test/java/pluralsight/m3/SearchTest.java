package pluralsight.m3;

import org.testng.annotations.Test;
import pluralsight.m3.pages.CoursePage;
import pluralsight.m3.pages.HomePage;
import pluralsight.m3.pages.SearchPage;


public class SearchTest extends BaseTestClass {

    HomePage home = new HomePage();
    SearchPage search = new SearchPage();
    CoursePage course = new CoursePage();

    @Test
    public void basicFilterByTest() {

        home.search("Java");

        search.filterBySkillLevel("Beginner");
        search.filterByRole("Software Development");
        search.selectTabCourse();
        search.selectCourse("Java Fundamentals: The Java Language");

       course.verifyCoursePreviewIsDisplayed();
       course.verifyFreeTrialIsDisplayed();

    }

}
