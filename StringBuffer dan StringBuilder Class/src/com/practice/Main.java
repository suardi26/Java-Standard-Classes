package com.practice;
/*
    - String adalah tipe data yang bersifat immutable, artinya nilainya tidak dapat diubah lagi, saat kita mengubah nilai String,
      maka yang sebenarnya terjadi ialah java membuat String baru untuk menampung nilai String yang diubah.
    - Ketika kita ingin memanipulasi suatu nilai String berkali-kali. maka tidak disarankan menggunakan String dikarenakan akan
      memakan banyak space memory, untuk itu disarankan menggunakan StringBuffer atau StringBuilder class.
    - StringBuffer atau StringBuilder digunakan untuk memanipulasi String.
    - StringBuffer itu thread safe, sedangkan StringBuilder tidak thread safe artinya jika kita ingin memanipulasi String secara
      pararel bersamaan maka kita dapat menggunakan String Buffer, tapi ketika kita tidak butuh pararel cukup gunakan StringBuilder.
    - Karena StringBuffer itu thread safe maka performanya lebih lambat dibandingkan dengan StringBuilder.
    - Untuk  dokumentasi lengkapnya silahkan kunjungi oracle tentang class StringBuffer dan class StringBuilder.

*/

public class Main {
    public static void main (String[] args){

        String name = "Suardi";
        System.out.println(name);
        System.out.println("Alamat name : "+Integer.toHexString(System.identityHashCode(name)));
        footer();
        name = name+" "+"Daud";
        System.out.println(name);
        System.out.println("Alamat name : "+Integer.toHexString(System.identityHashCode(name)));
        footer();
        name = name+" "+"Manda";
        System.out.println(name);
        System.out.println("Alamat name : "+Integer.toHexString(System.identityHashCode(name)));
        footer();
        System.out.println("Dapat dilihat contoh diatas ketika menggunakan String untuk memodifikasi nilainya " +
                "maka setiap kali diubah akan membuat nilai String baru dan akan disimpan pada alamat memory yang baru.");
        
        footer();
        // Menggunakan StringBuilder untuk memanipulasi nilai String sehingga lebih hemat memory dibanding dengan menggunakan
        // Class String.
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Suardi");
        stringBuilder.append(" ");
        stringBuilder.append("Daud");
        stringBuilder.append(" ");
        stringBuilder.append("Manda");
        stringBuilder.append(" ");

        // Konversi dari StringBuilder ke String.
        String value = stringBuilder.toString();
        System.out.println(value);
    }

    public static void footer(){
        System.out.println("================================================");
    }
}
