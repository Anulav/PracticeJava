package logging.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jDriver {

    private static final Logger LOGGER = LogManager.getLogger(Log4jDriver.class);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 2000; i++) {
            LOGGER.info("This is the {} time I say 'Hello World'.", i);
            Thread.sleep(100);
        }
        LogManager.shutdown();
    }
}
