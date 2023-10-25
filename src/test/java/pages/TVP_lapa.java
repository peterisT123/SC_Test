package pages;

import Helper.DriverCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TVP_lapa extends DriverCommon {


    private final By advanced = By.xpath("//*[@id=\"details-button\"]");
    private final By izmantotLV = By.xpath("//*[@id=\"edit-latvia-auth-login-links\"]/a");

    private final By piekrītuNosacījummiemlogs = By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/label/span[2]");
    private final By testaAutoriz = By.xpath("//*[@alt='Test.STS']");
    private final By ievadaLietotajvardu = By.xpath("//input[@id='content_UserName']");

    private final By spiestPogu = By.xpath("//*[@id=\"dataset-edit\"]/div[15]/i/button");
    private final By augšupielādētPoga = By.xpath("//*[@id='field-image-upload']");
    //private final By augšupielādētPoga = By.cssSelector("#field-image-upload");

    private final By augšupielādētPogaFirefox = By.xpath("//*[text()='Augšuplādēt']");
    private final By dzēstKopuPoga = By.xpath("//*[@id=\"dataset-edit\"]/div[15]/i/a");

    private final By apstiprinātUnVISS = By.xpath("//*[text()='Apstiprināt']");
    private final By finApstiprināt = By.xpath("/html/body/div[4]/div/div/div[3]/button[2]");
    public void atvertTVPlapa(){
        driver.get("https://tvp.tvptest.vraa.gov.lv/user/login");
    }


    public void pieslēgšanās(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ele0 = wait.until(ExpectedConditions.elementToBeClickable(advanced));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele0);

        //driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
    }
    public void pieslegsanasFire(){
        driver.findElement(By.xpath("//*[text()='Pieslēgties, izmantojot Latvija.lv']")).click();
    }
    public void pieslēgšanās2(){
        driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
    }
    public void pieslēgšanās3(){
        driver.findElement(By.xpath("//*[@id=\"edit-latvia-auth-login-links\"]/a")).click();
    }
    public void setIzmantotLV(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ele1 = wait.until(ExpectedConditions.elementToBeClickable(izmantotLV));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele1);
    }
    public void setPiekrītuNosacījummiemlogs(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ele2 = wait.until(ExpectedConditions.elementToBeClickable(piekrītuNosacījummiemlogs));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele2);
    }
    public void setTestaAutoriz(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,2000)");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ele3 = wait.until(ExpectedConditions.elementToBeClickable(testaAutoriz));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele3);
    }





    public void ievadaLietotajvardu(){
        driver.findElement(By.xpath("//*[@id=\"content_UserName\"]")).sendKeys("VRAA_PTROKSA_Test");

    }
    public void setIevadaLietotajvardu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ele4 = wait.until(ExpectedConditions.elementToBeClickable(ievadaLietotajvardu));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele4);
        driver.findElement(By.xpath("//input[@id='content_UserName']")).sendKeys("");
    }
    public void ievadaParoli(){
        driver.findElement(By.xpath("//*[@id=\"content_Password\"]")).sendKeys("");
    }
    public void ievadaParoliFire(){
        driver.findElement(By.xpath("//input[@id='content_Password']")).sendKeys("");
    }
    public void apstiprina(){
        driver.findElement(By.xpath("//*[@id=\"content_LoginButton\"]")).click();
    }

    public void selectUser(){
        driver.findElement(By.xpath("//option[text()='VRAA_PTROKSA_Test Pēteris Trokša (26058611142)']")).click();
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
