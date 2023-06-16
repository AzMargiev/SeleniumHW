package class09.hw;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        /*
    create a method in Common methods for screenshot
    it should take file name as a parameter
     */

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        openBrowserAndLaunchApplication(url, "chrome");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginBtn);


       screenShot("Azam");


    }
}
