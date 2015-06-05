package tugas.besar.java;

import java.util.Scanner;

public class LingkunganKlas extends Ruang {
    
    Scanner in = new Scanner(System.in);
    
    @Override
    public void LingkunganKlas(){
        System.out.println("Masukan Kondisi Lantai Kelas : ");
        System.out.println("\n1. Bersih \n2. Kotor");
        super.setKondisiLantai(in.nextInt());
        System.out.println("Masukan Kondisi Dinding Kelas : ");
        System.out.println("\n1. Bersih \n2. Kotor");
        super.setKondisiDinding(in.nextInt());
        System.out.println("Masukan Kondisi Atap Kelas : ");
        System.out.println("\n1. Bersih \n2. Kotor");
        super.setKondisiAtap(in.nextInt());
        System.out.println("Masukan Kondisi Pintu Kelas : ");
        System.out.println("\n1. Bersih \n2. Kotor ");
        super.setKondisiPintu(in.nextInt());
        System.out.println("Masukan Kondisi Jendela Kelas : ");
        System.out.println("\n1. Bersih \n2. Kotor");
        super.setKondisiJendela(in.nextInt());
    }
    
    public String AnalisisKebersihan(){
        if(super.getKondisiLantai()==1&&super.getKondisiDinding()==1&&super.getKondisiAtap()==1&&super.getKondisiPintu()==1&&super.getKondisiJendela()==1){
			return("Kebersihan Ruangan = sesuai");
		}else{
			return("Kebersihan Ruangan = tidak sesuai");
		}
    }
    
}
