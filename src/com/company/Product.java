package com.company;

public abstract class Product {
    private String name;
    private double price;
    static public double sum = 0;
    static public int count = 0;

    public Product(String name, double price) {
        this.name = name;
        if  (price > 0) {
            this.price = price;
            sum+=price;
        }
        count++;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price should be be positive");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    static public double getAverage (double sum, int count){
        double av = sum/count;
        return av;
    }
}
