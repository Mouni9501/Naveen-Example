package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSelectionPage {
    WebDriver driver;

    public ProductSelectionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    //driver.findElement(By.xpath("//a[text()='Cameras']")).click();
    @FindBy(xpath = "//a[text()='Cameras']")
    WebElement cameras;

    public void clickingOnCameras() {
        cameras.click();
    }

    //    WebElement requiredProduct = driver.findElement(By.xpath("//a[text()='Nikon D300']//ancestor::div[4]"));
    @FindBy(xpath = "//a[text()='Nikon D300']//ancestor::div[4]")
    WebElement requiredProduct;

    //    requiredProduct.findElement(By.cssSelector(".fa.fa-shopping-cart")).click();
    public void addingRequiredProductToCart() throws InterruptedException {
        requiredProduct.findElement(By.cssSelector(".fa.fa-shopping-cart")).click();
        Thread.sleep(3000);


    }
}
