package logging;

import java.util.Locale;
import java.util.logging.Logger;

public class LoggingDriverUsingAppLogProperties {
    static {
        String path = LoggingDriverUsingAppLogProperties.class
                .getClassLoader()
                .getResource("Logging.properties")
                .getFile();
        System.setProperty("java.util.logging.config.file", path);
    }
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        logger.severe("Severe log Beware");
        logger.info("Info log Beware");
    }
}
