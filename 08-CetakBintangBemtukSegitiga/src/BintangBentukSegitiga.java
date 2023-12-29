public class BintangBentukSegitiga {
    public static void main(String[] args) {
        int tinggiSegitiga = 7; // Anda dapat mengganti tinggi segitiga sesuai kebutuhan

        for (int baris = 1; baris <= tinggiSegitiga; baris++) {
            for (int kolom = 1; kolom <= baris; kolom++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}