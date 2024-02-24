package Gun08;

import _001_Utilty.BaseDriver;
import _001_Utilty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Soru extends BaseDriver {
    @Test
public void  test(){

    ////        Test Senaryosu
        ////        1- https://www.facebook.com/  sayfasına gidiniz
        ////        2- CreateNewAccount a tıklatınız.
        ////        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
        ////        4- Email i tekrar girmenizi isteyen bir input daha açıldığını
        ////           öncesinde de görünmediğini, sonrasında da göründüğünü
        ////           assert ile doğrulayınız.
        ////        5- Doğum tarihinizi Select sınıfı ile seçiniz
//(By.xpath("//div[@class='summary_subtotal_label']"));
        driver.get("https://www.facebook.com/");
        MyFunc.Bekle(2);
        WebElement kayit= driver.findElement(By.xpath("//a[@class='_97w5']"));
        kayit.click();
        MyFunc.Bekle(2);
WebElement isim= driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][@name='firstname']"));
isim.sendKeys("Özgür");
MyFunc.Bekle(2);
//div[@class='mbm _1iy_ _a4y rfloat _ohf']
        WebElement soyisim= driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y rfloat _ohf']"));
        isim.sendKeys("Karakuş");
MyFunc.Bekle(2


);


    }
}
