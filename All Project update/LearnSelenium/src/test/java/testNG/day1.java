package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public  void learntest() {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iphone 16",Keys.ENTER);
	List<WebElement> mobileNames= driver.findElements(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]//h2"));
	for(WebElement mobile:mobileNames) {
		System.out.println(mobile.getText());
		System.out.println(mobile.getAttribute("class"));
	}
	}
}
