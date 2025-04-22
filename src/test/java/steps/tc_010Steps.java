package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_010Page;

public class tc_010Steps {
    tc_010Page slipPage = new tc_010Page();

    @Given("el usuario ha cargado y procesado los documentos")
    public void elUsuarioHaCargadoYProcesadoLosDocumentos() {
        slipPage.cargarYProcesarDocumentos();
    }

    @When("el sistema procesa la solicitud")
    public void elSistemaProcesaLaSolicitud() {
        slipPage.procesarSolicitud();
    }

    @Then("se genera el 'Slip de salida'")
    public void seGeneraElSlipDeSalida() {
        slipPage.verificarGeneracionSlip();
    }

    @Then("los documentos originales se guardan en el historial")
    public void losDocumentosOriginalesSeGuardanEnElHistorial() {
        slipPage.verificarDocumentosOriginalesGuardados();
    }

    @Then("los datos extraídos se almacenan correctamente en el historial de la solicitud")
    public void losDatosExtraidosSeAlmacenanCorrectamenteEnElHistorialDeLaSolicitud() {
        slipPage.verificarDatosExtraidosAlmacenados();
    }
}