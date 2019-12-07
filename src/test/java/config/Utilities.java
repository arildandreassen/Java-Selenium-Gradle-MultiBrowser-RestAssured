package config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {

    @Rule
    public TestName testName = new TestName();

    @Before
    public void before(){
        logger.info("====== starting test: " + testName.getMethodName() + " ======");
    }

    public static final Logger logger = LogManager.getLogger("Log");

    static public String getDateNow(){
        return getUnformattedDate("yyyy-MM-dd HH:mm:ss");
    }

    static public String getDateNowScreenshot(){
        return getUnformattedDate("yyyy-MM-dd_HH-mm-ss");
    }

    static private String getUnformattedDate(String format){
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = new Date();
        String formattedDate = dateFormat.format(date);
        return formattedDate;
    }
}
