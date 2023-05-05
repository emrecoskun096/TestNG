package techproed.tests.day28_listenersdaytime;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import static org.testng.AssertJUnit.assertTrue;
//Classı Listener ile ilişkilendirmek için ya class başına @Listeners eklenir yada xml dosyasına ekleme yapılır.
@Listeners(techproed.utilities.Listeners.class)//Listener classının bulunduğu yolu belirtiyoruz
public class C01_Listeners {

    @Test
    public void successTest(){
        System.out.println("PASS");
        assertTrue(true);
    }


    @Test
    public void failTest(){
        System.out.println("FAIL");
        assertTrue(false);
    }


    @Test
    public void skipTest(){
        System.out.println("SKIP");
        throw new SkipException("Atlandı!!!");
    }

    @Test
    public void failTestTechpro(){
        System.out.println("TechPro Fail Test");
        Driver.getDriver().get(ConfigReader.getProperty("techproed_Url"));
        Driver.getDriver().findElement(By.xpath("//OlmayanXpath"));

    }


}