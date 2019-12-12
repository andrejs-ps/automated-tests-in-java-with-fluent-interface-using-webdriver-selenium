package pluralsight.m5;

import org.testng.annotations.Test;
import pluralsight.m5.pages.CommonVerification;
import pluralsight.m5.pages.CoursePage;
import pluralsight.m5.pages.HomePage;
import pluralsight.m5.pages.search.Role;
import pluralsight.m5.pages.search.SearchPage;
import pluralsight.m5.pages.search.SkillLevel;
import pluralsight.m5.pages.search.Tab;

import static pluralsight.m5.pages.CommonVerification.getCommonVerification;
import static pluralsight.m5.pages.CoursePage.*;
import static pluralsight.m5.pages.HomePage.getHomePage;
import static pluralsight.m5.pages.search.SearchPage.getSearchPage;


public class SearchTest extends BaseTestClass {

    HomePage home = getHomePage();
    SearchPage search = getSearchPage();
    CoursePage course = getCoursePage();
    CommonVerification common = getCommonVerification();

    @Test
    public void basicFilterByTest() {

        home.search("Java");

        search.filterBySkillLevel(SkillLevel.BEGINNER)
                .filterByRole(Role.SOFTWARE_DEVELOPMENT)
                .selectTab(Tab.COURSES)
                .selectCourse("Java Fundamentals: The Java Language");

       course.verifyIsDisplayed(freeTrialButton())
               .verifyIsDisplayed(coursePreviewButton());

       // OR

       common.verifyIsDisplayed(freeTrialButton())
               .verifyIsDisplayed(coursePreviewButton());

    }

}
