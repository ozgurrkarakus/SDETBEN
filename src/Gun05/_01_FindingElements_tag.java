package Gun05;

import _001_Utilty.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {
    public static void main(String[] args) {
driver.get("https://www.hepsiburada.com/");


        List<WebElement> linkler=driver.findElements(By.tagName("a"));

for (WebElement e: linkler)
    if (!e.getText().equals(""))
        System.out.println("e.getText() = " + e.getText());






        BekleKapat();


    }
}
