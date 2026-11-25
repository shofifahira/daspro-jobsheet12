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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama pelanggan : ");
        String nama = sc.nextLine();
        System.out.print("Member (y/n)   : ");
        boolean isMember = sc.next(). equalsIgnoreCase("y");
        System.out.print("Jam kunjung    : ");
        int jam = sc.nextInt();

        Menu(nama, isMember, jam);

        sc.close();
    }
}