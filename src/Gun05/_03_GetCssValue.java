package Gun05;

import _001_Utilty.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssValue extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement aramaKutusu= driver.findElement(By.id("inputValEnter"));

        System.out.println("aramaKutusu.getAttribute() = " + aramaKutusu.getAttribute("class"));


        System.out.println("aramaKutusu.getCssValue(color) = " + aramaKutusu.getCssValue("color"));
        System.out.println("aramaKutusu.getCssValue(backround) = " + aramaKutusu.getCssValue("backround"));
        System.out.println("aramaKutusu.getCssValue(font-size) = " + aramaKutusu.getCssValue("font-size"));
        System.out.println("aramaKutusu.getCssValue(border) = " + aramaKutusu.getCssValue("border"));











        BekleKapat();
        
        
        
    }
}
