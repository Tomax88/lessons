package com.academy.lesson4;
import java.util.regex.Pattern;
public class Task3 {
    public static void main(String[] args) {

        String date1 = "2012/09/18 12:10";
        String date2 =  "2013/09/09 09:09";
        String date3 = "2013/9/09 09:09";
        String reg = "[1-2]\\d{3}\\/\\d{2}/\\d{2}\\s\\d{2}[:]\\d{2}";

        checkDate(reg, date1);
        checkDate(reg, date2);
        checkDate(reg, date3);
    }

    public static void checkDate(String reg, String date){

        boolean result = Pattern.matches(reg, date);
        System.out.println(result);

    }

}
