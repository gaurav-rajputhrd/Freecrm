package Bascis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		//Thread.sleep(5000);
		List<WebElement> list= driver.findElements(By.cssSelector("#inputGroupSelect03 option"));
		//Thread.sleep(5000);
		System.out.println(list.size());
		for(WebElement e: list) {
			System.out.println(e.getText());
			if(e.getText()=="Proof.") {
				e.click();
			}
		}
		

	}

}
