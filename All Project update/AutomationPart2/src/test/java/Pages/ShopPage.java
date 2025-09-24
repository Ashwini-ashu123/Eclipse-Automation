package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ShopPage {
	
	WebDriver driver;

	public ShopPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Shop")
	WebElement shopLink;
	
	
	@FindBy(linkText="Home")
	WebElement HomeLink;
	
	@FindBy(xpath="//a[@class='woocommerce-LoopProduct-link']//img")
	List<WebElement> NoOfArrivals ;
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement Login;
	
	
	public void openWithURL() {
		driver.navigate().to("https://practice.automationtesting.in");
		}
	public void ShopAndHomeClick() {
		shopLink.click();
		HomeLink.click();
	}
	
	public void sliderView() {
		int size = NoOfArrivals.size();
	}
	
	public void validateSliderView() {
		int size = NoOfArrivals.size();
		int expectedSize = 3;
		Assert.assertEquals(size, expectedSize);
//		Assert.assertEquals(size, expectedSize,"The size of the slider is not same as expected");
	}
	
	public void  saleforceURL() {
		driver.get("https://test.salesforce.com/");
	}
	
	public void UserNameAndPassword(String Username,String Password) {
		username.sendKeys(Username);
		password.sendKeys(Password);
		}
	
	public void loginButton() {
		Login.click();
	}
	
	
	
	
	}
