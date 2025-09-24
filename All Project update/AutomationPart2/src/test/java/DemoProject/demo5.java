package DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.linkText("SwitchTo")).click();
		driver.findElement(By.partialLinkText("Frames")).click();
		
		driver.switchTo().frame("SingleFrame");
		System.out.println("came to frame");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ashu");
		System.out.println("name is printed on the text box");
		
		driver.switchTo().defaultContent();
		System.out.println("===========");
		
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
		
		WebElement element1 = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
		driver.switchTo().frame(element1);
		System.out.println("came into the multiple frame");
		WebElement element2 = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
		driver.switchTo().frame(element2);
		System.out.println("switch to iframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ashu multiple iframe");
		System.out.println("name is printed on the text box");
		
		driver.switchTo().defaultContent();
		
		WebElement register = driver.findElement(By.partialLinkText("Register"));
		
//		driver.switchTo().window(register);
		
		
		
		

	}

}
