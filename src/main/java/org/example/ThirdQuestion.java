package org.example;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdQuestion {
    private static final String PATH = "src/main/resources/passwords.txt";
    public static void main(String[] args) throws IOException {
        InputStream inputstream = new FileInputStream(PATH);
        String string = inputstream.readAllBytes().toString();
        System.out.println(string);
        System.out.println();
        System.out.println();
        String[] passwords = string.split(",");

        for(String split: passwords) {
            if (split.length() == 8 && (split.contains("0") || split.contains("1") || split.contains("2") || split.contains("3")|| split.contains("4")|| split.contains("5")|| split.contains("6") || split.contains("7") || split.contains("8") || split.contains("9"))
            && hasBothCapAndLowLetter(split));
            System.out.println(split);
        }

    }


    public static boolean hasBothCapAndLowLetter(String string) {
        int cap = 0;
        int low = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) > 64 && string.charAt(i) < 91) low++;
            if (string.charAt(i) > 96 && string.charAt(i) < 123) cap++;
        }
        return cap > 0 && low > 0;
    }
}
