package class07.hw;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

//goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
//        login
//        click on PIM
//        from the table choose any ID (56310A)
//        and print out the row number of that id
//        please make sure that ur code is dynamic enough to cater if another row gets delted , it still prints the row correctly
public class Task1 extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");

        WebElement loginBtn= driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        WebElement pimBtn= driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();

        List<WebElement> allId=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        for (int i = 0; i < allId.size(); i++) {
            String id=allId.get(i).getText();
            if (id.equals("56310A")){
                System.out.println("the id is on row number  : "+(i+1));
            }
        }



    }
}
