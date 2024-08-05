package Base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Common {
public  WebDriver d;
public Actions a;
	@BeforeMethod
	@Parameters("browser")
	public void launchbrowser( String browser) {
		if(browser.equals("CH")) {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Rushikesh\\Desktop\\chromedriver.exe");
			d=new ChromeDriver();
		}
		else if(browser.equals("FF")) {
			System.setProperty("Webdriver.firefox.driver", "C:\\Users\\Rushikesh\\Desktop\\geckodriver.exe");
			d=new FirefoxDriver();
		}
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		
	}
	@AfterMethod
	public void closebrowser() throws InterruptedException {
		Thread.sleep(2000);
		d.close();
	}
	
	
	
}
