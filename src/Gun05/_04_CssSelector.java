package Gun05;

import _001_Utilty.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_CssSelector extends BaseDriver {
    public static void main(String[] args) {
driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement mesajKutusu= driver.findElement(By.cssSelector("input[id='user-message']"));
mesajKutusu.sendKeys("Merhaba Selenium");

WebElement buton= driver.findElement(By.cssSelector("[onclick='showInput();']"));
buton.click();

WebElement mesaj=driver.findElement(By.cssSelector("[id='display']"));

        if (mesaj.getText().contains("Merhaba Selenium"))
            System.out.println("Test Passed");
            else System.out.println("Test Failed");



    BekleKapat();



}
}
