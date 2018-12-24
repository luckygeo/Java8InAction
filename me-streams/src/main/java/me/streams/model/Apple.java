package me.streams.model;

import java.io.Serializable;

public class Apple implements Serializable {
    private int weight;
    private String color;

    public Apple() {

    }

    public Apple(String color, int weight) {
        this.weight = weight;
        this.color = color;
    }

    public Apple(int weight) {
        this("red", weight);
    }

    public Apple(String color) {
        this(color, 1);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
