package pluralsight.m6.pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy;
import static pluralsight.DriverFactory.getChromeDriver;
import static pluralsight.DriverFactory.getWebDriverWait;
import static pluralsight.m4.utils.TestUtils.explicitWait;

public class SearchActController {

    WebDriver driver = getChromeDriver();
    WebDriverWait wait = getWebDriverWait();

    public SearchActController filterBySkillLevel(SkillLevel value){

        driver.findElement(By.xpath("//div[contains(@class, 'search-filter-header') and contains(.,'Skill Levels')]"))
                .click();

        By skillFilter = By.xpath("//span[contains(@class, 'search-filter-option-text') and contains(.,'" + value + "')]");
        wait.until(visibilityOfAllElementsLocatedBy(skillFilter));
        driver.findElement(skillFilter)
                .click();

        explicitWait();
        return this;
    }

    public SearchActController filterByRole(Role role){
        driver.findElement(By.xpath("//div[contains(@class, 'search-filter-header') and contains(.,'Roles')]"))
                .click();

        By roleFilter = By.xpath("//span[contains(@class, 'search-filter-option-text') and contains(.,'" + role + "')]");
        wait.until(visibilityOfAllElementsLocatedBy(roleFilter));
        driver.findElement(roleFilter)
                .click();

        explicitWait();
        return this;
    }

    public SearchActController selectTab(Tab tab){
        driver.findElement(By.xpath("//a[contains(@class, 'tab') and contains(., '" + tab + "')]"))
                .click();
        return this;
    }

    public void selectCourse(String courseName){
        driver.findElement(By.xpath("//div[@id='search-results-category-target']" +
                "//div[@class='search-result columns' and contains(., '" + courseName + "')]" +
                "//div[@class='search-result__title']/a"))
                .click();
    }


    public SearchActController doThis(){
        // ....
        return this;
    }

    public SearchActController doThat(){
        // ....
        return this;
    }
}
