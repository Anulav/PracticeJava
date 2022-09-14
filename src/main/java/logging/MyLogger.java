package logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
    static private FileHandler filehandler;
    static private FileHandler htmlHandler;
    static private SimpleFormatter simpleFormatter;
    static private MyFormatter formatter;

    static void setup() throws IOException {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.setLevel(Level.FINE);

        filehandler = new FileHandler("logging.txt");
        htmlHandler = new FileHandler("logging-html.htm");
        simpleFormatter = new SimpleFormatter();

        filehandler.setLevel(Level.FINE);
        filehandler.setFormatter(simpleFormatter);

        formatter = new MyFormatter();
        htmlHandler.setLevel(Level.ALL);
        htmlHandler.setFormatter(formatter);

        logger.addHandler(filehandler); /* One Logger can have multiple handlers */
        logger.addHandler(htmlHandler);
    }

}


/*
* Get Logger
* create handlers, set their logging levels also create Formatter and add to the handlers
* and finally add handler to the logger.
*
*
* */