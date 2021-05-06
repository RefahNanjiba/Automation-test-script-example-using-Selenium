package seleniumFirstClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class firstScript {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("span")).click();
		driver.findElement(By.linkText("About")).click();
		String text = driver.findElement(By.className("body-large")).getText();
		System.out.println(text);
		String verify = "Selenium is a suite of tools for automating web browsers.";
		if(text.contentEquals(verify))
			{
				System.out.println("Test Passed");
			}
		else
			{
				System.out.println("Test Failed");
			}
		
		driver.navigate().back();
       
    }

}