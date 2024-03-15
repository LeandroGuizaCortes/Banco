package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class banco {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "src/test/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.cinecolombia.com/");
        driver.manage().window().maximize();



    }


}
