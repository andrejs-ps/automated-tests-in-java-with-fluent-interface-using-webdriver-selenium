package pluralsight.m6;

import org.testng.annotations.Test;
import pluralsight.m6.pages.CommonVerification;
import pluralsight.m6.pages.course.CoursePage;
import pluralsight.m6.pages.home.HomePage;
import pluralsight.m6.pages.search.Role;
import pluralsight.m6.pages.search.SearchPage;
import pluralsight.m6.pages.search.SkillLevel;
import pluralsight.m6.pages.search.Tab;

import static org.assertj.core.api.Assertions.assertThat;
import static pluralsight.m6.pages.CommonVerification.getCommonVerification;
import static pluralsight.m6.pages.course.CoursePage.*;
import static pluralsight.m6.pages.home.HomePage.getHomePage;
import static pluralsight.m6.pages.search.SearchPage.getSearchPage;


public class SearchTest extends BaseTestClass {

    HomePage home = getHomePage();
    SearchPage search = getSearchPage();
    CoursePage course = getCoursePage();
    CommonVerification common = getCommonVerification();

    @Test
    public void basicFilterByTest() {

        home.act()
                .search("Java");

        search.act()
                .filterBySkillLevel(SkillLevel.BEGINNER)
                .filterByRole(Role.SOFTWARE_DEVELOPMENT)
                .selectTab(Tab.COURSES)
                .selectCourse("Java Fundamentals: The Java Language");


        course.verify()
               .coursePreviewIsDisplayed()
               .freeTrialIsDisplayed();

       // OR

       common.verifyIsDisplayed(freeTrialButton())
               .verifyIsDisplayed(coursePreviewButton());
    }

    @Test
    public void searchListCheck(){
        home.act()
                .search("Java");

        search.act()
                .filterBySkillLevel(SkillLevel.BEGINNER)
                .filterByRole(Role.SOFTWARE_DEVELOPMENT)
                .selectTab(Tab.COURSES);


        assertThat(search.get().courses())
                .hasSize(25)
                .containsOnlyOnce("Java Fundamentals: The Java Language")
                .doesNotContain("Python");

    }

}
