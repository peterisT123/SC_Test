package pages;

import Helper.DriverCommon;

import org.testng.annotations.Test;
import pages.LADP_lapa;
import java.util.Properties;

public class LADP_POM extends DriverCommon{
    DriverCommon driverCommon = new DriverCommon();
    LADP_lapa ladp_lapa = new LADP_lapa();


    @Test

    public void LADP_chrome() {
        driverCommon.startDriverChrome();
        ladp_lapa.arvertLADPlapa();
        ladp_lapa.pieslēgšanās();
        ladp_lapa.ievadaLietotajvardu();
        ladp_lapa.ievadaParoli();
        ladp_lapa.apstiprina();
        ladp_lapa.atverManasDatuKopas();
        ladp_lapa.pievienotDatuKopu();
        ladp_lapa.ievadaDatuKopasNosaukumu();
        ladp_lapa.ievaditUrl();
        ladp_lapa.ievaditAprakstu();
        ladp_lapa.pievienoBirku();
        ladp_lapa.ievadaSaziņasEpastu();
        ladp_lapa.nākamaisPieveinotDatus();
        ladp_lapa.augšupielādētDatni();
        ladp_lapa.nosaukumsDatukopai();
        ladp_lapa.pabeigt();
        ladp_lapa.pogaPārvaldīt();
        ladp_lapa.pogaDzēst();
        ladp_lapa.accept();
        driverCommon.statuss();
        driverCommon.aizvertDriverChrome();
    }

    @Test(priority = 2)
    public void LADP_firefox() {
        driverCommon.startDriverFirefox();
        ladp_lapa.arvertLADPlapa();
        ladp_lapa.pieslēgšanās();
        ladp_lapa.ievadaLietotajvardu();
        ladp_lapa.ievadaParoli();
        ladp_lapa.apstiprina();
        ladp_lapa.atverManasDatuKopas();
        ladp_lapa.pievienotDatuKopu();
        ladp_lapa.ievadaDatuKopasNosaukumu();
        ladp_lapa.ievaditUrlFirefox();
        ladp_lapa.ievaditAprakstu();
        ladp_lapa.pievienoBirku();
        ladp_lapa.ievadaSaziņasEpastu();
        ladp_lapa.nākamaisPieveinotDatus();
        ladp_lapa.augšupielādētDatniFirefox();
        ladp_lapa.nosaukumsDatukopai();
        ladp_lapa.pabeigt();
        ladp_lapa.pogaPārvaldīt();
        ladp_lapa.pogaDzēst();
        ladp_lapa.accept();
        driverCommon.statuss();
        driverCommon.aizvertDriverFirefox();
    }

    @Test(priority = 3)
    public void LADP_edge() {
        driverCommon.startDriverEdge();
        ladp_lapa.arvertLADPlapa();
        ladp_lapa.pieslēgšanās();
        ladp_lapa.ievadaLietotajvardu();
        ladp_lapa.ievadaParoli();
        ladp_lapa.apstiprina();
        ladp_lapa.atverManasDatuKopas();
        ladp_lapa.pievienotDatuKopu();
        ladp_lapa.ievadaDatuKopasNosaukumu();
        ladp_lapa.ievaditAprakstu();
        ladp_lapa.pievienoBirku();
        ladp_lapa.ievadaSaziņasEpastu();
        ladp_lapa.nākamaisPieveinotDatus();
        ladp_lapa.augšupielādētDatni();
        ladp_lapa.nosaukumsDatukopai();
        ladp_lapa.pabeigt();
        ladp_lapa.pogaPārvaldīt();
        ladp_lapa.pogaDzēst();
        ladp_lapa.accept();
        driverCommon.statuss();
        driverCommon.aizvertDriverEdge();
    }
}



