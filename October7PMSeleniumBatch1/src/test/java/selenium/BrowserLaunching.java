package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunching {
	
	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		/*
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 * 
		 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();
		 */
		/*
		 * WebDriverManager.edgedriver().setup(); driver = new EdgeDriver();
		 * driver.get("www.google.com");
		 */
	 
	// WebDriverManager.chromedriver().setup();
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver84\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
		
	
		//webdriver.gecko.driver
	    //webdriver.ie.driver
	    //webdriver.edge.driver
	 
	 driver.manage().window().maximize();
	 
	 
	 
		
	}

}
