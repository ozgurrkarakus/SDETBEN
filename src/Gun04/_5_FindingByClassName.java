package Gun04;

import _001_Utilty.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _5_FindingByClassName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element = driver.findElement(By.className("form-sub-label"));

        System.out.println("element.getText() = " + element.getText());
        // findElement:  locator birden fazla elemanı işaret ediyorsa bile, ilkini bulur

        // Bütün elemanları almak için findElemenS kullanılır

        List<WebElement> etiketler = driver.findElements(By.className("form-sub-label"));

        System.out.println("etiketler.size() = " + etiketler.size());

        for (WebElement w : etiketler)
            System.out.println("w.getText() = " + w.getText());

        MyFunc.Bekle(5);
        driver.quit();


    }
}
