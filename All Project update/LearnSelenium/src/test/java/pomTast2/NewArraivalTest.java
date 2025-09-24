package pomTast2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NewArraivalTest {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		NewArraival newarrival=new NewArraival(driver);
		newarrival.shopClick();
		newarrival.homeClick();
		int arraival=newarrival.arrivals();
		int expected =3;
		Assert.assertEquals(arraival, expected);
		
	}
	
	

}
