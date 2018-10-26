package com.example.billcalatayud.exam;

public class Exam {

    public static void main(String[] args) {
        System.out.println("\n\n\t*** Encoding problem ***\n\n");
        Encoding encoding = new Encoding();
        encoding.f("Errors in strategy cannot be correct through tactical maneuvers");
        encoding.g("Hello there! Apple!");

        System.out.println("\n\n\t*** Jungle problem ***\n\n");
        Jungle jungle = new Jungle();
        System.out.println("\n--- Jungle soundOf --- \n");
        jungle.makeSoundOf();
        System.out.println("\n--- Jungle soundOf finished --- \n");

        System.out.println("\n--- Random activities ---\n");
        jungle.activities();

    }


}







