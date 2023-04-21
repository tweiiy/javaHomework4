package org.example;

public class Plate {
    int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;
        } else {
            System.out.println("Not enough food in the plate.");
        }
    }
    public void addFood(int n) {
        food += n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
