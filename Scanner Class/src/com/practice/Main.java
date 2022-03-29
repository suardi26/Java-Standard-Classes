package com.practice;

import java.util.Scanner;

/*
    - Scanner adalah class yang digunakan untuk membaca dan mengolah data dari file input.
    - Scanner sebenarnya bagian dari Java IO (input Output), Class Scanner hadir pada java 5.
    - Class Scanner ini digunakan untuk membaca input baik dari file, console, dll.
    - Class Scanner ini biasa dijadikan object untuk membaca input user saat membangun program java menggunakan
      console/terminal.
    - Untuk  dokumentasi lengkapnya silahkan kunjungi oracle tentang class Scanner.


*/
public class Main {
    public static void main(String[] args) {

        // membuat object Scanner dan membaca data dari console '(System.in)'.
        Scanner inputConsole = new Scanner(System.in);


        // Beberapa contoh Method dari class Scanner.

        // nextLine() digunakan untuk membaca nilai string .
        System.out.print("Nama : ");
        String name = inputConsole.nextLine();

        // nextInt() digunakan untuk membaca nilai integer.
        System.out.print("Umur : ");
        int age = inputConsole.nextInt();

        // nextLong() digunakan untuk membaca nilai Long.
        System.out.print("No. Tlp. : ");
        long numberPhone = inputConsole.nextLong();

        // nextBoolean() digunakan untuk membca nilai boolean.
        System.out.print("Apakah Anda masih pelajar(True or False) : ");
        boolean status = inputConsole.nextBoolean();

        System.out.println("========= Result =========");
        System.out.println("Nama : "+name.toString());
        System.out.println("Umuer : "+age);
        System.out.println("No. Tlp : "+numberPhone);
        if(!status){
            System.out.println("Anda Sudah Lulus.");
        }else if(status){
            System.out.println("Anda Adalah Seorang Pelajar.");
        }else{
            System.out.println("Silahkan Masukan Pilihan yang benar (True or False) !!!");
        }

        // Dan masih banyak lagi method yang ada pada class Scanner, untuk detail dokumentasi lengkapnya silahkan kunjungi oracle
        // tentang class Scanner.

    }

}
