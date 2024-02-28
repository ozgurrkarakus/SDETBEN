package Gun09;

import _001_Utilty.BaseDriver;
import _001_Utilty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionsMouseWheel extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        WebElement iframe = driver.findElement(By.name("nested_scrolling_frame"));
        MyFunc.Bekle(2);

        new Actions(driver).
                scrollToElement(iframe).
                build().
                perform();
        BekleKapat();
    }

    @Test
    public void test2() {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");

        MyFunc.Bekle(2);
        new Actions(driver).scrollByAmount(0, 500).build().perform();
    }

}
