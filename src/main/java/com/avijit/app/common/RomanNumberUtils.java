package com.avijit.app.common;

import java.util.TreeMap;

public class RomanNumberUtils {
    private final static TreeMap<Character, Integer> romanMap = new TreeMap<Character, Integer>() {{

        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    private static final int[] romanNumbers = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private static final String[] romanSymbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public static int toNumber(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            sum += romanMap.get(s.charAt(i));
        }

        return sum;
    }


    public static String toRoman(int number) {

        StringBuilder builder = new StringBuilder();

        int i = romanNumbers.length - 1;
        while (number > 0) {
            int div = number / romanNumbers[i];
            number = number % romanNumbers[i];
            while (div > 0) {
                builder.append(romanSymbols[i]);
                div = div - 1;
            }
            i = i - 1;
        }
        return builder.toString();
    }
}