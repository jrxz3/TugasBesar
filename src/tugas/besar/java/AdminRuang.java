package tugas.besar.java;

import java.util.Scanner;

public class AdminRuang extends Ruang {

    Scanner in = new Scanner(System.in);
    //Ruang ruang = new Ruang();

    public void InsertData() {
        System.out.println("Masukkan Identitas : (Nama Ruangan, Lokasi Ruangan, Fakultas, Studi)");
		super.setIdentitas(in.next(), in.next(), in.next(), in.next());
    }
        
}
