package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ImplicitWait extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

//        implicitWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        click on create new account
        WebElement createNewAccountBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccountBtn.click();

//        send first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        sendText("abracadabra",firstName);
    }
}