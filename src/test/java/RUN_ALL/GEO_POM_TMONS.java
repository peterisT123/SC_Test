package RUN_ALL;

import Helper.DriverCommon;
import org.testng.annotations.Test;
import pages.Geo_homeLapa;
import pages.LADP_homeLapa;

public class GEO_POM_TMONS extends DriverCommon {

    DriverCommon driverCommon = new DriverCommon();

    Geo_homeLapa geoHomeLapa = new Geo_homeLapa();


    @Test(priority = 1)

    public void GEO_FireTmons() {
        driverCommon.startDriverFirefox();
        geoHomeLapa.atvertGEOlapa();
        geoHomeLapa.spiežGeoprodukti();
        geoHomeLapa.ievadaTekstu();
        geoHomeLapa.atverPirmoRezutlātu();
        geoHomeLapa.atverGaleriju();
        geoHomeLapa.atverKarti();
        geoHomeLapa.ievadaTekstuMekletaja();
        geoHomeLapa.ietTapis();
        geoHomeLapa.ierakstaMekletaja();
        geoHomeLapa.atverFailus();
        driverCommon.aizvertDriverFirefox();
    }
    @Test(priority = 2)

    public void GEO_ChromeTmons() {
        driverCommon.startDriverChrome();
        geoHomeLapa.atvertGEOlapa();
        geoHomeLapa.spiežGeoprodukti();
        geoHomeLapa.ievadaTekstu();
        geoHomeLapa.atverPirmoRezutlātu();
        geoHomeLapa.atverGaleriju();
        geoHomeLapa.atverKarti();
        geoHomeLapa.ievadaTekstuMekletaja();
        geoHomeLapa.ietTapis();
        geoHomeLapa.ierakstaMekletaja();
        geoHomeLapa.atverFailus();
        driverCommon.aizvertDriverChrome();
    }
    @Test(priority = 3)

    public void GEO_EdgeTmons() {
        driverCommon.startDriverEdge();
        geoHomeLapa.atvertGEOlapa();
        geoHomeLapa.spiežGeoprodukti();
        geoHomeLapa.ievadaTekstu();
        geoHomeLapa.atverPirmoRezutlātu();
        geoHomeLapa.atverGaleriju();
        geoHomeLapa.atverKarti();
        geoHomeLapa.ievadaTekstuMekletaja();
        geoHomeLapa.ietTapis();
        geoHomeLapa.ierakstaMekletaja();
        geoHomeLapa.atverFailus();
        driverCommon.aizvertDriverEdge();
    }


}


//        1.	Atver geolatvija.lv un sagaida pogu meklēt	1.99s
//        2.	Apstiprina sīkdatnes	0.555s
//        3.	Nospiež Geoprodukti	1.918s
//        4.	Ievada Augsnes	0.662s
//        5.	Spiež meklēt	2.503s
//        6.	Spiež pirmo rezultātu	1.777s
//        7.	Atver galeriju	1.75s
//        8.	Pauze 5sec	5.524s
//        9.	Atver karšu iframe (izņemts Firefox problēmu dēļ)	1.54s
//        10.	Spiež pirmo karti	4.319s
//        11.	Pauze 3 sec	3.549s
//        12.	Nospiež uz meklētāja	3.228s
//        13.	Ievada tekstu	4.238s
//        14.	Atver TAPIS	5.252s
//        15.	Aizver popup	0.538s
//        16.	Ieraksta mekletaja tekstu	3.599s
//        17.	Atver failu	2.619s
//        18.	Pauze 5sec	5.531s
//        19.	Atver failu 2	1.4s
//        20.	Pauze 2sec	7.14s