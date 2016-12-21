import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class EditPhoto {
	public static void main(String arg[]){
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
		WebElement register = driver.findElement(By.cssSelector("a.btn_register"));
		register.click();
		
		WebElement table=driver.findElement(By.className("table_register"));
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		WebElement submit = driver.findElement(By.className("submit"));
		submit.click();
		
		Assert.assertEquals(5,rows.size());
		for(WebElement row:rows){
			List<WebElement> cols= row.findElements(By.tagName("td"));
			for(WebElement col:cols){
				System.out.print(col.getText()+"\t");
			}
			System.out.println("");
		}
		
	}

}
