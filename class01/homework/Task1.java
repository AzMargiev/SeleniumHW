package class01.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException{
        /* navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
close the browser */

        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("Azamat");
        driver.findElement(By.name("customer.lastName")).sendKeys("Margiev");
        driver.findElement(By.name("customer.address.street")).sendKeys("Main street");
        driver.findElement(By.name("customer.address.state")).sendKeys("Maryland");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("20999");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("8999883663");
        driver.findElement(By.name("customer.ssn")).sendKeys("888772266");
        driver.findElement(By.name("customer.username")).sendKeys("AzMargiev");
        driver.findElement(By.name("customer.password")).sendKeys("88733bbhw");
        driver.findElement(By.name("repeatedPassword")).sendKeys("88733bbhw");

        Thread.sleep(3000);
        driver.quit();

    }
}
