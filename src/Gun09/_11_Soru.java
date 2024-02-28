package Gun09;

import _001_Utilty.BaseDriver;
import _001_Utilty.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _11_Soru extends BaseDriver {
//    https://www.mediamarkt.com.tr/ sayfasına gidiniz.
//    Tüm Kategoriler -> Beyaz Eşya -> Kombiler click
//    tıklatma işleminden sonra URL de
//    kombi kelimesinin geçtiğini doğrulayın.

    @Test
    public void test1(){
        driver.get("https://www.mediamarkt.com.tr/");
        Actions aksiyonDriver=new Actions(driver);

        WebElement tumKategoriler= driver.findElement(By.xpath("//*[text()='Tüm Kategoriler']"));
        WebElement beyazEsya= driver.findElement(By.xpath("(//*[ contains(text(),'Beyaz Eşya')])[1]"));
        WebElement kombi= driver.findElement(By.xpath("(//*[contains(text(),'Kombiler')])[1]"));

aksiyonDriver.moveToElement(tumKategoriler).build().perform();
        MyFunc.Bekle(2);
aksiyonDriver.moveToElement(beyazEsya).build().perform();
MyFunc.Bekle(2);
kombi.click();

String url= driver.getCurrentUrl();
        Assert.assertTrue(" Url de kombi kelimesi bulunamadı ",url.contains("kombi"));
        BekleKapat();

    }


}
