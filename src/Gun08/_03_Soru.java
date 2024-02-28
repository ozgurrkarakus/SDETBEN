package Gun08;

import _001_Utilty.BaseDriver;
import _001_Utilty.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _03_Soru extends BaseDriver {
    @Test
    public void test() {

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

        List<WebElement> cookies = driver.findElements(By.cssSelector("[data-testid='cookie-policy-manage-dialog-accept-button']"));
        if (cookies.size() > 0)
            cookies.get(0).click();

        MyFunc.Bekle(2);
        WebElement heseap = driver.findElement(By.cssSelector("[data-testid='open-registration-form-button']"));
        heseap.click();
        MyFunc.Bekle(2);

        WebElement isim = driver.findElement(By.name("firstname"));
        isim.sendKeys("Özgür");
        MyFunc.Bekle(2);

        WebElement soyIsim = driver.findElement(By.name("lastname"));
        soyIsim.sendKeys("Karakuş");
        MyFunc.Bekle(2);

        WebElement reEmail = driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse("ReMail Gözüktü", reEmail.isDisplayed());
        System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());
        MyFunc.Bekle(2);

        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("ozgurkarakus.fb@gmail.com");
        MyFunc.Bekle(2);

        Assert.assertTrue("reEmeil Gözükmedi", reEmail.isDisplayed());
        System.out.println("email = " + reEmail.isDisplayed());
        MyFunc.Bekle(2);
        WebElement webGun = driver.findElement(By.id("day"));
        WebElement webAy = driver.findElement(By.id("month"));
        WebElement webYil = driver.findElement(By.id("year"));

        Select gun = new Select(webGun);
        Select ay = new Select(webAy);
        Select yil = new Select(webYil);
        gun.selectByValue("20");
        ay.selectByValue("3");
        yil.selectByValue("1995");

        MyFunc.Bekle(3);
        BekleKapat();
    }
}
