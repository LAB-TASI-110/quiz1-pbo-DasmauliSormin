import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah total data (N): ");
        int N = input.nextInt();

        int[] nilai = new int[N];

        System.out.println("Masukkan deret nilai:");
        for (int i = 0; i < N; i++) {
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan kode kelompok (1 atau 2): ");
        int kodeKelompok = input.nextInt();

        int total = 0;

        for (int i = 0; i < N; i++) {
            if (kodeKelompok == 1 && i % 2 == 0) {
                total += nilai[i];
            }
            else if (kodeKelompok == 2 && i % 2 != 0) {
                total += nilai[i];
            }
        }

        System.out.println("Total nilai kelompok " + kodeKelompok + " = " + total);

        input.close();
    }
}
