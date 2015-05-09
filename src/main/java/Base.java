import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by mrahman on 5/8/15.
 */
public class Base {

public WebDriver driver = null;

    @BeforeMethod
    public void setUpSauce() throws IOException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(FirefoxDriver.BINARY, new File("/Applications/Firefox.app").getAbsolutePath());
        capabilities.setCapability("version", "37");
        capabilities.setCapability("", "");
        this.driver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"), capabilities);
        driver.navigate().to("http://www.cnn.com");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
}
