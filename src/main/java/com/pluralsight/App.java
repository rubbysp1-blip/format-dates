package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class App {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        TimeZone timeZone = TimeZone.getTimeZone("US/Eastern");

        //DateTimeFormatter formatter;
        //System.out.println(dateTime.format(formatter));
        //System.out.println(dateFormat(dateTime));

        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-dd-MM")));

        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy")));

        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("EEEE, MM dd, yyyy hh:ss")));

    }

}
