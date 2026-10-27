package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter;
        //System.out.println(dateTime.format(formatter));
        System.out.println(dateFormat(dateTime));

        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

        formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        System.out.println(dateTime.format(formatter));

        formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        System.out.println(dateTime.format(formatter));

        formatter = DateTimeFormatter.ofPattern("EEEE, MM dd, yyyy hh:ss");
        System.out.println(dateTime.format(formatter));
    }

    public static String dateFormat(LocalDateTime dateTime){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return dateTime.format(dateTimeFormatter);
    }
}
