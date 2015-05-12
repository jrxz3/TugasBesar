package tugas.besar.java;

import java.util.Scanner;

public class KondisiKlas extends Ruang {

    Scanner in = new Scanner(System.in);
    //Ruang ruang = new Ruang();

    public void DataRuang() {
        System.out.println("Data Ruang Kelas");
        System.out.println("Masukan Panjang Ruang = ");
        super.setPanjang(in.nextInt());
        System.out.println("\n");
        System.out.println("Masukan Lebar Ruang = ");
        super.setLebar(in.nextInt());
        System.out.println("\n");
        System.out.println("Masukan Jumlah Kursi = ");
        super.setJumlahKursi(in.nextInt());
        System.out.println("\n");
        System.out.println("Masukan Jumlah Pintu = ");
        super.setJumlahPintu(in.nextInt());
        System.out.println("\n");
        System.out.println("Masukan Jumlah Jendela = ");
        super.setJumlahJendela(in.nextInt());
        System.out.println("\n");
    }

    public double HitungLuas() {
        return super.getPanjang() * super.getLebar();
    }

    public String BentukRuang() {
        if (super.getPanjang() == super.getLebar()) {
            return ("Bentuk Ruangan Persegi");
        } else {
            return ("Bentuk Ruangan Persegi Panjang");
        }
    }

    public double RasioLuas() {
        return HitungLuas() / super.getJumlahKursi();
    }

    public String AnalisisPintu() {
        if (super.getJumlahPintu() >= 2) {
            return ("Jumlah Pintu Sesuai");
        } else {
            return ("Jumlah Pintu Tidak Sesuai");
        }
    }

    public String AnalisisJendela() {
        if (super.getJumlahJendela() >= 1) {
            return ("Jumlah Jendela Sesuai");
        } else {
            return ("Jumlah Jendela Tidak Sesuai");
        }
    }
}
