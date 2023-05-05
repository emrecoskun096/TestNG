package techproed.utilities.daytime;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ListenersRetry implements IRetryAnalyzer {
    //Bu class fail olan testleri tekrar çalıştırır
    private int retryCount = 0;
    private static final int maxRetryCount = 1;//maxRetryCount==> Fail sonrası tekrar sayısı
    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}