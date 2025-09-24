package LearnJava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		WebElement searchbox=driver.findElement(By.id("nav-bb-search"));
//		searchbox.clear();
//		searchbox.sendKeys("iphone");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		System.out.println("********");
//		List<WebElement> listnames=driver.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//a/h2"));
//		
//		
//		for(WebElement listname:listnames) {
//			System.out.println(listname.getText());
//		}
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box')]")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
//		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm')]")).click();
//		Alert alertwithOk=driver.switchTo().alert();
		alert.dismiss();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
		
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		
		driver.findElement(By.xpath("//a[@class='analystic']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		WebElement multipleframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(multipleframe);
		WebElement singleframe=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
		
		

		
	}
}
