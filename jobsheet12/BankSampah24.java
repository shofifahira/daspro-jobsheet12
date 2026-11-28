package jobsheet12;

import java.util.Scanner;

public class BankSampah24 {
    static double[] inputSetoran(int n) {
        Scanner sc = new Scanner(System.in);
        double[] setoran = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Berat setoran nasabah " + (i + 1) + " (kg): ");
            setoran[i] = sc.nextDouble();
        }
        sc.close();
        return setoran;
    }

    static void tampilSetoran(double[] setoran) {
        System.out.println("\n---- Data Setoran ---");
        for (int i = 0; i < setoran.length; i++) {
            System.out.println("Nasabah " + (i + 1) + ": " + setoran[i] + " kg");
        }
    }

    static double totalSetoran(double[] setoran) {
        double total = 0;
        for (double s : setoran) {
            total += s;
        }
        return total;
    }

    static double hitungSaldo(double berat, double hargaPerKg) {
        return berat * hargaPerKg;
    }

    static int nasabahTerbanyak(double[] setoran) {
        int idxMax = 0;
        for (int i = 1; i < setoran.length; i++) {
            if (setoran[i] > setoran[idxMax]) {
                idxMax = i;
            }
        }
        return idxMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double HARGA_PER_KG = 3000;

        System.out.print("Jumlah nasabah (N): ");
        int n = sc.nextInt();

        double[] setoran = inputSetoran(n);
        tampilSetoran(setoran);

        System.out.println("\n--- Saldo Nasabah ---");
        for (int i = 0; i < setoran.length; i++) {
            System.out.printf("Nasabah %d: Rp%,.0f%n", (i + 1), hitungSaldo(setoran[i], HARGA_PER_KG));
        }

        System.out.println("\nTotal setoran seluruh nasabah: " + totalSetoran(setoran) + " kg");

        int idx = nasabahTerbanyak(setoran);
        System.out.println("Nasabah dengan setoran terbanyak: Nasabah " + (idx + 1) + " (" + setoran[idx] + " kg)");
    }
}
