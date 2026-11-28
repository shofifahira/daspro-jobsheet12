package jobsheet12;

import java.util.Scanner;

public class RekapLaundry24 {
    
    static String[] layanan = {"Cuci Kering", "Cuci Setrika", "Setrika Saja", "Express"};
    static int[] harga = {6000, 8000, 5000, 12000};
    static String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

    static int[][] inputData(Scanner sc) {
        int[][] data = new int[layanan.length][hari.length];
        for (int i = 0; i < layanan.length; i++) {
            for (int j = 0; j < hari.length; j++) {
                System.out.print("Berat " + layanan[i] + " hari " + hari[j] + " (kg): ");
                data[i][j] = sc.nextInt();
            }
        }
        return data;
    }

    static void tampilData(int[][] data) {
        System.out.printf("%-14s", "Layanan");
        for (String h : hari) {
            System.out.printf("%8s", h);
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%s-14", layanan[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%8d", data[i][j]);
            }
            System.out.println();
        }
    }

    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int j = 0; j < data[idxLayanan].length; j++) {
            total += data[idxLayanan][j];
        }
        return total;
    }

    static void tampilLayananTertinggi(int[][] data) {
        int idxMax = 0;
        for (int i = 1; i < data.length; i++) {
            if (totalPerLayanan(data, i) > totalPerLayanan(data, idxMax)) {
                idxMax = i;
            }
        }
        System.out.println("Layanan dengan cucian terbanyak: " + layanan[idxMax]
            + " (" + totalPerLayanan(data, idxMax) + " kg)");
    }

    static int hariTersibuk(int[][] data) {
        int idxMax = 0;
        int totalMax = -1;
        for (int j = 0; j < data[0].length; j++) {
            int total = 0;
            for (int i = 0; i < data.length; i++) {
                total += data [i][j];
            }
            if (total > totalMax) {
                totalMax = total;
                idxMax = j;
            }
        }
        return idxMax;
    }

    static void tampilPendapatan(int[][] data) {
        int totalPendapatan = 0;
        for (int i = 0; i < data.length; i++) {
            int pendapatan = totalPerLayanan(data, i) * harga[i];
            totalPendapatan += pendapatan;
            System.out.printf("Pendapatan %-14s: Rp%,d%n", layanan[i], pendapatan);
        }
        System.out.printf("Total pendapatan            : Rp%,d%n", totalPendapatan);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] data = inputData(sc);

        System.out.println("\n=== DATA CUCIAN (kg) ===");
        tampilData(data);

        System.out.println();
        for (int i = 0; i < layanan.length; i++) {
            System.out.println("Total " + layanan[i] + ": " + totalPerLayanan(data, i) + " kg");
        }

        System.out.println();
        tampilLayananTertinggi(data);
        System.out.println("Hari tersibuk: " + hari[hariTersibuk(data)]);

        System.out.println();
        tampilPendapatan(data);
    }
}
