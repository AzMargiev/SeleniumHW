package class05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement alert1Btn = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1Btn.click();
        Thread.sleep(2000);

        Alert confirmationAlert1 = driver.switchTo().alert();
        confirmationAlert1.accept();

        WebElement alert2Btn = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2Btn.click();
        Thread.sleep(2000);

        Alert confirmationAlert2 = driver.switchTo().alert();
        confirmationAlert2.accept();

        WebElement alertBtn3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alertBtn3.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).sendKeys("Azam");
        Thread.sleep(2000);
        Alert confirmationAlert3 = driver.switchTo().alert();
        confirmationAlert3.accept();


    }
}
