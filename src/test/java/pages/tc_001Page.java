package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {
    private WebDriver driver;

    private By uploadDocumentsOption = By.id("uploadDocumentsOption");
    private By singleUploadOption = By.id("singleUploadOption");
    private By multipleUploadOption = By.id("multipleUploadOption");
    private By singleUploadBox = By.id("singleUploadBox");
    private By multipleUploadBoxes = By.className("multipleUploadBox");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openDocumentUploadPage() {
        driver.get("https://example.com/document-upload"); // Example URL
    }

    public void selectUploadDocumentsOption() {
        driver.findElement(uploadDocumentsOption).click();
    }

    public void selectSingleFileUploadOption() {
        driver.findElement(singleUploadOption).click();
    }

    public void selectMultipleFileUploadOption() {
        driver.findElement(multipleUploadOption).click();
    }

    public boolean isSingleUploadOptionVisible() {
        return driver.findElement(singleUploadOption).isDisplayed();
    }

    public boolean isMultipleUploadOptionVisible() {
        return driver.findElement(multipleUploadOption).isDisplayed();
    }

    public boolean isSingleUploadBoxEnabled() {
        WebElement uploadBox = driver.findElement(singleUploadBox);
        return uploadBox.isDisplayed() && uploadBox.isEnabled();
    }

    public boolean areMultipleUploadBoxesDisplayed() {
        return driver.findElements(multipleUploadBoxes).size() > 0;
    }
}