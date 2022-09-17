package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryGoogle {
    WebDriver driver;

    @FindBy(xpath = "//input[@name='btnK']")
    WebElement searchButton;



    public PageFactoryGoogle(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickButton()
    {
        searchButton.submit();
    }



}
