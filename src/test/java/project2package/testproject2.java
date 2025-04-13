package project2package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testproject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WebDriver Initialization
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				// Setup Site
				driver.get("https://trytestingthis.netlify.app/");
				driver.manage().window().maximize();
				
				// First Name
				driver.findElement(By.id("fname")).sendKeys("Rubya");
				
				// Last Name
				driver.findElement(By.id("lname")).sendKeys("Rochona");
				
				// Radio Button
				WebElement radiobtn = driver.findElement(By.id("female"));
				radiobtn.click();
				
				// check if radio button is selected
				assert radiobtn.isSelected();
				System.out.println(radiobtn.isSelected());
				
				// Dropdown
				WebElement testdropdown = driver.findElement(By.id("option"));
				Select dropdown = new Select(testdropdown);
				//dropdown.selectByIndex(2);
				//dropdown.selectByValue("option 3");
				dropdown.selectByVisibleText("Option 1");
				
				// Checklist
				driver.findElement(By.name("option2")).click();
				driver.findElement(By.name("option3")).click();
				
				// Textarea
				driver.findElement(By.name("message")).clear();
				driver.findElement(By.name("message")).sendKeys("SQA confirms software quality with thorough tests.");
				
				
				// Wait for 5 second before Submitting
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// Submit
				driver.findElement(By.cssSelector("button.btn.btn-success")).click();

	}

}
