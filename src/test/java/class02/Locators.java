package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        //GoToWebSite
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();

        //userName
        WebElement userNameTextBox = driver.findElement(By.id("txtUsername"));
        userNameTextBox.sendKeys("Admin");
        Thread.sleep(2000);
        userNameTextBox.clear();
        userNameTextBox.sendKeys("Admin");

        //Password
        WebElement pass = driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Hum@nhrm123");

        //LoginButton
        WebElement loginBtn = driver.findElement(By.className("button"));
        loginBtn.click();

        //
        WebElement message = driver.findElement(By.linkText("Welcome Admin"));
        String text = message.getText();
        System.out.println(text);

        driver.findElement(By.partialLinkText("Recruitment")).click();

    }
}
