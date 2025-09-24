package steps;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page {
	WebDriver driver;
		public page(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
			
	}
		
		@FindBy(linkText = "Shop")
		WebElement clickshop;
		
		@FindBy(linkText = "Home")
		WebElement clickhome;
		
		@FindBy(xpath = "//div[@id='text-22-sub_row_1-0-2-0-0']/../..//img")
		List<WebElement> validateslider;
		
		@FindBy(xpath = "(//div[@id='text-22-sub_row_1-0-2-0-0']/../..//img)[2]")
		WebElement clickimg;
		//***************
		@FindBy(xpath = "//button[@type='submit']")
		WebElement clickaddtobasket;
		
		@FindBy(xpath="//span[@class='cartcontents']")
		WebElement checkcart;   //same as click cart
		
		@FindBy(id = "coupon_code")
		WebElement coupon;     //krishnasakinala 
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement clickcoupon;
		
		
		public void login() {
			driver.get("https://practice.automationtesting.in/");
			driver.manage().window().maximize();
		}
		
		public void clickshop() {
			clickshop.click();
		}
		
		public void clickHome() {
			clickhome.click();
		}
		
		public int validateslider() {
			return validateslider.size();
			 
		}
		public void clickimg() {
			clickimg.click();
		}
		
		public void clickaddtobasket() {
			clickaddtobasket.click();
		}
		
		public String checkcart() {
			System.out.println(checkcart.getText());
			return checkcart.getText();
			
		}
		
		public void coupon() {
			coupon.clear();
			coupon.sendKeys("coupon",Keys.TAB);
		}
		
		public void clickcoupon() {
			clickcoupon.click();
		}
		
		

}
