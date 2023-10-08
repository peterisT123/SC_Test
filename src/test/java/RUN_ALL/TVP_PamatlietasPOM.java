package RUN_ALL;

import Helper.DriverCommon;
import org.testng.annotations.Test;
import pages.TVP_PamatlietasTest;

public class TVP_PamatlietasPOM extends DriverCommon {
    DriverCommon driverCommon = new DriverCommon();
    TVP_PamatlietasTest tvp_pamatlietasTest = new TVP_PamatlietasTest();

        @Test
    public void TVP_pamatlietasFire(){
            driverCommon.startDriverFirefox();
            tvp_pamatlietasTest.atverLADPlapu();
            tvp_pamatlietasTest.apstipirnaSīkdatnes();
            tvp_pamatlietasTest.atvērtAktualitātes();
            tvp_pamatlietasTest.atvērtKontaktus();
            tvp_pamatlietasTest.parMums();
            tvp_pamatlietasTest.lasītVairākParMums();
            tvp_pamatlietasTest.mainītValoduUzEN();
            driverCommon.aizvertDriverFirefox();
        }
    @Test
    public void TVP_pamatlietasChrome() {
        driverCommon.startDriverChrome();
        tvp_pamatlietasTest.atverLADPlapu();
        tvp_pamatlietasTest.apstipirnaSīkdatnes();
        tvp_pamatlietasTest.atvērtAktualitātes();
        tvp_pamatlietasTest.atvērtKontaktus();
        tvp_pamatlietasTest.parMums();
        tvp_pamatlietasTest.lasītVairākParMums();
        tvp_pamatlietasTest.mainītValoduUzEN();
        driverCommon.aizvertDriverChrome();
    }
    @Test
    public void TVP_pamatlietasEdge(){
        driverCommon.startDriverEdge();
        tvp_pamatlietasTest.atverLADPlapu();
        tvp_pamatlietasTest.apstipirnaSīkdatnes();
        tvp_pamatlietasTest.atvērtAktualitātes();
        tvp_pamatlietasTest.atvērtKontaktus();
        tvp_pamatlietasTest.parMums();
        tvp_pamatlietasTest.lasītVairākParMums();
        tvp_pamatlietasTest.mainītValoduUzEN();
        driverCommon.aizvertDriverEdge();
    }

}
