package com.practice;

/*
    - Regular Expression(regex) adalah cara untuk melakukan pola pencarian, biasanya dilakukan untuk pencarian dalam data String.
    - Kita sering melakukan pencarian text pada aplikasi misalnya text editor atau aplikasi office.
    - Regex adalah pencarian yang lebih advanced dibanding pencarian text biasanya, contohnya kita ingin mencari semua kata
      yang mengandung diawali huruf tertentu dan diakhiri huruf tertentu, dll.

    - Java Sudah menyediakan package java.util.regex yang berisikan utilitas untuk melakukan proses regular expresssion.
    - Secara garis besar ada 2 class yang dapat digunakan : Pattern Class dan Matcher Class.
    - Pattern Class adalah representasi hasil kompilasi dari pola regular expression yang dibuat.
    - Matcher Class adalah engine untuk melakukan pencarian dari pattern yang sudah dibuat.
    - Aturan regular expression sangat banyak, Untuk dokumentasi lengkapnya silahkan kunjungi oracle tentang
      Class Pattern.

*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String name = "Suardi Daud Manda Java ud su";

        // Membuat Pattern Regular Expression (regex).
        // Dimana bisa saja ada huruf a samapi z atau A sampai Z pada samping kiri berapapun jumlahnya bisa 0 atau 1 ataupun lebih
        // dari 1 ditandai dengan '*' dan ditengahnya harus ada huruf 'u' kemudian disamping kanan bisa saja ada
        // huruf a samapi z atau A sampai Z berapapun jumlahnya baik 0 atau 1 ataupun lebih dari satu ditandai dengan '*'
        // Sehinnga dari nilai String 'name' dapat ditemukan kata : 'Suardi','Daud','ud','su'.
        Pattern pattern = Pattern.compile("[a-zA-Z]*[u][a-zA-Z]*");

        // Melakukan pencarian dari class Matcher berdasarkan pattern yang telah dibuat.
        Matcher matcher = pattern.matcher(name);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

        // Aturan regular expression sangat banyak, Untuk dokumentasi lengkapnya silahkan kunjungi oracle tentang
        // Class Pattern.
    }
}
