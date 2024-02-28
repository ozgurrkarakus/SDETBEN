package _003_Denemeler;

import _001_Utilty.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static _001_Utilty.MyFunc.Bekle;

public class Youtube extends BaseDriver{
    @Test
    public void test1(){
        driver.get("https://www.youtube.com/");
        Bekle(2);

        WebElement cokkie = driver.findElement(By.xpath("(//*[@class=yt-spec-touch-feedback-shape__fill])[8]"));
        cokkie.click();
        Bekle(2);

        WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
        search.click();

        Bekle(1);


        search.sendKeys("araba");

        Bekle(1);

        WebElement search1 = driver.findElement(By.cssSelector("[id='search-icon-legacy']"));
        search1.click();

        Bekle(2);

        WebElement lisa = driver.findElement(By.xpath("(//*[@id=\"thumbnail\"]/yt-image/img)[1]"));
        lisa.click();

        BekleKapat();
    }
}
