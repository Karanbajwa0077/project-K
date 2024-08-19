package demon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class google {
    public static void main(String[] args) {
        // Set up ChromeDriver
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        try {
            // Navigate to Google Search Page
            driver.get("https://www.google.com");

            // Locate the search box
            WebElement searchBox = driver.findElement(By.name("q"));

            // Create an instance of Actions class
            Actions actions = new Actions(driver);

            // Type "Selenium WebDriver" in the search box using Actions
            actions.moveToElement(searchBox)
                   .click()
                   .sendKeys("gta5")
                   .perform();

            // Wait for search suggestions to appear
            Thread.sleep(2000); // Not recommended for production use; use WebDriverWait in real cases

            // Navigate through the suggestions using the DOWN arrow key
            actions.sendKeys(Keys.DOWN)
                   .sendKeys(Keys.DOWN)
                   .sendKeys(Keys.DOWN)
                   .perform();

            // Press ENTER to select the suggestion
            actions.sendKeys(Keys.ENTER)
                   .perform();

            // Additional step: Print out the search results' titles
            List<WebElement> searchResults = driver.findElements(By.xpath("//h3"));
            for (WebElement result : searchResults) {
                System.out.println(result.getText());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

