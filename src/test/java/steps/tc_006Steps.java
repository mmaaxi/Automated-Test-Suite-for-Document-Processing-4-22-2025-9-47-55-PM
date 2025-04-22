package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

  private tc_006Page page = new tc_006Page();

  @Given("^I am on the document upload page$")
  public void iAmOnTheDocumentUploadPage() {
    page.navigateToUploadPage();
  }

  @When("^I upload structured and unstructured documents$")
  public void iUploadDocuments() {
    page.uploadDocuments();
  }

  @Then("^the system processes the documents with OCR$")
  public void theSystemProcessesDocumentsWithOCR() {
    Assert.assertTrue(page.isOCRProcessed());
  }

  @Then("^extracts the data$")
  public void extractsTheData() {
    Assert.assertTrue(page.isDataExtracted());
  }

  @Then("^displays the information for confirmation$")
  public void displaysInformationForConfirmation() {
    Assert.assertTrue(page.isConfirmationDisplayed());
  }
}