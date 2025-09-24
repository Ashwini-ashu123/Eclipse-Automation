package DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
public static void main(String [] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://test.salesforce.com");
		
		driver.findElement(By.id("username")).sendKeys("awhris@salesforce.com.uat");
		
		driver.findElement(By.name("pw")).sendKeys("RIS@2025");
		
		WebElement Login = driver.findElement(By.id("Login"));
		String attribute = driver.findElement(By.id("Login")).getAttribute("value");
		Boolean LoginButton = driver.findElement(By.id("Login")).isEnabled();
		Login.click();
		
		
		
		System.out.println(attribute);
		System.out.println(LoginButton);
	}

}
