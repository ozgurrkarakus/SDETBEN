package _001_Utilty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;

   static  {
        driver = new ChromeDriver();
        driver.manage().window().maximize();//Ekranı max yapıyor
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }

    public static void BekleKapat() {
        MyFunc.Bekle(5);

        driver.quit();
    }


}
