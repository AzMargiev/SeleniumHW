package class08.hw;
//hw:
//        goto syntax hrms
//        login
//        click on recruitment
//        select a date on the calanader

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        //click on recruitment
        WebElement reqBtn= driver.findElement(By.xpath("//b[text()='Recruitment']"));
        reqBtn.click();
        //click on calendar
        WebElement calendar=driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
        calendar.click();

        //select the date 12 april 2024
        WebElement selectMonth= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        selectMonth.click();

        Select select=new Select(selectMonth);
        select.selectByIndex(3);

        WebElement selectYear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        selectYear.click();

        Select select1=new Select(selectYear);
        select1.selectByValue("2024");

        List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement data:dates){
            String currentDate=data.getText();
            if (currentDate.equals("12")){
                data.click();
                break;
            }
        }







    }
}
