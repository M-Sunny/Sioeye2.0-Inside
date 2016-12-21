import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Case11 {
	public static void main(String[] args) {
		//设置firefox的系统路径
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//打开firefox
		WebDriver driver = new FirefoxDriver();
		//输入baidu
		driver.get("");
		//找到百度输入框，输入hello WebTest并提交
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
