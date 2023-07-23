package ahdjk;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//implicit wait - 2 seconds time out
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Ahad");
		driver.findElement(By.name("inputPassword")).sendKeys("abgdsg");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("AhadKhan");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("zdfxg@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).clear();
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("ahad@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543214");
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p.infoMsg")).getText());
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class*=\"go-to-login\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("Ahad");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("signInBtn")).click();
		
		
		
		
		//38
	}

}
