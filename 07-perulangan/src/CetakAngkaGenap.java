import java.tutorial;

import java.util.Scanner;

public class CetakAngkaGenap {
    public static void main(String[] args) {
    // buat variabel untuk menampung jumlah angka 
         int angka;
         // membuat objek scanner
         Scanner input = new Scanner(System.in);
 
         System.out.println("Masukan Jumlah Angka : ");
         angka = input.nextInt();
 
         // perulangan berdasarkan angka
         for(int i = 1; i < angka; i+=2) {

            System.out.print(i + " ");
         }
    }
    
}
