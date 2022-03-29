package com.practice;

import java.util.Calendar;
import java.util.Date;

/*
    - Class System berisi banyak utility static method di Java, misalnya yang sering digunakan adalah println() milik field out
      di class System.
    - Untuk  dokumentasi lengkapnya silahkan kunjungi oracle tentang class System.
*/
public class Main {

    public static void main(String[] args) {

        // Beberapa contoh Method dari class System.

        // String getenv(key) untuk mendapatkan environment variable sistem operasi.
        System.out.println(System.getenv("OS"));

        // long currentTimeMillis() untuk mendapatkan waktu saat ini dalam milisecond.
        System.out.println(System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        System.out.println(calendar.getTime());

        // ling nanoTime() untuk mendapatkan waktu saat ini dalam nanosecond.
        System.out.println(System.nanoTime());

        // void gc() untuk menjalankan Java garbage Collection.
        System.gc();

        // void exit(status) untuk menghentikan program Java.
        System.exit(10);

        System.out.println("END");

        // Masih banyak method dari class System yang dapat digunakan, untuk dokumentasi lengkap dari class System dapat mengunjungi
        // situs web oracle.
    }
}
