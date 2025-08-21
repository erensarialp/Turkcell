package com.turkcell.intro;

//Vehicle classindaki tum ozellikleri al, uzerine buradaki ozellikleri ekle.

//Superclass => Kalitim alinan class (Vehicle)
//Subclass => Kalitim yapan class (Car)

public class Car extends Vehicle {

    private int doorCount;

    public Car() {
    }

    public Car(String brand, String model, int year, float km, int doorCount) {
        super(brand, model, year, km);
        this.doorCount = doorCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}






