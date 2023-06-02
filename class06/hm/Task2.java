package class06.hm;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task2  extends CommonMethods {
    public static void main(String[] args) {
//        goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
//        click on get new user
//        print the firstname of user

        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        WebElement clickBtnGetNewUser= driver.findElement(By.xpath("//button[@id='save']"));
        clickBtnGetNewUser.click();


        WebElement text=driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        //wait.until(ExpectedConditions.textToBePresentInElement(text,"First Name : Priscilla" ));

        System.out.println(text.getText());





    }
}
