package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {
    WebDriver driver;

    By documentosSubidos = By.id("documentosSubidos");
    By procesarButton = By.id("procesarButton");
    By slipGeneratedMessage = By.id("slipGeneratedMessage");
    By historialDocumentos = By.id("historialDocumentos");
    By historialDatos = By.id("historialDatos");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void cargarYProcesarDocumentos() {
        driver.findElement(documentosSubidos).click();
    }

    public void procesarSolicitud() {
        driver.findElement(procesarButton).click();
    }

    public void verificarGeneracionSlip() {
        boolean isSlipGenerated = driver.findElement(slipGeneratedMessage).isDisplayed();
        assert isSlipGenerated : "Slip de salida no fue generado.";
    }

    public void verificarDocumentosOriginalesGuardados() {
        boolean areDocumentsSaved = driver.findElement(historialDocumentos).isDisplayed();
        assert areDocumentsSaved : "Documentos originales no están guardados en el historial.";
    }

    public void verificarDatosExtraidosAlmacenados() {
        boolean isDataStored = driver.findElement(historialDatos).isDisplayed();
        assert isDataStored : "Datos extraídos no están almacenados en el historial de la solicitud.";
    }
}