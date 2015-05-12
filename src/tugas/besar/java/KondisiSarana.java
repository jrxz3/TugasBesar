package tugas.besar.java;

import java.util.Scanner;

public class KondisiSarana extends Ruang {

    Scanner in = new Scanner(System.in);

    public void KondisiSarana() {
        //Stop Kontak

        System.out.println("Masukan Jumlah Stop Kontak : ");
        super.setJumlahStopKontak(in.nextInt());
        System.out.println("/n");
        System.out.println("Masukan Kondisi Stop Kontak : ");
        System.out.println("\n1. Baik \n2. Sebagian Rusak \n3. Semua Rusak \n4. Tidak Ada ");
        super.setKondisiStopKontak(in.nextInt());
        System.out.println("/n");
        System.out.println("Masukan Posisi Stop Kontak : ");
        System.out.println("\n1. Pojok Ruang \n2. Pojok Dekat Dosen \n3. Belakang ");
        super.setPosisiStopKontak(in.nextInt());
        System.out.println("/n");

        //LCD
        System.out.println("Masukan Jumlah Kabel LCD : ");
        super.setJumlahKabelLcd(in.nextInt());
        System.out.println("\n");
        System.out.println("Masukan Kondisi Kabel LCD : ");
        System.out.println("\n1. Berfungsi \n2. Tidak Berfungsi \n3. Tidak Ada ");
        super.setKondisiKabelLcd(in.nextInt());
        System.out.println("/n");
        System.out.println("Masukan Posisi Kabel LCD : ");
        System.out.println("\n1. Dekat Meja Dosen \n2. Dekat Kursi Mahasiswa ");
        super.setPosisiKabelLcd(in.nextInt());
        System.out.println("/n");

        //Lampu
        System.out.println("Masukan Jumlah Lampu : ");
        super.setJumlahLampu(in.nextInt());
        System.out.println("/n");
        System.out.println("Masukan Kondisi Lampu : ");
        System.out.println("\n1. Berfungsi \n2. Menyalan Sebagian \n3. Rusak Semua ");
        super.setKondisiLampu(in.nextInt());
        System.out.println("/n");
        System.out.println("Masukan Posisi Lampu : ");
        System.out.println("\n1. Atap Kelas \n2. Dekat Meja Dosen ");
        super.setPosisiLampu(in.nextInt());
        System.out.println("/n");

        //Kipas Angin
        System.out.println("Masukan Jumlah Kipas Angin : ");
        super.setJumlahKipasAngin(in.nextInt());
        System.out.println("/n");
        System.out.println("Masukan Kondisi Kipas Angin : ");
        System.out.println("/n1. Berfungsi Normal \n2. Sebagian Rusak \n3. Rusak Semua ");
        super.setKondisiKipasAngin(in.nextInt());
        System.out.println("/n");
        System.out.println("Masukan Posisi Kipas Angin : ");
        System.out.println("/n1. Atap \n2. Dinding ");
        super.setPosisiKipasAngin(in.nextInt());
        System.out.println("/n");

        //AC
        System.out.println("Masukan Jumlah AC : ");
        super.setJumlahAC(in.nextInt());
        System.out.println("/n");
        System.out.println("Masukan Kondisi AC : ");
        System.out.println("\n1. Baik \n2. Sebagian Rusak \n3. Semua Rusak \n4. Tidak Ada ");
        super.setKondisiAC(in.nextInt());
        System.out.println("/n");
        System.out.println("Masukan Posisi AC : ");
        System.out.println("/n1. Depan \n2. Belakang \n3. Samping");
        super.setPosisiAC(in.nextInt());
        System.out.println("/n");

        //SSID dan Bandwidth 
        System.out.println("Pilih SSID yang di gunakan : ");
        System.out.println("\n1. UMM Hotspot \n2. Lab informatika");
        super.setSSID(in.nextInt());
        System.out.println("\n");
        System.out.println("Apakah Anda Dapat Login Hotspot ? ");
        System.out.println("\n1. Ya \n2. Tidak");
        super.setLogin(in.nextInt());
        System.out.println("Masukkan jumlah Bandwidth : ");
        super.setBandwidth(in.nextInt());
        System.out.println("\n");

        //CCTV
        System.out.println("Masukkan jumlah CCTV diruangan : ");
        super.setJumlahCCTV(in.nextInt());
        System.out.println("\n");
        System.out.println("Masukan kondisi CCTV diruangan : ");
        System.out.println("\n1. baik \n2. rusak sebagian \n3.rusak semua \n4. tidak ada");
        super.setKondisiCCTV(in.nextInt());
        System.out.println("\n");
        System.out.println("Masukan Posisi CCTV : ");
        System.out.println("n1. depan \n2. samping \n3. belakangan \n4. tidak ada");
        super.setPosisiCCTV(in.nextInt());
        System.out.println("\n");
    }
 
    public String AnalisisKelistrikan() {
        if (super.getJumlahStopKontak() >= 4 && super.getKondisiStopKontak() == 1 || super.getKondisiStopKontak() == 2 && super.getPosisiStopKontak() == 1 || super.getPosisiStopKontak() == 2) {
            return ("Jumlah StopKontak = Sesuai");
        } else {
            return ("Jumlah StopKontak = tidak sesuai");
        }
    }

    public String AnalisisLCD() {
        if (super.getJumlahKabelLcd() >= 1 && super.getKondisiKabelLcd() == 1 || super.getKondisiKabelLcd() == 2 && super.getPosisiKabelLcd() == 1) {
            return "jumlah kabel LCD = sesuai";
        } else {
            return "jumlah kabel LCD = tidak sesuai";
        }
    }

    public String AnalisisLampu() {
        if (super.getJumlahLampu()>= 18 && super.getKondisiLampu() == 1 && super.getPosisiLampu() == 1) {
            return ("Jumlah Lampu = Sesuai");
        } else {
            return ("Jumlah Lampu = tidak sesuai");
        }
    }

    public String AnalisisKipas() {
        if (super.getJumlahKipasAngin() >= 2 && super.getKondisiKipasAngin() == 1 && super.getPosisiKipasAngin() == 1) {
            return ("Jumlah Kipas Angin = Sesuai");
        } else {
            return ("Jumlah Kipas Angin = tidak sesuai");
        }
    }

    public String AnalisisAC() {
        if (super.getJumlahAC() >= 1 && super.getKondisiAC() == 1 && super.getPosisiAC() == 1 || super.getPosisiAC() == 2) {
            return ("Jumlah AC = Sesuai");
        } else {
            return ("Jumlah AC = tidak sesuai");
        }
    }

    public String AnalisisInternet() {
        if (super.getSSID() == 1 && super.getLogin() == 1) {
            return ("SSID = Sesuai");
        } else {
            return ("SSID = tidak sesuai");
        }
    }

    public String AnalisisCCTV() {
        if (super.getJumlahCCTV() == 2 && super.getKondisiCCTV() == 1 && super.getPosisiCCTV() == 1 || super.getPosisiCCTV() == 3) {
            return ("Jumlah CCTV = Sesuai");
        } else {
            return ("Jumlah CCTV = tidak sesuai");
        }

    }
}
