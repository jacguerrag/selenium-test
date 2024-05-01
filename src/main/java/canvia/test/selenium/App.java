package canvia.test.selenium;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String CHROME_DRIVER = System.getenv("CHROME_DRIVER");
    	String CHROME_BIN = System.getenv("CHROME_BIN");    	
    	System.out.println("CHROME DRIVER : "+CHROME_DRIVER+"\nCHROME BIN : "+CHROME_BIN);

    	System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);
    	ChromeOptions options = new ChromeOptions();
    	
    	options.setBinary(CHROME_BIN);
    	
    	WebDriver driver = new ChromeDriver(options);
        
    	String url = "https://automationexercise.com/";
        
    	driver.manage().window().maximize();
        
    	driver.get(url);

        driver.close();
    	
    	
    	
    }
}
