package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamplePagePageFactory {

    WebDriver driver;


    @FindBy(xpath ="//*[@name='q']")
    WebElement textbox;

    @FindBy(xpath ="//*[@name='btnK']")
    WebElement button;

    public SamplePagePageFactory(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void enterText(String value)
    {
        textbox.sendKeys(value);
        button.click();
    }
}
