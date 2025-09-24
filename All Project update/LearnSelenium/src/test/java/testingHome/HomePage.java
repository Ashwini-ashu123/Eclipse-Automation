package testingHome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(linkText = "Shop")
	WebElement shopLink;
	
	@FindBy(linkText = "Home")
	WebElement homeLink;
	
	@FindBy(xpath = "//div[@class='n2-ss-slider-3']/div//img")
	List<WebElement> getslides;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickShop() {
		shopLink.click();
	}
	public void clickHome() {
		homeLink.click();
		}
	
	public int getslide() {
		return getslides.size();
	}
	
	
}
