package com.sio.webtestin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Notification {
	@Test (priority=1)
	public void DispalyRedPoint() {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		
		FirefoxProfile profile = new FirefoxProfile(); 
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://10.120.1.39/");
		
		WebElement signupLogin = driver.findElement(By.className("login"));
		signupLogin.click();
		
		WebElement account = driver.findElement(By.name("account"));
		account.sendKeys(new CharSequence[]{"sunny2@qq.com"});
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement password = (WebElement)driver.findElements(By.name("password")).get(1);
		password.sendKeys(new CharSequence[]{"123456"});
		
		WebElement signin = (WebElement)driver.findElements(By.className("submit")).get(1);
		signin.click();	
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement redpoint = driver.findElement(By.cssSelector(".notifications.new"));
		if(redpoint.isDisplayed()){
			System.out.println("Pass,the red point is displayed!");
		}else{
			System.out.print("Failed");
		}
		redpoint.click();
		WebElement newmark = driver.findElement(By.className("new_mark"));
		Assert.assertEquals("NEW", newmark.getText());
		
	}
	//@Test
	//public void ClickDropList(){
		//WebElement droplist=
	}
	
