
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class Login {
	//1. ������ȷ���˺ź����룬��¼�ɹ�
	@Test
	public void loginWithSuccess(){

		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//�������������ΪӢ��
		FirefoxProfile profile = new FirefoxProfile(); 
		profile.setPreference("general.useragent.locale", "en-US");  
		profile.setPreference("intl.accept_languages", "en-US");
		
		
		
		
		
		WebDriver driver = new FirefoxDriver(profile);
		//��������ҳ
		driver.get("http://10.120.1.39/");
		driver.manage().window().maximize();
		//�򿪵�¼ע�����
		WebElement signupLogin = driver.findElement(By.className("login"));
		signupLogin.click();
		
		//�򿪵�¼����
		WebElement loginbutton = driver.findElement(By.linkText("Log In"));
		loginbutton.click();
		//������ȷ���˺ź�����
		WebElement account = driver.findElement(By.name("account"));
		account.sendKeys(new CharSequence[]{"918@qq.com"});
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement password = (WebElement)driver.findElements(By.name("password")).get(1);
		password.sendKeys(new CharSequence[]{"123456"});
		//�����¼��ť
		WebElement signin = (WebElement)driver.findElements(By.className("submit")).get(1);
		signin.click();	
		//�ж��Ƿ��¼�ɹ�
		boolean flag = driver.getPageSource().contains("������");
		System.out.println("��½�Ƿ�ɹ�������"+flag);
		driver.quit();		
	}
	//��¼--��������Ϊ��
	@Test
	  public void Loginfailed1(){   
	 System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");  
	 FirefoxProfile profile = new FirefoxProfile(); 
	 profile.setPreference("general.useragent.locale", "en-US");  
	 profile.setPreference("intl.accept_languages", "en-US");
	   
	 WebDriver driver = new FirefoxDriver(profile);
	 //��url
	 driver.get("http://10.120.1.39/");
	 driver.manage().window().maximize();
	 //�򿪵�¼����
	 WebElement element1 = driver.findElement(By.linkText("Sign up / Log in"));
	 element1.click();
	 
	 WebElement element2 = driver.findElement(By.linkText("Log In"));
	 element2.click();
	 //�����û���
	    WebElement account = driver.findElement(By.name("account"));
	    account.sendKeys(new CharSequence[]{"xuefan1@qq.com"});
	 //�����¼
	 WebElement submit = (WebElement) driver.findElements(By.className("submit")).get(1);
	 submit.click(); 
	 
	 //��������ʾ
	 WebElement Prompt = (WebElement) driver.findElements(By.cssSelector(".form_con .table_login .error")).get(1);
	  String text = Prompt.getText();
	  System.out.println(text);
	  driver.quit();
	} 
}
