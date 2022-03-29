package com.practice;

    /* - Class Math adalah class utilities yang berisikan banyak sekali static mehtod untuk operasi numerik, misalnya trigonometri,
         logarithm, akar pangkat, dll.
       - Untuk  dokumentasi lengkapnya silahkan kunjungi oracle tentang class Math.
     */

public class Main {

    public static void main(String[] args){

        // Ada banyak method dari class Math, berikut beberapa contoh Method dari class String.
        double number = 20;
        double number1 = Math.toRadians(20);

        // double 'cos(double)' untuk Menghitung cos di trigonometric.
        System.out.println("Nilai Cos dari nilai "+number+" adalah "+Math.cos(number1));

        // double 'sin(double)' untuk Menghitung sin di trigonometric.
        System.out.println("Nilai Sin dari nilai "+number+" adalah "+Math.sin(number1));

        // double 'tan(double)' untuk Menghitung tan di trigonometric.
        System.out.println("Nilai Tan dari nilai "+number+" adalah "+Math.tan(number1));

        // 'min(number1, number2)' untuk Menentukan nilai terkecil.
        System.out.println("Nilai terkecil antara 1 dan 2 adalah "+Math.min(1,2));

        // 'max(number1, number2)' untuk Menentukan nilai terbesar.
        System.out.println("Nilai terbesar antara 1 dan 2 adalah "+Math.max(1,2));

        // Masih banyak method dari class Math yang dapat digunakan, untuk dokumentasi lengkap dari class Math dapat mengunjungi
        // situs web oracle.

    }
}
