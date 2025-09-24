package LearnSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day1 { 
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		// 1.attribute xpath
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("DemoCSR");
		// 2. Partial xpath using attribute 
		driver.findElement(By.xpath("//input[contains(@id,\"pass\")]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,\"decor\")]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"CRM\")]")).click();
		driver.findElement(By.xpath("//a[text()=\"Leads\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Crealte\")]")).click();
		
//		
//		WebElement username= driver.findElement(By.id("username"));
//		username.sendKeys("DemoCSR");
//		WebElement password= driver.findElement(By.id("password"));
//		password.sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
//		driver.findElement(By.linkText("CRM/SFA")).click();
//		driver.findElement(By.linkText("Create Account")).click();
//		Thread.sleep(2000);
//		WebElement industry=driver.findElement(By.name("industryEnumId"));
//		Select indus=new Select(industry);
//		indus.selectByValue("IND_PRESS");
//		WebElement accName=driver.findElement(By.id("accountName"));
//		accName.sendKeys("Vignesh");
//		WebElement localName= driver.findElement(By.id("groupNameLocal"));
//		localName.sendKeys("vicky");
//		WebElement ownership= driver.findElement(By.name("ownershipEnumId"));
//		Select os=new Select(ownership);
//		os.selectByVisibleText("Public Corporation");
//		WebElement des= driver.findElement(By.name("description"));
//		des.sendKeys("This is the testing process");

		
	}

}
