package amazon_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonbaseclass {
	
  public static Properties prop=  new Properties();
public static	WebDriver driver;
	
	public Amazonbaseclass() {
		
		try {
		FileInputStream file=new FileInputStream("C:\\Users\\anami\\Downloads\\Amazon1.0\\src\\test\\java\\environmentvariables\\Config.properties");
			
		prop.load(file);		
	}
	
	catch(FileNotFoundException e) {
		
		e.printStackTrace();
		
	}
	catch(IOException a) {
		a.printStackTrace();
		
		}
	}
		@SuppressWarnings("deprecation")
		public static void initiate() {
			
String browsername=	prop.getProperty("browser");	
			
			if(browsername.equals("GoogleChrome")) {
				
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver=new ChromeDriver();}
			
				else if (browsername.equals("chrome"))	{
					
					System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
					
					driver=new FirefoxDriver();
				}
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get((prop.getProperty("url")));
				
				
			}
		}
		
		
	
	
	
	
	
	

