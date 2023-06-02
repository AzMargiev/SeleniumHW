package class03.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Azamat");
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Margiev");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abracadabra@gmail.com");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("2233334554");
        driver.findElement(By.xpath("//input[@name='address']")).sendKeys("2233 Lee hwy");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Los Angeles");

       WebElement state=driver.findElement(By.xpath("//select[@name='state']"));
       state.click();

       WebElement selectState=driver.findElement(By.xpath("//option[text()='California']"));
       selectState.click();

       driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("22222");

       driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.facebook.com");

       WebElement hosting=driver.findElement(By.xpath("//input[@value='no']"));
       hosting.click();

       driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Selenium is Good");



    }
}
