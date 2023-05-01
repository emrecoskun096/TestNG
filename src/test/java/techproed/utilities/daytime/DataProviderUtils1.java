package techproed.utilities.daytime;

import org.testng.annotations.DataProvider;

public class DataProviderUtils1 {

    @DataProvider
    public Object[][] sehirVerileri(){

        return new Object[][]{ {"İstanbul","Marmara", "34"}, {"Diyarbakır", "Güneydoğu", "21"}, {"Ankara", "İçanadolu", "06"} };

    }

    @DataProvider
    public Object[][] kullaniciBilgileri(){

        return new Object[][]{ {"Ali", "Ali.123"}, {"Ayşe", "Ayse.123"}, {"Fatma", "Ftm_987"}, {"Veli", "1234"}  };

    }

    @DataProvider()
    public Object[][] customerData() {
        String path = "src/test/java/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";

        //ExcelUtils objesi oluşturarak  getDataArray() methodu ile iki boyutlu String Array'i DataProvider olarak return yapıyorum.
        ExcelUtils1 excelUtils = new ExcelUtils1(path, sheetName);
        return excelUtils.getDataArrayWithoutFirstRow();
    }

}