package techproed.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //Önce properties dosyasındaki verileri okuyabilmek için java'dan properties class'ından bir obje oluştururuz
    public static Properties properties;

    //Herşeyden önce çalışması için static bloc içerisinde, oluşturmuş olduğum properties dosyasını tanımlar
    //ve atamasını yaparız. FileInputStream ile dosya yolunu akışa alırız.

    static {
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties(); //objeyi oluşturduk ve atamasını gerçekleştirdik
            properties.load(fis);//fis'in okuduğu bilgileri properties'e yükler
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //properties dosyasındaki key değerini alıp test methodumda kullanabilmek için bir method oluşturmalıyız
    public static String getProperty(String Key){//String bir değer döndürmesi için String bir parametre atarız
        /*
            Test method'undan gönderdiğimiz string key değerini alıp ConfigReader class'ından
        getProperty() methodunu kullanarak bu key'e ait value'yu bize getirir.
         */


        return properties.getProperty(Key);
    }



}

/*
yasin hoca
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    //    Bu sinif configuration.properties file i okumak icin kullanilir
//    property file i okumak icin properti objecsi kullanilir
    private static Properties properties;

    //    static block : ilk calisir
    static {
//        data cekmek istedigim dosyaninin path i
        String path = "configuration.properties";
        try {
//            configuration.property dosyasini acar
            FileInputStream fileInputStream = new FileInputStream(path);
//            properties objesini instantiate ediyoruz
            properties = new Properties();
//            configuration.property dosyasindaki datalari yükler
            properties.load(fileInputStream);
//            file input stream'i kapatilir
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    ConfigReader.getProperty("browser"); -> chrome
//    ConfigReader.getProperty("amazon_url"); -> https://www.amazon.com
//    ConfigReader.getProperty("username"); -> ali
    public static String getProperty(String key) {
        String value = properties.getProperty(key);
        return value;
    }


}
 */