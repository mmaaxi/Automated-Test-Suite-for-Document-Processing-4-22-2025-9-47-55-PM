package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {

  private WebDriver driver;

  private By uploadPageLocator = By.id("uploadPage");
  private By uploadButtonLocator = By.id("uploadButton");
  private By ocrProcessedLocator = By.id("ocrProcessed");
  private By dataExtractedLocator = By.id("dataExtracted");
  private By confirmationDisplayedLocator = By.id("confirmationMessage");

  public tc_006Page(WebDriver driver) {
    this.driver = driver;
  }

  public void navigateToUploadPage() {
    driver.findElement(uploadPageLocator).click();
  }

  public void uploadDocuments() {
    WebElement uploadButton = driver.findElement(uploadButtonLocator);
    uploadButton.sendKeys("path/to/structured_document");
    uploadButton.sendKeys("path/to/unstructured_document");
  }

  public boolean isOCRProcessed() {
    return driver.findElement(ocrProcessedLocator).isDisplayed();
  }

  public boolean isDataExtracted() {
    return driver.findElement(dataExtractedLocator).isDisplayed();
  }

  public boolean isConfirmationDisplayed() {
    return driver.findElement(confirmationDisplayedLocator).isDisplayed();
  }
}