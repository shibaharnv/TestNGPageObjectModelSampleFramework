package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SamplePage {

    WebDriver driver;

    public SamplePage(WebDriver driver)
    {
        this.driver=driver;
    }

    By textbox= By.xpath("//*[@name='q']");
    By button = By.xpath("//*[@name='btnK']");

    public void enterTextMethod(String input)
    {
        driver.findElement(textbox).sendKeys(input);
        driver.findElement(button).click();
    }

}
