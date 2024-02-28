package Gun09;

import _001_Utilty.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _07_DragAndDropBy extends BaseDriver {
    @Test
    public void test1(){
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        List<WebElement> consent=driver.findElements(By.xpath("//p[text()='Consent']"));
        if (consent.size()>0)
            consent.get(0).click();
Actions driverAksiyon=new Actions(driver);

WebElement solSurgu=driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));

Action aksiyon=driverAksiyon.dragAndDropBy(solSurgu,100,0).build();
aksiyon.perform();










    }
}
