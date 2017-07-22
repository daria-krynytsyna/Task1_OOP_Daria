package com.company;

import static com.company.CarType.Hatchback;
import static com.company.CarType.Sedan;
import static com.company.CarType.Van;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stock stock = new Stock();

        stock.add(new Car("Mersedes", 50000, Sedan,"green",2016));
        stock.add(new Doll("Barbie",100, 100,"fair"));
        stock.add(new Doll("Sofia",500.5, 75,"dark"));
        stock.add(new Car("Nissan", 31000.5, Van,"red",2005));
        stock.add(new Car("Toyota", 31000.3, Hatchback,"yellow",2010));

        stock.print();

        System.out.println();
        stock.sort();

        stock.print();
        System.out.println("Number of objects in Collection : " + stock.count());
        System.out.println("Average price is " + stock.getAvPrice());


    }
}
