import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tc_005Page {
    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");

    public Tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void attemptToProceedWithoutDocument() {
        driver.findElement(uploadButton).click();
    }

    public boolean isProgressionPrevented() {
        return driver.findElements(errorMessage).size() > 0;
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}