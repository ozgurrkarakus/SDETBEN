package Gun04;

import _001_Utilty.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

WebElement isimkutusu=driver.findElement(By.name("q8_name[first]"));
isimkutusu.sendKeys("Özgür");
WebElement soyadKutusu= driver.findElement(By.name("q8_name[last]"));
soyadKutusu.sendKeys("Karakuş");

WebElement butonTiklat= driver.findElement(By.id("input_2"));
butonTiklat.click();


        MyFunc.Bekle(5);
driver.quit();







    }
}
