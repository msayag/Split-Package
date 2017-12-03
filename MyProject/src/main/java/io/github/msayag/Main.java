package io.github.msayag;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.msayag.lib.Something;
import io.github.msayag.lib.impl.KindOfSomething;

public class Main {
    private final static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String... args) {
        logger.info("Application started");
        Something s = new KindOfSomething();
        logger.debug("Some object was created: " + s);
        logger.info("Application completed");
    }
}
