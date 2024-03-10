package Gun12;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/*
        1-driver.get("https://chercher.tech/practice/frames"); sayfasına gidiniz.
        2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 2.elemanını seçiniz.
        */

public class Soruu extends BaseDriver {
    @Test
    public void test() {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");

        JavascriptExecutor js=(JavascriptExecutor) driver;
      js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        BekleKapat();




    }
}