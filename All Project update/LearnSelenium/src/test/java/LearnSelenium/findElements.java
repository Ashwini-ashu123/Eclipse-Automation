package LearnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class findElements {
	@Test
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/");
		List<WebElement> listMains= driver.findElements(By.xpath("//nav[@id='main-nav-wrap']//li"));
//					System.out.println(listMains);
		for(WebElement listmain :listMains) {
			Thread.sleep(2000);
			String navList=listmain.getText();
			System.out.println(navList);
			if(navList.equals("Shop")) {
				driver.findElement(By.xpath("//a[text()='Shop']")).click();
				Thread.sleep(2000);
				String shopName= driver.findElement(By.xpath("//aside[@id='sidebar']//h4[1]")).getText();
				System.out.println("Shop Name : "+shopName);
				driver.navigate().back();
			}else if(navList.equals("My Account")) {
				driver.findElement(By.xpath("//a[text()='My Account']")).click();
				Thread.sleep(2000);
				List<WebElement> accountNames= driver.findElements(By.xpath("//div[@class='woocommerce']//div/h2"));
				for(WebElement accountName : accountNames) {
					String accdetails=accountName.getText();
					if(accdetails.equals("Login")) {
						System.out.println("Account Login Name : ");
					}else if(accdetails.equals("Register")) {
							System.out.println("Account Register Name : ");
						}
					}
				driver.navigate().back();
//					
			}else if(navList.equals("Test Cases")) {
				driver.findElement(By.xpath("//a[text()='Test Cases']")).click();
				List<WebElement> testCases=driver.findElements(By.xpath("(//ul[@class='ui module-accordion default rounded blue'])[1]/li"));
				for(WebElement testCase : testCases) {
					String testcaseName=testCase.getText();
					System.out.println(testcaseName);
				}
				
				
//				WebElement ul = driver.findElement(By.xpath("(//ul[@class='ui module-accordion default rounded blue'])[1]"));
//				List<WebElement> testCases = ul.findElements(By.tagName("li"));
//				for(WebElement testCase : testCases) {
//				    System.out.println(testCase.getText());
//				}
			} 
			
			else {
				System.out.println("No value");
			}
			
		}
	}

}
