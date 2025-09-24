package LearnSelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class windowHandle {
	
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Open Seperate Multiple Windows')]")).click();
		
		driver.findElement(By.xpath("//div[@id='Multiple']//button")).click();
		String currentWindow=driver.getWindowHandle();
		Set<String> windowHandles=driver.getWindowHandles();
		int sizeWindow=windowHandles.size();
		System.out.println("Total count of window: "+sizeWindow);
		List<String> windows=new ArrayList<>(windowHandles);
		String secondWindow=windows.get(1);
		driver.switchTo().window(secondWindow);
		driver.findElement(By.id("email")).sendKeys("Vignes");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
//		String web=driver.findElement(By.xpath("//span[contains(text(),'Downloads')]")).getText();
//		System.out.println(web);
		
		driver.switchTo().window(currentWindow);
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
	}
	
}
