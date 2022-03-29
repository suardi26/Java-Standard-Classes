package com.practice;

import java.util.Random;

/*
    - Random Class dapat digunakan untuk generete random number.
    - Untuk dokumentasi lengkapnya silahkan kunjungi oracle tentang class Random.
*/
public class Main {
    public static void main(String[] args) {

        // Membuat random number sebanyak 100 dan interval number yang dapat digunakan dari 0-999.
        Random randomNumber = new Random();
        for (int j = 0; j < 100; j++){
            var number = randomNumber.nextInt(999);
            System.out.println(number);
        }

    }
}
