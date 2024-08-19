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
		  WebDriver driver =new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");

        try {
            // Navigate to Selenium Official Site
            driver.get("https://www.selenium.dev/");

            // Locate and click on the "Downloads" link
            WebElement downloadsLink = driver.findElement(By.linkText("Downloads"));
            downloadsLink.click();

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
