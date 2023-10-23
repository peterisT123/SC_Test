package pages;

import Helper.DriverCommon;
import RUN_ALL.RAIM_POM_TMONS;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RAIM_homeLapa extends DriverCommon {
    //Reporter.log("");
    public void raim_lapuAtver(){
        driver.get("https://raim.gov.lv");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Reporter.log("1. RAIM lapa ir atvērta");
    }
    public void apstiprinaSīkdatnes(){
        driver.findElement(By.xpath("//*[text()='Apstiprināt visas']")).click();
        Reporter.log("2. Sīkdatnes apstiprinātas ");
    }
    public void izvēlasPMLP(){
        driver.findElement(By.xpath("//*[contains(text(),'Rādītāju')]")).click();
        Reporter.log("3. Izvēlas Iedzīvotāju skaits (PMLP)");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,2000)");
        driver.findElement(By.xpath("//*[contains(text(),'Iedzīvotāju skaits (skaits, PMLP)')]")).click();
        Reporter.log("4. Atver /list");
    }
    public void lejupielādēt(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-2000)");
        driver.findElement(By.xpath("//*[contains(text(),'Lejupielādēt')]")).click();
        Reporter.log("5. Spiež lejuplādēt ");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Reporter.log("6. Pauze 5 sec");
    }
    public void spiežAtlasīt(){
        driver.findElement(By.xpath("//*[contains(text(),'Atlasīt')]")).click();
        Reporter.log("7. Spiež atlasīt");
    }
    public void tematiskāAnalīze(){
        driver.findElement(By.xpath("//*[contains(text(),'Tematiskā analīze')]")).click();
        Reporter.log("8. Atver /thematic-analysis");
    }
    public void spiežES(){
        driver.findElement(By.xpath("//*[contains(text(),'Par ES fondu (2014. - 2020.) ieguldījumiem')]")).click();
        Reporter.log("9. Spiež Par ES fondu...");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Reporter.log("10. Pauze 3 sec");
    }


}

//        1. Atver raim.gov.lv
//        2. Apstiprina sīkdatnes
//       3.  Izvēlas Iedzīvotāju skaits (PMLP)
//        4. Atver /list
//        5. Spiež lejuplādēt
//        6. Pauze 5 sec
//        7. Spiež atlasīt
//        8.Atver /thematic-analysis
//        9. Spiež Par ES fondu...
//        Pauze 3 sec


