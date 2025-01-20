package web.models;

import java.awt.*;

public class Car {
    private String model;
    private int year;
    private Color color;

    public Car(String model, int year, Color color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public String getColorString() {
        return color.toString();
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
