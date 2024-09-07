package com.edu.seiryo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneralUtils {
	private static final String FORMART_DATE = "yyyy-MM-dd HH:mm:ss";
	public static String BEGINTIME;
	public static String BEGINHOUR;
	public static String ENDTIME;
	public static String ENDHOUR;
	public static String formatDateToString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMART_DATE);
        String result = sdf.format(date);
        return result;
    }

    public static boolean compareToTime(int time, boolean target) {
        Date currentTime = new Date();
        String strTime = formatDateToString(currentTime);
        strTime = strTime.split(" ")[1];
        String[] times = strTime.split(":");
        String cTime = "";
        for (int i = 0; i < times.length; i++) {
            cTime += times[i];
        }
        int intTime = Integer.parseInt(cTime);
        if (target) {
            return (intTime >= time) ? true : false;
        } else {
        	return (intTime <= time) ? true : false;
        }
    }
}
