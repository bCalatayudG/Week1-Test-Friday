package com.example.billcalatayud.exam;

public class Tiger extends Animals {
    public static int totalAnimals;
    public int totalEnergy2 = totalEnergy;


    Tiger() {
        totalAnimals += 1;
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping");
        totalEnergy2 += 5;
    }

    @Override
    public void eat(String string) {
        if (string.equals("grain"))
            System.out.println(getName() + "can't eat " + string + ", has a sensitive digestive system.");
        else {
            totalEnergy2 += 5;
            System.out.println(getName() + "is eating");
        }
    }
}
