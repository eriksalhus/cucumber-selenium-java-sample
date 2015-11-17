package no.erik.cucumberselenium;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertTrue;

public class GoogleSearchScenario {
    private WebDriver driver = new HtmlUnitDriver();

    @Given("^i open \"([^\"]*)\"$")
    public void the_page_is_open(String page) throws Throwable {
        driver.get(page);
    }

    @When("^i search for \"([^\"]*)\"$")
    public void I_search_for(String search) throws Throwable {
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(search);
        element.submit();
    }

    @Then("^the browser title should contain \"([^\"]*)\"$")
    public void a_browser_title_should_contains(String text) throws Throwable {
        assertTrue(driver.getTitle().contains(text));
    }
}
