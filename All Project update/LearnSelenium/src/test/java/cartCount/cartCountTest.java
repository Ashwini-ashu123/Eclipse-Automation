package cartCount;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pomImageNav.ImgNav;

public class cartCountTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		ImgNav cart = new ImgNav(driver);
		cart.Login();
		cart.shopClick();
		cart.homeClick();
		int actualArrivals = cart.arrivals();
		int expectedArrivals = 3;
		Assert.assertEquals(actualArrivals, expectedArrivals);
		cart.imgClick();
		Double amount = cart.amountOfPerBook();
		System.out.println("Per book amount : " + amount); // get amount per book
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		int cartvalue = cart.quantity();
		System.out.println("Cart Value : " + cartvalue);
		double cartAmount = cart.cartAmount();
		System.out.println("Cart Amount : " + cartAmount);
		Double expectedAmount = amount * cartvalue;
		Assert.assertEquals(cartAmount, expectedAmount, "Cart Amount Mismatch");
		System.out.println("Cart Amount : " + cartAmount + " Expected Amount : " + expectedAmount + " Matched");
		Assert.assertEquals(actualArrivals, expectedArrivals);

//		driver.close();

	}

}
