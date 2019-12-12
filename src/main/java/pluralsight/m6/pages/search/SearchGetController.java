package pluralsight.m6.pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.testng.Assert.assertTrue;
import static pluralsight.DriverFactory.getChromeDriver;

public class SearchGetController {

    WebDriver driver = getChromeDriver();


    public List<String> courses(){
        List<WebElement> courses = driver.findElements(
                By.xpath("//div[@id='search-results-category-target']//div[@class='search-result__title']"));

        assertTrue(courses.size() != 0, "List is empty, failed to collect courses");

        return courses.stream()
                      .map(WebElement::getText)
                      .collect(toList());

    }


}
