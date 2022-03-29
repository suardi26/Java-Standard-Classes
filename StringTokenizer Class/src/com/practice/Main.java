package com.practice;

import java.util.StringTokenizer;

/*
 - StringTokenizer class digunakan untuk memotong nilai String ke token atau String yang lebih kecil.
 - Kita bisa memotong Nilai String dengan delimiter yang ditentukan.
 - Yang membedakan StringTokenizer dengan method 'split()' pada class String adalah jika StringTokenizer memotong nilai String
   satu persatu dengan method 'nextToken()' sedangkan 'split()' akan memotong nilai String secara keseluruhan.
 - Untuk  dokumentasi lengkapnya silahkan kunjungi oracle tentang class StringTokenizer.
*/
public class Main {
    public static void main(String[] args) {

        String words = " Halo My Name is Suardi Daud Manda";

        // Memisahkan nilai String dari variabel 'words' dengan pemisah spasi yang telah ditentukan.
        StringTokenizer stringTokenizer = new StringTokenizer(words," ");


        while(stringTokenizer.hasMoreTokens()){
            String word = stringTokenizer.nextToken();
            System.out.println(word);
        }
    }
}
