package com.example.billcalatayud.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Jungle {
    Random rand = new Random();
    List<String> foodlist = Arrays.asList("meat", "fish", "bugs", "grain");
    ArrayList<Tiger> tigerList = new ArrayList<>();
    ArrayList<Monkey> monkeyList = new ArrayList<>();
    ArrayList<Snake> snakeList = new ArrayList<>();

    String[] lists = {"tigerList", "monkeyList", "snakeList"};

    Jungle() {


        System.out.println("Tigers:");
        for (int i = 0; i <= rand.nextInt(10) + 1; i++) {
            Tiger tiger = new Tiger();
            tiger.setName("Tiger" + i);
            tiger.setEnergy();
            tigerList.add(tiger);
        }
        System.out.println("\nMonkeys:");

        for (int i = 0; i <= rand.nextInt(10) + 1; i++) {
            Monkey monkey = new Monkey();
            monkey.setName("Monkey" + i);
            monkey.setEnergy();
            monkeyList.add(monkey);
        }
        System.out.println("\nSnakes:");
        for (int i = 0; i <= rand.nextInt(10) + 1; i++) {
            Snake snake = new Snake();
            snake.setName("Snake" + i);
            snake.setEnergy();
            snakeList.add(snake);
        }
        System.out.println("\nTotal tigers created: " + tigerList.size());
        System.out.println("Total monkeys created: " + monkeyList.size());
        System.out.println("Total snakes created: " + snakeList.size());
    }

    public void makeSoundOf() {
        System.out.println("Tigers: ");
        for (Tiger tiger : tigerList) {
            tiger.makeSound();
        }

        System.out.println("\nMonkeys: ");
        for (Monkey monkey : monkeyList) {
            monkey.makeSound();
        }

        System.out.println("\nSnakes:");
        for (Snake snake : snakeList) {
            snake.makeSound();
        }
    }

    public void activities() {

        System.out.println("\nTigers: " + tigerList.size());
        for (Tiger tiger : tigerList) {
            randomActivity(tiger);
        }
        System.out.println("\nMonkeys: " + monkeyList.size());
        for (Monkey monkey : monkeyList) {
            randomActivity(monkey);
        }
        System.out.println("\nSnakes:" + snakeList.size());
        for (Snake snake : snakeList) {
            randomActivity(snake);
        }
    }

    private void randomActivity(Animals animal) {
        switch (rand.nextInt(4) + 1) {
            case 1:
                System.out.print("Eat: ");
                animal.eat(foodlist.get(rand.nextInt(3) + 1));
                break;
            case 2:
                System.out.print("Sleep: ");
                animal.sleep();
                break;

            case 3:
                System.out.print("Play: ");
                animal.play();
                break;
            case 4:
                System.out.print("MakeSound: ");
                animal.makeSound();
                break;
            default:
                break;
        }
    }

}
