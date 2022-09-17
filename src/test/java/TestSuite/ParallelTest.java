package TestSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParallelTest {
    public WebDriver driver;
    @Test
    public void FirefoxTest() {
        //Initializing the firefox driver (Gecko)
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        driver= WebDriverManager.chromedriver().capabilities(options).create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      //  driver = new FirefoxDriver();
        driver.get("https://www.demoqa.com");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
        driver.quit();
    }

    @Test
    public void ChromeTest()
    {
        //Initialize the chrome driver

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        driver=WebDriverManager.chromedriver().capabilities(options).create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver = new ChromeDriver();
        driver.get("https://www.demoqa.com");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
        driver.quit();
    }
}
