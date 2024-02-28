package Gun09;

import _001_Utilty.BaseDriver;
import _001_Utilty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionHoverTest extends BaseDriver {
    @Test
    public void test1(){
        driver.get("https://www.hepsiburada.com/");
        WebElement element=driver.findElement(By.xpath("//span[text()='Moda']"));
        MyFunc.Bekle(2);
        Actions aksiyonDriver=new Actions(driver);
        Action aksiyon=aksiyonDriver.moveToElement(element).build();
        aksiyon.perform();
        BekleKapat();

    }


}
