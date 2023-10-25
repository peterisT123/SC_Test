package pages;

import Helper.DriverCommon;
import com.sun.source.util.SourcePositions;

import io.cucumber.java.en_old.Ac;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.junit.Assert;
import org.junit.runner.JUnitCore;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class LADP_homeLapa extends DriverCommon {

    private final By spiestPirmoFire = By.xpath("(//*[text()='Vakances'])");
    private final By spiestVakances = By.xpath("(//*[contains(text(),'Vakances')])[5]");
    private final By spiestPirmo = By.xpath("//*[@id=\"content\"]/div[3]/div/section[1]/div/ul/li[1]/div/div[1]/h3/a");
    private final By spiestPirmoKon = By.xpath("(//*[@class='dataset-heading'])[1]");
private final By spiest2023 = By.xpath("//*[@title='EIS_E_IEPIRKUMI_IZSLUDINATIE_2023.csv']");
private final By dropdownPrieksatijums = By.xpath("(//*[contains(@href,'a0f9-4c31-b43c-770e97a06fda')])[2]");
    public void atvertLADPlapa() {
        driver.get("https://data.gov.lv/lv");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Reporter.log("1. LADP lapa ir atvērta");
    }
    public void ievadaVakances() {
        driver.findElement(By.xpath("//*[contains(@placeholder,'Ievadiet terminus, kurus meklēt.')]")).sendKeys("Vakances");
        Reporter.log("2. Atrod meklēšanas lauku");
        Reporter.log("3. Ievada vakances");
        assertTrue(driver.getTitle().contains("| Latvijas Atvērto datu portāls"));
      driver.findElement(By.xpath("//*[contains(text(),'Meklēt')]")).click();
        Reporter.log("4. Spiež meklēt");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Reporter.log("5. Pauze 5 sec");
        System.out.println("Vekances tiek meklētas");
    }
    public void izvēlāsPirmoRezultātu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement ele3 = wait.until(ExpectedConditions.elementToBeClickable(spiestPirmoFire));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", ele3);
        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '100%'");
        //driver.manage().window().setSize(new Dimension(1600, 1200));
        Reporter.log("6. Spiež pirmo rezultātu/vakances");
        driver.findElement(By.xpath("//*[contains(@class,'btn btn-primary dropdown-toggle')]")).click();
        System.out.println("Pirmais rezultāts izvēlēts");
    }
    public void izvēlāsPirmoRezultātuFire() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        JavascriptExecutor jse22 = (JavascriptExecutor) driver;
        WebElement ele3 = wait.until(ExpectedConditions.elementToBeClickable(spiestPirmoFire));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", ele3);
        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '100%'");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1600, 1200));
        Reporter.log("6. Spiež pirmo rezultātu/vakances");
        driver.findElement(By.xpath("//*[contains(@class,'btn btn-primary dropdown-toggle')]")).click();
        System.out.println("Pirmais rezultāts izvēlēts");
    }
    public void izvēlāsVakances() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        WebElement ele4 = wait.until(ExpectedConditions.elementToBeClickable(dropdownPrieksatijums));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", ele4);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement Element1 = driver.findElement(By.xpath("//*[contains(text(),'Pēdējo reizi mainīts')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element1);
        System.out.println("Kad pēdējo reizi mainīts");
        Reporter.log("7. Spiež uz pirmo resursu");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(" 5 sekundes pagaidīts");
    }
    public void braucLejup() {
        String KADmainits = driver.findElement(By.xpath("//*[text()='Pēdējo reizi mainīts']")).getText();
        System.out.println(KADmainits);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)", "");
        driver.findElement(By.xpath("//*[text()='Pēdējo reizi mainīts']")).getText();
        Reporter.log("8. Aiziet uz datumu kad pēdējo reizi mainīts");
        System.out.println("Brauc lejup");
    }
    public void breafcrumb() {
        ((JavascriptExecutor) driver).executeScript("scroll(0,-2000)");
        driver.findElement(By.xpath("//*[contains(text(),'home')]")).click();
        Reporter.log("9. Spiež breadcrumb home");
        System.out.println("Breadcrumb nospiests");
    }
    public void ievadaEkonkursus() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("Pauze 5 sek");
        Reporter.log("10. Pauze 5 sek");
        driver.findElement(By.xpath("//*[contains(@placeholder,'Meklē datu')]")).sendKeys("Izsludinātie iepirkumi (e-konkursi)");
        System.out.println("Ievadīts e-konkursi");
        Reporter.log("11. Meklē Izsludinātie iepirkumi (e-konkursi)");
        driver.findElement(By.xpath("(//*[contains(@type,'submi')])[1]")).click();
        System.out.println("Tad meklēt");
        Reporter.log("12. Spiež meklēt");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("Pauze 5 sek");
        Reporter.log("13. Pauze 5 sek");
    }
    public void izvēlāsPirmoRezultātuKonkursi() {
        driver.findElement(By.xpath("(//*[contains(text(),'Izsludinātie iepirkumi')])[2]")).click();
        System.out.println("Spiež uz Izsludinātiem iepirkumiem");
        Reporter.log("14. Spiež uz pirmā rezultāta");
        System.out.println("Pauze 5 sek");
        Reporter.log("15. Pauze 5 sek");
    }
    public void izvēlās2023Gadu() {
        driver.findElement(By.xpath("(//*[contains(@title,'2023')])")).click();
        System.out.println("Spiež uz 2023 gadu");
        Reporter.log("16. Spiež uz 2023 datiem");
        String KADmainits = driver.findElement(By.xpath("//*[text()='Pēdējo reizi mainīts']")).getText();
        System.out.println(KADmainits);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)", "");
        driver.findElement(By.xpath("//*[text()='Pēdējo reizi mainīts']")).getText();
        Reporter.log("17. Aiziet uz datumu kad pēdējo reizi mainīts");
        System.out.println("Kad mainīts pēdējo reizi");
    }
    public void ietuzAPI() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("scroll(0,-2000)");
        driver.findElement(By.xpath("//*[contains(text(),' Datu API')]")).click();
        System.out.println("Nospiests datu API");
        Reporter.log("18. Spiež Datu API");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        System.out.println("Pauze 5 sek");
        Reporter.log("19. Pauze 2 sek");
    }
    public void melnsKonstrasts() {
        WebElement pirmsMainaKontrastu = driver.findElement(By.xpath("//*[@class='path-frontpage has-glyphicons portal']"));
        Boolean vaipirmsMainaKonstrastu = pirmsMainaKontrastu.isDisplayed();


        if (vaipirmsMainaKonstrastu) {
            System.out.println("Pirms maina kotrastu ir balts--- " + vaipirmsMainaKonstrastu);
        } else {
            System.out.println("Kontrasts nomainījies" + vaipirmsMainaKonstrastu);
        }


    }


//        //driver.findElement(By.xpath("//*[@class='contrast']")).click();
//        Boolean pēcMainaKonstrastu2 = driver.findElement(By.xpath("//*[contains(@class,'portal hcontrast')]")).isDisplayed();
//        //System.out.println("Pēc maina kotrastu ir melns--- " + pēcMainaKonstrastu2);
//        if (pēcMainaKonstrastu2) {
//            System.out.println("Pēc maina kotrastu ir melns--- " + pēcMainaKonstrastu2);
//        } else {
//            System.out.println("Kontrasts nomainījies" +pēcMainaKonstrastu2);
//        }


//        Boolean pēcMainaKonstrastu2 = driver.findElement(By.xpath("//*[contains(@class,'portal hcontrast')]")).isDisplayed();
//        System.out.println("Pēc maina kotrastu ir melns--- " + pēcMainaKonstrastu2);

}



// public void atvertLADPlapa() {
//        driver.get("https://data.gov.lv/lv");
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        Reporter.log("1. Chrome LADP lapa ir atvērta");
//    }
//    public void ievadaVakances() {
//        driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[1]/form/div/div[1]/div/input")).sendKeys("Vakances");
//        //assertTrue(driver.getTitle().contains("| Latvijas Atvērto datu portāls"));
//      driver.findElement(By.xpath("(//*[@value='Meklēt'])")).click();
//        Reporter.log("2. Ievada vakances");
//        Reporter.log("3. Spiež meklēt");
//    }
//    public void izvēlāsPirmoRezultātu() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
//        WebElement ele0 = wait.until(ExpectedConditions.elementToBeClickable(spiestPirmo));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", ele0);
//
//
//
//        driver.findElement(By.xpath("(//*[@title='Vakances'])")).click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        Reporter.log("4. Spiež pirmo rezultātu/vakances");
//
//    }
//    public void izvēlāsPirmoRezultātuFire() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollBy(0,2000)");
//        WebElement ele3 = wait.until(ExpectedConditions.elementToBeClickable(spiestPirmoFire));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", ele3);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '125%'");
//        Reporter.log("4. Spiež pirmo rezultātu/vakances");
//    }
//    public void izvēlāsVakancesFire() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//        driver.manage().window().setSize(new Dimension(1600, 1200));
//
//        try {
//            driver.findElement(By.xpath("(//*[contains(text(),'Vakances')])[5]")).click();
//        } catch (Exception e) {
//            WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
//            System.out.println("Excepted and Waited");
//            driver.findElement(By.xpath("(//*[contains(text(),'Vakances')])[5]")).click();
//        }
//
//
//        WebElement ele21 = wait.until(ExpectedConditions.elementToBeClickable(spiestVakances));
//        System.out.println("Ir vakances elements---------------");
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", ele21);
//        //Reporter.log("Izvēlās pirmo rezultātu no meklētā VAKANCES");
//    }
//    public void braucLejup() {
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        ((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
//        driver.findElement(By.xpath("//*[text()='Pēdējo reizi mainīts']"));
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//    }
//    public void breafcrumb() {
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        ((JavascriptExecutor) driver).executeScript("scroll(0,-2000)");
//
//        driver.findElement(By.xpath("//*[text()='home']")).click();
//        Reporter.log("6. Spiež breadcrumb home");
//    }
//    public void ievadaEkonkursus() {
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//*[@placeholder='Meklē datu kopas...']")).sendKeys("Izsludinātie iepirkumi (e-konkursi)");
//        driver.findElement(By.xpath("//*[@type='submit'][@value='search']")).click();
//        Reporter.log("7. Meklē Izsludinātie iepirkumi (e-konkursi)");
//        Reporter.log("8. Spiež meklēt");
//
//    }
//    public void izvēlāsPirmoRezultātuKonkursi() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
//        WebElement ele1 = wait.until(ExpectedConditions.elementToBeClickable(spiestPirmoKon));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", ele1);
//        driver.findElement(By.xpath("(//*[@class='dataset-heading'])[1]")).click();
//        Reporter.log("9. Izvēlās pirmo rezultātu");
//    }
//    public void izvēlās2023Gadu() {
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
//        WebElement ele4 = wait.until(ExpectedConditions.elementToBeClickable(spiest2023));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", ele4);
//        Reporter.log("10. Spiež uz 2023 datiem");
//    }
//    public void ietuzAPI() {
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        ((JavascriptExecutor) driver).executeScript("scroll(0,-2000)");
//        driver.findElement(By.xpath("(//*[@class='btn btn-success'])")).click();
//        Reporter.log("11. Spiež Datu API");
//    }
//}
