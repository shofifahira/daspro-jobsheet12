package jobsheet12;

import java.util.Scanner;

public class Kafe24 {
    public static void Menu(String namaPelanggan, boolean isMember, int jamKunjung) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (jamKunjung >= 14 && jamKunjung <= 16) {
            System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
        }
        
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga24(int pilihanMenu, int banyakItem) {
        int[]hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true, 15);

        int totalKeseluruhan = 0;

        while (true) {
            System.out.print("\nMasukkan nomor menu (0 = selesai): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;
            }

            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu tidak tersedia");
                continue;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int totalBayar = hitungTotalHarga24(pilihanMenu, banyakItem);
            System.out.println("Subtotal menu " + pilihanMenu + ": Rp" + totalBayar);

            totalKeseluruhan += totalBayar;
        }

        System.out.println("\nTotal keseluruhan pesanan Anda: Rp" + totalKeseluruhan);

        sc.close();
    }
}