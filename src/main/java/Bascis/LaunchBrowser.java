package Bascis;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		System.out.println("ParentWindow Title "+driver.getTitle());
		driver.findElement(By.xpath("//button[contains(text(),'New Window')]")).click();
		
		Set<String> handler= driver.getWindowHandles();
		Iterator<String> it= handler.iterator();
		String parentWindowId= it.next();
		String childWindowID= it.next();
		driver.switchTo().window(childWindowID);
		System.out.println("ChildWindow Title"+driver.getTitle());
		driver.switchTo().window(parentWindowId);
		System.out.println("ParrentWindow title "+driver.getTitle());
		
	}

}
