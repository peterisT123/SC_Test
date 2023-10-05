package utilitis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;
    public static ChromeOptions options;

    public BrowserDriver(){
        options = new ChromeOptions();
        options.addArguments("--remove-allow-origins=*");
        System.setProperty("Webdriver.http.factory", "jdk-http-client");
        System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"src/test/resources/drivers/chrome.exe");
        this.driver = new ChromeDriver();
        driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiriqXSnLuBAxUkVPEDHRUlBU4QPAgJ");

    }
    public void close(){
        this.driver.close();
    }

}
