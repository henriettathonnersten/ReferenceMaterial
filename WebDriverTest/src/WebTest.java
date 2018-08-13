import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {
	
	@Test
	public void openGoogleTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dale\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver myDriver = new ChromeDriver();
		myDriver.manage().window().maximize();
		myDriver.get("http://www.google.co.uk");
	WebElement myElement = 	myDriver.findElement(By.cssSelector("#tsf > div.tsf-p > div.jsb > center > input[type=\"submit\"]:nth-child(1)"));
		assertTrue(myElement.isDisplayed());
		myDriver.close();
	}

}
