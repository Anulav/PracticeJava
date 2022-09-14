package logging;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingDriver {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public void doSomething(){
        logger.setLevel(Level.SEVERE);

        logger.severe("SEVERE Log");
        logger.warning("WARNING Log");
        logger.info("Info Log");
        logger.finest("FINEST Really not important");

        logger.setLevel(Level.INFO);
        logger.severe("SEVERE Log");
        logger.warning("WARNING Log");
        logger.info("Info Log");
        logger.finest("Finest Really not important");

    }
    public static void main(String[] args) {
        LoggingDriver loggingDriver = new LoggingDriver();
        try{
            MyLogger.setup();
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
        loggingDriver.doSomething();

    }
}
