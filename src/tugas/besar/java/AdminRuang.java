package tugas.besar.java;

import java.util.Scanner;

public class AdminRuang extends Ruang {

    Scanner in = new Scanner(System.in);
    //Ruang ruang = new Ruang();

    public void InsertData() {
        System.out.println("Input Data");
        System.out.println("Masukan Nama Ruangan = ");
        super.setNamaRuang(in.next());
        System.out.println("\n");
        System.out.println("Masukan Lokasi Ruangan = ");
        super.setLokasiRuang(in.next());
        System.out.println("\n");
        System.out.println("Pilih Program Studi Anda = ");
        super.setStudi(in.next());
        System.out.println("\n");
        System.out.println("Pilih Fakultas Anda = ");
        super.setFakultas("\n");
    }
}
