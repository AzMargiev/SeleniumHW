package class01.class001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("margievazamat0@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("abracadabra");

       String url=  driver.getCurrentUrl();
        System.out.println(url);

        String title=driver.getTitle();
        System.out.println(title);

        if (title.equals("Facebook - log in or sign up")){
            System.out.println("the title is correct");
        }else {
            System.out.println("the title is incorrect");
        }
        driver.quit();

    }
}
