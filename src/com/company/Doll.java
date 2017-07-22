package com.company;

public class Doll extends Product {
    private double size;
    private String hair;

    public Doll(String name, double price, double size, String hair) {
        super(name, price);
        if ((size > 0)&&(size < 120)) {
            this.size = size;
        }
        if ((hair.toLowerCase() == "fair")||(hair.toLowerCase() == "dark")||
                (hair.toLowerCase() == "red")) {
            this.hair = hair;
        }
    }

    public Doll() {
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if ((size > 0)&&(size < 120)) {
            this.size = size;
        } else{
            System.out.println("The size should be more than 0 sm and less than 120sm");
        }
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        if ((hair.toLowerCase() == "fair")||(hair.toLowerCase() == "dark")||
                (hair.toLowerCase() == "red")) {
            this.hair = hair;
        } else {
            System.out.println("The hair can be fair, dark or red only");
        }

    }

    @Override
    public String toString() {
        return "Doll{" +
                "size=" + size +
                ", hair='" + hair + '\'' +
                "} " + super.toString();
    }
}
