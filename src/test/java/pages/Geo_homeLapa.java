package pages;

import Helper.DriverCommon;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import javax.swing.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertTrue;

public class Geo_homeLapa extends DriverCommon {


private final By meklēšanasLauks = By.xpath("//input[@id='VRAASearchKeywords']");


    public void atvertGEOlapa() {
        driver.get("https://geolatvija.lv/geo/#/");
        driver.manage().window().maximize();
        System.out.println("Lapa atvērta");
        Reporter.log("1.  GEO lapa ir atvērta");
        driver.findElement(By.xpath("//*[text()='Piekrītu']")).click();
        System.out.println("Apstiprina sīkdantes");
        Reporter.log("2. Apstiprina sīkdantes");
    }
    public void spiežGeoprodukti(){
        driver.findElement(By.xpath("//*[text()='Ģeoprodukti']")).click();
        System.out.println("Nospiež ģeoprodukti");
        Reporter.log("3.  Nospiež ģeoprodukti");
    }
    public void ievadaTekstu(){
        driver.findElement(meklēšanasLauks).sendKeys("Augsnes");
        System.out.println("Ievada augsnes");
        Reporter.log("4.  Ievada augsnes");
        driver.findElement(By.xpath("//input[contains(@value,'Meklēt')]")).click();
        System.out.println("Spiež meklēt");
        Reporter.log("5.  Spiež meklēt");
    }
    public void atverPirmoRezutlātu(){
        String kasIrPirmaisRezultāts = driver.findElement(By.xpath("(//*[contains(@href,'/geo/p/319')])[1]")).getText();
        System.out.println(kasIrPirmaisRezultāts);
        Reporter.log(" Pirmais rezultāts ir: " + kasIrPirmaisRezultāts);
        System.out.println("Pirmais rezultāts ir: " + kasIrPirmaisRezultāts);
        driver.findElement(By.xpath("(//*[contains(@href,'/geo/p/319')])[1]")).click();
        Reporter.log("6.  Spiež pirmo rezultātu");
        System.out.println("Spiež pirmo rezultātu");
    }
    public void atverGaleriju(){
        driver.findElement(By.xpath("//a[contains(text(),'galerija')]")).click();
        Reporter.log("7.  Atver galeriju");
        System.out.println("Atver galeriju");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Pauze 5 sek");
        Reporter.log("8. Pauze 5 sek");
    }
    public void atverKarti(){
        driver.switchTo().frame("mapsIframeId");
        System.out.println("Atver karšu iframe");
        Reporter.log("9. Atver karšu iframe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("(//*[@class='imageThumbnailClass'])[1]")).click();
        System.out.println("Spiež pirmo karti");
        Reporter.log("10. Spiež pirmo karti");
    }
    public void ievadaTekstuMekletaja(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        System.out.println("Pauze 3 sek");
        Reporter.log("11. Pauze 3 sek");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("mapsIframeId");
        driver.findElement(By.xpath("//*[@id='esri_dijit_Search_0_input']")).sendKeys("Karte darbojas");
        System.out.println("Nospiež uz meklētāja");
        Reporter.log("12. Nospiež uz meklētāja");
        System.out.println("Ievada tekstu");
        Reporter.log("13. Ievada tekstu");
        driver.switchTo().defaultContent();
    }
    public void ietTapis(){
        driver.findElement(By.xpath("(//*[contains(text(),'Teritorijas attīstības')])[1]")).click();
        System.out.println("Atver Tapis");
        Reporter.log("14. Atver Tapis");
    }
    public void ierakstaMekletaja() {
        System.out.println("Aizvērt popup");
        Reporter.log("15. Aizvērt popup");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//*[contains(@placeholder,'Meklēšana pēc nosaukuma un izstrādātāja')]")).sendKeys("Tapis darbojas");
        System.out.println("Ieraksta meklētājā tekstu");
        Reporter.log("16. Ieraksta meklētājā tekstu");
    }
    public void atverFailus(){
        driver.get("https://geolatvija.lv/geo/content/images/pdfs/Kapec_sekot_lidzi_planosanas_procesam.pdf");
        System.out.println("Atver failu");
        Reporter.log("17. Atver failu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Pauze 5 sek");
        Reporter.log("18. Pauze 5 sek");
        driver.get("https://geolatvija.lv/geo/content/images/pdfs/Ka_iegut_informaciju_par_planosanas_dokumentiem.pdf");
        System.out.println("Atver failu 2");
        Reporter.log("19. Atver failu 2 ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println("Pauze 2 sek");
        Reporter.log("20. Pauze 2 sek");
    }
}