package com.practice;

/*
    - Class Date & Calender digunakan untuk representasi tanggal.
    - Pada Java 8 sudah ada cara menamipulasi tanggal yang baru dengan menggunakan Java Date Time API.
    - Class Date merupakan class representasi tanggal sampai presisi millisecond.
    - Pada class date sudah banyak method-method yang di deprecated, sehingga untuk memanipulasi date/tanggal kita dapat melakukan
      kombinansi antara class Date dan Calendar.
    - Class date untuk representasi tanggal, dan Calendar untuk memanipulasi tanggal.
    - Untuk  dokumentasi lengkapnya silahkan kunjungi oracle tentang class Date & Calender.


*/

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args){

        // Membuat Object dari class Date.
        Date date = new Date();
        System.out.println(date);

        // Membuat Object dari class Date dengan parameter milliseconds
        Date date1 = new Date(835780140000l);
        System.out.println(date1);

        // Memanipulasi Tanggal menggunakan class Calender.
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        // mengubah waktu/tanggal menggunakan method set.
        calendar.set(Calendar.YEAR, 1996);
        calendar.set(Calendar.MONTH,Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH,26);
        calendar.set(Calendar.HOUR_OF_DAY,1);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,1);
        System.out.println(calendar.getTime());

        // Memasukan object dari Calendar pada reference class date.
        Date date3 = calendar.getTime();
        long miliseconds = date3.getTime();
        System.out.println(date3);
        System.out.println(miliseconds);

        // Menambahkan atau mengurangi waktu dan tanggal menggunakan method add.
        calendar.add(Calendar.YEAR,-6);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.YEAR,32);
        System.out.println(calendar.getTime());

        // Masih banyak method dari class Date & Calendar yang dapat digunakan, untuk dokumentasi lengkap
        // class Date & Calendar dapat mengunjungi situs web oracle.
    }
}
