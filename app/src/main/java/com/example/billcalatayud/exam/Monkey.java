package com.example.billcalatayud.exam;

public class Monkey extends Animals {
    public static int totalAnimals;
    public int totalEnergy2 = totalEnergy;


    Monkey() {
        totalAnimals += 1;
    }

    @Override
    public void eat(String string) {
        System.out.println(getName() + " is eating ");
        totalEnergy2 += 2;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " is making a sound - remaining energy: " + getEnergy());
        totalEnergy2 -= 4;
    }

    @Override
    public void play() {
        if (totalEnergy2 > 8) {
            totalEnergy2 -= 8;
            System.out.println("Oooo Oooo Oooo");
        } else {
            System.out.println(getName() + " is too tired");
        }
    }

}
