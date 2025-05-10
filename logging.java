import java.util.logging.Logger;

public class logging {

    private static Logger log = Logger.getLogger("request");

    public static void main(String[] args) {
        log.info("logging message");
        log.warning("this is warning");
        log.config("config");
        log.fine("fine");
        log.severe("sever warning");
        

    }
}
