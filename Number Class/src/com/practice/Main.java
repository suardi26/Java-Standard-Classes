package com.practice;
/*
 - Semua number class yang bukan primitif memiliki parent class yang sama, yaitu Class Number.
 - Class number mimiliki banyak method yang digunakan untuk mengkonversi ke tipe data number lain sehingga memudahkan
   dalam mengkonversi object number dari suatu tipe data number ke tipe data number lainnya.
 - Long, Integer, Short dan Byte memiliki static method untuk melakukan konversi dari String ke number.
 - ___.parse___(String) digunakan Untuk mengkonversi dari String ke tipe data number primitif.
 - ___.valueOf___(String) digunakan Untuk mengkonversi dari String ke tipe data number non primmitif.
 - Method ini akan Throw NumberFormatException jika gagal melakukan konversi String ke number sehingga ketika nilai String yang
   dimasukan bukan number maka akan error.
 - Untuk  dokumentasi lengkapnya silahkan kunjungi oracle tentang class Number.
*/
public class Main {
    public static void main(String[] args) {

        // Beberapa contoh Method dari class Number.

        Integer intValue = 11;

        // byte 'byteValue()' untuk mengubah nilai number ke type data byte.
        Byte byteValue = intValue.byteValue();
        System.out.println("Mengkonversi Nilai number ke type data byte : "+byteValue);

        // double 'doubleValue()' untuk mengubah nilai number ke type data double.
        Double doubleValue = intValue.doubleValue();
        System.out.println("Mengkonversi Nilai number ke type data double : "+doubleValue);

        // float 'floatValue()' untuk mengubah nilai number ke type data float.
        Float floatValue = intValue.floatValue();
        System.out.println("Mengkonversi Nilai number ke type data float : "+floatValue);

        // int 'intValue()' untuk mengubah nilai number ke tipe data integer.
        Integer intValue2 = byteValue.intValue();
        System.out.println("Mengkonversi Nilai number ke type data Integer : "+intValue2);

        // long 'longValue()' untuk mengubah nilai number ke tipe data long.
        Long longValue = intValue.longValue();
        System.out.println("Mengkonversi Nilai number ke type data Long : "+longValue);

        // short 'shortValue()' untuk mengubah nilai number ke tipe data short.
        Short shortValue = intValue.shortValue();
        System.out.println("Mengkonversi Nilai number ke type data Short : "+shortValue);

        // ___.parse___(String) digunakan Untuk mengkonversi dari String ke tipe data number primitif.
        String numberPrimitive = "16";
        int numberIntPrimitive = Integer.parseInt(numberPrimitive);
        System.out.println("Mengkonversi Nilai String ke type data number primitif (int) : "+numberIntPrimitive);

        // ___.valueOf___(String) digunakan Untuk mengkonversi dari String ke tipe data number non primmitif.
        String numberNonPrimitive = "219";
        Integer numberIntNonPrimitive = Integer.valueOf(numberNonPrimitive);
        System.out.println("Mengkonversi Nilai String ke type data number non primitif (int) : "+numberIntNonPrimitive);
    }
}
