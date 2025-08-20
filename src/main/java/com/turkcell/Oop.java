package com.turkcell;

public class Oop {
    public static void main(String[] args) {
        //Constructor - Yapici  blok
        //
        //Her class ayni zamanda yeni bir veri turu
        Car car1 = new Car("Honda", "Civic", 2025, 100); //Instance
        car1.startRent();
        // new -> o classtan yeni bir "instance" uretir.

        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.model = "Corolla";
        car2.startRent();

        //Encapsulation - Kapsulleme
        //car2.year = 10; //SET
        //System.out.println(car2.year); //GET

        car2.setYear(2025);
        car2.setYear(10);//SET
        System.out.println(car2.getYear()); //GET





    }
}
