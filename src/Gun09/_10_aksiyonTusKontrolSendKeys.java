package Gun09;

import _001_Utilty.BaseDriver;
import _001_Utilty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _10_aksiyonTusKontrolSendKeys extends BaseDriver {
    @Test


    public void test1() {
        driver.get("https://demoqa.com/auto-complete\n");
        MyFunc.Bekle(2);
        List<WebElement> consent = driver.findElements(By.xpath("//p[text()='Consent']"));
        if (consent.size() > 0)
            consent.get(0).click();

        WebElement txtBox = driver.findElement(By.id("autoCompleteSingleInput"));
        MyFunc.Bekle(2);

        Actions driveraksiyon = new Actions(driver);

        driveraksiyon
                .moveToElement(txtBox)
                .click()
                .sendKeys("b")
                .build()
                .perform();
        MyFunc.Bekle(2);

        driveraksiyon
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
        BekleKapat();



    }
}
