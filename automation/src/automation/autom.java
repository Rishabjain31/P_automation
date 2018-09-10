package automation;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autom {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishabh.jain1\\Documents\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("");
		 //given().auth().basic("username", "password").when().get("/secured/hello").then().statusCode(200);

		  try {		   
		   Robot robot = new Robot();
		   robot.keyPress(KeyEvent.VK_A);
		   //Thread.sleep(100);
		   robot.keyPress(KeyEvent.VK_D);
		   //Thread.sleep(100);
		   robot.keyPress(KeyEvent.VK_M);
		   //Thread.sleep(100);
		   robot.keyPress(KeyEvent.VK_I);
		   Thread.sleep(100);
		   robot.keyPress(KeyEvent.VK_N);
		   //Thread.sleep(100);
		   robot.keyPress(KeyEvent.VK_TAB);
		   //Thread.sleep(100);
		   robot.keyPress(KeyEvent.VK_A);
		   //Thread.sleep(100);
		   robot.keyPress(KeyEvent.VK_D);
		   //Thread.sleep(100);
		   robot.keyPress(KeyEvent.VK_M);
		   //Thread.sleep(100);
		   robot.keyPress(KeyEvent.VK_I);
		   //Thread.sleep(100);
		   robot.keyPress(KeyEvent.VK_N);
		   //Thread.sleep(100);
		   robot.keyPress(KeyEvent.VK_ENTER);
		   //Thread.sleep(100);
		  } catch (Exception e) {
		   System.out.println(e);
		  }
		 }
	}		
	
