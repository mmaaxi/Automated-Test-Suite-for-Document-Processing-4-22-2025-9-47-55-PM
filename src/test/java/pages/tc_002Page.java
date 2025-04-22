package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {

    WebDriver driver;

    private By uploadInput = By.id("upload-input");
    private By previewSection = By.id("preview-section");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadFile(String fileType) {
        String filePath = getFilePath(fileType);
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys(filePath);
    }

    private String getFilePath(String fileType) {
        // Mock file path based on file type, in a real scenario this should point to an actual file
        return "path/to/testfile." + fileType.toLowerCase();
    }

    public boolean isPreviewDisplayed() {
        WebElement previewElement = driver.findElement(previewSection);
        return previewElement.isDisplayed();
    }
}