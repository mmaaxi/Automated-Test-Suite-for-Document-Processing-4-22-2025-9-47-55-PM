package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_008Page;
import utils.DriverFactory;

public class tc_008Steps {

    private WebDriver driver = DriverFactory.getDriver();
    private tc_008Page filePage = PageFactory.initElements(driver, tc_008Page.class);

    @Given("the user is on the file upload page")
    public void the_user_is_on_the_file_upload_page() {
        filePage.navigateToFileUploadPage();
    }

    @When("the user uploads multiple documents")
    public void the_user_uploads_multiple_documents() {
        filePage.uploadDocuments();
    }
    
    @Then("the system displays the name, size, and type of each file")
    public void the_system_displays_the_name_size_and_type_of_each_file() {
        Assert.assertTrue(filePage.isFileInfoDisplayed());
    }

    @When("the user deletes one of the files using the delete option")
    public void the_user_deletes_one_of_the_files_using_the_delete_option() {
        filePage.deleteFile();
    }

    @Then("the file is correctly removed from the list before confirmation")
    public void the_file_is_correctly_removed_from_the_list_before_confirmation() {
        Assert.assertTrue(filePage.isFileRemoved());
    }
}