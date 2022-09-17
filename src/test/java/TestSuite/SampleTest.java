package TestSuite;

import Objects.SamplePage;
import Objects.SamplePagePageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class SampleTest {
    WebDriver driver;
    @BeforeTest
    public void setUp()
    {
//        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(false);
//         driver=WebDriverManager.chromedriver().capabilities(options).create();
//         driver.manage().window().maximize();
//         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void actualTest(String value) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        driver=WebDriverManager.chromedriver().capabilities(options).create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
        SamplePage obj = new SamplePage(driver);

        driver.get("https://www.google.co.in/");

        obj.enterTextMethod("abc");
        Thread.sleep(5000);
    }


    @Test
    public void actualTest2(String value) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        driver=WebDriverManager.chromedriver().capabilities(options).create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
        SamplePagePageFactory obj = new SamplePagePageFactory(driver);

        driver.get("https://www.google.co.in/");

        obj.enterText("123");
        Thread.sleep(5000);
    }


//    @DataProvider(name = "dataspro")
//    public Object[][] dataMethod()
//    {
//        Object[][] data={{"xyz"},{"abc"}};
//        return data;
//    }




}
