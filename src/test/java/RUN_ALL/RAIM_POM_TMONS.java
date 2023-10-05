package RUN_ALL;

import Helper.DriverCommon;
import org.testng.annotations.Test;
import pages.RAIM_homeLapa;

public class RAIM_POM_TMONS extends DriverCommon {

    DriverCommon driverCommon = new DriverCommon();
    RAIM_homeLapa raimHomeLapa = new RAIM_homeLapa();


    @Test(priority = 2)

    public void Raim_Crome_TMON(){
        driverCommon.startDriverChrome();
        raimHomeLapa.raim_lapuAtver();
        raimHomeLapa.apstiprinaSīkdatnes();
        raimHomeLapa.izvēlasPMLP();
        raimHomeLapa.lejupielādēt();
        raimHomeLapa.spiežAtlasīt();
        raimHomeLapa.tematiskāAnalīze();
        raimHomeLapa.spiežES();
        driverCommon.aizvertDriverChrome();
    }
    @Test(priority = 1)

    public void Raim_Fire_TMON(){
        driverCommon.startDriverFirefox();
        raimHomeLapa.raim_lapuAtver();
        raimHomeLapa.apstiprinaSīkdatnes();
        raimHomeLapa.izvēlasPMLP();
        raimHomeLapa.lejupielādēt();
        raimHomeLapa.spiežAtlasīt();
        raimHomeLapa.tematiskāAnalīze();
        raimHomeLapa.spiežES();
        driverCommon.aizvertDriverFirefox();
    }
    @Test(priority = 3)

    public void Raim_Edge_TMON(){
        driverCommon.startDriverEdge();
        raimHomeLapa.raim_lapuAtver();
        raimHomeLapa.apstiprinaSīkdatnes();
        raimHomeLapa.izvēlasPMLP();
        raimHomeLapa.lejupielādēt();
        raimHomeLapa.spiežAtlasīt();
        raimHomeLapa.tematiskāAnalīze();
        raimHomeLapa.spiežES();
        driverCommon.aizvertDriverEdge();
    }





}
