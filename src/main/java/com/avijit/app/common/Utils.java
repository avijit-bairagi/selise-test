package com.avijit.app.common;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Utils {

    public static String decode(String data) {

        byte[] decoded = Base64.getDecoder().decode(data);
        return new String(decoded, StandardCharsets.UTF_8);
    }

    public static String removeSpecialCharsAndNumbers(String data) {
        return data.replaceAll(Constants.specialChars, Constants.empty);
    }

    public static String increment(String data) {

        StringBuilder stringBuilder = new StringBuilder();

        for (char c : data.toCharArray()) {
            stringBuilder.append((char) (((int) c) + 1));
        }

        return stringBuilder.toString();
    }
}
