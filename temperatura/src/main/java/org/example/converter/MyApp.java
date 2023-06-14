import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MyApp {
    private static final Logger logger = LogManager.getLogger(MyApp.class);

    public static void main(String[] args) {
        logger.info("To jest informacja logowana");
        logger.error("To jest błąd logowany");

    }
}
