package pages;

import Helper.DriverCommon;
import RUN_ALL.TVP_PamatlietasPOM;
import com.beust.ah.A;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TVP_PamatlietasTest extends DriverCommon {

    private final By Aktualitātes = By.xpath("(//*[@href='/lv/jaunumi'])[1]");
    public void atverLADPlapu(){
        driver.get("https://www.vraa.gov.lv/lv");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Reporter.log("1. VRAA lapa ir atvērta");
        System.out.println("VRAA lapa ir atvērta");
    }
    public void apstipirnaSīkdatnes(){
        driver.findElement(By.xpath("//*[contains(text(),'Apstiprināt visas')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Reporter.log("2. VRAA lapa ir apstiprinātas sīkdatnes");
        System.out.println("VRAA lapa ir apstiprinātas sīkdatnes");
    }
    public void atvērtAktualitātes(){
        driver.findElement(By.xpath("//span[contains( text(),'Aktuali')]")).click();
        Reporter.log("3. Izvēlētas aktualitātes");
        System.out.println("Izvēlētas aktualitātes");
        driver.findElement(By.xpath("//a[contains( @class,'readmore')]")).click();
        Reporter.log("4. Lasīt vairāk");
        System.out.println("Lasīt vairāk");
        String aktualitatesDatums = driver.findElement(By.xpath("(//*[@class='article-details'])[1]")).getText();
        System.out.println(aktualitatesDatums);
        Reporter.log("5. Iegūts aktualitātes datums: "+ aktualitatesDatums);
        System.out.println("Iegūts aktualitātes datums: "+ aktualitatesDatums);
        driver.findElement(By.xpath("(//img[contains(@src,'/vraa_mazs_logo_1')])[1]")).click(); //iet uz sākuma skatu
    }
    public void atvērtKontaktus(){
        driver.findElement(By.xpath("//span[text()='Kontakti']")).click();
        Reporter.log("6. Izvēlēta kontaktu sadaļa");
        System.out.println("Izvēlēta kontaktu sadaļa");
        driver.findElement(By.xpath("(//a[text()='Lasīt vairāk'])[6]")).click();
        Reporter.log("7. Lasīt vairāk");
        System.out.println("Lasīt vairāk");
        String iestadesVaditajs = driver.findElement(By.xpath("(//*[contains(@class,'employee-info-left')])[1]")).getText();
        System.out.println(iestadesVaditajs);
        Reporter.log("8. Iestādes vadītājs ir: "+ iestadesVaditajs);
        System.out.println("Iestādes vadītājs ir: "+ iestadesVaditajs);
        driver.findElement(By.xpath("(//img[contains(@src,'/vraa_mazs_logo_1')])[1]")).click(); //iet uz sākuma skatu
    }
    public void parMums(){
        driver.findElement(By.xpath("(//*[@class='item-title'])[1]")).click();
        Reporter.log("9. Izvēlēta Par mums sadaļa");
        System.out.println("Izvēlēta Par mums sadaļa");
    }
    public void lasītVairākParMums(){
        driver.navigate().refresh();
        driver.findElement(By.xpath("(//*[@class='item-title'])[1]")).click();
        driver.findElement(By.xpath("(//*[contains(text(),'Lasīt vairāk')])[5]")).click();
        Reporter.log("10. Lasīt vairāk");
        System.out.println("Lasīt vairāk");
        String parMumsDatums = driver.findElement(By.xpath("//div[@class='submitted']")).getText();
        System.out.println(parMumsDatums);
        Reporter.log("10. Pēdējais labojums par mums: "+ parMumsDatums);
        System.out.println("Pēdējais labojums par mums: "+ parMumsDatums);
        driver.findElement(By.xpath("(//img[contains(@src,'/vraa_mazs_logo_1')])[1]")).click(); //iet uz sākuma skatu
    }
    public void mainītValoduUzEN(){
        driver.findElement(By.xpath("//*[@class='fal icon-globe']")).click();
        driver.findElement(By.xpath("(//*[contains(@href,'/en')])[2]")).click();
        Reporter.log("11. Izvēlēta EN valoda");
        System.out.println("Izvēlēta EN valoda");
    }









}
