package com.practice;

import java.util.UUID;

/*
    - Pada saat membuat aplikasi, biasanya kita ingin membuat data unique, contohnya untuk membuat data primary key untuk itu
      java menyediakan sebuah class UUID (Universal Unique Identifier).
    - UUID merupakan format standard untuk membuat unique value yang telah terjamin.
    - Untuk  dokumentasi lengkapnya silahkan kunjungi oracle tentang class UUID.
*/
public class Main {
    public static void main(String[] args) {

        // Membuat randon UUID.
        for (var i = 0; i<100; i++){
            UUID uuid = UUID.randomUUID();
            String id = uuid.toString();
            System.out.println(id);
        }
    }
}
