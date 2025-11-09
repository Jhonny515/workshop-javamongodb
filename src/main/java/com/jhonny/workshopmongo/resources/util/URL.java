package com.jhonny.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class URL {
    public static String decodeParam(String text) {
        try {
            return java.net.URLDecoder.decode(text, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }
    public static Date convertDate(String textDate, Date defaultDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        try {
            return sdf.parse(textDate);
        } catch (ParseException e) {
            return defaultDate;
        }
    }
}
