package class01.class001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {
    public static void main(String[] args) throws InterruptedException{

       // create instance
      WebDriver driver= new ChromeDriver();

      //go to google
      driver.get("https://www.google.com");

      Thread.sleep(2000);

      driver.navigate().to("https://www.facebook.com");

      Thread.sleep(2000);

      driver.navigate().refresh();

      Thread.sleep(1000);

      driver.navigate().back();

      Thread.sleep(2000);

      driver.navigate().forward();

      driver.quit();

      driver.close();
    }
}
