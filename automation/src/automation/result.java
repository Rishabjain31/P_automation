package automation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class result {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishabh.jain1\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.cssSelector("input[id='lst-ib']")).sendKeys("irctc");
		driver.findElement(By.cssSelector("input[id='lst-ib']")).sendKeys(Keys.ENTER);
		driver.navigate().back(); // To Navigate back to previous page
		driver.navigate().forward(); // To Navigate forward to previous page
		driver.navigate().refresh(); // To Refresh the page
		List<WebElement> links = driver.findElements(By.cssSelector("h3[class='r'] a"));
		System.out.println(links.size());
		for (WebElement link : links) {
			System.out.println(link.getText());
			System.out.println("All links are: "+link.getAttribute("href"));
		}
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		String url = driver.findElement(By.xpath("(//h3[@class='r'])[3]//a")).getAttribute("href");
		System.out.println(url);
		driver.findElement(By.xpath("(//h3[@class='r'])[3]//a")).click();
//		if (url.equals(driver.getCurrentUrl()))
//			return true;
//		else
//			return false; 
	}
}
