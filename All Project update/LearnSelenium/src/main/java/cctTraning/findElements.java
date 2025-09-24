package cctTraning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/s?k=iphone");
		driver.manage().window().maximize();
		List<WebElement> listPhones= driver.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//a/h2"));
		for(WebElement listphone: listPhones) {
			System.out.println(listphone.getText());
		}
		//Handling browser navigation
		driver.navigate().back();
driver.navigate().forward();

driver.navigate().to("https://www.amazon.com/");
	}

}
