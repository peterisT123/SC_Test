package pages;

import Helper.DriverCommon;
import RUN_ALL.TVP_PamatlietasPOM;
import com.beust.ah.A;
import com.beust.jcommander.internal.Console;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TVP_PamatlietasTest extends DriverCommon {

    private final By Aktualitātes = By.xpath("(//*[@href='/lv/jaunumi'])[1]");

    private final String meklētājvārds = "Budžets";

    public void atverLADPlapu() {
        driver.get("https://www.vraa.gov.lv/lv");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Reporter.log("1. VRAA lapa ir atvērta");
        System.out.println("VRAA lapa ir atvērta");
    }

    public void apstipirnaSīkdatnes() {
        driver.findElement(By.xpath("//*[contains(text(),'Apstiprināt visas')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Reporter.log("2. VRAA lapa ir apstiprinātas sīkdatnes");
        System.out.println("VRAA lapa ir apstiprinātas sīkdatnes");
    }

    public void atvērtAktualitātes() {
        driver.findElement(By.xpath("//span[contains( text(),'Aktuali')]")).click();
        Reporter.log("3. Izvēlētas aktualitātes");
        System.out.println("Izvēlētas aktualitātes");
        driver.findElement(By.xpath("//a[contains( @class,'readmore')]")).click();
        Reporter.log("4. Lasīt vairāk");
        System.out.println("Lasīt vairāk");
        String aktualitatesDatums = driver.findElement(By.xpath("(//*[@class='article-details'])[1]")).getText();
        System.out.println(aktualitatesDatums);
        Reporter.log("5. Iegūts aktualitātes datums: " + aktualitatesDatums);
        System.out.println("Iegūts aktualitātes datums: " + aktualitatesDatums);
        driver.findElement(By.xpath("(//img[contains(@src,'/vraa_mazs_logo_1')])[1]")).click(); //iet uz sākuma skatu
    }

    public void atvērtKontaktus() {
        driver.findElement(By.xpath("//span[text()='Kontakti']")).click();
        Reporter.log("6. Izvēlēta kontaktu sadaļa");
        System.out.println("Izvēlēta kontaktu sadaļa");
        driver.findElement(By.xpath("(//a[text()='Lasīt vairāk'])[6]")).click();
        Reporter.log("7. Lasīt vairāk");
        System.out.println("Lasīt vairāk");
        String iestadesVaditajs = driver.findElement(By.xpath("(//*[contains(@class,'employee-info-left')])[1]")).getText();
        System.out.println(iestadesVaditajs);
        Reporter.log("8. Iestādes vadītājs ir: " + iestadesVaditajs);
        System.out.println("Iestādes vadītājs ir: " + iestadesVaditajs);
        driver.findElement(By.xpath("(//img[contains(@src,'/vraa_mazs_logo_1')])[1]")).click(); //iet uz sākuma skatu
    }

    public void parMums() {
        driver.findElement(By.xpath("(//*[@class='item-title'])[1]")).click();
        Reporter.log("9. Izvēlēta Par mums sadaļa");
        System.out.println("Izvēlēta Par mums sadaļa");
    }

    public void lasītVairākParMums() {
        driver.navigate().refresh();
        driver.findElement(By.xpath("(//*[@class='item-title'])[1]")).click();
        driver.findElement(By.xpath("(//*[contains(text(),'Lasīt vairāk')])[5]")).click();
        Reporter.log("10. Lasīt vairāk");
        System.out.println("Lasīt vairāk");
        String parMumsDatums = driver.findElement(By.xpath("//div[@class='submitted']")).getText();
        System.out.println(parMumsDatums);
        Reporter.log("10. Pēdējais labojums par mums: " + parMumsDatums);
        System.out.println("Pēdējais labojums par mums: " + parMumsDatums);
        driver.findElement(By.xpath("(//img[contains(@src,'/vraa_mazs_logo_1')])[1]")).click(); //iet uz sākuma skatu
    }

    public void mainītValoduUzEN() {
        driver.findElement(By.xpath("//*[@class='fal icon-globe']")).click();
        driver.findElement(By.xpath("(//*[contains(@href,'/en')])[2]")).click();
        Reporter.log("11. Izvēlēta EN valoda");
        System.out.println("Izvēlēta EN valoda");
        driver.findElement(By.xpath("(//img[contains(@src,'/vraa_mazs_logo_1')])[1]")).click(); //iet uz sākuma skatu
    }

    public void mainītValoduUzLV() {
        driver.findElement(By.xpath("//*[@class='fal icon-globe']")).click();
        driver.findElement(By.xpath("(//*[contains(@href,'/lv')])[2]")).click();
        Reporter.log("12. Izvēlēta LV valoda");
        System.out.println("Izvēlēta LV valoda");
        driver.findElement(By.xpath("(//img[contains(@src,'/vraa_mazs_logo_1')])[1]")).click(); //iet uz sākuma skatu
    }


    public void melnsKonstrasts() {
        driver.findElement(By.xpath("//*[@class='fas icon-contrast']")).click();
        WebElement pirmsMainaKontrastu = driver.findElement(By.xpath("(//*[@class='fal icon-eye'])[2]"));
        Boolean vaipirmsMainaKonstrastu = pirmsMainaKontrastu.isDisplayed();


        if (vaipirmsMainaKonstrastu) {
            System.out.println("Pirms maina kotrastu ir balts--- " + vaipirmsMainaKonstrastu);
            driver.findElement(By.xpath("(//*[@class='fal icon-eye'])[2]")).click();
        } else {
            System.out.println("Kontrasts nomainījies  " + vaipirmsMainaKonstrastu);
            Reporter.log("13. Kontrasts melns");
            System.out.println("Kontrasts melns");

        }
        WebElement pirmsMainaKontrastu2 = driver.findElement(By.xpath("(//*[@class='fal icon-eye'])[1]"));
        Boolean vaipirmsMainaKonstrastu2 = pirmsMainaKontrastu2.isDisplayed();

        driver.findElement(By.xpath("//*[@class='fas icon-contrast']")).click();
        if (vaipirmsMainaKonstrastu2) {
            System.out.println("Pirms maina kotrastu ir melns--- " + vaipirmsMainaKonstrastu2);
            driver.findElement(By.xpath("//*[@class='fas icon-contrast']")).click();
            driver.findElement(By.xpath("(//*[@class='fal icon-eye'])[1]")).click();
            Reporter.log("14. Kontrasts balts");
            System.out.println("Kontrasts balts");

        } else {
            System.out.println("Kontrasts nomainījies " + vaipirmsMainaKonstrastu2);

        }
    }

    public void meklētājaPārbaude() {
        WebElement vaiMeklejtajs = driver.findElement(By.xpath("//*[@class='fal icon-search']"));
        Boolean vaiVaiMeklejtajs = vaiMeklejtajs.isDisplayed();

        if (vaiVaiMeklejtajs) {
            Reporter.log("15. Meklētājs pieejams");
            System.out.println("Meklētājs pieejams--- " );
            driver.findElement(By.xpath("//*[@class='fal icon-search']")).click();
            driver.findElement(By.xpath("//*[@id='edit-search']")).sendKeys(meklētājvārds);
            Reporter.log("16. Meklētājvārds ievadīts");
            System.out.println("Meklētājvārds ievadīts");
            driver.findElement(By.xpath("//*[contains(@id,'button')]")).click();
            Reporter.log("17. Poga meklēt nospiesta");
            System.out.println("Poga meklēt nospiesta");

            String meklēšanasRezultāts = driver.findElement(By.xpath("(//*[contains(@target,'_blank')])[3]")).getText();
            System.out.println(meklēšanasRezultāts);
            Reporter.log("18. Pirmais meklēšanas rezutlāts ir --- : " + meklēšanasRezultāts);
            System.out.println("Pirmais meklēšanas rezutlāts ir --- " + meklēšanasRezultāts);


        } else {
            System.out.println("Nevar atrast meklētāju " + vaiMeklejtajs);
        }
        driver.findElement(By.xpath("(//img[contains(@src,'/vraa_mazs_logo_1')])[1]")).click(); //iet uz sākuma skatu
    }
    public void pieteiktiesJaunumiem(){

        WebElement ievaditValodu = driver.findElement(By.xpath("(//*[contains(text(),'Latviešu')])[2]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.elementToBeClickable(ievaditValodu));
        ievaditValodu.click();
        System.out.println("Atzīmēta jaunumu valoda LATVIEŠU " );
        driver.findElement(By.xpath("(//*[contains(@id,'edit-email')])")).sendKeys("test@testttt.com");
        System.out.println("Pieteikties jaunumiem var " );
        Reporter.log("18. Pieteikties jaunumiem var");

    }



}















