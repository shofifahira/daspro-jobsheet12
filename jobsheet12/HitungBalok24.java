package jobsheet12;

import java.util.Scanner;

public class HitungBalok24 {
    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    static int selisih(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.println("Masukkan panjang");
        p = input.nextInt();

        System.out.println("Masukkan lebar");
        l = input.nextInt();

        System.out.println("Masukkan tinggi");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume (t, p, l) adalah " + vol);

        vol = hitungVolume(p, l, t);
        System.out.println("Volume (p, l, t) adalah " + vol);

        System.out.println("selisih(10, 3) = " + selisih(10, 3));
        System.out.println("selisih(3, 10) = " + selisih(3, 10));

        input.close();
    }
}
