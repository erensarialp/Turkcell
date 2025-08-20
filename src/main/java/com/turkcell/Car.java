package com.turkcell;

//OOP'de temsil edeceğimiz nesnenin kalıbı
public class Car {

    //Her nesnenin icinde ctor oto. olusturulur.
    //Ama istersek kendi ctor'imizi yazabiliriz.


    //All - Args - Ctor
    public Car(String brand, String model, int year, float km){
        System.out.println("1. Ctor blogu");
        this.brand = brand; //this => Classin kendisini ifade eder.
        this.model = model;
        this.year = year;
        this.km = km;
    }

    //No - Args - Ctor
    public Car(){
        System.out.println("2. Ctor Blogu");

    }

    //Method Overloading

    public String brand;
    public String model;
    public int year;
    public float km;

    public void startRent(){
        System.out.println("Kiralama baslatiliyor." + this.brand);
    }


    public void endRent(){
        System.out.println("Kiralama bitiriliyor.");
    }


    //getter-setter methods
    //setter
    public void setYear(int year){
        if(year < 2000){
            System.out.println("Yil 2000'den kucuk olamaz");
            return;
        }

        this.year = year;

    }
    //getter
    public int getYear(){
        return this.year;
    }

}



//Erisim Belirleyiciler
// public -> Bu class diger tum siniflardan erisebilsin.
// protected -> Bu class alt siniflardan, ayni paketlerden erisilebilsin.
// private -> Yalnizca o sinifin icinden erisilebilsin.
// default -> Bu class ayni sinif ve ayni paket disinda erisilebilir olmasin.
