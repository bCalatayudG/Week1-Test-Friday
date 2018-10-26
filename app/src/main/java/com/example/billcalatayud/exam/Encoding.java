package com.example.billcalatayud.exam;

import java.util.HashMap;

public class Encoding {
    public static void f(String string) {
        char[] arrayString = string.toCharArray();
        String encodedString = "";
        int a, b, intC = 0, fst = 0, scn = 0;
        for (int i = 0; i < string.length(); i++) {
            intC = (int) arrayString[i];
            if (intC < 123 && intC > 96) {
                fst = 97;
                scn = 122;
            } else if (intC < 90 && intC > 65) {
                fst = 65;
                scn = 90;
            } else if (intC < 65 || intC > 123) {
                fst = 0;
                scn = intC * 2;
            }
            a = intC - fst;
            b = scn - a;
            encodedString += (char) b;
        }
        System.out.println("Original string: " + string);
        System.out.println("Encoded string:  " + encodedString);

    }

    public static void g(String string) {
        HashMap<Character, Integer> abcd = new HashMap<Character, Integer>();

        string = string.toLowerCase();

        for (int c = 97; c <= 122; c++) {
            abcd.put((char) c, 0);
        }
        for (char c : string.toCharArray()) {
            if (abcd.containsKey(c)) {
                abcd.put(c, abcd.get(c) + 1);
            }
        }
        System.out.println(abcd);
    }
}
