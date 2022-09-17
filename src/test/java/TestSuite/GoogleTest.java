package TestSuite;

import Objects.GooglePage;
import Objects.PageFactoryGoogle;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {

    WebDriver driver;
    @BeforeTest
    public void setUp()
    {
        ChromeOptions options = new ChromeOptions();

        options.setHeadless(false);
         driver=WebDriverManager.chromedriver().capabilities(options).create();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
    }


    @Test
    public void googleTestMethod()
    {

        //Create a object for the page class and pass the driver to the constructor

        GooglePage obj = new GooglePage(driver);
        PageFactoryGoogle pfobj = new PageFactoryGoogle(driver);
        System.out.println("Test method");
        obj.setValueInSearchBox("hello");
        pfobj.clickButton();
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }



}
