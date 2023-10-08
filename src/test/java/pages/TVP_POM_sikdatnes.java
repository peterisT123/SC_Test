package pages;

import Helper.DriverCommon;
import RUN_ALL.cookiesTVP;
import org.testng.annotations.Test;

public class TVP_POM_sikdatnes extends DriverCommon {
    DriverCommon driverCommon = new DriverCommon();
    TVP_lapa_sikdatnes tvp_lapa_sikdatnes = new TVP_lapa_sikdatnes();
    RUN_ALL.cookiesTVP cookiesTVP = new cookiesTVP();


    @Test(priority = 1)

    public void TVP_Chrome() {
        driverCommon.startDriverChrome();
        tvp_lapa_sikdatnes.atvertTVPlapa_sikdatnes();

        //tvp_lapa_sikdatnes.apstiprinātVisas();
        //tvp_lapa_sikdatnes.cepumi2();
    }
}
//        tvp_lapa.atvertTVPlapa();
//        tvp_lapa.pieslēgšanās();
//        tvp_lapa.pieslēgšanās2();
//        tvp_lapa.setIzmantotLV();
//        tvp_lapa.pieslēgšanās();
//        tvp_lapa.pieslēgšanās2();
//        tvp_lapa.setPiekrītuNosacījummiemlogs();
//        tvp_lapa.setTestaAutoriz();
//        tvp_lapa.ievadaLietotajvardu();
//        tvp_lapa.ievadaParoli();
//        tvp_lapa.apstiprina();
//        tvp_lapa.selectUser();
//        driverCommon.chromeStatussTVP();
//        driverCommon.aizvertDriverChrome();
//    }
//
//    @Test(priority = 2)
//    public void TVP_firefox() {
//        driverCommon.startDriverFirefox();
//        tvp_lapa.atvertTVPlapa();
//        tvp_lapa.pieslegsanasFire();
//        tvp_lapa.setPiekrītuNosacījummiemlogs();
//        tvp_lapa.setTestaAutoriz();
//        tvp_lapa.setIevadaLietotajvardu();
//        tvp_lapa.ievadaParoliFire();
//        tvp_lapa.apstiprina();
//        tvp_lapa.selectUser();
//        driverCommon.fireStatussTVP();
//        driverCommon.aizvertDriverFirefox();
//
//    }
//
//    @Test(priority = 3)
//    public void TVP_edge() {
//        driverCommon.startDriverEdge();
//        tvp_lapa.atvertTVPlapa();
//        tvp_lapa.pieslēgšanās();
//        tvp_lapa.pieslēgšanās2();
//        tvp_lapa.setIzmantotLV();
//        tvp_lapa.pieslēgšanās();
//        tvp_lapa.pieslēgšanās2();
//        tvp_lapa.setPiekrītuNosacījummiemlogs();
//        tvp_lapa.setTestaAutoriz();
//        tvp_lapa.ievadaLietotajvardu();
//        tvp_lapa.ievadaParoli();
//        tvp_lapa.apstiprina();
//        tvp_lapa.selectUser();
//        driverCommon.edgeStatussTVP();
//        driverCommon.aizvertDriverEdge();
//
//
//    }
//}
