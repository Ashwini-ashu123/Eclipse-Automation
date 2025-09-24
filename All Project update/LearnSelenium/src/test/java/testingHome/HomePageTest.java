package testingHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in");
		HomePage homepage =new HomePage(driver);
		homepage.clickShop();
		homepage.clickHome();
		int actualsize=homepage.getslide();
		int expectedsize=3;
		org.testng.Assert.assertEquals(actualsize, expectedsize);

	}
	
}
