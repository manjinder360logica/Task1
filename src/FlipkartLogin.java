import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartLogin 
	{
		static WebDriver driver;

		
		
		public static void main(String[] args)  
	    {
			
	    	System.setProperty("webdriver.gecko.driver","D:\\Firefox\\geckodriver.exe");
	    	System.out.println("Launch app Successfully");
	    	 
			WebDriver driver = new FirefoxDriver();
			
			driver.get("http://www.flipkart.com");
			 driver.manage().window().maximize();  
			  WebElement MobileNo =driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
			  MobileNo.sendKeys("9711316582");
			  
			  WebElement Password =driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
			  Password.sendKeys("Test@123");
			  //driver.wait(2000);
			  WebElement Button =driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			  	//WebElement Button =driver.findElement(By.xpath("//button[@class='_2VTdOs _1_qmw3']"));
			  	Button.click();
			  	
			  	System.out.println("App Login successfully");
			  	driver.close();
	    }
		}	



}
