import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Tc_005Page;

import static org.junit.Assert.assertTrue;

public class Tc_005Steps {
    WebDriver driver;
    Tc_005Page page;

    @Given("I start the document upload process")
    public void i_start_the_document_upload_process() {
        driver = new ChromeDriver();
        page = new Tc_005Page(driver);
        page.openUploadPage();
    }

    @When("I attempt to proceed without a required document")
    public void i_attempt_to_proceed_without_a_required_document() {
        page.attemptToProceedWithoutDocument();
    }

    @Then("the system should prevent progression")
    public void the_system_should_prevent_progression() {
        assertTrue(page.isProgressionPrevented());
    }

    @Then("an error message about the missing document should be shown")
    public void an_error_message_about_the_missing_document_should_be_shown() {
        assertTrue(page.isErrorMessageDisplayed());
        driver.quit();
    }
}