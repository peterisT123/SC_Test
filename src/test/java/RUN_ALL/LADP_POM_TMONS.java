package RUN_ALL;

import Helper.DriverCommon;
import org.testng.annotations.Test;
import pages.LADP_homeLapa;

public class LADP_POM_TMONS extends DriverCommon {

    DriverCommon driverCommon = new DriverCommon();
    LADP_homeLapa ladpHomeLapa = new LADP_homeLapa();
    @Test(priority = 3)
    public void LADP_chromeTmons(){
        driverCommon.startDriverChrome();
        ladpHomeLapa.atvertLADPlapa();
        ladpHomeLapa.ievadaVakances();
        ladpHomeLapa.izvēlāsPirmoRezultātu();
        ladpHomeLapa.izvēlāsVakances();
        ladpHomeLapa.braucLejup();
        ladpHomeLapa.breafcrumb();
        ladpHomeLapa.ievadaEkonkursus();
        ladpHomeLapa.izvēlāsPirmoRezultātuKonkursi();
        ladpHomeLapa.izvēlās2023Gadu();
        ladpHomeLapa.ietuzAPI();
        driverCommon.aizvertDriverChrome();
    }
    @Test (priority = 1)
    public void LADP_FireTmons(){
        driverCommon.startDriverFirefox();
        ladpHomeLapa.atvertLADPlapa();
        ladpHomeLapa.ievadaVakances();
        ladpHomeLapa.izvēlāsPirmoRezultātuFire();
        ladpHomeLapa.izvēlāsVakances();
        ladpHomeLapa.braucLejup();
        ladpHomeLapa.breafcrumb();
        ladpHomeLapa.ievadaEkonkursus();
        ladpHomeLapa.izvēlāsPirmoRezultātuKonkursi();
        ladpHomeLapa.izvēlās2023Gadu();
        ladpHomeLapa.ietuzAPI();
        driverCommon.aizvertDriverFirefox();
}
    @Test (priority = 2)
    public void LADP_EdgeTmons(){
      driverCommon.startDriverEdge();
        ladpHomeLapa.atvertLADPlapa();
        ladpHomeLapa.ievadaVakances();
        ladpHomeLapa.izvēlāsPirmoRezultātu();
        ladpHomeLapa.izvēlāsVakances();
        ladpHomeLapa.braucLejup();
        ladpHomeLapa.breafcrumb();
        ladpHomeLapa.ievadaEkonkursus();
        ladpHomeLapa.izvēlāsPirmoRezultātuKonkursi();
        ladpHomeLapa.izvēlās2023Gadu();
        ladpHomeLapa.ietuzAPI();
      driverCommon.aizvertDriverEdge();
    }



}
