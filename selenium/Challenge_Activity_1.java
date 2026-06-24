package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Challenge_Activity_1 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

       
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));

        String id = searchBox.getAttribute("id");
        String name = searchBox.getAttribute("name");

        System.out.println("Search Box ID: " + id);
        System.out.println("Search Box Name: " + name);

        driver.quit();
        } 
    }

