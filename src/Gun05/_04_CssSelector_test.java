package Gun05;

import _001_Utilty.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test;

public class _04_CssSelector_test extends BaseDriver {
    @Test
    public void test1()
    {




        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement mesajKutusu= driver.findElement(By.cssSelector("input[id='user-message']"));
        mesajKutusu.sendKeys("Merhaba Selenium");

        WebElement buton= driver.findElement(By.cssSelector("[onclick='showInput();']"));
        buton.click();

        WebElement mesaj=driver.findElement(By.cssSelector("[id='display']"));



        Assert.assertTrue("Aranılan Mesaj Bulunamadı",mesaj.getText().contains("Merhaba Selenium1"));


        BekleKapat();

    }
}
//_04_CssSelector