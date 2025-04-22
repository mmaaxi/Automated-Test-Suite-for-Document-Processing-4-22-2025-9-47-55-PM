package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {
    tc_001Page documentUploadPage = new tc_001Page();

    @Given("the user has navigated to the document upload page")
    public void navigateToDocumentUploadPage() {
        documentUploadPage.openDocumentUploadPage();
    }

    @When("the user selects the 'cargar documentos' option")
    public void selectCargarDocumentosOption() {
        documentUploadPage.selectUploadDocumentsOption();
    }

    @Then("the system displays options for single and multiple uploads")
    public void verifyOptionsForUploadModes() {
        Assert.assertTrue(documentUploadPage.isSingleUploadOptionVisible());
        Assert.assertTrue(documentUploadPage.isMultipleUploadOptionVisible());
    }

    @When("the user chooses 'carga en un solo archivo'")
    public void chooseSingleFileUpload() {
        documentUploadPage.selectSingleFileUploadOption();
    }

    @Then("the system enables a single box for file upload")
    public void verifySingleUploadBoxEnabled() {
        Assert.assertTrue(documentUploadPage.isSingleUploadBoxEnabled());
    }

    @When("the user chooses 'cargar documentos por separado'")
    public void chooseMultipleFileUpload() {
        documentUploadPage.selectMultipleFileUploadOption();
    }

    @Then("the system displays multiple boxes for each required document")
    public void verifyMultipleUploadBoxesDisplayed() {
        Assert.assertTrue(documentUploadPage.areMultipleUploadBoxesDisplayed());
    }
}