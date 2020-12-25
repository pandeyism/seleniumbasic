package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1Selenium {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanjeev\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();
		
		WebElement surname=driver.findElement(By.cssSelector("input.inputtext._58mg._5dba._2ph-"));
		surname.sendKeys("paney");
		
		
		
	}

}
