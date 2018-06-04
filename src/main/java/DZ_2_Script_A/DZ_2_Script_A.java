package DZ_2_Script_A;

import Driver_sleep.Driver_sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DZ_2_Script_A {
    public static void main(String[] args) {
        WebDriver driver = Driver_sleep.initCromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/ ");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("webinar.test@gmail.com ");

        WebElement passwd = driver.findElement(By.id("passwd"));
        passwd.click();

        WebElement pas = driver.findElement(By.name("passwd"));
        pas.sendKeys("Xcg7299bnSmMuRLp9ITw ");

        WebElement clik = driver.findElement(By.name("submitLogin"));
        clik.click();


        Driver_sleep.sleep(3000);

        WebElement profile = driver.findElement(By.id("employee_infos"));
        profile.click();

        Driver_sleep.sleep(1000);

        WebElement exit = driver.findElement(By.id("header_logout"));
        exit.click();

    }


}
