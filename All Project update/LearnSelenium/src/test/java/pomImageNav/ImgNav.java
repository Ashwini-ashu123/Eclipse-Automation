package pomImageNav;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImgNav {
	WebDriver driver;

	public ImgNav(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Shop")
	WebElement shopClick;
	@FindBy(linkText = "Home")
	WebElement homeClick;
	@FindBy(xpath = "//div[@class='col3-1 first sub_column sub_column_1-0-2-0 sub_column_post_22']/..//img")
	List<WebElement> arrivals; // to check 3 arrivals is there
	@FindBy(xpath = "//div[@class='col3-1 first sub_column sub_column_1-0-2-0 sub_column_post_22']//img")
	WebElement imgClick; // to click 1st img

	@FindBy(xpath = "//button[text()='Add to basket']")
	WebElement basket;
	@FindBy(xpath = "//div[@id='tab-description']//p")
	WebElement pargh;

	@FindBy(xpath = "//p[@class='price']/span")
	WebElement amount;

	@FindBy(xpath = "//div[@class='quantity']/input")
	WebElement quantity;

	@FindBy(xpath = "//span[@class='amount']")
	WebElement cartAmount;

	public void Login() {
		driver.get("https://practice.automationtesting.in/shop/");
		driver.manage().window().maximize();
	}

	public void shopClick() {
		shopClick.click();
	}

	public void homeClick() {
		homeClick.click();
	}

	public int arrivals() {
		return arrivals.size();
	}

	public void imgClick() {
		imgClick.click();
	}

	public void basket() {
		basket.click();
	}

	public String pargh() {
		return pargh.getText();
	}

	public Double amountOfPerBook() {
		String getamount = amount.getText();
		String cleanText = getamount.replace("₹", "").replace(",", "");
		Double doubleValue = Double.parseDouble(cleanText);
		return doubleValue;
	}

	public int quantity() {
		quantity.clear();
		quantity.sendKeys("5", Keys.TAB);
		basket.click();
		String valueOfQuantity = quantity.getAttribute("Value");
		int value = Integer.parseInt(valueOfQuantity);
		return value;

	}

	public double cartAmount() {
		String cartamount = cartAmount.getText();
		String cleanText = cartamount.replace("₹", "").replace(",", "");
		double doubleValue = Double.parseDouble(cleanText);
		return doubleValue;
	}
}
