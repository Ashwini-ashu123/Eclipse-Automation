package DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.linkText("SwitchTo")).click();
		driver.findElement(By.partialLinkText("Windows")).click();
		
		String parent = driver.getWindowHandle();
		System.out.println("Handle PArent " +parent);
		
		
		driver.findElement(By.xpath("//button[contains(text(),' click')]")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		for(String child : driver.getWindowHandles()) {
		driver.switchTo().window(child);
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(parent);
		System.out.println("navigate to parent now");
		
		
		System.out.println("-----------");
		
		driver.findElement(By.xpath("//a[@href='#Seperate']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		for(String child : driver.getWindowHandles()) {
		driver.switchTo().window(child);
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(parent);
		System.out.println("navigate to parent now");
		
		System.out.println("-----------");  
		
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		Thread.sleep(3000);
		System.out.println("current window " +driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//div[@id='Multiple']//button")).click();
		
		for(String child : driver.getWindowHandles()) {
			driver.switchTo().window(child);
			}
		System.out.println("child windows "+driver.getCurrentUrl());
		
		driver.switchTo().window(parent);
		
		System.out.println("-----------");
		
		
		
		
		
		
		
		
	

	

}
}
