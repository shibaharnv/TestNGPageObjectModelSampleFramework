package TestSuite;

import Objects.GlobalSavingsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class GlobalSavingsGroup {

    //{1. Open the Dailymail website - https://discountcode.dailymail.co.uk/
    //2. Confirm Cookie banner is loaded and click on “Accept All” button
    //3. In the search bar enter the search term as “laptops”
    //4. Confirm search results page is loaded and click on “SEE CODE” button
    //5. A pop up will be opened in the new tab, click on “COPY CODE” button and store the result(the code that is copied) into a text file which can be accessed later.
    //6. Print the voucher code on to the output screen (optional step)
    //7. Exit from the test}


    @Test
    public void actualTest()
    {
        ChromeOptions options= new ChromeOptions();
        options.setHeadless(false);



        WebDriver driver=WebDriverManager.chromedriver().capabilities(options).create();

        driver.get("https://discountcode.dailymail.co.uk/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        GlobalSavingsPage obj = new GlobalSavingsPage(driver);
        obj.cookieBannerVerification();
        obj.searchboxEnter();
        obj.searchPageVerification();
        obj.popupValidation();





    }
}
