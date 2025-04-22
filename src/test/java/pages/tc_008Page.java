package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.DriverFactory;

public class tc_008Page {

    private WebDriver driver = DriverFactory.getDriver();

    @FindBy(id = "uploadPage")
    private WebElement uploadPage;

    @FindBy(id = "uploadButton")
    private WebElement uploadButton;

    @FindBy(id = "fileInfo")
    private WebElement fileInfo;

    @FindBy(id = "deleteButton")
    private WebElement deleteButton;

    public void navigateToFileUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadDocuments() {
        uploadButton.sendKeys("/path/to/document1");
        uploadButton.sendKeys("/path/to/document2");
    }

    public boolean isFileInfoDisplayed() {
        return fileInfo.isDisplayed();
    }

    public void deleteFile() {
        deleteButton.click();
    }

    public boolean isFileRemoved() {
        // Note: Implement logic to verify the file is removed from the list
        return true;  // Placeholder for actual validation
    }
}