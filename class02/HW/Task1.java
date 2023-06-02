package class02.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task1 {
      /* HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account
what is the reason, will discuss in next lecture */
      public static void main(String[] args) throws InterruptedException {
          WebDriver driver=new ChromeDriver();
          driver.get("https://www.facebook.com/");
          driver.manage().window().maximize();

          WebElement createNewAcc= driver.findElement(By.xpath("//a[text()='Создать новый аккаунт']"));
          createNewAcc.click();
          Thread.sleep(2000);

          WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
          firstName.sendKeys("David");

          WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
          lastName.sendKeys("Backham");

          WebElement phoneNumber= driver.findElement(By.xpath("//input[@name='reg_email__']"));
          phoneNumber.sendKeys("2233");

          WebElement pass= driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
          pass.sendKeys("samsara");

          WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
          month.click();
          WebElement selectMonth= driver.findElement(By.xpath("//option[text()='янв']"));
          selectMonth.click();

          WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
          day.click();
          WebElement selectDay= driver.findElement(By.xpath("//option[text()='11']"));
          selectDay.click();

          WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
          year.click();
          WebElement selectYear= driver.findElement(By.xpath("//option[text()='1994']"));
          selectYear.click();

          WebElement gender=driver.findElement(By.xpath("//label[text()='Мужчина']"));
          gender.click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png']")).click();
          Thread.sleep(2000);

          driver.quit();



      }
}
