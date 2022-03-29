package com.practice;

import java.util.StringJoiner;

/*
    - StringJoiner adalah class yang bisa digunakan untuk membuat String sequence yang dipisahkan dengan
      delimiter (pemisah) tertentu.
    - StringJoiner dapat memisah nilai suatu array dengan delimeter tertentu.
    - StringJoiner juga mendukung prefix (Character Paling pertama) dan suffix(Character Paling terakhir).
    - CLass StringJoiner sangat bagus digunakan pada saat kita ingin menampilkan nilai array dengan format yang
      ditentukan.
    - Untuk  dokumentasi lengkapnya silahkan kunjungi oracle tentang class StringJoiner.
*/
public class Main {
    public static void main(String[] args){
        String[] brands = {"Apple","Realme","Samsung"};
        StringJoiner stringJoiner = new StringJoiner(" - ","[ "," ]");

        // Menambahkan value dari StringJoiner.
        for(var brand : brands){
            stringJoiner.add(brand);
        }

        stringJoiner.add("Asus");
        stringJoiner.add("Oppo");

        System.out.println("Nilai dari variabel product yang bertipe data Array adalah : "+stringJoiner.toString());
    }
}
