package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_004Page;

public class tc_004Steps {

    WebDriver driver;
    tc_004Page page;

    @Given("I am on the file upload page")
    public void i_am_on_the_file_upload_page() {
        driver = new ChromeDriver();
        driver.get("http://example.com/upload");
        page = new tc_004Page(driver);
    }

    @When("I upload a compressed file {string}")
    public void i_upload_a_compressed_file(String fileName) {
        page.uploadFile(fileName);
    }

    @Then("I should see a list of extracted documents")
    public void i_should_see_a_list_of_extracted_documents() {
        Assert.assertTrue(page.isFileExtractionSuccessful());
        driver.quit();
    }
}