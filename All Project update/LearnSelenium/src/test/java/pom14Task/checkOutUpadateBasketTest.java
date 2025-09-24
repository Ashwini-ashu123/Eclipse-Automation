package pom14Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkOutUpadateBasketTest {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		checkOutUpadateBasket basket=new checkOutUpadateBasket(driver);
		basket.login();
		basket.clickShop();
		basket.clickHome();
		int actualArrivals = basket.arrivals();
		int expectedArrivals = 3;
		Assert.assertEquals(actualArrivals, expectedArrivals);
		basket.clickimg();
		String imgUrl=driver.getCurrentUrl();
		String expectedUrl="https://practice.automationtesting.in/product/thinking-in-html/";
		Assert.assertEquals(imgUrl,expectedUrl);
		basket.addToBasket();
		basket.clickItem();
		basket.quantityChange();
		basket.updateBasket();
		System.out.println("Completed");
	}

}
