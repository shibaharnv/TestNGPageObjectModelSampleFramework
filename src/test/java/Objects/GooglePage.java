package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {

    WebDriver driver;
    public GooglePage(WebDriver driver)
    {
        this.driver=driver;
    }

    By searchBox= By.xpath("//input[@name='q']");


    public void setValueInSearchBox(String value)
    {
        driver.findElement(searchBox).sendKeys(value);
    }
}
