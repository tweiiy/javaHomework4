package org.example;


public class Main {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Murzik", 7),
                new Cat("Vasya", 3)
        };

        Plate plate = new Plate(20);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println("Cat " + cat.name + " is full: " + cat.isFull);
        }

        plate.info();
    }
}