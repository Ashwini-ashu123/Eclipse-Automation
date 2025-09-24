package pom14Task;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkOutUpadateBasket {
	WebDriver driver;

	public checkOutUpadateBasket(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Shop")
	WebElement shop;
	@FindBy(linkText = "Home")
	WebElement Home;
	@FindBy(xpath = "//div[@class='col3-1 first sub_column sub_column_1-0-2-0 sub_column_post_22']/..//img")
	List<WebElement> arrivals;
	@FindBy(xpath = "(//ul[@class='products']//img)[2]")
	WebElement clickImg;
	@FindBy(xpath = "//button[text()='Add to basket']")
	WebElement addToBasket;
	@FindBy(xpath = "//span[@class='cartcontents']")
	WebElement clickItem;
	@FindBy(xpath="//input[@type='number']")
WebElement quantityChange;
	
	@FindBy(xpath = "//input[@name='update_cart']")
	WebElement updateBasket;
	
	
	public void login() {
		driver.get("https://practice.automationtesting.in/shop/");
		driver.manage().window().maximize();
	}

	public void clickShop() {
		shop.click();
	}

	public void clickHome() {
		Home.click();
	}

	public int arrivals() {
		int size = 0;
		for (int i = 0; i < arrivals.size(); i++) {
			size++;
		}
		return size;
	}

	public void clickimg() {
		clickImg.click();
	}

	public void addToBasket() {
		addToBasket.click();
	}

	public void clickItem() {
		clickItem.click();
	}
	
	public void quantityChange() {
		quantityChange.clear();
		quantityChange.sendKeys("3");
	}
	
	public void updateBasket() {
		updateBasket.click();
	}
}
