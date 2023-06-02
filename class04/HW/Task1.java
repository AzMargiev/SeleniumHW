package class04.HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task1 extends CommonMethods {

public static void main(String[] args) throws InterruptedException {

    //    goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
    //    select , tuesday, thursday and friday one by one

    String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
    String browser="chrome";
    openBrowserAndLaunchApplication(url, browser);

   WebElement DD=driver.findElement(By.xpath("//select[@id='select-demo']"));
    DD.click();

    Select sel=new Select(DD);

    sel.selectByVisibleText("Tuesday");
    Thread.sleep(1000);

    sel.selectByValue("Thursday");
    Thread.sleep(1000);

    sel.selectByIndex(6);
    Thread.sleep(1000);

}
}
