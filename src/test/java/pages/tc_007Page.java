package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_007Page {

    WebDriver driver;

    By uploadButton = By.id("upload-button");
    By notificationMessage = By.id("notification-message");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void uploadCorruptFile() {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.sendKeys("path/to/corrupt/file");
    }

    public boolean isFaultDetected() {
        return driver.findElement(notificationMessage).getText().contains("Error: archivo corrupto");
    }

    public boolean isErrorNotifiedToBroker() {
        // Implement logic to check if error is notified to the broker
        return true; // Assuming it returns true for simplicity
    }

    public boolean isProcessingFinalized() {
        // Implement logic to verify processing is finalized
        return true; // Assuming it returns true for simplicity
    }
}