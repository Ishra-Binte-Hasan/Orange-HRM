import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads (D drive)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("txtUsername")).click();
       driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.id("txtPassword")).click();
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        Thread.sleep(1000);
        driver.findElement(By.id("btnLogin")).click();
       // Thread.sleep(2000);
        driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
        //driver.findElement(By.id("menu_admin_UserManagement"));
       // driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
        //Thread.sleep(1000);
        driver.findElement(By.name("btnAdd")).click();
        //Thread.sleep(1000);
        Select s=new Select(driver.findElement(By.id("systemUser_userType")));
        s.selectByValue("1");
        driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Admin A");
        Thread.sleep(1000);
        driver.findElement(By.id("systemUser_userName")).sendKeys("Abh123");
        Thread.sleep(1000);
        Select s1= new Select(driver.findElement(By.id("systemUser_status")));
        s1.selectByValue("1");
        driver.findElement(By.id("systemUser_password")).sendKeys("123456789i");
        driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("123456789i");
        Thread.sleep(1000);
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Abh123");
        Select s2=new Select(driver.findElement(By.id("searchSystemUser_userType")));
        s2.selectByValue("1");
        driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Admin A");
        Thread.sleep(2000);
        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("welcome")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[10]/ul[1]/li[3]/a[1]")).click();
        driver.findElement(By.id("txtUsername")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("txtUsername")).sendKeys("Abh123");
        Thread.sleep(1000);
        driver.findElement(By.id("txtPassword")).click();
        driver.findElement(By.id("txtPassword")).sendKeys("123456789i");
        Thread.sleep(1000);
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Assign Leave')]")).click();
        driver.findElement(By.id("assignleave_txtEmployee_empName")).click();
        driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("Jacqueline White");
        Select s3= new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
        s3.selectByValue("7");
        Thread.sleep(1000);
        driver.findElement(By.id("leaveBalance_details_link")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("closeButton")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='assignleave_txtFromDate']")).click();
        driver.findElement(By.xpath("//tbody/tr[2]/td[4]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("assignleave_duration_duration")).click();
        Select s4=new Select(driver.findElement(By.id("assignleave_duration_duration")));
        s4.selectByValue("half_day");
        driver.findElement(By.id("assignleave_duration_ampm")).click();
        Select s5=new Select(driver.findElement(By.id("assignleave_duration_ampm")));
        s5.selectByValue("PM");
        driver.findElement(By.id("assignleave_txtComment")).click();
        driver.findElement(By.id("assignleave_txtComment")).sendKeys("I have an doctor appointment.");
        driver.findElement(By.id("assignBtn")).click();
        Thread.sleep(1000);
        //driver.findElement(By.id("confirmOkButton")).click();
        //Thread.sleep(1000);
        driver.findElement(By.id("welcome")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[10]/ul[1]/li[3]/a[1]")).click();
        
    }

	}


