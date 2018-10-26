package com.example.billcalatayud.exam;

import java.util.Random;

public abstract class Animals {
    Random rand = new Random();
    int totalEnergy;
    private String name;

    public void eat(String string) {
        System.out.println(getName() + " is eating");
        totalEnergy += 5;
    }

    public void sleep() {
        System.out.println(getName() + " is sleeping");
        totalEnergy += 10;
    }

    public void makeSound() {
        System.out.println(getName() + " is making a sound - remaining energy: " + getEnergy());
        totalEnergy -= 3;
    }

    public void play() {
        System.out.println(getName() + " can't play, is not a monkey");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("name: " + name);
    }

    public int getEnergy() {
        return totalEnergy;
    }

    public void setEnergy() {
        totalEnergy = rand.nextInt(20) + 1;
        System.out.println(getName() + " created with: " + totalEnergy + " energy");
    }

}
