package ahdjk;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipadress:4444");
		option.setCapability("proxy", proxy);
      
		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "/directory/path");

		option.setExperimentalOption("prefs", prefs);

		option.setAcceptInsecureCerts(true);
       WebDriver driver = new ChromeDriver(option);
       driver.get("https://expired.badssl.com/");
       System.out.println(driver.getTitle());
	}
	
}
