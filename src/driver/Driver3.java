import java.util.Scanner;

public class Driver3 {

    static int nomor = 1;
    static final int HARGA_REGULER = 7000;
    static final int HARGA_EXPRESS = 10000;

    public static void main(String[] args) {
        
        
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("===== SISTEM LAUNDRY DEL =====");

            System.out.print("Masukkan Nama Pelanggan: ");
            String nama = input.nextLine();

            System.out.print("Masukkan No HP: ");
            String hp = input.nextLine();

            System.out.print("Masukkan Berat Cucian (kg): ");
            double berat = input.nextDouble();

            System.out.println("Pilih Jenis Layanan:");
            System.out.println("1. Reguler (Rp7.000/kg)");
            System.out.println("2. Express (Rp10.000/kg)");
            System.out.print("Pilihan Anda (1/2): ");
            int pilihan = input.nextInt();

            int hargaPerKg = 0;

            if (pilihan == 1) {
                hargaPerKg = HARGA_REGULER;
            } else if (pilihan == 2) {
                hargaPerKg = HARGA_EXPRESS;
            } else {
                System.out.println("Pilihan tidak valid!");
                return; // Sekarang aman, Scanner akan otomatis tertutup
            }

            double total = berat * hargaPerKg;

            String noTransaksi = "LD" + String.format("%03d", nomor);
            nomor++;

            System.out.println("\n===== NOTA TRANSAKSI =====");
            System.out.println("No Transaksi : " + noTransaksi);
            System.out.println("Nama         : " + nama);
            System.out.println("No HP        : " + hp);
            System.out.println("Berat        : " + berat + " kg");
            System.out.println("Total Bayar  : Rp " + total);
            System.out.println("Status       : Diterima");
            System.out.println("===========================");
            
        } 
    }
}
