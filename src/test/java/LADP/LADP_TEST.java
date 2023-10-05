package LADP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LADP_TEST {

public static WebDriver driver;



    @Test(priority = 2)

    public static void LADP_firefox() {
        driver   = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://dpptest.vraa.gov.lv/lv");
        WebDriver.Timeouts wait = driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div[4]/div/nav/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"field-login\"]")).sendKeys("peteris-troksa-4189");
        driver.findElement(By.xpath("//*[@id=\"field-password\"]")).sendKeys("Stirna123!@#");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //driver.close();
        System.out.println(" atverās lapa LADP_firefox");
    }
    @Test(priority = 3)

    public static void LADP_edge() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://dpptest.vraa.gov.lv/lv");
        WebDriver.Timeouts wait = driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div[4]/div/nav/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"field-login\"]")).sendKeys("peteris-troksa-4189");
        driver.findElement(By.xpath("//*[@id=\"field-password\"]")).sendKeys("Stirna123!@#");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //driver.close();
        System.out.println(" atverās lapa LADP_edge");
    }


    @Test(priority = 1)

    public static void LADP_chrome(){
//            ChromeOptions options = new ChromeOptions();
//            options.setBinary("C:\\Users\\peteris.troksa\\Desktop\\java-practice5\\chromedriver-win64\\chromedriver.exe");
//            options.setBinary("--remote-allow-origin=*");
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\peteris.troksa\\Desktop\\java-practice5\\chromedriver-win64\\chromedriver.exe");
        driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://dpptest.vraa.gov.lv/lv");
        WebDriver.Timeouts wait = driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div[4]/div/nav/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"field-login\"]")).sendKeys("peteris-troksa-4189");
        driver.findElement(By.xpath("//*[@id=\"field-password\"]")).sendKeys("Stirna123!@#");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //driver.close();
        System.out.println(" atverās lapa LADP_chrome");

    }
    @Test
    void testSteps(){


    }


}




