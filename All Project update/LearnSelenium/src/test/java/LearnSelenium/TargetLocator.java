package LearnSelenium;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TargetLocator {
	@Test
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new EdgeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
//		search.sendKeys("iphone 16",Keys.ENTER);
//		List<WebElement> mobileNames= driver.findElements(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]//h2"));
//		for(WebElement mobile:mobileNames) {
//			System.out.println(mobile.getText());
//			System.out.println(mobile.getAttribute("class"));
//		}
//		search.getAttribute("value");
		 
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		WebElement from= driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("chennai",Keys.TAB);
		WebElement to= driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("Delhi",Keys.TAB);
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File srcfile=screenshot.getScreenshotAs(OutputType.FILE);
		File des=new File("./src/main/resources/snaps/img001.jpg");
		FileUtils.copyFile(srcfile, des);
		
		driver.findElement(By.id("buttonFromTo")).click();
//		List<WebElement> trainNames=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
//		for(WebElement trainName:trainNames) {
//			System.out.println(trainName.getText());
//		}
		Thread.sleep(2000);
		WebElement table= driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		List<WebElement> listrows= table.findElements(By.tagName("tr"));
		for(int i=0;i<listrows.size();i++) {
			WebElement currentrow= listrows.get(i);
			List<WebElement> listcolumn= currentrow.findElements(By.tagName("td"));
		for(int j=0;j<listcolumn.size();j++) {
			System.out.println(listcolumn.get(j).getText());
		}
		}
	
		
	}

}
