package ActionalClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement doublebtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		act.doubleClick(doublebtn).perform();
		Thread.sleep(2000);
		
		WebElement rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.contextClick(rightclick).perform();
		Thread.sleep(200);
		
//		WebElement click = driver.findElement(By.xpath("//button[contains(text(),'Click Me']"));
		WebElement click = driver.findElement(By.className("tbn"));
		act.click(click).perform();
		
		
		
		
		
		
		
		
	}

}
