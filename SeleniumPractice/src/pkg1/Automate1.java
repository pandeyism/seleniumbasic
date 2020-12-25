package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanjeev\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.cssSelector("input[class='inputtext login_form_input_box']"));
		user.sendKeys("apple");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("1234");
		WebElement loginbutton=driver.findElement(By.id("u_0_b"));
		loginbutton.click();
	}

}
