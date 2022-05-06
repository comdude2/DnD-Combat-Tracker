package main;

import gui.FrameController;
import util.FileSystem;
import util.Log;

public class Main {

    private final static Log log = new Log("CaravanManager", false);
    private final static String version = "1.0";
    private static FileSystem fs = null;

    public static void main(String args[]){
        log.info("CombatTracker V" + Main.version);
        for (String arg : args){
            if (arg.equalsIgnoreCase("debug")){
                Main.log.setDebug(true);
            }
        }
        //DatabaseConnector.loadJdbcDriver(log);

        //Initialise Filesystem
        fs = new FileSystem(log);
        fs.createSubFileSystem();

        //Check for updates
        //checkForUpdates();

        //Start framecontroller
        FrameController controller = new FrameController(log, fs);
        controller.initialise();

        //Done
        log.info("Done");
        //log.error("Test", new Exception("Pie"));
    }

    private static String stringStripper(String string){
        string.replaceAll("\n", "");
        string.replaceAll("\\n", "");
        string.replaceAll("\r", "");
        string.replaceAll("\\r", "");
        return string;
    }

}
