package ahdjk;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Base {


	
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
	
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait w = new WebDriverWait(driver, 5);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000); 
		addItems(driver, itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),\'PROCEED TO CHECKOUT\')]")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
	//	Thread.sleep(5000);
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		//Thread.sleep(4000);
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//Thread.sleep(5000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}
	 private static WebDriverWait WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void addItems(WebDriver driver,String[] itemsNeeded){
		 int j=0;
		 List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		 for(int i=0; i<products.size(); i++) {
		 	String[] name = products.get(i).getText().split("-");
		 	String formattedName = name[0].trim();
		 	List itemsNeededList = Arrays.asList(itemsNeeded);

		 	if(itemsNeededList.contains(formattedName))
		 	{
		 		j++;
		 		driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();
		 		if(j==itemsNeeded.length) 
		 		{
		 			break;
		 		}
		 	}
		 }
	}

}
