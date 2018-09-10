package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsalerts {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishabh.jain1\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector(".example li:nth-child(2) button")).click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		Alert popup = driver.switchTo().alert();
		popup.accept();
		String result = driver.findElement(By.id("result")).getText();
		System.out.println(result);
		// assertThat(result, is(equalTo("You clicked: Ok")));
	}
}
