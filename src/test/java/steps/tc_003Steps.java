package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_003Page;

public class tc_003Steps {
    WebDriver driver = new ChromeDriver();
    tc_003Page fileUploadPage = new tc_003Page(driver);

    @Given("I am on the file upload page")
    public void i_am_on_the_file_upload_page() {
        driver.get("http://example.com/upload");
    }

    @When("I attempt to upload a file with an unpermitted format or size greater than 50 MB")
    public void i_attempt_to_upload_a_file_with_unpermitted_format_or_size() {
        fileUploadPage.uploadFile("path/to/large_or_invalid_file");
    }

    @Then("I should see an error message indicating invalid format or exceeded size")
    public void i_should_see_an_error_message_indicating_invalid_format_or_exceeded_size() {
        String errorMessage = fileUploadPage.getErrorMessage();
        Assert.assertTrue(errorMessage.contains("invalid format") || errorMessage.contains("exceeded size"));
        driver.quit();
    }
}