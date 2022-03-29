package com.practice;

import java.util.Base64;

/*
    - Pada java 8 terdapat class base64 yang digunakan untuk melakukan encoding base64.
    - Base64 digunakan untuk encoding untuk mengubah binary data ke text yang aman dari kesalahan parsing namun
      bukan berarti aman dari sisi security karena base64 dapat dibalikan lagi datanya.
    - Untuk  dokumentasi lengkapnya silahkan kunjungi oracle tentang class Base64.
*/
public class Main {
    public static void main(String[] args) {

        String message = "Turn On The Computer";

        // Melakukan encode Base64.
        String encode = Base64.getEncoder().encodeToString(message.getBytes());
        System.out.println(encode);

        // Melakukan decode Base64.
        byte[] bytesEncode = Base64.getDecoder().decode(encode);
        String decode = new String(bytesEncode);
        System.out.println(decode);
    }
}
