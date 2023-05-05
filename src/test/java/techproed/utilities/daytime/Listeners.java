package techproed.utilities.daytime;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static techproed.utilities.ReusableMethods.tumSayfaResmi;

public class Listeners implements ITestListener {

    public void onStart(ITestContext context) {
        System.out.println("onStart()==> Tüm testlerden önce bir kez çalışır(Class'tan önce)");
    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish()==> Tüm testlerden sonra bir kez çalışır(Class'tan sonra)");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart()==> Her bir @Test'ten önce bir kez çalışır");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess()==> Sadece PASS olan testlerden sonra çalışır");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure()==> Sadece FAIL olan testlerden sonra çalışır");
        tumSayfaResmi("sayfa resmi");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped()==> Sadece SKIP olan testlerden sonra çalışır");
    }


}