/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package log4j2.bugsample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("STARTED SUCCESFULLY");
        logger.info("INFO message with no lambdas");
        logger.info("INFO message with a lambda function result = {}",
                () -> { return "MESSAGE FROM LAMBDA"; });
        methodWithLoggerCall();
        System.out.println("ENDED SUCCESFULLY");
    }

    private static String getMethodMessage() {
        return "METHOD MESSAGE";
    }

    private static void methodWithLoggerCall() {
        logger.info("INFO message with a method reference {}", App::getMethodMessage);
    }
}
