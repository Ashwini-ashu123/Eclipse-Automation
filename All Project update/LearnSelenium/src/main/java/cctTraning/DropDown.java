package cctTraning;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		/* Dropdown
		 *      1.Select the element
		 *      2.create object for this select element
		 *      3.to call the element
		 *  
		 */
		
		WebElement skills= driver.findElement(By.xpath("//select[@type='text']"));
		Select select=new Select(skills);
		select.selectByValue("AutoCAD");
		
	   TakesScreenshot screenshot=(TakesScreenshot)driver;
	   File source=screenshot.getScreenshotAs(OutputType.FILE);
	   File des=new File("./src/main/resources/imgstore/img001.jpg");
	   FileUtils.copyFile(source, des);
	}

}
