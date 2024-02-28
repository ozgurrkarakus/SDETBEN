package Gun09;

import _001_Utilty.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionDragAndDropTest extends BaseDriver {
    @Test
    public void test1(){

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions driverAksiyon=new Actions(driver);
        WebElement oslo= driver.findElement(By.id("box1"));
        WebElement norway= driver.findElement(By.id("box101"));

        driverAksiyon.dragAndDrop(oslo,norway).build().perform();


        driverAksiyon.clickAndHold(oslo).build().perform();


BekleKapat();
    }
}
