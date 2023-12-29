
import java.util.Scanner;

public class CetakAngka {
    public static void main (String[] args) {
        // buat variabel untuk menampung jumlah angka 
        int angka;
        // membuat objek scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Jumlah Angka : ");
        angka = input.nextInt();

        // perulangan berdasarkan angka
        for(int i = 0; i < angka; i++) {
            System.out.println(i + " ");
        }
    }
}