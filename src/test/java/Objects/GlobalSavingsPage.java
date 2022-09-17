package Objects;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class GlobalSavingsPage {

    WebDriver driver;
    public GlobalSavingsPage(WebDriver driver)
    {
        this.driver= driver;
    }

    By cookieBanner= By.xpath("//*[@id='cmpbox']");

    By acceptAll=By.xpath("//a[@class='cmpboxbtn cmpboxbtnyes cmptxt_btn_yes']/span");

    By searchBox=By.xpath("//*[@id=':r0:']");

    By laptopSearchText=By.xpath("//*[contains(text(),'Results for: laptops')]");

    By seecodeButton=By.xpath("//*[contains(text(),'See Code')][1]");

    By copyCode= By.xpath("//*[contains(text(),'Copy code')]");




    public void cookieBannerVerification()
    {
        driver.findElement(cookieBanner).isDisplayed();
        driver.findElement(acceptAll).click();
    }


    public void searchboxEnter()
    {
        driver.findElement(searchBox).sendKeys("laptops");
        driver.findElement(searchBox).submit();
    }

    public void searchPageVerification()
    {
        //results and see code click

        String actualText=driver.findElement(laptopSearchText).getText();
        String expectedText="Results for: laptops";
        Assert.assertEquals(actualText,expectedText);

        driver.findElement(seecodeButton).click();

        //After clicking see code it goes to next tab and pop handling
    }



    public void popupValidation()
    {

        Set<String> windows =driver.getWindowHandles();

        Iterator itr=windows.iterator();

        ArrayList al = new ArrayList();

        while (itr.hasNext())
        {
            al.add(itr.next());
        }

        String firstWindow=al.get(0).toString();
        String secondWindow=al.get(1).toString();

        String secondWindowTitle =driver.switchTo().window(secondWindow).getTitle();

        String secondWindowActualTitle="Search Results- Daily Mail";

        Assert.assertEquals(secondWindowActualTitle,secondWindowTitle);

       // driver.switchTo().alert()

        String copyCodeText=driver.findElement(copyCode).getText();

        //
        //Path of the file
        String path = "/Users/snagarajan/Documents/TestNgFrameworkRetest/src/test/resources/sample.txt";
        File fileObje = new File(path);

        System.out.println(copyCodeText);

        //fileObje.canWrite()
        //
        //

    }

}
