package class06.hm;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1 extends CommonMethods {
    public static void main(String[] args) {
//        HW1:
//goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
//        click on start
//        print the text  "welcome syntax technologies "on console

        String url="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement clickBtnStart=driver.findElement(By.xpath("//button[@id='startButton']"));
        clickBtnStart.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement text= driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        wait.until(ExpectedConditions.textToBePresentInElement(text, "Welcome Syntax Technologies"));

        System.out.println(text.getText());
        driver.close();



    }
}
