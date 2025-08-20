package com.turkcell;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Eren Sarıalp");

        //Değişkenler

        int yas =23;
        yas = 30; //set
        System.out.println(yas); //get

        String isim = "Eren Sarıalp";
        System.out.println(isim);

        float sayi = 10.14f;
        double sayi1 = 10.14;
        long sayi2 = 10L;
        short sayi3 = 10;
        char karakter = 'E';
        boolean aktif = true;

        //Aritmetik Operatorler

        System.out.println(10 + 10);
        System.out.println(11 - 10);
        System.out.println(11 * 10);
        System.out.println(11 / 10);
        System.out.println(100 % 3); //  Mod (Bolumunden kalan)


        // Atama Operatorleri

        int a = 10;
        a = 15;

        a += 5; // a'nin uzerine 5 ekle
        a -= 5; // a'nin degerinden 5 cikar
        a *= 5; // a'yi 5 ile carp
        a /= 5; // a'yi 5'e bol
        System.out.println(a);

        // Karsilastirma Operatorleri -> Sonuc olarak boolean deger donen operatorlerdir.

        System.out.println(a == 15); // a 15'e esit mi?
        System.out.println(a != 15); // a 15'e esit degil mi?

        System.out.println(a > 10);
        System.out.println(a >= 15);

        System.out.println(a < 20);
        System.out.println(a <= 15);

        //Mantik Operatorleri
        // && => Ve Operatoru , iki kosulun da true olmasini ister
        // || => Veya Operatoru , iki kosuldan birinin true olmasini ister

        yas = 17;
        System.out.println(a == 15 && yas > 18); //short-circuit calisir
        System.out.println(a == 15 || yas > 18); //short-circuit calisir

        // Sart Bloklari

        if (yas > 18){

            System.out.println("Kisi resittir");
        }
        else if (yas == 18)
        {
            System.out.println("Kisi tam 18 yasindadir ay takibi yapilmai");
        }
        else
        {
            System.out.println("Kisi resit degildir");
        }


        boolean admin = true;

        if (admin){

            System.out.println("Logla");
        }

    }

}