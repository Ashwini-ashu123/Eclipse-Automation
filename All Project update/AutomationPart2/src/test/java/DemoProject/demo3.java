package DemoProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.linkText("SwitchTo")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();
		
		driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
		
	    Alert alt = driver.switchTo().alert();
	   
	    alt.accept();
	  
	    driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='CancelTab']/button")).click();
	    Alert alt1 = driver.switchTo().alert();
	    alt1.dismiss();
	    
	    String actualText = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	    System.out.println(actualText);
	    
	    if(actualText.equalsIgnoreCase("You pressed Ok")) {
	    	System.out.println("Ok button is pressed");
	    }else {
	    	System.out.println("Cancel button is pressed");
	    }
	    
	    driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
	    driver.findElement(By.xpath("//div[@id='Textbox']/button")).click();
	    
	    alt1.sendKeys("User");
	    Thread.sleep(3000);
	    alt1.accept();
	    
	    String Actualwords = driver.findElement(By.id("demo1")).getText();
	    System.out.println(Actualwords);
	    if(Actualwords.contains("User")) {
	    	System.out.println("given text is enter into the textbox");
	    }else {
	    	System.out.println("No such words apperar on the screen");
	    }
	    
	    
	    
		
	}

	

}
