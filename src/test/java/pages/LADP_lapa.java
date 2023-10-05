package pages;

import Helper.DriverCommon;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;

public class LADP_lapa extends DriverCommon {

    private final By spiestPogu = By.xpath("//*[@id=\"dataset-edit\"]/div[15]/i/button");
    private final By augšupielādētPoga = By.xpath("//*[@id='field-image-upload']");
    //private final By augšupielādētPoga = By.cssSelector("#field-image-upload");

    private final By augšupielādētPogaFirefox = By.xpath("//*[text()='Augšuplādēt']");
    private final By dzēstKopuPoga = By.xpath("//*[@id=\"dataset-edit\"]/div[15]/i/a");

    private final By apstiprinātUnVISS = By.xpath("//*[text()='Apstiprināt']");
    private final By finApstiprināt = By.xpath("/html/body/div[4]/div/div/div[3]/button[2]");
    public void arvertLADPlapa(){
        driver.get("https://dpptest.vraa.gov.lv/lv");
    }

    public void pieslēgšanās(){
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div[4]/div/nav/ul/li[2]/a")).click();
    }
    public void ievadaLietotajvardu(){
        driver.findElement(By.xpath("//*[@id=\"field-login\"]")).sendKeys("peteris-troksa-4189");

    }
    public void ievadaParoli(){
        driver.findElement(By.xpath("//*[@id=\"field-password\"]")).sendKeys("Stirna123!@#");

    }
    public void apstiprina(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public void atverManasDatuKopas(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/article/header/ul/li[2]/a")).click();
    }
    public void pievienotDatuKopu(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/article/div/div/a")).click();
    }
    public void ievadaDatuKopasNosaukumu(){
        driver.findElement(By.xpath("//*[@id=\"field-title\"]")).sendKeys("LADP_Tests");
    }

    public void ievaditUrl(){
        driver.findElement(By.xpath("//*[@id='s2id_autogen1']")).sendKeys("testaUrl");
    }
    public void ievaditUrlFirefox(){
        driver.findElement(By.xpath("//*[@id='s2id_autogen1']")).sendKeys("testaUrl");

        //driver.findElement(By.xpath("//*[@placeholder='piem. mana-datu-kopa']")).sendKeys("testaUrl");
    }
    public void ievaditAprakstu(){
        driver.findElement(By.xpath("//*[@id=\"field-notes\"]")).sendKeys("Test apraksts");
    }
    public void pievienoBirku(){
        driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]")).sendKeys("IntelijiBirka");
    }
    public void ievadaSaziņasEpastu(){
        driver.findElement(By.xpath("//*[@id=\"field-maintainer_email\"]")).sendKeys("test@tessstt.lv");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '125%'");
        jse.executeScript("window.scrollBy(0,1500)");
    }
    public void nākamaisPieveinotDatus() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ele0 = wait.until(ExpectedConditions.elementToBeClickable(spiestPogu));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele0);
    }
    public void augšupielādētDatni(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        //driver.findElement(By.xpath("//*[@id=\"field-image-upload\"]")).sendKeys("src/test/java/Helper/ok.csv");
//        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '125%'");
//        driver.findElement(augšupielādētPoga).sendKeys("C:\\Users\\peteris.troksa\\IdeaProjects\\SC_Test\\src\\test\\java\\Helper\\ok.csv");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '125%'");
        WebElement fileInput = driver.findElement(augšupielādētPoga);
        fileInput.sendKeys("C:\\Users\\peteris.troksa\\IdeaProjects\\SC_Test\\src\\test\\java\\Helper\\ok.csv");




       // driver.wait(5).until(ExpectedConditions.visibilityOfElementLocated(augšupielādētPoga));
//        driver.findElement(augšupielādētPoga).sendKeys("C:\\Users\\peteris.troksa\\IdeaProjects\\SC_Test\\src\\test\\java\\Helper\\ok.csv");

//        WebElement ele1 = wait.until(ExpectedConditions.elementToBeClickable(augšupielādētPoga));
////        JavascriptExecutor executor = (JavascriptExecutor)driver;
//////        executor.executeScript("arguments[0].click();", ele1);
//        WebElement elementUpload=driver.findElement(augšupielādētPoga);
//        WebDriverWait wait=new WebDriverWait(driver, 100);
//        wait.until(ExpectedConditions.elementToBeClickable(augšupielādētPoga));
//        elementUpload.sendKeys("C:/Users/peteris.troksa/IdeaProjects/SC_Test/src/test/java/Helper/ok.csv");

    }

    public void augšupielādētDatniFirefox(){
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ele6 = wait.until(ExpectedConditions.elementToBeClickable(augšupielādētPogaFirefox));
        ele6.sendKeys("src/test/java/Helper/ok.csv");

        WebElement uploadElement = driver.findElement(By.xpath("//input[@id='field-image-upload']"));
        uploadElement.sendKeys("C:\\Users\\peteris.troksa\\Downloads\\Merge.xlsx");


//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();", ele6);
//
//        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '125%'");
//        WebElement uploadElement = driver.findElement(augšupielādētPogaFirefox);
//        ((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('style')",uploadElement);
//        uploadElement.sendKeys("C:\\Users\\peteris.troksa\\IdeaProjects\\SC_Test\\src\\test\\java\\Helper\\ok.csv");






        //driver.findElement(By.xpath("//*[@class='btn btn-default'][1]")).sendKeys("C:\\Users\\peteris.troksa\\IdeaProjects\\SC_Test\\src\\test\\java\\Helper\\ok.csv");
    }

    public void nosaukumsDatukopai(){
        driver.findElement(By.xpath("//*[@id=\"field-name\"]")).sendKeys("Testa DATU kopa");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,2000)");
    }
    public void pabeigt(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '100%'");
        driver.findElement(By.xpath("//*[@id=\"resource-edit\"]/div[6]/button[3]")).click();
    }
    public void pogaPārvaldīt(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/article/header/div/a")).click();
    }
    public void pogaDzēst(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '100%'");
        jse.executeScript("window.scrollBy(0,2000)");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ele2 = wait.until(ExpectedConditions.elementToBeClickable(dzēstKopuPoga));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele2);
        //driver.switchTo().alert().accept();

        //driver.findElement(dzēstKopuPoga).click();
       // driver.switchTo().activeElement().submit();
    }
    public void accept(){

        WebElement element11 = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/button[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element11);
        //Alert confirmationAlert = driver.switchTo().alert();
//        String alertText = confirmationAlert.getText();
//        System.out.println("Alert text is " + alertText);
        //confirmationAlert.accept();

//
//        Alert simpleAlert = driver.switchTo().alert();
//        simpleAlert.accept();
    }


}
