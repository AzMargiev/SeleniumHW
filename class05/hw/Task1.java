package class05.hw;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task1 extends CommonMethods {
    //    http://practice.syntaxtechs.net/javascript-alert-box-demo.php
//    click on the last alert
//    send keys and accept it
//    Note: dont worry if the text u send doesnt appears up in the textbox
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebElement alertBtn = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alertBtn.click();
        Thread.sleep(2000);

        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Syntax");
        Thread.sleep(2000);
        alert.accept();


    }
}
