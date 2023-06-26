package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
    WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //    driver.findElement(By.xpath("//i[@class='fa fa-share'][1]")).click();
    @FindBy(xpath = "//i[@class='fa fa-share'][1]")
    WebElement checkOut;

    public void clickingOnCheckOut() throws InterruptedException {
        checkOut.click();
        Thread.sleep(3000);

    }



}
