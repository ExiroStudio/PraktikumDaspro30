package PraktikumDaspro30;

import java.util.Scanner;

public class StudiKasus230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama mahasiswa \t: ");
        String nama = sc.nextLine().trim();
        sc.nextLine();
        System.out.print("Jenis kegiatan (BELIMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String kegiatan = sc.nextLine().trim().toLowerCase();
        sc.nextLine();
        if (kegiatan == "belimawa" || kegiatan == "bakorma" || kegiatan == "mandiri" || kegiatan == "pkm") {

        } else {
            System.out.println("Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }

    }
}
