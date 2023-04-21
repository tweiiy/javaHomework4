package org.example;

public class Cat {
    String name;
    private int appetite;
    boolean isFull;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }
    public void eat(Plate p) {
        if (p != null && p.food >= appetite) {
            p.decreaseFood(appetite);
            isFull = true;
        } else {
            System.out.println("Not enough food in the plate.");
        }
    }
}
