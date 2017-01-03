package com.sio.webtestin;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

  @Test
public class Discovery {
		public WebDriver driver;
		String baseUrl = "http://10.120.1.39/";
	@BeforeMethod
		public void BeforeMethod(){
			System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Firefox\\firefox.exe");
			driver = new FirefoxDriver();
			driver.get(baseUrl);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	@AfterMethod
	    public void AfterMethod(){
		     driver.quit();
	}
	 //���Top broadcasts
	public void Topbroadcasts(){
		
		//���next
		WebElement next = driver.findElement(By.className("next"));
		Actions  builder=new Actions(driver);
		builder.doubleClick(next).build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//��֤next��ȷ��
      WebElement prevabled = driver.findElement(By.cssSelector("a.btn_prev"));
		System.out.println(prevabled.isDisplayed());
		//���prev
		WebElement prev = driver.findElement(By.className("prev"));
		//Actions  builder1=new Actions(driver);
		builder.doubleClick(prev).build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//��֤prey��ȷ��
        WebElement nextbled = driver.findElement(By.cssSelector("a.btn_next"));
		System.out.println(nextbled.isDisplayed());
	
	}
	
    //δ��¼ʱ�����Who to follow
	public void WhoToFollow(){
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy (0,750)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //���refresh
		WebElement refresh = driver.findElement(By.className("refresh"));
		refresh.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//���Follow
		WebElement follow1 = driver.findElements(By.linkText("��ע")).get(1);	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		follow1.click();
		
		//��֤�Ƿ񵯳���¼����
		WebElement submit = driver.findElements(By.className("submit")).get(1);
		String login = submit.getText();
		System.out.println(submit.isDisplayed());
		System.out.println(login);
	}
	
	//����û�ͷ������û��������ģ����Who To Follow
	public void User_WhoToFollow(){

		((JavascriptExecutor) driver).executeScript("window.scrollBy (0,800)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����û�ͷ��
		WebElement head1 = driver.findElements(By.className("head")).get(1);		
		head1.click();
		//��֤�Ƿ������û�����
		WebElement sioeyeid = driver.findElement(By.className("sioeye_id_val"));
		String id = sioeyeid.getText();
		System.out.println(sioeyeid.isDisplayed());
		System.out.println(id);
		
		//����Ƽ������е�ˢ��
		WebElement refresh1 = driver.findElement(By.className("refresh"));
		refresh1.click();
		try {
			Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		//����Ƽ������еĹ�ע
		WebElement follow1 = driver.findElements(By.linkText("��ע")).get(1);
		follow1.click();

		try {
			  Thread.sleep(2000);
			} catch (InterruptedException e) {
			  // TODO Auto-generated catch block
			e.printStackTrace();
			}	
			//��֤�Ƿ��ע�ɹ�
			WebElement submit1 = driver.findElements(By.className("submit")).get(1);
			String login1 = submit1.getText();
			System.out.println(submit1.isDisplayed());
			System.out.println(login1);
			//����رյ�¼����
			WebElement close3 = driver.findElement(By.xpath("//span[@class='icon_close']"));
			close3.click();
		
		//�ȴ�ӡһ���Ƽ����˵�nickname
		WebElement nickname1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[1]/div/a/h1"));
		System.out.println(nickname1.getText());
		//�������������Ƽ����˵��û�ͷ����
		WebElement wtfavatar = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[1]/a[1]/img"));
		//����һ��Action����
		Actions actions =new Actions(driver);
		//����Action�����moveToElement����
		actions.moveToElement(wtfavatar).perform();	 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//��ӡ�����Ƽ����˵�nickname
		WebElement nickname2 =driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/div[1]/div[2]/a/h2"));
		System.out.println(nickname2.getText()+"���������ͬ");
		//Assert.assertSame(nickname1.getText(), nickname2.getText());
		//�������Ƽ������е����ע
		WebElement follow = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[1]/a"));
		follow.click();
		try {
			  Thread.sleep(2000);
			} catch (InterruptedException e) {
			  // TODO Auto-generated catch block
			e.printStackTrace();
			}	
			//��֤�Ƿ��ע�ɹ�
			WebElement submit2 = driver.findElements(By.className("submit")).get(1);
			String login2 = submit2.getText();
			System.out.println(submit2.isDisplayed());
			System.out.println(login2);
			//����رյ�¼����
			close3.click();
	}
	
	//����û�ͷ������û��������ģ�����û���Ƶ
	public void UserVideo(){

			((JavascriptExecutor) driver).executeScript("window.scrollBy (0,800)");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//����û�ͷ��
			WebElement head1 = driver.findElements(By.className("head")).get(1);		
			head1.click();
		    //�����û��Ƿ�����Ƶ
		    By dBy =  By.className("no_data_msg");
		    List<WebElement> novideoDrivers = driver.findElements(dBy);
		    //���û����Ƶ���򲻵������
	  	    if (novideoDrivers.size() > 0)
			   {
					return ;
			     	}
	
		   //���ת��
	       WebElement repost = driver.findElements(By.xpath("//a[@class='btn btn_repost']")).get(0);
	    	try {
					Thread.sleep(2000);
					} catch (InterruptedException e) {
								// TODO Auto-generated catch block
		e.printStackTrace();
		     }
		repost.click();
		//��֤�Ƿ񵯳���¼����
		WebElement submit = driver.findElements(By.className("submit")).get(1);
		String login = submit.getText();
		System.out.println(submit.isDisplayed());
		System.out.println(login);
		//����رյ�¼����
		WebElement close1 = driver.findElement(By.xpath("//span[@class='icon_close']"));
		close1.click();
		//�������
		WebElement share = driver.findElements(By.xpath("//a[@class='btn share2']")).get(0);
		share.click();
		try {
					Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
		//����ر�
		WebElement close2 = driver.findElement(By.xpath("//button[@class='at-expanded-menu-close']"));
		close2.click();
		}
		
	//����û�ͷ������û��������ģ�����û���עҳ��
	public void UserFollowing(){

			((JavascriptExecutor) driver).executeScript("window.scrollBy (0,800)");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//����û�ͷ��
			WebElement head1 = driver.findElements(By.className("head")).get(1);		
			head1.click();
			//�����עҳ��
			WebElement following = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/a[2]"));
			following.click();
		    //�����û��Ƿ��й�ע��
		    By dBy =  By.className("avatar");
		    List<WebElement> noavatarDrivers = driver.findElements(dBy);
		    //���û����Ƶ���򲻵������
	  	    if (noavatarDrivers.size() > 0)
			   {
					return ;
			     	}
	  	    //�����ע
	  	    WebElement follow = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/a[2]"));
	  	    follow.click();
			try {
				  Thread.sleep(2000);
				} catch (InterruptedException e) {
				  // TODO Auto-generated catch block
				e.printStackTrace();
				}	
				//��֤�Ƿ��ע�ɹ�
				WebElement submit1 = driver.findElements(By.className("submit")).get(1);
				String login1 = submit1.getText();
				System.out.println(submit1.isDisplayed());
				System.out.println(login1);
				//����رյ�¼����
				WebElement close3 = driver.findElement(By.xpath("//span[@class='icon_close']"));
				close3.click();
	}
	
	//����û�ͷ������û��������ģ�����û���˿ҳ��
	public void UserFollowers(){

				((JavascriptExecutor) driver).executeScript("window.scrollBy (0,800)");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//����û�ͷ��
				WebElement head1 = driver.findElements(By.className("head")).get(1);		
				head1.click();
				//�����עҳ��
				WebElement followers = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/a[3]"));
				followers.click();
			    //�����û��Ƿ��й�ע��
			    By dBy =  By.className("avatar");
			    List<WebElement> noavatarDrivers = driver.findElements(dBy);
			    //���û����Ƶ���򲻵������
		  	    if (noavatarDrivers.size() > 0)
				   {
						return ;
				     	}
		  	    //�����ע
		  	    WebElement follow = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/a[2]"));
		  	    follow.click();
				try {
					  Thread.sleep(2000);
					} catch (InterruptedException e) {
					  // TODO Auto-generated catch block
					e.printStackTrace();
					}	
					//��֤�Ƿ��ע�ɹ�
					WebElement submit1 = driver.findElements(By.className("submit")).get(1);
					String login1 = submit1.getText();
					System.out.println(submit1.isDisplayed());
					System.out.println(login1);
					//����رյ�¼����
					WebElement close3 = driver.findElement(By.xpath("//span[@class='icon_close']"));
					close3.click();
		}
	
	//�������app��ά��
	public void DownloadApp(){

		((JavascriptExecutor) driver).executeScript("window.scrollBy (0,800)");
		try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		//����û�ͷ��
		WebElement head1 = driver.findElements(By.className("head")).get(1);		
		head1.click();
		//��֤�Ƿ���ʾSioeye�ֻ�app
		WebElement downloadfree = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]"));
		String  free = downloadfree.getText();
		System.out.println(downloadfree.isDisplayed());
		System.out.println(free);

				//�Ƚ���ǰ��������ڵľ���洢��parentWindowHandle������
				String paerntWindowHandle = driver.getWindowHandle();
				WebElement appstore = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/a/img"));
				appstore.click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//��ȡ��ǰ���д򿪴��ڵľ�����������洢��һ��set������
				java.util.Set<String> allWindowHandles = driver.getWindowHandles();
				//��������洢�Ķ���Ϊ�գ��ڱ�������allWindowHandles�е�������������
				if (!allWindowHandles.isEmpty()){
					for (String windowHandle : allWindowHandles){
						try {
							if (driver.switchTo().window(windowHandle).getTitle().equals("Ӧ������"));
								//����жϳ�������˵����Sioeye�콢�� - ����
						}catch (NoSuchWindowException e) {
							//���û���ҵ�������ľ��������׳�NoSuchWindowException����ӡ�쳣�Ķ�ջ��Ϣ
							e.printStackTrace();
						}
					}
				}
				//���ص��ʼ�򿪵������ҳ��
				driver.switchTo().window(paerntWindowHandle);
	}
	
	//�鿴������Ƶ
	public void hotbroadcasts(){

		((JavascriptExecutor) driver).executeScript("window.scrollBy (0,1350)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//���������Ƶ
		WebElement video1 = driver.findElements(By.className("hot_video")).get(1);		
		video1.click();
		//��֤�Ƿ�������Ƶ����
		String pageurl=driver.getCurrentUrl();
		System.out.println(pageurl);
		Assert.assertTrue(pageurl.startsWith("https://10.120.1.39/promotion/")); 
		}
}
