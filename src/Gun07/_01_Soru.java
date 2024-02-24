package Gun07;

import _001_Utilty.BaseDriver;
import _001_Utilty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Soru extends BaseDriver {
@Test
//        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.
    public void test1(){
driver.get("https://www.saucedemo.com/");
    MyFunc.Bekle(2);
    WebElement kullanici= driver.findElement(By.cssSelector("input[@id='user-name']"));
kullanici.sendKeys("standard_user");MyFunc.Bekle(2);
WebElement sifre= driver.findElement(By.cssSelector("input[@id='password']"));
sifre.sendKeys("secret_sauce");MyFunc.Bekle(2);














BekleKapat();
}

}
