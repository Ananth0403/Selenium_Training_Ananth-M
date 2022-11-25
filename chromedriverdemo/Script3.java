package chromedriverdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script3 {
	
	@Test
	public void dayOneProgram() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
		driver.findElement(By.linkText("New user? Signup")).click();
		Thread.sleep(3000);

		WebElement username = driver.findElement(By.id("name"));
		username.sendKeys("Ananth");

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Ananth@gmail.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Abcd@123a4");


		WebElement states = driver.findElement(By.id("state"));
		Select state = new Select(states);
		List<WebElement> allValues = state.getOptions();
		

		for(WebElement w1 : allValues) {
			if(w1.equals("Rajasthan"))
				break;
		}

		System.out.println("loop breaked");


	}

}
