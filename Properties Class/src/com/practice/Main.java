package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
    - Biasanya Aplikasi java akan menyimpan konfigurasi file dalam bentuk properties file.
    - Properties file adalah file yang berisi key value yang dipisahkan dengan tanda sama dengan (=).
    - Properties file bisa kita gunakan untuk menyimpan konfigurasi aplikasi.
    - Biasanya yang digunakan untuk menyimpan konfigurasi file pada JSON file namun pada java biasanya pada properties file.
    - Biasanya pada saat membuat konfiguarasi file tidak pada hard code di dalam source codenya namun disimpan diluar pada sebuah
      file dan pada saat aplikasi di run maka file konfigurasi tersebut akan diload.
    - Class properties digunakan untuk mengambil atau menyimpan informasi ke file properties.
    - Untuk dokumentasi lengkapnya silahkan kunjungi oracle tentang class Properties.
*/
public class Main {
    public static void main(String[] args) {

        try {
            // Mengambil/menyimpan informasi ke file properties.
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            // Mengambil value dari key 'database.host'.
            String host = properties.getProperty("database.host");
            System.out.println("Host : "+host);

            // Mengambil value dari key 'database.port'.
            String port = properties.getProperty("database.port");
            System.out.println("Port : "+port);

            // Mengambil value dari key 'database.username'.
            String username = properties.getProperty("database.username");
            System.out.println("Username : "+username);

            // Mengambil value dari key 'database.password'.
            String pwd = properties.getProperty("database.password");
            System.out.println("Password : "+pwd);

            // Menyimpan value 'db_product' dengan key 'database.name' pada file 'application.properties'.
            properties.put("database.name","db_product");
            properties.store(new FileOutputStream("application.properties"),"Comment");

            // Mengambil value dari key 'database.name'.
            String databaseName = properties.getProperty("database.name");
            System.out.println("Database Name : "+databaseName);

        }catch(IOException exception){
            System.out.println("Tidak dapat Membaca File !!!,"+exception);
        }

    }
}
