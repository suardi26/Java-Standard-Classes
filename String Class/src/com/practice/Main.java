package com.practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/*
    - String merupakan tipe data object bukan tipe data primitif artinya object String memiliki referensi classnya.
    - Ada banyak method yang bisa kita gunakan dari class String melalui object, unutuk penjelasannya secara detail dapat di liat di
      halaman dokumentasi javadoc, pada website oracle.


*/
public class Main {


    public static void main(String [] args){

        // Beberapa contoh Method dari class String.

        // Method 'toLowerCase()'digunakan  Membuat String baru dengan format lower case (huruf kecil).
        String word = "Welcome7";
        System.out.println("Mengubah nilai String ("+word+") menjadi LowerCase : "+word.toLowerCase());

        // Method 'toUpperCase()' digunakan Membuat String baru dengan format upper case (huruf Besar).
        System.out.println("Mengubah nilai String ("+word+") menjadi Uppercase : "+word.toUpperCase());

        // Method 'length()' digunakan untuk mendapat panjang suatu nilai String dan return valuenya adalah int.
        System.out.println("Panjang Character ("+word+") : "+word.length());

        // Method 'starsWith(value)' Digunakan untuk melakukan pengecekan apakah nilai String dimulai dengan String value yang ada
        // pada parameter.
        String word2 = "David Esquiel";
        System.out.println("Apakah String Value ("+word+") dimulai dengan huruf 'W' ? = "+word.startsWith("W"));
        System.out.println("Apakah String Value ("+word2+") dimulai dengan Kata 'David' ? = "+word2.startsWith("David"));

        // Method 'endsWith(value)' Digunakan untuk melakukan pengecekan apakah nilai String diakhiri dengan String value yang ada
        // pada parameter.
        System.out.println("Apakah String Value ("+word+") diakhiri dengan '7' ? = "+word.endsWith("7"));
        System.out.println("Apakah String Value ("+word2+") diakhiri dengan Kata 'Esquiel' ? = "+word2.endsWith("Esquiel"));

        // Method 'split(value)' Digunakan untuk memecah suatu nilai String sesuai dengan parameter yang ditentukan.
        String[] list = word2.split(" ");
        System.out.println("Nilai String '"+word2+"' dapat dipecah dengan parameter spasi ' ' sehinnga memiliki nilai" +
                "-nilai : " +Arrays.toString(list));

        // Method 'isBlank()' untuk mengecek suatu nilai String ketika nilai kosong ataupun cuma spasi maka dianggap Kosong, kemudian
        // Menghasilkan nilai boolean true/false.
        String word3 = "     ";
        System.out.println("Nilai String '"+word3+"', ketika menggunakan method 'isBlank' maka hasilnya "+word3.isBlank());

        // Method 'isEmpty()' untuk mengecek suatu nilai String ketika nilai kosong maka akan menghasilkan nilai boolean true
        // berbeda dengan 'isBlank()', 'isEmpty()' tidak menganggap suatu nilai String kosong ketika ada spasi.
        String word4 = "";
        System.out.println("Nilai String '"+word3+"', ketika menggunakan method 'isEmpty()' maka hasilnya "+word3.isEmpty());
        System.out.println("Nilai String '"+word4+"', ketika menggunakan method 'isEmpty()' maka hasilnya "+word4.isEmpty());

        // Dan masih banyak lagi method yang ada pada class String untuk detail dokumentasi lengkapnya silahkan kunjungi oracle
        // tentang class String.
    }

}
