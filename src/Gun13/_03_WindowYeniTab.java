package Gun13;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class _03_WindowYeniTab extends BaseDriver {
@Test
    public void test1(){
    driver.get("https://www.selenium.dev/");
    driver.switchTo().newWindow(WindowType.TAB);
    driver.get("https://www.facebook.com");
    BekleKapat();
}



}
