package pluralsight.m5.pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy;
import static pluralsight.DriverFactory.getChromeDriver;
import static pluralsight.DriverFactory.getWebDriverWait;
import static pluralsight.m4.utils.TestUtils.explicitWait;

public class SearchPage {

    WebDriver driver = getChromeDriver();
    WebDriverWait wait = getWebDriverWait();

    private SearchPage(){
        // hide it
    }

    public static SearchPage getSearchPage(){
        return new SearchPage();
    }

    public SearchPage filterBySkillLevel(SkillLevel value){

        driver.findElement(By.xpath("//div[contains(@class, 'search-filter-header') and contains(.,'Skill Levels')]"))
                .click();

        By skillFilter = By.xpath("//span[contains(@class, 'search-filter-option-text') and contains(.,'" + value + "')]");
        wait.until(visibilityOfAllElementsLocatedBy(skillFilter));
        driver.findElement(skillFilter)
                .click();

        explicitWait();
        return this;
    }

    public SearchPage filterByRole(Role role){
        driver.findElement(By.xpath("//div[contains(@class, 'search-filter-header') and contains(.,'Roles')]"))
                .click();

        By roleFilter = By.xpath("//span[contains(@class, 'search-filter-option-text') and contains(.,'" + role + "')]");
        wait.until(visibilityOfAllElementsLocatedBy(roleFilter));
        driver.findElement(roleFilter)
                .click();

        explicitWait();
        return this;
    }

    public SearchPage selectTab(Tab tab){
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
}
