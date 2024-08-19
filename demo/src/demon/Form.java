


package demon;

import org.openqa.selenium.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import foam.Select;
//import foam.WebElement;

public class Form {
	public static void main(String[] args) {
		System.out.println("test");
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		try {
//		
            driver.get("https://demoqa.com/automation-practice-form");
            driver.findElement(By.id("firstName")).sendKeys("karan");
            driver.findElement(By.id("lastName")).sendKeys("bajwa");
            driver.findElement(By.id("userEmail")).sendKeys("karanbajwa0031@gmail.com");

            WebElement radio = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radio);
            radio.click();

            driver.findElement(By.id("userNumber")).sendKeys("7626929717");

//            WebElement dateElement = driver.findElement(By.id("dateOfBirthInput"));
//            dateElement.click();
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dateElement);
//            dateElement.click();
//
//            WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
//            Select selectYear = new Select(yearDropdown);
//            selectYear.selectByVisibleText("2003");
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yearDropdown);
//            yearDropdown.click();
//
//            WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
//            Select selectMonth = new Select(monthDropdown);
//            selectMonth.selectByVisibleText("June");
////            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", monthDropdown);
////            monthDropdown.click();
//
//            WebElement day = driver.findElement(By.className("react-datepicker__day--007"));
//            day.click();
////            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", day);
////            day.click();


            WebElement checkbox1 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox1);
            checkbox1.click();
            WebElement checkbox2 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox2);
            checkbox2.click();
            
            driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Asus\\Pictures\\trip\\IMG_1417.jpg");
            driver.findElement(By.id("currentAddress")).sendKeys("gurdaspur");
            
            
            WebElement subjectInput = driver.findElement(By.cssSelector(".subjects-auto-complete__input input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", subjectInput);

            subjectInput.sendKeys("Physics");
            Thread.sleep(1000);
            subjectInput.sendKeys(Keys.TAB); // Ensure to trigger the selection
            
            
            
            

	        WebElement state = driver.findElement(By.id("react-select-3-input"));
	        state.sendKeys("Haryana");
	        state.sendKeys(Keys.ENTER);

	        WebElement city = driver.findElement(By.id("react-select-4-input"));
	        city.sendKeys("Panipat");
	        city.sendKeys(Keys.ENTER);
            
            
      

            WebElement button =  driver.findElement(By.id("submit"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
            button.click();

	}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
//			driver.quit();
		}
	}

}