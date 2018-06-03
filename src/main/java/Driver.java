import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver initCromeDriver(){
        System.setProperty("webdriver.chrome.driver",Driver.class.getResource("chromedriver.exe").getPath());
        return new ChromeDriver();
    }
    public static void sleep(int millisecond){
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
