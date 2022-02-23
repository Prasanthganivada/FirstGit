package chromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import net.bytebuddy.asm.Advice.Enter;

public class ExploringChromeDriver2 {
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	public void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanth\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.get("https://www.w3schools.com/");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//h1[contains(text(),'Learn to Code')]"));
		
		//Thread.sleep(5000);
		//driver.findElement(By.id("search2")).sendKeys("Java");
		//driver.findElement(By.id("learntocode_searchbtn")).click();
		/*driver.quit();
		driver.findElement(By.className(null));
		driver.findElement(By.cssSelector(null));*/
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mens T-shirt");
		
		//Thread.sleep(5000);
		/*driver.findElement(By.linkText(null));
		driver.findElement(By.name(null));
		driver.findElement(By.partialLinkText(null));
		driver.findElement(By.tagName(null));*/
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//driver.quit();
        driver.executeScript("window.scrollBy(0,800)");
	}

}










