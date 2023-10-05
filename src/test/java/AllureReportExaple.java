import Helper.DriverCommon;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.rmi.MarshalException;
import java.util.concurrent.TimeUnit;



public class AllureReportExaple extends DriverCommon {

    @Test
    public void testCace1(){
        driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://dpptest.vraa.gov.lv/lv");
        WebDriver.Timeouts wait = driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Assert.assertEquals(driver.getTitle(), "LADP", " Virsraksts ir");
        driver.close();

    }

}
