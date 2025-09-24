import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
/*		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.xpath("//a[text()='Alerts']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		System.out.println(alert.getText());
		alert.dismiss();
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt ')]")).click();
		alert.sendKeys("Hi");
		System.out.println(alert.getText());
		*/
		
		// frames
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.linkText("Frames")).click();
		WebElement frame=driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		System.out.println("click");
		WebElement mulitple= driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")). sendKeys("Hi");
		driver.switchTo().defaultContent();
		// window handling
		
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.linkText("Windows")).click();
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		System.out.println("!st window URL: "+driver.getCurrentUrl());
		String parentHandle= driver.getWindowHandle();  // parent current window
		driver.findElement(By.xpath("//div[@id='Seperate']//button")).click();
		
//		driver.switchTo().window(parentHandle);
		
		System.out.println("!st window URL: "+driver.getCurrentUrl());
		
		System.out.println(parentHandle);
		Set<String> windowhandles=driver.getWindowHandles();
		List<String> listwindow=new ArrayList<>(windowhandles);
//		String secondwindow=listwindow.get(1);
//		driver.switchTo().window(secondwindow);
		String secondWindow = listwindow.get(1); // Get the second window handle
	    driver.switchTo().window(secondWindow);
	    System.out.println("Second window URL: "+driver.getCurrentUrl());
	    driver.close();
	    driver.switchTo().window(listwindow.get(0));
	    
	    System.out.println(driver.getCurrentUrl());
		
//		for(String child:driver.getWindowHandles()) {
//			driver.switchTo().window(child);
//		}
//		System.out.println("Second window URL: "+driver.getCurrentUrl());
		
		
		
		
//		
		
		
		
		 
		
		
		
		
		

	}

}
