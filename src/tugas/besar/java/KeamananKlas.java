package tugas.besar.java;

import java.util.Scanner;

public class KeamananKlas extends Ruang {
    
    Scanner in = new Scanner(System.in);
    
    @Override
    
    public void KeamananKls(){
        System.out.println("Masukan Kondisi Kekokohan Bangunan Ruang Kelas : ");
        System.out.println("\n1.Kuat \n2.Tidak Kuat");
        super.setKekokohan(in.nextInt());
        System.out.println("\n");
        System.out.println("Masukan Kondisi Kunci Pintu Ruang Kelas : ");
        System.out.println("\n1.Rusak \n2.Tidak Rusak");
        super.setKunciPintu(in.nextInt());
        System.out.println("\n");
        System.out.println("Masukan Kondisi Kunci Jendela Ruang Kelas : ");
        System.out.println("\n1.Rusak \n2.Tidak Rusak");
        super.setKunciJendela(in.nextInt());
        System.out.println("\n");
        System.out.println("Masukan Kondisi Bahata Ruang Kelas : ");
        System.out.println("\n1.Bahaya \n2.Tidak Bahaya");
        super.setBahaya(in.nextInt());
        System.out.println("\n");
    }
    
    public String AnalisisKekokohan(){
		if(super.getKekokohan()==1)
			return("Tingkat Kekokohan = Sesuai");
		else
			return("Tingkat Kekokohan = tidak sesuai");
	}
	public String AnalisisKunciPintu(){
		if(super.getKunciPintu()==1)
			return("Kunci pintu = Sesuai");
		else
			return("Kunci pintu = tidak sesuai");
	}
	public String AnalisisKunciJendela(){
		if(super.getKunciJendela()==1)
			return("Kunci Jendela = Sesuai");
		else
			return("Kunci Jendela = tidak sesuai");
	}
	public String AnalisisKeamananRuang(){
		if(super.getBahaya()==1)
			return("Tingkat Keamanan Ruangan = Sesuai");
		else
			return("Tingkat Keamanan Ruangan = tidak sesuai");
	}
    
}
