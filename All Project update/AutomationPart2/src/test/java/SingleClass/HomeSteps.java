package SingleClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeSteps {
	
	WebDriver driver;
	
	@FindBy(linkText="Shop")
	WebElement shopLink;
	
	@FindBy(linkText="Home")
	WebElement HomeLink;
	
	@FindBy(xpath="//a[@class='woocommerce-LoopProduct-link']//img")
	List<WebElement> NoOfArrivals ;
	
	@FindBy(xpath="(//a[@class='woocommerce-LoopProduct-link']//img)[2]")
	WebElement clickImg;
	
	@FindBy(xpath="//h1[@class='product_title entry-title']")
	WebElement BookName;
	
	@FindBy(xpath="//button")
	WebElement AddtoBasket;
	
	@FindBy(xpath="//span[contains(text(),'item')]")
	WebElement Item;
	
	@FindBy(xpath="//a[contains(text(),'Checkout')]")
	WebElement Checkout;
	
	@FindBy(name="coupon_code")
	WebElement CouponCode;
	
	@FindBy(name="apply_coupon")
	WebElement applyCoupon;
	
	@FindBy(xpath="//li[contains(text(),'The minimum spend for this coupon is')]")
	WebElement verifyLastText;
	
	@FindBy(xpath="//span[@class='woocommerce-Price-amount amount']")
	WebElement amountText;
	
	@FindBy(xpath="(//span[@class='woocommerce-Price-amount amount'])[3]")
	WebElement subtotal;
	
	@FindBy(xpath="(//span[@class='woocommerce-Price-amount amount'])[5]")
	WebElement total;
	
	
	
	public HomeSteps(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickShop() {
		shopLink.click();
	}
	
	public void clickHome() {
		HomeLink.click();
	}
	
	public int ArrivalSize() {
		return NoOfArrivals.size();
	}
	
	public void ArrivalImgClick() {
		clickImg.click();
	}
	
	public String VerfiyText() {
		return BookName.getText();
	}
	
	
	public String VerifyButtonText() {
		return AddtoBasket.getText();
	}
	
	public void ClickButton() {
		AddtoBasket.click();
	}
	
	public String checkItem() {
		return Item.getText();
	}
	
	public void ClickItem() {
		Item.click();
	}
	
	public String TextCheckout() {
		return Checkout.getText();
	}
	
	public void CouponCodeClick() {
		CouponCode.click();
		CouponCode.sendKeys("krishnasakinala");
		applyCoupon.click();
		
	}
	
	public String verify2Text() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(verifyLastText));
		return  verifyLastText.getText();
	}
	
	public String amountVerfiy() {
		return amountText.getText();
	}
	
	public String SubtotalValue() {
		return subtotal.getText();
	}
	
	public String totalValue() {
		return total.getText();
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
