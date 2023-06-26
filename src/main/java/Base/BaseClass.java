package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    WebDriver driver;

    public WebDriver webDriverInitializer() throws IOException {
        Properties properties = new Properties();
        String projectPath = System.getProperty("user.dir");
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\javva\\Downloads\\Git repository\\NaveenSiteForFrameworkPractice\\src\\main\\java\\Config\\GlobalData.properties");
        properties.load(fileInputStream);
        String browserName = properties.getProperty("browser");

        if (browserName.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver(); // For firefox we need to use gecko driver right
        } else if (browserName.equals("edge")) {
            driver = new EdgeDriver();
        }
        //every time if we want to change the browser do we need to change the value in the properties file
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://naveenautomationlabs.com/opencart/");
        return driver;
    }

    public void tearDown()
    {
        driver.close();
    }

}
