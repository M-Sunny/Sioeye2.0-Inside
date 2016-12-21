import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Case11 {
	public static void main(String[] args) {
		//����firefox��ϵͳ·��
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//��firefox
		WebDriver driver = new FirefoxDriver();
		//����baidu
		driver.get("");
		//�ҵ��ٶ����������hello WebTest���ύ
		WebElement element = driver.findElement(By.name("wd"));
		element.sendKeys(new CharSequence[]{"hello WebTest"});
		element.submit();
		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		System.out.println("Page title is: " + driver.getTitle());
		driver.quit();
		}

	
}
