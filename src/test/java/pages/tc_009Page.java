package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.BasePage;

public class tc_009Page extends BasePage {

    private WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By fileInput = By.id("fileInput");
    private By previewPane = By.id("previewPane");

    private long specifiedMaxTimeMS = 1000; // 1 second in milliseconds

    public tc_009Page() {
        this.driver = super.driver;
    }

    public void navigateToFileUploadPage() {
        driver.get("http://example.com/file-upload");
    }

    public boolean uploadFile(int sizeMB) {
        WebElement fileInputElement = driver.findElement(fileInput);
        fileInputElement.sendKeys("/path/to/file_" + sizeMB + "MB");
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.click();

        // Placeholder: logic to capture upload completion time
        long processingTimeMS = getProcessingTime();

        return processingTimeMS < specifiedMaxTimeMS;
    }

    public boolean isProcessingTimeAcceptable() {
        // Placeholder: logic to determine if within time
        long processingTime = getProcessingTime();
        return processingTime < specifiedMaxTimeMS;
    }

    public void measureResponseTime() {
        // Placeholder: logic to start timing from selection to preview
        long startTime = System.currentTimeMillis();
        WebElement previewElement = driver.findElement(previewPane);
        wait.until(ExpectedConditions.visibilityOf(previewElement));
        long responseTime = System.currentTimeMillis() - startTime;

        // Store or log response time as required
    }

    public boolean isResponseTimeWithinLimits() {
        long responseTime = getResponseTime();
        return responseTime < specifiedMaxTimeMS;
    }

    // Placeholder methods for demonstration purposes
    private long getProcessingTime() {
        return 500; // Dummy value
    }

    private long getResponseTime() {
        return 500; // Dummy value
    }
}