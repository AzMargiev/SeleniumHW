package class04.HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
//        goto facebook.com
//        click on create account
//        and select the your  date of birth using select class

        String url = "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement DD = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        DD.click();
        Thread.sleep(2000);

        WebElement BB = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        BB.click();
        Thread.sleep(2000);

        Select sel = new Select(BB);

        sel.selectByVisibleText("11");


    }
}
