package config;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {

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
