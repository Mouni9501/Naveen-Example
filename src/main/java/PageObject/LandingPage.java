package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //driver.findElement(By.xpath("//span[text()='My Account']")).click();
    //driver.findElement(By.xpath("//a[text()='Login']")).click();
    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccount;

    @FindBy(xpath = "//a[text()='Login']")
    WebElement login;

    //      driver.findElement(By.id("input-email")).sendKeys("mouni95.j@gmail.com");
//        driver.findElement(By.id("input-password")).sendKeys("Angel@2020");
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
    @FindBy(id = "input-email")
    WebElement Email;
    @FindBy(id = "input-password")
    WebElement Password;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement SubmitButton;


    public WebElement getMyAccountLink(WebElement myAccount) {
        return myAccount;
    }

    public void clickingOnMyAccount() {
        myAccount.click();
    }

    public void clickingOnLogin() {
        login.click();
    }

    public void gettingEmail() {
        Email.sendKeys("mouni95.j@gmail.com");
    }

    public void gettingPassword() {
        Password.sendKeys("Angel@2020");
    }

    public void clickingOnSubmitButton() {
        SubmitButton.click();
    }

}
