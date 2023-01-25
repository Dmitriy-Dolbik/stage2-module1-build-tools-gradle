package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if(str.equals("null") || str == "" || str == " ")
        {
            return false;
        } else {
            double number = Double.parseDouble(str);
            if (number > 0){
                return true;
            }
            else {
                return false;
            }
        }

    }
}
