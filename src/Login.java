

import org.openqa.jetty.html.List;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		
		FirefoxProfile profile = new FirefoxProfile(); 
		profile.setPreference("general.useragent.locale", "en-US");  
		profile.setPreference("intl.accept_languages", "en-US");
		
		
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://10.120.1.39/");
		driver.manage().window().maximize();
		
		WebElement signupLogin = driver.findElement(By.className("login"));
		signupLogin.click();
		
		
		WebElement loginbutton = driver.findElement(By.linkText("Log In"));
		loginbutton.click();
		WebElement account = driver.findElement(By.name("account"));
		account.sendKeys(new CharSequence[]{"918qq.com"});
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement password = driver.findElements(By.name("password")).get(1);
		password.sendKeys(new CharSequence[]{"123456"});
		
		WebElement signin = driver.findElements(By.className("submit")).get(1);
		signin.click();	
		
		WebElement Popbox = (WebElement) driver.findElements(By.className("ui_prompt_box")).get(1);
		String popbox_prompt_error = Popbox.getText();
		System.out.println(popbox_prompt_error);
		if(Popbox.isDisplayed()){
			
			if(Popbox.equals("Account name or password is wrong")){
				System.out.println("Pass");
			}else{
				System.out.println("Fail");
			}
		}else{
			System.out.println("False");
		}
	}
}
