package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {

    tc_002Page uploadPage = new tc_002Page();

    @Given("El usuario está en la página de subida de archivo")
    public void elUsuarioEstaEnLaPaginaDeSubidaDeArchivo() {
        uploadPage.navigateToUploadPage();
    }

    @When("El usuario selecciona un archivo en formato {string} dentro del límite de 50 MB")
    public void elUsuarioSeleccionaUnArchivoEnFormato(String fileType) {
        uploadPage.uploadFile(fileType);
    }

    @Then("El archivo se carga y se muestra la vista previa con el nombre, tamaño y tipo del archivo")
    public void elArchivoSeCargaYSeMuestraLaVistaPrevia() {
        Assert.assertTrue(uploadPage.isPreviewDisplayed());
    }
}