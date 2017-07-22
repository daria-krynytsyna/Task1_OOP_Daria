package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Stock {

    ArrayList <Product> stockList = new ArrayList <Product>();

    public void add (Product ob){
      stockList.add(ob);
    }

    public int count (){
        return Product.count;
    }

    public Product getObject (int index){
        return stockList.get(index);
    }


    public void print (){
        stockList.forEach((a) -> {
            System.out.println(a.toString());
        });
    }

    public void sort(){
        stockList.sort(new Comparator<Product>() {
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
    }

    public double getAvPrice (){
        return Product.getAverage(Product.sum,Product.count);
    }




}
