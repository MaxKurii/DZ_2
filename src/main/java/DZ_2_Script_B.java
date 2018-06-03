import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class DZ_2_Script_B {
    public static void main(String[] args) {
        WebDriver driver= Driver_sleep.initCromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("webinar.test@gmail.com");

        WebElement passwd = driver.findElement(By.id("passwd"));
        passwd.click();

        WebElement pas = driver.findElement(By.name("passwd"));
        pas.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement click = driver.findElement(By.name("submitLogin"));
        click.click();

        Driver_sleep.sleep(3000);

        for(int i = 0; i < 16; i ++){
            if(i == 0 || i == 1 || i == 7|| i == 13){
                continue;
            }
            Driver_sleep.sleep(3000); //
            WebElement subMenu = driver.findElements(By.xpath("//nav/ul/li")).get(i);
            subMenu.click();
            System.out.println("The Title is: " + driver.getTitle());
            String Url = driver.getCurrentUrl();
            driver.navigate().refresh();
            if (Url.equals(driver.getCurrentUrl())){
                System.out.println("Update check performed successfully");
            }else {
                System.out.println("Check for updates failed");
            }
            Driver_sleep.sleep(1000);

        }


    }
}
