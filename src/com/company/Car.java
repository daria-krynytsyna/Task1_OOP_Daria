package com.company;

public class Car extends Product {
  private CarType type;
  private String color;
  private int year;

    public Car(String name, double price, CarType type, String color, int year) {
        super(name, price);
        this.type = type;
        if ((color.toLowerCase() == "red")||(color.toLowerCase() == "blue")||
            (color.toLowerCase() == "black")||(color.toLowerCase()=="green")||
            (color.toLowerCase() == "white")) {
            this.color = color;
        }
        if (year > 1900) {
            this.year = year;
        }
    }

    public Car() {
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if ((color.toLowerCase() == "red")||(color.toLowerCase() == "blue")||
                (color.toLowerCase() == "black")||(color.toLowerCase()=="green")||
                (color.toLowerCase() == "white")) {
            this.color = color;
        } else {
            System.out.println("The given color " + color + " doesn't exist for this product");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        if (year > 1900) {
            this.year = year;
        } else {
            System.out.println("The year of release should be more than 1900");
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", color='" + color + '\'' +
                ", year=" + year +
                "} " + super.toString();
    }
}
