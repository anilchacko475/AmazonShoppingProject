package Amazon.scenario1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shopping {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "<pathof driver.exe file>");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.linkText("Try different image")).click();
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abc@gmail.com");
		 driver.findElement(By.id("continue")).click();
		 driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("xxx");
		 driver.findElement(By.id("signInSubmit")).click();

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("keyboards");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		
		List<WebElement> product = driver.findElements(By.cssSelector("h2.a-size-mini"));
		for (int i = 0; i < product.size(); i++) {
			String name = product.get(i).getText();
			if (name.contains("Rainbow LED")) {
				driver.findElements(By.className("a-button-text")).get(i).click();
				
			}
			
			}
		
	driver.findElement(By.xpath("//span[@data-action='a-dropdown-button'][1]")).click();
	driver.findElement(By.cssSelector("div[class='a-popover-inner'] li[aria-labelledby='dropdown1_3']")).click();

driver.findElement(By.cssSelector("span[class='a-button-inner'] input[class='a-button-input']")).click();
 driver.findElement(By.linkText("Go to cart")).click();
   



	
 driver.findElement(By.name("proceedToRetailCheckout")).click();
 
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address-ui-widgets-enterAddressFullName")));
 driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("Rose");
 driver.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("21 abc ave");
 driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("4379790075");
 driver.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("Regina");

 JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,400)");
	

	 driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion")).click();
	    driver.findElement(By.partialLinkText("Saskatchewan")).click();
  driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("S0G 3W0");
 driver.findElement(By.id("address-ui-widgets-form-submit-button")).click();
 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
 w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Add a credit or debit card")));
 driver.findElement(By.partialLinkText("Add a credit or debit card")).click();


	}

	}

