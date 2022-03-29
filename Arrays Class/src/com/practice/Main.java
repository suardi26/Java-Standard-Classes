package com.practice;
/*
 - Arrays Class berisi static method yang dapat digunakan untuk memanipulasi data array, seperti pencarian, pengurutan, menampilkan
   data array dll.
 - Untuk dokumentasi lengkapnya silahkan kunjungi oracle tentang class Arrays.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Beberapa method yang biasa digunakan dari class Arrays.

        int[] numbers = {2,1,6,3,5,4,9,10,8,7};

        // toString(array) digunakan untuk mengembalikan representasi String.
        System.out.println("Nilai dari data array : "+Arrays.toString(numbers));

        // sort(array) digunakan untuk mengurutkan data array.
        Arrays.sort(numbers);
        System.out.println("Nilai dari data array setelah di sort : "+Arrays.toString(numbers));

        // binarySearch(array, value) digunakan untuk mencari nilai array pada index keberapa dan mengembalikan return value int.
        int index = Arrays.binarySearch(numbers,1);
        System.out.println("Nilai angka 1 pada index ke-"+index);
        index = Arrays.binarySearch(numbers,5);
        System.out.println("Nilai angka 5 pada index ke-"+index);

        // Ketika suatu nilai tidak terdapat pada data array maka menghasilkan nilai lebih kecil dari 0 atau mins (-).
        index = Arrays.binarySearch(numbers,100);
        System.out.println("Nilai angka 100 pada index ke-("+index+")");
         
        // copyOf(...) digunakan untuk menyalin data array dan panjang data array yang akan di salin dapat ditentukan.
        int[] resultCopyOf = Arrays.copyOf(numbers,5);
        System.out.println("Nilai dari data array baru yang disalin sebanyak 5 adalah "+Arrays.toString(resultCopyOf));

        // copyOfRange(...) digunakan untuk menyalin data array dan range dapat ditentukan dari index ke berapa sampai index ke berapa.
        resultCopyOf = Arrays.copyOfRange(numbers,5,10);
        System.out.println("Nilai dari data array baru yang disalin sebanyak 5 adalah "+Arrays.toString(resultCopyOf));

        // equals(array1, array2) digunakan untuk membandingkan array1 dengan array2.
        System.out.println(numbers.equals(numbers));

        // Masih banyak method dari class Arrays yang dapat digunakan, untuk dokumentasi lengkap dari class Arrays dapat mengunjungi
        // situs web oracle.
    }
}
