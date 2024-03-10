package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class _04_RobotGiris extends BaseDriver {
    @Test
    public void test1() throws AWTException {
        driver.get("https://www.selenium.dev/");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        MyFunc.Bekle(2);

        Set<String> idler=driver.getWindowHandles();
        Iterator gosterge=idler.iterator();
        String birinciSekme=gosterge.next().toString();
        String ikinciSekme=gosterge.next().toString();
        MyFunc.Bekle(2);
        driver.switchTo().window(ikinciSekme);
        driver.get("https://www.facebook.com/");
        MyFunc.Bekle(2);
        BekleKapat();


    }
}
