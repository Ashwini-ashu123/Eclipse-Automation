package cctTraning;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandlingClass {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		System.out.println("parent url: "+driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[@target='_blank']/button")).click();
		
		Set<String> windowshandles=driver.getWindowHandles();
		List<String> listWindows=new ArrayList<>(windowshandles);
		String secondwindow=listWindows.get(1);
		driver.switchTo().window(secondwindow);
		System.out.println("Child url: "+driver.getCurrentUrl());
		
	}

}
