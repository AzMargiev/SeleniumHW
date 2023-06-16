package class09;

import Utils.CommonMethods;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends CommonMethods {
    public static void main(String[] args) {

        String url = "https://the-internet.herokuapp.com/upload";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement fileUploadBtn= driver.findElement(By.xpath("//input[@id='file-upload']"));

        fileUploadBtn.sendKeys("/Users/azamatmargiev/Desktop/Salam.Изображение PNG");
    }
}
