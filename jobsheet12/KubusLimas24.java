package jobsheet12;

import java.util.Scanner;

public class KubusLimas24 {
    static int luasPersegi(int s) {
        return s * s;
    }

    static int volumeKubus(int s) {
        return s * s * s;
    }

    static int luasPermukaanKubus(int s) {
        return 6 * luasPersegi(s);
    }

    static double volumeLimasPersegi(int s, int t) {
        return luasPersegi(s) * t / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU BANGUN RUANG ===");
            System.out.println("1. Luas persegi");
            System.out.println("2. Volume kubus");
            System.out.println("3. Luas permukaan kubus");
            System.out.println("4. Volume limas persegi");
            System.out.println("0. Keluar");
            System.out.println("Pilih: ");
            pilihan = sc.nextInt();

            int s, t;
            switch (pilihan) {
                case 1:
                    System.out.print("Sisi: ");
                    s = sc.nextInt();
                    System.out.println("Luas persegi = " + luasPersegi(s));
                    break;
                case 2:
                    System.out.print("Sisi: ");
                    s = sc.nextInt();
                    System.out.println("Volume kubus = " + volumeKubus(s));
                    break;
                case 3:
                    System.out.print("Sisi: ");
                    s = sc.nextInt();
                    System.out.println("Luas permukaan kubus = " + luasPermukaanKubus(s));
                    break;
                case 4:
                    System.out.print("Sisi alas: ");
                    s = sc.nextInt();
                    System.out.print("Tinggi: ");
                    t = sc.nextInt();
                    System.out.printf("Volume limas = %.2f%n", volumeLimasPersegi(s, t));
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
