package com.practice;

import java.sql.SQLOutput;
import java.util.Objects;

/*
    - Objects adalah class utility yang berisikan banyak static method yang bisa kita gunakan untuk operasi object atau melakukan
      pengecekan sebelum operasinya dikerjakaan.
    - Class objects bukan class object yang merupakan superclass dari setiap class.
    - Untuk dokumentasi lengkapnya silahkan kunjungi oracle tentang class Objects.
*/
public class Main {
    public static void main(String[] args) {

        startManual(new ExObjects("Ovaltine"));

        startObjects(new ExObjects("Milo"));
        startObjects(new ExObjects(null));
    }

    // Melakukan Pengecekan secara manual.
    public static void startManual(ExObjects exObjects){
        if (exObjects != null){
            System.out.println(exObjects.toString());
            System.out.println(exObjects.hashCode());
        }
    }

    // Melakukan Pengecekan menggunakan class Objects.
    public static void startObjects(ExObjects exObjects){
        System.out.println(Objects.toString(exObjects));
        System.out.println(Objects.hashCode(exObjects));
    }

    // Masih banyak method dari class Objects yang dapat digunakan, untuk dokumentasi lengkap dari class Objects dapat mengunjungi
    // situs web oracle.
}
