package veevaVault;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginvault {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://login.veevavault.com/");
	driver.manage().window().maximize();
	WebElement userName= driver.findElement(By.id("j_username"));
	userName.sendKeys("prana.user2@partnersi-prana4life.com",Keys.ENTER);
	Thread.sleep(2000);
	WebElement password= driver.findElement(By.id("j_password"));
	password.sendKeys("Pr@n@_USER2!",Keys.ENTER);
	
	
}
}
