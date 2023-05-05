package techproed.tests.day26_ExcelDataProvider.day26_DataProvider;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;
import techproed.utilities.daytime.ExcelUtils1;

public class C01_DataProviderTest1 {

    @DataProvider()
    public Object[][] customerData() {
        String path = "src/test/java/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";

        //ExcelUtils1 objesi oluşturarak  getDataArray() methodu ile iki boyutlu String Array'i DataProvider olarak return yapıyorum.
        ExcelUtils1 excelUtils = new ExcelUtils1(path, sheetName);
        return excelUtils.getDataArrayWithoutFirstRow();
    }

    @Test(dataProvider = "customerData")
    public void dataProviderExcelTest(String email, String password){
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();//login buttonuna tıklar
        blueRentalPage.email.sendKeys(email, Keys.TAB,password,Keys.ENTER);
        ReusableMethods.bekle(3);
        Driver.closeDriver();
    }
}