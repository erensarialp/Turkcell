package com.turkcell;

public class BiggestNumber {
    public static void main(String[] args) {

        int a = 3;   // Math.max kutuphanesi ile tek satirda da yapabiliriz
        int b = 5;
        int c = 4;

        if (a >= b && a >= c){

            System.out.println(a);
        } else if (b >= a && b >=c) {

            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}
