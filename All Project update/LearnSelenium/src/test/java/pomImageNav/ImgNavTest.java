package pomImageNav;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ImgNavTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();

		ImgNav ImgNav = new ImgNav(driver);
		ImgNav.shopClick();
		ImgNav.homeClick();
		int actualarrival = ImgNav.arrivals();
		int expectedarrival = 3;
		String currentURL = driver.getCurrentUrl();

		System.out.println(currentURL);
		Assert.assertEquals(actualarrival, expectedarrival);
		ImgNav.imgClick();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String produtURL = driver.getCurrentUrl();
		System.out.println(produtURL);
//		WebElement basket=ImgNav.basket();
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(basket));
//		Assert.assertTrue(basket.isDisplayed());

		String actualpargh = ImgNav.pargh();
		String expectedPargh = "The Selenium WebDriver Recipes book is a quick problem-solving guide to automated testing web applications with Selenium WebDriver. It contains hundreds of solutions to real-world problems, with clear explanations and ready-to-run test scripts you can use in your own projects.";
		Assert.assertEquals(actualpargh, expectedPargh);
		driver.quit();

	}

}
