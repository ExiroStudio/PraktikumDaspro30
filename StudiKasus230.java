package PraktikumDaspro30;

import java.util.Scanner;

public class StudiKasus230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String status;

        System.out.print("Nama mahasiswa  : ");
        String _ = sc.nextLine().trim();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String kegiatan = sc.nextLine().trim().toLowerCase();

        if (kegiatan.equals("belmawa") || kegiatan.equals("bakorma") || kegiatan.equals("mandiri")) {
            System.out.print("Jumlah dokumen  : ");
            int dokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            int juara = sc.nextInt();

            if (juara < 1 || juara > 3) {
                status = "Tidak memperoleh dana penghargaan (bukan Juara 1/2/3).";
            } else if (dokumen < 4) {
                status = "Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.";
            } else {
                status = "Berhak memperoleh dana penghargaan.";
            }
        } else if (kegiatan.equals("pkm")) {
            System.out.print("Jumlah dokumen  : ");
            int dokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1=lolos, 0=tidak) : ");
            int lolos = sc.nextInt();

            if (lolos != 1) {
                status = "Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).";
            } else if (dokumen < 4) {
                status = "Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.";
            } else {
                status = "Berhak memperoleh dana penghargaan.";
            }
        } else {
            status = "Tidak memperoleh dana penghargaan (kegiatan Lainnya).";
        }

        System.out.println("Status : " + status);
        sc.close();
    }
}