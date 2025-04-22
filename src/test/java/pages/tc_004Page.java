package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {

    WebDriver driver;

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    private By uploadInputField = By.id("file-upload");
    private By successMessage = By.id("upload-success");
    private By documentList = By.id("document-list");

    public void uploadFile(String fileName) {
        WebElement uploadElement = driver.findElement(uploadInputField);
        uploadElement.sendKeys(System.getProperty("user.dir") + "/src/test/resources/" + fileName);
        uploadElement.submit();
    }

    public boolean isFileExtractionSuccessful() {
        boolean isSuccessMessageDisplayed = driver.findElement(successMessage).isDisplayed();
        boolean isDocumentListDisplayed = driver.findElement(documentList).isDisplayed();
        return isSuccessMessageDisplayed && isDocumentListDisplayed;
    }
}