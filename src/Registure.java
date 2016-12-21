
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Registure {
	
	//1. ������ȷ������ע��ɹ�
	@Test
	public void registerWithSuccess(){
		
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		
		FirefoxProfile profile = new FirefoxProfile(); 
		profile.setPreference("general.useragent.locale", "en-US");  
		profile.setPreference("intl.accept_languages", "en-US");
		
		
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://10.120.1.39/");
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
		// �ȴ�sioeye_idԪ�س��֣�һֱ��40��ĳ�ʱ��
		new WebDriverWait(driver, 40).until(ExpectedConditions
		.presenceOfElementLocated(By.className("sioeye_id")));
		
		// class:sioeye_id
		WebElement sioeye_id = driver.findElement(By.className("sioeye_id")); 
		boolean flag = sioeye_id != null;
		Assert.assertEquals(flag,true);
		System.out.print("ע��ɹ�������");
		driver.quit();
		}
	//2. ע��--������������Ϊ��
	@Test
	public void registerWithoutValue(){
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxProfile profile = new FirefoxProfile(); 
		profile.setPreference("general.useragent.locale", "en-US");  
		profile.setPreference("intl.accept_languages", "en-US");

		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://10.120.1.39/");
		//�Ŵ󴰿�
		driver.manage().window().maximize();
		//�򿪵�¼����
		WebElement login = driver.findElement(By.className("login"));
		login.click();
		//��ע�����
		WebElement register = driver.findElement(By.className("btn_register"));
		register.click(); 
		// ���log in
		WebElement submit = driver.findElement(By.className("submit"));
		submit.click();
		//�����ʾ��Ҫ����nickname
		WebElement naickname = (WebElement) driver.findElements(By.cssSelector(".form_con .table_register .error")).get(0);
		if(naickname.isDisplayed()){
			String nickname = naickname.getText();
			System.out.println(nickname);
			if(naickname.equals("Nickname is required")){
				// TODO
				System.out.println("Pass");
			}else{
				System.out.println("Failed");
			}
		}else {
			System.out.println("Failed");
		}
		//�����ʾҪ����email
		WebElement email = (WebElement) driver.findElements(By.cssSelector(".form_con .table_register .error")).get(1);
		if(email.isDisplayed()){
			String email_error = email.getText();
			System.out.println(email_error);
			if(email_error.equals("Nickname is required")){
				// TODO
				System.out.println("Pass");
			}else{
				System.out.println("Failed");
			}
		}else {
			System.out.println("Failed");
		}
		//�����ʾҪ����password
		WebElement password = (WebElement) driver.findElements(By.cssSelector(".form_con .table_register .error")).get(2);
		if(password.isDisplayed()){
			String password_error = password.getText();
			System.out.println(password_error);
			if(password_error.equals("Nickname is required")){
				// TODO
				System.out.println("Pass");
			}else{
				System.out.println("Failed");
			}
		}else {
			System.out.println("Failed");
		}
		//�����ʾҪ����repeat password
		WebElement repeat_password = (WebElement) driver.findElements(By.cssSelector(".form_con .table_register .error")).get(3);
		if(repeat_password.isDisplayed()){
			String repeat_password_error = repeat_password.getText();
			System.out.println(repeat_password_error);
			if(repeat_password_error.equals("Nickname is required")){
				// TODO
				System.out.println("Pass");
			}else{
				System.out.println("Failed");
			}
		}else {
			System.out.println("Failed");
		}
		driver.quit();
	}
	//ע��--������ַ�
	@Test
	public void RegiterWithShort(){
		//���ò��������
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//���������������
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("general.useragent.locale", "en-US");
		profile.setPreference("intl.accept_languages", "en-US");
		WebDriver driver= new FirefoxDriver(profile);
		//�������
		driver.get("http://10.120.1.39/");
		//���ע���¼��ť
		WebElement login = driver.findElement(By.className("login"));
		login.click();
		//���ע�ᰴť
		WebElement register = driver.findElement(By.className("btn_register"));
		register.click();
		
		//������ַ�
		WebElement nickname = driver.findElement(By.name("nickname"));
		nickname.sendKeys("12");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("1999@163.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12");
		WebElement repeat_password = driver.findElement(By.name("repeat_password"));
		repeat_password.sendKeys("12");
		
		//���ע�ᰴť
		WebElement submit = driver.findElement(By.className("submit"));
		submit.click();
		
		//��֤�����nickname�Ƿ�����ʾ
		WebElement ShortNick = (WebElement) driver.findElements(By.cssSelector("label[class='error has_error']")).get(0);
		if(ShortNick.isDisplayed()){
			String shortnick_prompt_error= ShortNick.getText();
			System.out.println(shortnick_prompt_error);
			
			if(shortnick_prompt_error.equals("Nickname should be 3 ~ 20 characters")){
				System.out.println("Pass");
				// TODO
				}else{
					System.out.println("Fail");
				}
			}else {
					System.out.println("Fail");
			}
		//��֤����̵�password�Ƿ�����ʾ
		WebElement ShortPassword = (WebElement) driver.findElements(By.cssSelector("label.error")).get(2);
		if(ShortPassword.isDisplayed()){
			String shortpassword_prompt_error = ShortPassword.getText();
			System.out.println(shortpassword_prompt_error);
			if(shortpassword_prompt_error.equals("Password should be at least 6 characters")){
				System.out.println("Pass");
			}else{
				System.out.println("False");
			}
			
		}else{
			System.out.println("Failed");
		}
		}
	//ע��--���볤�ַ�
	@Test
	public void RegiterWithLong(){
		//���ò��������
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//���������������
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("general.useragent.locale", "en-US");
		profile.setPreference("intl.accept_languages", "en-US");
		WebDriver driver= new FirefoxDriver(profile);
		//�������
		driver.get("http://10.120.1.39/");
		//���ע���¼��ť
		WebElement login = driver.findElement(By.className("login"));
		login.click();
		//���ע�ᰴť
		WebElement register = driver.findElement(By.className("btn_register"));
		register.click();
		
		//���볤�ַ�
		WebElement nickname = driver.findElement(By.name("nickname"));
		nickname.sendKeys("123456789012345678901234567890");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("1999@qq.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123456789012345678901234567890");
		WebElement repeat_password = driver.findElement(By.name("repeat_password"));
		repeat_password.sendKeys("123456789012345678901234567890");
		
		//���ע�ᰴť
		WebElement submit = driver.findElement(By.className("submit"));
		submit.click();
		
		//��֤�����nickname�Ƿ�����ʾ
		WebElement ShortNick = (WebElement) driver.findElements(By.cssSelector("label[class='error has_error']")).get(0);
		if(ShortNick.isDisplayed()){
			String shortnick_prompt_error= ShortNick.getText();
			System.out.println(shortnick_prompt_error);
			
			if(shortnick_prompt_error.equals("Nickname should be 3 ~ 20 characters")){
				System.out.println("Pass");
				// TODO
				}else{
					System.out.println("Fail");
				}
			}else {
					System.out.println("Fail");
			}
		//��֤���볤��password�Ƿ�����ʾ
		WebElement ShortPassword = (WebElement) driver.findElements(By.cssSelector("label.error")).get(2);
		if(ShortPassword.isDisplayed()){
			String shortpassword_prompt_error = ShortPassword.getText();
			System.out.println(shortpassword_prompt_error);
			if(shortpassword_prompt_error.equals("Password should be at most 24 characters")){
				System.out.println("Pass");
			}else{
				System.out.println("False");
			}
			
		}else{
			System.out.println("Failed");
		}
	}
	//ע��--�����ʽ���Ե�����
		
	}





