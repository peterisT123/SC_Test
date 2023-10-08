package pages;

import Helper.DriverCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class Cookies_TVP extends DriverCommon {
    public static void main(String[] args) throws InterruptedException {



        driver = new ChromeDriver();
        driver.get("https://www.vraa.gov.lv/lv");
        Thread.sleep(500);
        Set<Cookie> cookies = driver.manage().getCookies();
        Iterator<Cookie> itr = cookies.iterator();
        System.out.println("---------------------------------------- START -----Cepumu testa rezultāti pirms apstiprina--------------------------------------------------------------------------------------------- ");
        while ((itr.hasNext())) {
            Cookie cookie = itr.next();
            //System.out.println("---------------------------------------- START -----Cepumu testa rezultāti pirms apstiprina--------------------------------------------------------------------------------------------- ");
            System.out.println("Cepuma vārds ir: " + cookie.getName());
            System.out.println("Cepuma vērtība ir:" + cookie.getValue());
            System.out.println("Cepuma domēns ir:" + cookie.getDomain());
            System.out.println("Cepuma path ir:" + cookie.getPath());
            System.out.println("Cepuma derīguma termiņš ir:" + cookie.getExpiry());
            //System.out.println("----------------------------------------------------------------");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }
        System.out.println("----------------------------------------FINISH  ----Cepumu testa rezultāti pirms apstiprina--------------------------------------------------------------------------------------------- ");
        System.out.println("KOPĒJAIS CEPUMU SKAITS /UZSĀKOT LAPU/ IR ====  " + cookies.size());

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[text()='Apstiprināt visas']")).click();
        System.out.println("---------------------------------------- START -----Cepumu testa rezultāti PĒC apstiprina--------------------------------------------------------------------------------------------- ");
        Set<Cookie> cookies2 = driver.manage().getCookies();
        Iterator<Cookie> itr2 = cookies2.iterator();
        while ((itr2.hasNext())) {
            Cookie cookie2 = itr2.next();
            System.out.println("Cepuma vārds ir: " + cookie2.getName());
            System.out.println("Cepuma vērtība ir:" + cookie2.getValue());
            System.out.println("Cepuma domēns ir:" + cookie2.getDomain());
            System.out.println("Cepuma path ir:" + cookie2.getPath());
            System.out.println("Cepuma derīguma termiņš ir:" + cookie2.getExpiry());
            System.out.println("----------------------------------------------------------------");
        }
        System.out.println("----------------------------------------FINISH  ----Cepumu testa rezultāti pirms apstiprina--------------------------------------------------------------------------------------------- ");
        System.out.println("KOPĒJAIS CEPUMU SKAITS /APSTIPRINA VISAS/ IR ====  " + cookies2.size());


        System.out.println("DZĒST VISUS CEPUMUMUS -----------------------------------");
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//div[@class='col-12 col-md-4 reject-wrap']")).click();
        Set<Cookie> cookies3 = driver.manage().getCookies();
        Iterator<Cookie> itr3 = cookies3.iterator();
        while ((itr3.hasNext())) {
            Cookie cookie3 = itr3.next();
            System.out.println("Cepuma vārds ir: " + cookie3.getName());
            System.out.println("Cepuma vērtība ir:" + cookie3.getValue());
            System.out.println("Cepuma domēns ir:" + cookie3.getDomain());
            System.out.println("Cepuma path ir:" + cookie3.getPath());
            System.out.println("Cepuma derīguma termiņš ir:" + cookies3.size());
            System.out.println("----------------------------------------------------------------");
        }
        System.out.println("----------------------------------------FINISH  ----Cepumu testa rezultāti pirms apstiprina--------------------------------------------------------------------------------------------- ");
        System.out.println("KOPĒJAIS CEPUMU SKAITS PĒC /NORAIDĪT/  IR ====  " + cookies3.size());
        System.out.println("Atskaite Chorme pārlūks     ////////////////////////////////////////////////////");
        System.out.println("KOPĒJAIS CEPUMU SKAITS /UZSĀKOT/ IR ====  " + cookies.size());
        System.out.println("KOPĒJAIS CEPUMU SKAITS /APSTIPRINĀT VISAS/ IR ====  " + cookies2.size());
        System.out.println("KOPĒJAIS CEPUMU SKAITS PĒC /NORAIDĪT/  IR ====  " + cookies3.size());
        driver.close();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        driver = new FirefoxDriver();
        driver.get("https://www.vraa.gov.lv/lv");
        Thread.sleep(500);
        Set<Cookie> cookies4 = driver.manage().getCookies();
        Iterator<Cookie> itr4 = cookies4.iterator();
        System.out.println("---------------------------------------- START -----Cepumu testa rezultāti pirms apstiprina--------------------------------------------------------------------------------------------- ");
        while ((itr4.hasNext())) {
            Cookie cookie4 = itr4.next();
            //System.out.println("---------------------------------------- START -----Cepumu testa rezultāti pirms apstiprina--------------------------------------------------------------------------------------------- ");
            System.out.println("Cepuma vārds ir: " + cookie4.getName());
            System.out.println("Cepuma vērtība ir:" + cookie4.getValue());
            System.out.println("Cepuma domēns ir:" + cookie4.getDomain());
            System.out.println("Cepuma path ir:" + cookie4.getPath());
            System.out.println("Cepuma derīguma termiņš ir:" + cookie4.getExpiry());
            //System.out.println("----------------------------------------------------------------");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }
        System.out.println("----------------------------------------FINISH  ----Cepumu testa rezultāti pirms apstiprina--------------------------------------------------------------------------------------------- ");
        System.out.println("KOPĒJAIS CEPUMU SKAITS /UZSĀKOT LAPU/ IR ====  " + cookies.size());
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[text()='Apstiprināt visas']")).click();
        System.out.println("---------------------------------------- START -----Cepumu testa rezultāti PĒC apstiprina--------------------------------------------------------------------------------------------- ");
        Set<Cookie> cookies5 = driver.manage().getCookies();
        Iterator<Cookie> itr5 = cookies5.iterator();
        while ((itr5.hasNext())) {
            Cookie cookie5 = itr5.next();
            System.out.println("Cepuma vārds ir: " + cookie5.getName());
            System.out.println("Cepuma vērtība ir:" + cookie5.getValue());
            System.out.println("Cepuma domēns ir:" + cookie5.getDomain());
            System.out.println("Cepuma path ir:" + cookie5.getPath());
            System.out.println("Cepuma derīguma termiņš ir:" + cookie5.getExpiry());
            System.out.println("----------------------------------------------------------------");
        }
        System.out.println("----------------------------------------FINISH  ----Cepumu testa rezultāti pirms apstiprina--------------------------------------------------------------------------------------------- ");
        System.out.println("KOPĒJAIS CEPUMU SKAITS /APSTIPRINA VISAS/ IR ====  " + cookies5.size());
        System.out.println("----------------------------------------Cepumu testa rezutlāti pēc apstiprinājuma--------------------------------- ");
        System.out.println("DZĒST VISUS CEPUMUMUS -----------------------------------");
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//div[@class='col-12 col-md-4 reject-wrap']")).click();
        Set<Cookie> cookies6 = driver.manage().getCookies();
        Iterator<Cookie> itr6 = cookies6.iterator();
        while ((itr6.hasNext())) {
            Cookie cookie6 = itr6.next();
            System.out.println("Cepuma vārds ir: " + cookie6.getName());
            System.out.println("Cepuma vērtība ir:" + cookie6.getValue());
            System.out.println("Cepuma domēns ir:" + cookie6.getDomain());
            System.out.println("Cepuma path ir:" + cookie6.getPath());
            System.out.println("Cepuma derīguma termiņš ir:" + cookie6.getExpiry());
            System.out.println("----------------------------------------------------------------");
        }
        System.out.println("----------------------------------------FINISH  ----Cepumu testa rezultāti pirms apstiprina--------------------------------------------------------------------------------------------- ");
        System.out.println("KOPĒJAIS CEPUMU SKAITS PĒC /NORAIDĪT/  IR ====  " + cookies6.size());
        System.out.println("Atskaite Firefox pārlūks     ////////////////////////////////////////////////////");
        System.out.println("KOPĒJAIS CEPUMU SKAITS /UZSĀKOT/ IR ====  " + cookies4.size());
        System.out.println("KOPĒJAIS CEPUMU SKAITS /APSTIPRINĀT VISAS/ IR ====  " + cookies5.size());
        System.out.println("KOPĒJAIS CEPUMU SKAITS PĒC /NORAIDĪT/  IR ====  " + cookies6.size());


        driver.close();
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        driver = new EdgeDriver();
        driver.get("https://www.vraa.gov.lv/lv");
        Thread.sleep(500);
        Set<Cookie> cookies7 = driver.manage().getCookies();
        Iterator<Cookie> itr7 = cookies7.iterator();
        System.out.println("---------------------------------------- START -----Cepumu testa rezultāti pirms apstiprina--------------------------------------------------------------------------------------------- ");
        while ((itr7.hasNext())) {
            Cookie cookie7 = itr7.next();
            //System.out.println("---------------------------------------- START -----Cepumu testa rezultāti pirms apstiprina--------------------------------------------------------------------------------------------- ");
            System.out.println("Cepuma vārds ir: " + cookie7.getName());
            System.out.println("Cepuma vērtība ir:" + cookie7.getValue());
            System.out.println("Cepuma domēns ir:" + cookie7.getDomain());
            System.out.println("Cepuma path ir:" + cookie7.getPath());
            System.out.println("Cepuma derīguma termiņš ir:" + cookie7.getExpiry());
            //System.out.println("----------------------------------------------------------------");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }
        System.out.println("----------------------------------------FINISH  ----Cepumu testa rezultāti pirms apstiprina--------------------------------------------------------------------------------------------- ");
        System.out.println("KOPĒJAIS CEPUMU SKAITS /UZSĀKOT LAPU/ IR ====  " + cookies7.size());
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[text()='Apstiprināt visas']")).click();
        System.out.println("---------------------------------------- START -----Cepumu testa rezultāti PĒC apstiprina--------------------------------------------------------------------------------------------- ");
        Set<Cookie> cookies8 = driver.manage().getCookies();
        Iterator<Cookie> itr8 = cookies8.iterator();
        while ((itr8.hasNext())) {
            Cookie cookie8 = itr8.next();
            System.out.println("Cepuma vārds ir: " + cookie8.getName());
            System.out.println("Cepuma vērtība ir:" + cookie8.getValue());
            System.out.println("Cepuma domēns ir:" + cookie8.getDomain());
            System.out.println("Cepuma path ir:" + cookie8.getPath());
            System.out.println("Cepuma derīguma termiņš ir:" + cookie8.getExpiry());
            System.out.println("----------------------------------------------------------------");
        }
        System.out.println("----------------------------------------FINISH  ----Cepumu testa rezultāti pirms apstiprina--------------------------------------------------------------------------------------------- ");
        System.out.println("KOPĒJAIS CEPUMU SKAITS /APSTIPRINA VISAS/ IR ====  " + cookies8.size());
        System.out.println("----------------------------------------Cepumu testa rezutlāti pēc apstiprinājuma--------------------------------- ");
        System.out.println("DZĒST VISUS CEPUMUMUS -----------------------------------");
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//div[@class='col-12 col-md-4 reject-wrap']")).click();
        Set<Cookie> cookies9 = driver.manage().getCookies();
        Iterator<Cookie> itr9 = cookies9.iterator();
        while ((itr9.hasNext())) {
            Cookie cookie9 = itr9.next();
            System.out.println("Cepuma vārds ir: " + cookie9.getName());
            System.out.println("Cepuma vērtība ir:" + cookie9.getValue());
            System.out.println("Cepuma domēns ir:" + cookie9.getDomain());
            System.out.println("Cepuma path ir:" + cookie9.getPath());
            System.out.println("Cepuma derīguma termiņš ir:" + cookies9.size());
            System.out.println("----------------------------------------------------------------");
        }
        System.out.println("----------------------------------------FINISH  ----Cepumu testa rezultāti pirms apstiprina--------------------------------------------------------------------------------------------- ");
        System.out.println("KOPĒJAIS CEPUMU SKAITS PĒC /NORAIDĪT/  IR ====  " + cookies9.size());
        System.out.println("Atskaite Edge pārlūks     ////////////////////////////////////////////////////");
        System.out.println("KOPĒJAIS CEPUMU SKAITS /UZSĀKOT/ IR ====  " + cookies7.size());
        System.out.println("KOPĒJAIS CEPUMU SKAITS /APSTIPRINĀT VISAS/ IR ====  " + cookies8.size());
        System.out.println("KOPĒJAIS CEPUMU SKAITS PĒC /NORAIDĪT/  IR ====  " + cookies9.size());

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        System.out.println("----------------------------------------R----E----Z----U-----M------------------------------------------------------------------------------------------------- ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        System.out.println("--------------------------------------CHOME---CHROME---CHROME------------------------------------------------------------------------------------------------------------------------ ");

        System.out.println("KOPĒJAIS CEPUMU SKAITS /UZSĀKOT/ IR ====  " + cookies.size());
        System.out.println("KOPĒJAIS CEPUMU SKAITS /APSTIPRINĀT VISAS/ IR ====  " + cookies2.size());
        System.out.println("KOPĒJAIS CEPUMU SKAITS PĒC /NORAIDĪT/  IR ====  " + cookies3.size());
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        System.out.println("--------------------------------------FIRE---FIRE---FIRE------------------------------------------------------------------------------------------------------------------------ ");

        System.out.println("KOPĒJAIS CEPUMU SKAITS /UZSĀKOT/ IR ====  " + cookies4.size());
        System.out.println("KOPĒJAIS CEPUMU SKAITS /APSTIPRINĀT VISAS/ IR ====  " + cookies5.size());
        System.out.println("KOPĒJAIS CEPUMU SKAITS PĒC /NORAIDĪT/  IR ====  " + cookies6.size());
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        System.out.println("--------------------------------------EDGE---EDGE---EDGE------------------------------------------------------------------------------------------------------------------------ ");

        System.out.println("KOPĒJAIS CEPUMU SKAITS /UZSĀKOT/ IR ====  " + cookies7.size());
        System.out.println("KOPĒJAIS CEPUMU SKAITS /APSTIPRINĀT VISAS/ IR ====  " + cookies8.size());
        System.out.println("KOPĒJAIS CEPUMU SKAITS PĒC /NORAIDĪT/  IR ====  " + cookies9.size());
        driver.close();

    }
}
