package com.turkcell;

public class Loops {
    public static void main(String[] args) {

        //Iterasyon

        int []numbers = {10,20,30,40};
        System.out.println(numbers[1]); //array-dizi

        // degisken, sart, aksiyon
        for(int i = 5; i < 10; i++){
            System.out.println(i);
            System.out.println("Merhaba");
        }

        for( int number : numbers){

            System.out.println(number* 5);
        }


        //Kosulu kontrol eder calismaya baslar
        int a = 0;
        while(a < 5){
            a++;
            System.out.println("While calisti");
        }

        //Calismaya baslar kosulu kontrol eder
        int i = 0;
        do {
            System.out.println("Do While Calisti");
        }while(i>5);


        String ogrenciler[] = {"Muzaffer" , "Utku" , "Eren", "Beyza"};

        for (String ogrenci : ogrenciler){
            //Muzaffer adli ogrenci es gecilsin
            if(ogrenci.equals("Muzaffer")){
                //continue => Bu iterasyonu burada bitir.Bir sonrakine gec.
               // continue;

                //break => Bu donguyu tamamen kir (bitir).
                break;
            }

            System.out.println("Ogrenci : " + ogrenci + " icin islem yapiliyor.");
        }
    }
}
