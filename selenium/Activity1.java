package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

      
        driver.get("https://training-support.net/");

            // Print title of home page
        System.out.println("Home Page Title: " + driver.getTitle());

            // Click About Us button
        WebElement aboutUs = driver.findElement(By.linkText("About Us"));
        aboutUs.click();

            // Print title of About Us page
        System.out.println("About Us Page Title: " + driver.getTitle());

        driver.quit();
        
    }
}