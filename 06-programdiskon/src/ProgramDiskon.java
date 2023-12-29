import java.util.Scanner;

public class ProgramDiskon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah pelanggan memiliki membercard? (ya/tidak): ");
        String punyaMemberCard = scanner.nextLine().toLowerCase();

        if (punyaMemberCard.equals("ya")) {
            System.out.print("Total belanjaan: ");
            int totalBelanja = scanner.nextInt();

            if (totalBelanja > 500000) {
                System.out.println("Diskon 50 ribu diberikan.");
            } else if (totalBelanja > 100000) {
                System.out.println("Diskon 15 ribu diberikan.");
            } else {
                System.out.println("Tidak ada diskon.");
            }

        } else {
            System.out.print("Total belanjaan: ");
            int totalBelanja = scanner.nextInt();

            if (totalBelanja > 100000) {
                System.out.println("Diskon 10 ribu diberikan.");
            } else {
                System.out.println("Tidak ada diskon.");
            }
        }

        scanner.close();
    }
}
