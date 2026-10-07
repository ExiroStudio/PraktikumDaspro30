package PraktikumDaspro30;

import java.util.Scanner;

public class StudiKasus130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000;
        System.out.print("Masukkan jumlah cup\t : ");
        int jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar\t : ");
        int uangBayar = sc.nextInt();
        sc.close();

        int totalHarga = jumlahCup * hargaPerCup;
        int diskon = (totalHarga >= 100000 ? totalHarga * 10 / 100 : 0);
        int totalBayar = totalHarga - diskon;
        System.out.println("Total Bayar \t\t : Rp " + totalBayar);
        System.out.println("Diskon \t\t\t : Rp " + diskon);
        if (uangBayar >= totalBayar) {
            int kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian Anda : Rp " + kembalian);
        } else {
            int kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

    }
}
