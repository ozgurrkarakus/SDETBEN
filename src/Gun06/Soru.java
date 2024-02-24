package Gun06;

import _001_Utilty.BaseDriver;
import _001_Utilty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru extends BaseDriver {
   @Test
        // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
// 2- Business i çekleyin.
// 3- discover XYZ ye tıklatın ve online Advertising i seçin
// 4- Every day i seçin
// 5- Good u seçin
// 6- using XYZ yi tıklatın ve 3.seçeneği seçin
// css selector
// her bir tıklatma vs işlemin arasına MyFunc.Bekle(2);
public void test1(){
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement buton = driver.findElement(By.cssSelector("input[id='u_kym_4586_0']"));
        buton.click();
        MyFunc.Bekle(2);

        WebElement bar = driver.findElement(By.cssSelector("[id='u_kym_4588']"));
        bar.click();
        MyFunc.Bekle(2);

        WebElement secim = driver.findElement(By.cssSelector("[id='u_kym_4588'] :nth-child(4)"));
        secim.click();
        MyFunc.Bekle(2);

        WebElement secim2 = driver.findElement(By.cssSelector("[id='u_kym_89585_0']"));
        secim2.click();
        MyFunc.Bekle(2);

        WebElement secim3 = driver.findElement(By.cssSelector("[id='u_kym_4589_0'] "));
        secim3.click();
        MyFunc.Bekle(2);

        WebElement bar2 = driver.findElement(By.cssSelector("[id='u_kym_4597']"));
        bar2.click();
        MyFunc.Bekle(2);
//[id='u_kym_4597'] :nth-child(4)
        WebElement bar2secim3 = driver.findElement(By.cssSelector("[id='u_kym_4597'] :nth-child(4)"));
        bar2secim3.click();
        MyFunc.Bekle(2);

        BekleKapat();
    }
}
