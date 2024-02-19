package Gun04;

import _001_Utilty.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_FindMyId {
    public static void main(String[] args) {
        //Senaryo:
        //1-https://form.jotform.com/221934510376353 sayfasını aç,
        //2 isim kutucuğuna "özgür" yazdırınız,
        //3-soyisim kutucuğuna "Karakuş" yazdırınız.

        //first_8
        //Last_8

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        WebElement isimKutusu = driver.findElement(By.id("first_8"));
        isimKutusu.sendKeys("Özgür");

        WebElement soyadKutusu = driver.findElement(By.id("last_8"));
        soyadKutusu.sendKeys("Karakuş");
        MyFunc.Bekle(5);
        driver.quit();

    }
}
