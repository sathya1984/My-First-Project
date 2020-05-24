package org.test.live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\SeleniumProgarm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		Actions a=new Actions(driver);
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
		a.moveToElement(mobile).build().perform();
		Thread.sleep(2000);
		WebElement range = driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
		a.moveToElement(range).click().build().perform();
	}
	}


