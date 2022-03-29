package com.practice;

/*
    - Class Runtime berfungsi untuk melihat informasi environment tempat aplikasi java sedang berjalan.
    - Class Runtime tidak dapat dibuat, namun secara otomatis Java akan membuat single object. Kita bisa mengakses object tersebut
      menggunakan static method getRuntime() milik class Runtime.
    - Untuk  dokumentasi lengkapnya silahkan kunjungi oracle tentang class Runtime.
*/
public class Main {
    public static void main(String[] args){

        Runtime runtime = Runtime.getRuntime();

        // Beberapa contoh Method dari class Runtime.

        // int availableProcessors() untuk mendaptkan jumlah core dari cpu.
        System.out.println(runtime.availableProcessors());

        // long freeMemory() untuk Mendapatkan jumlah memory bebas di JVM.
        System.out.println(runtime.freeMemory());

        // long totalMemory() untuk Mendapatkan jumlah total memory di JVM.
        System.out.println(runtime.totalMemory());

        // long maxMemory() untuk Mendapatkan jumlah maksimum memory di JVM.
        System.out.println(runtime.maxMemory());

        // void gc() untuk Menjalankan garbage collector untuk menghilangkan data di memory yang sudah tidak terpakai.
        runtime.gc();

        // Masih banyak method dari class Runtime yang dapat digunakan, untuk dokumentasi lengkap dari class Runtime dapat mengunjungi
        // situs web oracle.

    }
}
