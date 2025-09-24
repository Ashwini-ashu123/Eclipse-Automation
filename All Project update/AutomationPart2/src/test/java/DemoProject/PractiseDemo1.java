package DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static java.lang.Thread.sleep;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/?utm_source");
//		WebElement SelectTag = driver.findElement(By.tagName("Select"));
//        SelectTag.click();
//        Select sel = new Select(SelectTag);
//        sel.selectByValue("JPN");
////        sel.selectByIndex(5);
//        System.out.println("dza is selected");
//        
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.w3schools.com/");
//        WebElement vul = driver.findElement(By.xpath("//h2[contains(text(),'Statistics')]"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();",vul);
////        js.executeScript("window.scrollBy(0,10000");
//		
//        driver.switchTo().newWindow(WindowType.TAB);
        
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
        
        driver.findElement(By.id("Accepted Elements")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='../../demoSite/practice/droppable/accepted-elements.html']")));
        System.out.println("frame is click");
        WebElement sourceElement = driver.findElement(By.id("draggable"));
        System.out.println("drag element is found");
        WebElement targetElement = driver.findElement(By.id("droppable"));
        System.out.println("drop element is found");
        Actions act = new Actions(driver);
        
        act.dragAndDrop(sourceElement, targetElement).perform();
        String actualtext =targetElement.getText();
        System.out.println(actualtext);
        String Expectedtext = "Dropped!";
        System.out.println("Drag and Drop done successfully!");
        Assert.assertEquals(actualtext, Expectedtext,"Not drag and droped");
        sleep(2000);


	}

}
