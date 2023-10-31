public class App {
    public static void main(String[] args) throws Exception {
        // Program Biodata Mahasiswa
        // deklarasi variabel
        String nama;
        String nim;
        String tgl_lahir;
        String alamat;
        float berat_badan;
        float tinggi_badan;

        // mengisi variabel
        nama =  "Haeril";
        nim = "23241069";
        tgl_lahir = "11 November 2004";
        alamat = "Rumak Timur Selatan";
        berat_badan = 55.5f;
        tinggi_badan = 180.5f;

        // cetak biodata
        System.out.println("===========");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Tanggal Lair : " + tgl_lahir);
        System.out.println("Alamat : " + alamat);
        System.out.println("Berat Badan : " + berat_badan);
        System.out.println("Tinggi Badan : " + tinggi_badan);
        System.out.println("=============");

    }
}