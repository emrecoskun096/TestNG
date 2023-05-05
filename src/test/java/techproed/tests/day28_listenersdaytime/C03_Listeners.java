package techproed.tests.day28_listenersdaytime;
import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import static org.testng.AssertJUnit.assertTrue;

public class C03_Listeners {
    @Test(retryAnalyzer = techproed.utilities.daytime.ListenersRetry.class)//Bu parametreyi kullanmak tavsiye edilmez. Test classı mümkün olduğu kadar sade olmalıdır.
    public void successTest(){
        System.out.println("PASS");
        assertTrue(true);
    }

    @Test(retryAnalyzer = techproed.utilities.daytime.ListenersRetry.class)
    public void failTest(){
        System.out.println("FAIL");
        assertTrue(false);
    }


    @Test(retryAnalyzer = techproed.utilities.daytime.ListenersRetry.class)
    public void skipTest(){
        System.out.println("SKIP");
        throw new SkipException("Atlandı!!!");
    }

    @Test(retryAnalyzer =techproed.utilities.daytime.ListenersRetry.class)
    public void failTestTechpro(){
        System.out.println("TechPro Fail Test");
        Driver.getDriver().get(ConfigReader.getProperty("techproed_Url"));
        Driver.getDriver().findElement(By.xpath("//OlmayanXpath"));//NoSuchElementException

    }
}