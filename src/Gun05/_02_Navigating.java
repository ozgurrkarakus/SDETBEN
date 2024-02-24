package Gun05;

import _001_Utilty.BaseDriver;
import _001_Utilty.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html ");
        //navigate().to: get ile aynı , history için kullanılır. ileri - geri için
        WebElement element = driver.findElement(By.id("alerttest"));
        element.click();
        MyFunc.Bekle(3);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        driver.navigate().back();
        MyFunc.Bekle(2);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.navigate().forward();


        BekleKapat();
    }
}
