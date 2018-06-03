import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DZ_2 {
    public static void main(String[] args) {
        WebDriver driver = initCromeDriver();

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/ ");
        WebElement ema = driver.findElement(By.id("email"));
        ema.sendKeys("webinar.test@gmail.com ");

        WebElement button = driver.findElement(By.id("passwd"));
        button.click();

        WebElement pas = driver.findElement(By.name("passwd"));
        pas.sendKeys("Xcg7299bnSmMuRLp9ITw ");

        WebElement clik = driver.findElement(By.name("submitLogin"));
        clik.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement profile = driver.findElement(By.id("employee_infos"));
        profile.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement exit = driver.findElement(By.id("header_logout"));
        exit.click();



    }
    public static WebDriver initCromeDriver(){
        System.setProperty("webdriver.chrome.driver",DZ_2.class.getResource("chromedriver.exe").getPath());
        return new ChromeDriver();

    }

}
