package com.example.task1;

public class Solution {

    public static String shrink_space_v1(String inputString) {

        String value = inputString.replace(" ", "");
        return value;
    }

    public static String shrink_space_v2(String inputString) {

        String result = "";
        char[] charArray = inputString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            char symbol = charArray[i];

            if (symbol != ' ') {
                result = result + symbol;
            }
        }
        return result;
    }
}
