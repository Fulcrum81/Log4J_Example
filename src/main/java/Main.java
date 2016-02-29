import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.trace("This is a trace message");
        LOG.debug("This is a debug message");
        LOG.info("This is an info message");
        LOG.warn("This is a warning");
        LOG.error("This is an error");
        LOG.fatal("This is a fatal error");

        try {
            int x = 1 / 0;
        }
        catch (Exception e) {
            LOG.error("Все плохо!", e);
            LOG.trace("Отработало исключение", e);
        }
    }
}
