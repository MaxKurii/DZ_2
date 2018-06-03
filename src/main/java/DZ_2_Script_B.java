import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class DZ_2_Script_B {
    public static void main(String[] args) {
        WebDriver driver= Driver_sleep.initCromeDriver();

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("webinar.test@gmail.com");

        WebElement passwd = driver.findElement(By.id("passwd"));
        passwd.click();

        WebElement pas = driver.findElement(By.name("passwd"));
        pas.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement clik = driver.findElement(By.name("submitLogin"));
        clik.click();

        Driver_sleep.sleep(3000);

        WebElement orders = driver.findElement(By.id("subtab-AdminParentOrders"));
        orders.click();

        Driver_sleep.sleep(1000);


        String Url = driver.getCurrentUrl();


        driver.navigate().refresh();
        if (Url.equals(driver.getCurrentUrl())){
            System.out.println(driver.getTitle());
            System.out.println("Update check perfomed successfully");
        }else {
            System.out.println("Check for updates failed");
        }



    }
}
