package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    private tc_009Page fileUploadPage = new tc_009Page();

    @Given("^El usuario está en la página de carga de archivos$")
    public void userOnFileUploadPage() {
        fileUploadPage.navigateToFileUploadPage();
    }

    @When("^El usuario sube un archivo de (\\d+) MB$")
    public void userUploadsFileOfSize(int size) {
        boolean isUploaded = fileUploadPage.uploadFile(size);
        Assert.assertTrue("El archivo no se subió correctamente", isUploaded);
    }

    @Then("^La carga y procesamiento se completan en tiempos inferiores a los especificados$")
    public void verifyUploadProcessingTime() {
        boolean isTimeAcceptable = fileUploadPage.isProcessingTimeAcceptable();
        Assert.assertTrue("El tiempo de procesamiento no es el esperado", isTimeAcceptable);
    }

    @When("^El usuario mide el tiempo de respuesta desde la selección hasta la vista previa$")
    public void userMeasuresResponseTime() {
        fileUploadPage.measureResponseTime();
    }

    @Then("^El tiempo total se encuentra dentro de los límites establecidos$")
    public void verifyTotalResponseTime() {
        boolean isTimeWithinLimits = fileUploadPage.isResponseTimeWithinLimits();
        Assert.assertTrue("El tiempo total no se encuentra dentro de los límites establecidos", isTimeWithinLimits);
    }
}