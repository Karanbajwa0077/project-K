package demon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class debug {
    public static void main(String[] args) {
        // Setup ChromeDriver
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        try {
            // Navigate to Selenium Official Site
            driver.get("https://www.selenium.dev/");

            // Locate and click on the "Downloads" link
            WebElement downloadsLink = driver.findElement(By.linkText("Downloads"));
            downloadsLink.click();

            // Attempt to find the "Previous Releases" section
//            WebElement previousReleases = driver.findElement(By.id("unknown-id")); // Issue here
//            previousReleases.click();
         // Corrected line to find "Previous Releases" section
//            WebElement previousReleases = driver.findElement(By.xpath("//h2[text()='Previous Releases']"));
//            previousReleases.click();

            
            // Adding a wait before interacting with the "Previous Releases" section
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait
            WebElement previousReleases = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Previous Releases']")));
            previousReleases.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
