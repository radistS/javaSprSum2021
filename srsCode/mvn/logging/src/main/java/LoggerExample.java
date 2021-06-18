import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerExample {


    private static final Logger loggerDebug = LoggerFactory.getLogger("logger.debug");
    private static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");
    private static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    private static final Logger loggerError = LoggerFactory.getLogger("logger.error");

    private static final String MESSAGE_PATTERN = "Example log from {}";

    public static void main(String[] args) throws InterruptedException {

//        loggerWarn.trace(MESSAGE_PATTERN, 1);
//        loggerWarn.debug(MESSAGE_PATTERN, 2);
//        loggerWarn.info(MESSAGE_PATTERN, 3);
//        loggerWarn.warn(MESSAGE_PATTERN, 4);
//        loggerWarn.error(MESSAGE_PATTERN, 5);

        for (int i = 1; i <= 5000000;i++) {

            Student st = new Student().setFirstName("ST_FN_" + i).setLastName("ST_LN_" + i).setAge((int) (Math.random() * 100));
            loggerDebug.debug("create user default : " + st.toString());
            if (st.getAge() < 50) {
                loggerError.error("User is young : " + st.toString());
                loggerWarn.error("User is young : " + st.toString());
            } else {
                loggerWarn.warn("Created user : " + st.toString());
            }
        }

    }
}
