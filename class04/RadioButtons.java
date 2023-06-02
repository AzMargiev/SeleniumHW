package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons extends CommonMethods {
    public static void main(String[] args) {

        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser="chrome";

       openBrowserAndLaunchApplication(url, browser);

       //find the radiobutton and click on it
        WebElement r1=driver.findElement(By.xpath("//input[@value='Male' or @name='optradio']"));
        r1.click();

       boolean r1IsSelected=r1.isSelected();
        System.out.println("The radio button is selected :"+r1IsSelected);

        //check if the radiobutton is  displayed
        boolean r1Displayed=r1.isDisplayed();
        System.out.println("The radio button is displayed :"+r1Displayed);

        boolean r1IsEnabled=r1.isEnabled();
        System.out.println("The radio button is Enabled :"+r1IsEnabled);

        //deselect the male r1 button
        WebElement r2 = driver.findElement(By.xpath("//input[@value='Female' and @name='optradio']"));
        r2.click();

        r1IsSelected=r1.isSelected();
        System.out.println("The male radio button is selected: "+r1IsSelected);

    }
}
