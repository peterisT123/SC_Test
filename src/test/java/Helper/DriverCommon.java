package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class DriverCommon {
    public static org.openqa.selenium.WebDriver driver;
    protected Object atvertGEOlapa;

    public void startDriverChrome(){
        driver  = new ChromeDriver();
        driver.manage().window().maximize();
        Reporter.log("Chrome ir palaists");
    }
    public void aizvertDriverChrome(){
        driver.close();
        Reporter.log(" Lapa ir aizvērta");
    }
    public void startDriverFirefox(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Reporter.log("Firefox ir palaists");
    }
    public void aizvertDriverFirefox() {
        driver.close();
        Reporter.log(" Lapa ir aizvērta");
    }
    public void startDriverEdge(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        Reporter.log("Edge ir palaists");
    }
    public void aizvertDriverEdge() {
        driver.close();
        Reporter.log(" Lapa ir aizvērta");
    }
    public void statuss(){
        System.out.println(" Darbojās LADP lapa");
    }
    public void chromeStatuss(){
        System.out.println(" Chrome LADP lapa darbojas");
    }
    public void  fireStatuss(){
        System.out.println(" Firefox LADP lapa darbojas");
    }
    public void edgeStatuss(){
        System.out.println(" EDGE LADP lapa darbojas");
    }
    public void chromeStatussTVP(){
        System.out.println(" Chrome TVP lapa darbojas");
    }
    public void  fireStatussTVP(){
        System.out.println(" Firefox TVP lapa darbojas");
    }
    public void edgeStatussTVP(){
        System.out.println(" EDGE TVP lapa darbojas");
    }





}
