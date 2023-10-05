package pages;

import Helper.DriverCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import java.util.concurrent.TimeUnit;

public class TVP_lapa_sikdatnes extends DriverCommon {

    public void atvertTVPlapa_sikdatnes(){
        driver.get("https://www.vraa.gov.lv/lv");
    }
//    public static void cepumi2(){
//
//        checkNoOfCookies(0);
//
//    }
    public void apstiprinātVisas(){
        driver.findElement(By.xpath("//div[text()='Apstiprināt visas']")).click();
    }



//        Set<Cookie> coociesList = driver.manage().getCookies();
//        for(Cookie getcookies :coociesList){
//            System.out.println(getcookies);
//        }





}
