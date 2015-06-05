package tugas.besar.java;

import java.util.Scanner;

public class KebersihanKlas extends Ruang {
    Scanner in = new Scanner(System.in);
   
    @Override
    public void KebersihanKlas(){
    System.out.println("Sirkulasi udara = ");
        super.setSirkulasiUdara(in.nextInt());
        System.out.println("Nilai Pencahayaan = ");
        super.setNilaiPencahayaan(in.nextInt());
        System.out.println("Kelembapan = ");
        super.setKelembapan(in.nextInt());
        System.out.println("Suhu = ");
        super.setSuhu(in.nextInt());
    }
    public String AnalisisSirkulasiUdara(){
		if(super.getSirkulasiUdara()==1)
			return("Sirkulasi Udara = sesuai");
		else
			return("Sirkulasi Udara = tidak sesuai");
		
	}
	public String AnalisisPencahayaan(){
		if(super.getNilaiPencahayaan()>=250&&super.getNilaiPencahayaan()<=350)
			return("Pencahayaan = sesuai");
		else
			return("Pencahayaan = tidak sesuai");
	}
	public String AnalisisKelembapan(){
		if(super.getKelembapan()>=70&&super.getKelembapan()<=80)
			return("Kelembapan = sesuai");
		else
			return("Kelembapan = tidak sesuai");
	}
	public String AnalisisSuhu(){
		if(super.getSuhu()>=25&&super.getSuhu()<=35)
			return("Suhu = sesuai");
		else
			return("Suhu = tidak sesuai");
	}
}
