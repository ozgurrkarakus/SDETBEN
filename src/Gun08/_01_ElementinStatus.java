package Gun08;

import _001_Utilty.BaseDriver;
import _001_Utilty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElementinStatus extends BaseDriver {

    @Test
    public void test1() {


        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        WebElement sali = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-label"));


        MyFunc.Bekle(2);

        System.out.println("sali.isDisplayed = " + sali.isDisplayed());
        System.out.println("sali.isEnabled() = " + sali.isEnabled());
        System.out.println("sali.isSelected() = " + sali.isSelected());

        sali.click();
        MyFunc.Bekle(2);
        System.out.println("sali.isSelected() = " + sali.isSelected());


        //**** cumartesi
        WebElement cumartesi = driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-label"));

        System.out.println("cumartesi.isDisplayed = " + cumartesi.isDisplayed());
        System.out.println("cumartesi.isEnabled() = " + cumartesi.isEnabled());
        System.out.println("cumartesi.isSelected() = " + cumartesi.isSelected());
        cumartesi.click();
        MyFunc.Bekle(2);
        BekleKapat();


    }

}
