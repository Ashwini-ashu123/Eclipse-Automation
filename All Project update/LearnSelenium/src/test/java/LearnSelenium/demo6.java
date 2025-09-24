package LearnSelenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo6 {

	public demo6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/?utm_source");
		
        WebElement SelectTag = driver.findElement(By.tagName("Select"));
        SelectTag.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='IND'; arguments[0].dispatchEvent(new Event('change'));", SelectTag);
//        js.executeScript("arguments[0].value='MEX'; arguments[0].dispatchEvent(new Event('change'));",SelectTag);
        System.out.println("scrolled");
        
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.w3schools.com/");
        WebElement vul = driver.findElement(By.xpath("//h2[contains(text(),'Vue')]"));
        js.executeScript("arguments[0].scrollIntoView();",vul);
        
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
        driver.findElement(By.id("Accepted Elements")).click();
//        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
        WebElement frame=driver.findElement(By.xpath("//iframe[@src=\"../../demoSite/practice/droppable/accepted-elements.html\"]"));

        System.out.println("frame is click");
//        Thread.sleep(2000);
        driver.switchTo().frame(frame);
        WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable-nonvalid']//p"));
        System.out.println("Selected");
        WebElement targetElement = driver.findElement(By.id("droppable"));
        Actions act = new Actions(driver);
        act.dragAndDrop(sourceElement, targetElement).perform();
        System.out.println("Drag and Drop done successfully!");

        driver.quit();

        
        
        

	}

}
