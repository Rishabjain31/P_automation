package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice {
    public static void main(String args[])
    {  
    	//String filePath = "C:\\Users\\rishabh.jain1\\Documents\\practice\\bulb.jpg";
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishabh.jain1\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://toolsqa.com/automation-practice-form/");
        //driver.get("http://automationpractice.com");
//        driver.manage().window().maximize();
//        driver.findElement(By.cssSelector("input[class='search_query form-control ac_input']")).sendKeys("T-shirts");
//        driver.findElement((By.cssSelector("input[class='search_query form-control ac_input']"))).sendKeys(Keys.ENTER);
        //to hover over an element
//        Actions action = new Actions(driver);
//		WebElement menu = driver.findElement(By.cssSelector("div[class='left-block']"));
//		action.moveToElement(menu);
//		JavascriptExecutor js = (JavascriptExecutor) driver; js.executeScript("document.querySelector(\"a[title='Add to cart']\").click()");
//		driver.navigate().refresh();
//		js.executeScript("document.querySelector(\"a[title='Proceed to checkout']\").click()");
//		js.executeScript("document.querySelector(\"a[title='View my shopping cart']\").click()");
//     	driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
//     	driver.findElement(By.cssSelector("input[name='email_create']")).sendKeys("coolabc.def@yahoo.com");
//     	driver.findElement(By.cssSelector("button[name='SubmitCreate']")).click();
//     	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("coolabc.def@yahoo.com");
//     	driver.findElement(By.cssSelector("input[id='passwd']")).sendKeys("Password");
//     	driver.findElement(By.cssSelector("button[id='SubmitLogin']")).click();
//     	try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//     	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//     	driver.findElement(By.cssSelector("#uniform-id_gender1 input")).click();
//     	driver.findElement(By.cssSelector("input[name='customer_firstname']")).sendKeys("cool");
//     	driver.findElement(By.cssSelector("input[name='customer_lastname']")).sendKeys("abcd");
//     	driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys("Password");
//     	driver.findElement(By.cssSelector("select[id='days'] option[value='1']")).click();
//     	driver.findElement(By.cssSelector("select[id='months'] option[value='1']")).click();
//     	driver.findElement(By.cssSelector("select[id='years'] option[value='2015']")).click();
//     	driver.findElement(By.cssSelector("input[id='company']")).sendKeys("new");
//     	driver.findElement(By.cssSelector("input[id='address1']")).sendKeys("New Street");
//     	driver.findElement(By.cssSelector("input[id='city']")).sendKeys("Boston");
//     	driver.findElement(By.cssSelector("select[name='id_state'] option[value='1']")).click();
//     	driver.findElement(By.cssSelector("input[id='postcode']")).sendKeys("02101");
//     	driver.findElement(By.cssSelector("select[name='id_country'] option[value='21']")).click();
//     	driver.findElement(By.cssSelector("input[name='phone_mobile']")).sendKeys("617-555-0104");
//     	driver.findElement(By.cssSelector("input[name='alias']")).sendKeys("New Street");
//     	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//     	driver.findElement(By.cssSelector("button[name='submitAccount']")).click();
//     	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//     	driver.findElement(By.cssSelector("button[name='processAddress']")).click();
//     	driver.findElement(By.cssSelector("input[name='cgv']")).click();
//     	driver.findElement(By.cssSelector("button[name='processCarrier']")).click();
     	driver.findElement(By.cssSelector("input[id='photo']")).sendKeys("C:\\Users\\rishabh.jain1\\Documents\\practice\\bulb.jpg");
     	}

} 