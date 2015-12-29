package si.meansoft.meancore;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import si.meansoft.meancore.common.library.InfoMC;
import si.meansoft.meancore.event.*;
import si.meansoft.meancore.proxy.IProxy;

@Mod(modid = InfoMC.MODID, name= InfoMC.MODNAME, certificateFingerprint = InfoMC.FINGERPRINT, version = InfoMC.VERSION, guiFactory = InfoMC.GUI_FACTORY)
public class MeanCore {

    @Mod.Instance(InfoMC.MODID)
    public static MeanCore instance;

    private static Server sr = new Server();

    @SidedProxy(clientSide = "si.meansoft.meancore.proxy.ClientProxy", serverSide = "si.meansoft.meancore.proxy.ServerProxy")
    public static IProxy proxy;

    @EventHandler
    public void invalidFingerprint(FMLFingerprintViolationEvent evt) {
        Fingerprint fp = new Fingerprint();
        fp.init(evt, InfoMC.FINGERPRINT);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent evt) {
        System.out.println("MC-0: " + evt.getSuggestedConfigurationFile());
        PreInit pi = new PreInit();
        pi.init(evt);
    }

    @EventHandler
    public void init(FMLInitializationEvent evt) {
        Init in = new Init();
        in.init(evt);
    }

    @EventHandler
    public void readIMC(FMLInterModComms.IMCEvent evt) {
        ReadIMC imc = new ReadIMC();
        imc.init(evt);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent evt) {
        PostInit pi = new PostInit();
        pi.init(evt);
    }

    @EventHandler
    public void serverStarting(FMLServerStartingEvent evt) {
        sr.initStart(evt);
    }

    @EventHandler
    public void serverStopping(FMLServerStoppingEvent evt) {
        sr.initStop(evt);
    }
}
