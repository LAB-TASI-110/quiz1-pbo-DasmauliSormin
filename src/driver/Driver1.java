import java.util.Scanner;

public class Driver1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kode;
        int porsi;
        int harga = 0;
        int total = 0;
        
        // StringBuilder ini berfungsi sebagai "wadah" untuk menyimpan baris-baris tabel
        StringBuilder daftarPesanan = new StringBuilder();

        System.out.println("--- Input Pesanan (Ketik END untuk selesai) ---");

        while (true) {
            System.out.print("Kode Menu: ");
            kode = input.nextLine();

            if (kode.equalsIgnoreCase("END")) {
                break;
            }

            System.out.print("Jumlah Porsi: ");
            porsi = Integer.parseInt(input.nextLine());

            String namaMenu = "";
            switch (kode.toUpperCase()) {
                case "NGS": namaMenu = "Nasi Goreng Spesial"; harga = 15000; break;
                case "AP":  namaMenu = "Ayam Penyet";          harga = 20000; break;
                case "SA":  namaMenu = "Sate Ayam (10 Tusuk)"; harga = 25000; break;
                case "BU":  namaMenu = "Bakso Urat";           harga = 18000; break;
                case "MAP": namaMenu = "Mie Ayam Pangsit";     harga = 15000; break;
                case "GG":  namaMenu = "Gado-Gado";            harga = 15000; break;
                case "SAM": namaMenu = "Soto Ayam";            harga = 17000; break;
                case "RD":  namaMenu = "Rendang Daging";       harga = 25000; break;
                case "IB":  namaMenu = "Ikan Bakar";           harga = 35000; break;
                case "NUK": namaMenu = "Nasi Uduk Komplit";    harga = 20000; break;
                default:
                    System.out.println("Kode tidak dikenal!");
                    continue;
            }

            int subtotal = harga * porsi;
            total += subtotal;

            // Masukkan data ke dalam wadah (belum dicetak ke layar)
            daftarPesanan.append(String.format("%-20s %-8d %-10d %-10d\n", 
                                 namaMenu, porsi, harga, subtotal));
        }

        // --- BAGIAN PENCETAKAN TABEL (Setelah loop selesai) ---
        System.out.println("\n\n%-20s %-8s %-10s %-10s".replace("%-20s", "Menu").replace("%-8s", "Porsi").replace("%-10s", "Harga").replace("%-10s", "Total"));
        // Atau cara simpel:
        System.out.printf("\n\n%-20s %-8s %-10s %-10s\n", "Menu", "Porsi", "Harga", "Total");
        System.out.println("=====================================================");
        
        // Cetak semua isi wadah tadi
        System.out.print(daftarPesanan.toString());
        
        System.out.println("=====================================================");

        // Hitung Diskon
        int kelipatan = total / 100000;
        double diskonPersen = Math.min(kelipatan * 0.05, 1.0);
        double totalAkhir = total - (total * diskonPersen);

        System.out.printf("%-40s %.0f\n", "Total Pembayaran", totalAkhir);

        input.close();
    }
}
