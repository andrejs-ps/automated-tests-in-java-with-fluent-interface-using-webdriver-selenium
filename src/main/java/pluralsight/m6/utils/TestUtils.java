package pluralsight.m6.utils;

public class TestUtils {

    public static void explicitWait() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
