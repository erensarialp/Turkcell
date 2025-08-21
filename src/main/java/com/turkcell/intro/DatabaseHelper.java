package com.turkcell.intro;

public class DatabaseHelper {

    //static -> Bulundugu nesnenin turetilmesine ihtiyac olmadan olusturulabilir.
    // Override edilemez.
    public static void connect(String username, String password){
        System.out.println("Varsayilan bilgiler ve kullanici bilgisi ile giris yapiliyor");
    }

    public static void connect(String username, String password, String url){
        System.out.println("URL bilgisindeki db'e baglaniyor");
    }
}

