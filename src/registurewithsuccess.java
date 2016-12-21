
import java.util.UUID;

import junit.framework.Assert;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class registurewithsuccess {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		
		FirefoxProfile profile = new FirefoxProfile(); 
		profile.setPreference("general.useragent.locale", "en-US");  
		profile.setPreference("intl.accept_languages", "en-US");
		
		
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("https://live.sioeye.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.className("login"));
		login.click();
		WebElement register = driver.findElement(By.className("btn_register"));
		register.click(); // nickname
		WebElement nickname = driver.findElement(By.name("nickname"));
		nickname.sendKeys(new CharSequence[]{"xiao"
		+ UUID.randomUUID().toString().substring(0, 15)});
		// email
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys(new CharSequence[]{UUID.randomUUID().toString().substring(0, 12)
		+ "@ctk.com"});
		// password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(new CharSequence[]{"123456"});
		// repeat_password
		WebElement repeat_password = driver.findElement(By
		.name("repeat_password"));
		repeat_password.sendKeys(new CharSequence[]{"123456"});
		// class:submit
		WebElement submit = driver.findElement(By.className("submit"));
		submit.click();
		// 等待sioeye_id元素出现，一直到40秒的超时。
		new WebDriverWait(driver, 40).until(ExpectedConditions
		.presenceOfElementLocated(By.className("sioeye_id")));
		
		// class:sioeye_id
		WebElement sioeye_id = driver.findElement(By.className("sioeye_id")); 
		boolean flag = sioeye_id != null;
		Assert.assertEquals(flag,true);
		driver.findElement(By.cssSelector(".form_con .table_register .error ")).getText();
		}
}

