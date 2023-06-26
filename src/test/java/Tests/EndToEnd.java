package Tests;

import Base.BaseClass;
import PageObject.CheckOutPage;
import PageObject.LandingPage;
import PageObject.ProductSelectionPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class EndToEnd extends BaseClass {
    @Test
    public void endToEnd() throws InterruptedException, IOException {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        EndToEnd endToEnd = new EndToEnd();
        WebDriver driver = endToEnd.webDriverInitializer();
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickingOnMyAccount();
        landingPage.clickingOnLogin();
        landingPage.gettingEmail();
        landingPage.gettingPassword();
        landingPage.clickingOnSubmitButton();
        ProductSelectionPage selectingProduct = new ProductSelectionPage(driver);
        selectingProduct.clickingOnCameras();
        selectingProduct.addingRequiredProductToCart();
        CheckOutPage checkOut = new CheckOutPage(driver);
        checkOut.clickingOnCheckOut();

        //landingPage.getMyAccountLink(myAccount)
//        driver.findElement(By.xpath("//span[text()='My Account']")).click();
//        driver.findElement(By.xpath("//a[text()='Login']")).click();
//        driver.findElement(By.id("input-email")).sendKeys("mouni95.j@gmail.com");
//        driver.findElement(By.id("input-password")).sendKeys("Angel@2020");
//        driver.findElement(By.xpath("//input[@type='submit']")).click();

        //driver.findElement(By.xpath("//a[text()='Cameras']")).click();
//        List<WebElement> products = driver.findElements(By.cssSelector(".product-grid"));
//        WebElement requiredProduct = products.stream().filter(product->product.findElement(By.xpath("//a[text()='Nikon D300']")).
//                getText().equals("Nikon D300")).findFirst().orElse(null);
//        WebElement requiredProduct = driver.findElement(By.xpath("//a[text()='Nikon D300']//ancestor::div[4]"));
//        requiredProduct.findElement(By.cssSelector(".fa.fa-shopping-cart")).click();
//        Thread.sleep(3000);
        // driver.findElement(By.cssSelector("#cart-total")).click();
//        driver.findElement(By.xpath("//i[@class='fa fa-share'][1]")).click();
//        Thread.sleep(3000);
//        driver.close();

    }
}
