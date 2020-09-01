package Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumMethods {

	
	
	WebDriver driver = new ChromeDriver();

	public void elementWaitClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	WebElement elm = driver.findElement(By.xpath("//a[@value='hbas2113k']"));
	
	Select slc = new Select(elm);
	
	Actions action = new Actions(driver);
	File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	
	
	
	
	
	
}
