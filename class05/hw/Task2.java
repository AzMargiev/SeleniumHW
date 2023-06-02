package class05.hw;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    /*
       task: HW2:
       go to https://chercher.tech/practice/frames, click on check box
       then select baby cat from drop down, then enter text in text box
        */
    public static void main(String[] args) throws InterruptedException {

        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);

        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        WebElement clickCheckBox=driver.findElement(By.xpath("//input[@id='a']"));
        clickCheckBox.click();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement selectAnimals= driver.findElement(By.xpath("//select[@id='animals']"));
        Select select=new Select(selectAnimals);
        select.selectByVisibleText("Baby Cat");
        Thread.sleep(2000);
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement enterText=driver.findElement(By.xpath("//input"));
        enterText.sendKeys("Azam");


    }
}
