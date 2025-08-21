package com.turkcell.intro;

public class Methods {
    public static void main(String[] args) {
        veritabaninaBaglan("abc123 ");
        veritabaninaBaglan("abc123 ");
        veritabaninaBaglan("abc123 ");
        veritabaninaBaglan("abc123 ");

        int sayi1 =topla(5 , 10);
        System.out.println(sayi1);

        int sayi2 = topla(5 , 20);
        System.out.println(sayi2 + 50);
    }

    // (erisim belirleyici) static (donus tipi) fonksiyonAdi() {}
    public static void veritabaninaBaglan(String veritabaniAdi){

        // Eger veritabani adi 2 haneden kucukse baglanmaya calisma
        if(veritabaniAdi.length() <= 2)
            return; //Buraya geldigi an fonksiyonu bitir
        System.out.println(veritabaniAdi + "Veritabani Baglantisi. x15");
    }

    public static int topla (int a, int b){ //donus tipi varsa return tipini vermek zorunludur
        System.out.println(a+b);
        return a + b;
    }
}
