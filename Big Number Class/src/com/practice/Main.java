package com.practice;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/*
    - Pada saat kita ingin menggunakan range angka yang lebih besar dan melebihi kapasitas Long dan Double, maka di java sudah
      disediakan class untuk menangani data besar tersebut.
    - BigInteger adalah class untuk menghandle data bilangan bulat (Integer) yang melebihi kapasitas dari tipe data Long.
    - BigDecimal adalah class untuk menghadle data Bilangan Decimal (floating point) yang melebihi kapasitas dari tipe data Double.
    - Untuk  dokumentasi lengkapnya silahkan kunjungi oracle tentang class BigInteger dan BigDecimal.
*/
public class Main {

    public static void main(String[] args) {

        // Karena bukan tipe data number biasa untuk melakukan operasi aritmatika tidak dapat menggunakan  "+ , - , * , /",
        // namun Untuk melakukan operasi aritmatika pada class BigInteger dan BigDecimal dapat dilakukan dengan method berikut :

        BigInteger number1 = new BigInteger("20");
        BigInteger number2 = new BigInteger("3");

        BigDecimal number3 = new BigDecimal("50.0");
        BigDecimal number4 = new BigDecimal("3.0");

        // 'add()' untuk melakukan penjumlahan.
        System.out.println("Hasil Penjumlahan kedua nilai BigInteger dengan nilai "+number1+" dan "+number2+" adalah "+
                number1.add(number2));

        // 'subtract()' untuk melakukan pengurangan.
        System.out.println("Hasil Pengurangan kedua nilai BigInteger dengan nilai "+number1+" dan "+number2+" adalah "+
                number1.subtract(number2));

        // 'multiply()' untuk melakukan Perkalihan.
        System.out.println("Hasil Perkalihan kedua nilai BigInteger dengan nilai "+number1+" dan "+number2+" adalah "+
                number1.multiply(number2));

        // 'divide()' untuk melakukan pembagian.
        System.out.println("Hasil Pembagian kedua nilai BigInteger dengan nilai "+number3+" dan "+number4+" adalah " +
                number3.divide(number4,2, RoundingMode.HALF_UP));

        // 'mod()' untuk mendapatkan sisa dari pembagian beberapa bilangan (Modulus).
        System.out.println("Hasil sisa bagi dari kedua nilai BigInteger dengan nilai "+number1+" dan "+number2+" adalah "+
                number1.mod(number2));

        // Masih banyak method dari class BigInteger dan BigDecimal yang dapat digunakan, untuk dokumentasi lengkap dari
        // class BigInteger dan BigDecimal dapat mengunjungi situs web oracle.


    }
}
