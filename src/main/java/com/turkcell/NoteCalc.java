package com.turkcell;

public class NoteCalc {
    public static void main(String[] args) {
        
        float not = 67f;
        
        if(not >= 90 && not <=100){

            System.out.println("Harf Notunuz = AA");
        }
        else if (not >=85 && not < 90 ) {

            System.out.println("Harf Notunuz = BA");
        }
        else if (not >= 70 && not < 85) {

            System.out.println("Harf Notunuz = BB");
        }
        else if (not >= 65 && not < 70) {

            System.out.println("Harf Notunuz = CB");
        }
        else if (not >= 60 && not < 65) {

            System.out.println("Harf Notunuz = CC");
        }
        else if (not >= 50 && not < 60) {

            System.out.println("Harf Notunuz = DD");
        }
        else{
            System.out.println("Harf Notunuz = FF");
        }


    }
}
