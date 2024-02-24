package Gun08;

import _001_Utilty.BaseDriver;
import _001_Utilty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClass extends BaseDriver {

    @Test
public void test1(){


      /*  driver.get("https://www.amazon.com/");
        MyFunc.Bekle(2);

        WebElement webMenu=driver.findElement(By.id("searchDropdownBox"));
        Select ddMenu=new Select(webMenu);
//ddMenu.selectByIndex(4);
        ddMenu.selectByValue("searc-alias=stripbooks-intl-ship");
//ddMenu.deselectByVisibleText("Electronics");
        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());

        for (WebElement w: ddMenu.getOptions()){
            System.out.println("w.getText() = " + w.getText());
            System.out.println("w.getCssValue(\"value\") = " + w.getCssValue("value"));
        }

*/

        driver.get("https://www.amazon.com/");

        MyFunc.Bekle(2);
        WebElement webMenu=driver.findElement(By.id("searchDropdownBox"));

        //eğerki bir html elemnti select ile başlıyorsa daha kolay kullanım için, onu
        // seleniumun SELECT classına çevirip kullanabilirim.

        Select ddMenu=new Select(webMenu);
        // ddMenu.selectByIndex(4); // istersen indexle seçebiliyorsun
        ddMenu.selectByValue("search-alias=stripbooks-intl-ship"); // istersen value ile seçebiliyorsun
        // ddMenu.selectByVisibleText("Electronics");

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());

        for(WebElement e: ddMenu.getOptions())
        {
            System.out.print("e.getText() = " + e.getText());
            System.out.println("  - e.getAttribute(value) = " + e.getAttribute("value"));
        }


BekleKapat();

    }
}
