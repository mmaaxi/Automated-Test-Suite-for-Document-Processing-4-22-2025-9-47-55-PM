package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("el usuario está en la página de carga de archivos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeArchivos() {
        page.navigateToUploadPage();
    }

    @When("el usuario carga un archivo corrupto")
    public void elUsuarioCargaUnArchivoCorrupto() {
        page.uploadCorruptFile();
    }

    @Then("el sistema detecta el fallo")
    public void elSistemaDetectaElFallo() {
        Assert.assertTrue(page.isFaultDetected());
    }

    @Then("el sistema notifica el error al Bróker")
    public void elSistemaNotificaElErrorAlBroker() {
        Assert.assertTrue(page.isErrorNotifiedToBroker());
    }

    @Then("el sistema finaliza el procesamiento")
    public void elSistemaFinalizaElProcesamiento() {
        Assert.assertTrue(page.isProcessingFinalized());
    }
}