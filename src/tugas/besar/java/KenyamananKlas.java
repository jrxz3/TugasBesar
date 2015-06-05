package tugas.besar.java;

import java.util.Scanner;

public class KenyamananKlas extends Ruang {
    Scanner in = new Scanner(System.in);

    @Override
    public void KenyamananKlas() {
        System.out.println("Kondisi Kebisingan : ");
        System.out.println("\n1. Tidak bising \n2. Bising");
	System.out.println("Kondisi Bau Ruangan : ");
        System.out.println("\n1. Tidak bau \n2. Bau");
	super.setBau(in.nextInt());
	System.out.println("Kondisi Kebocoran ruangan : ");
        System.out.println("\n1. Tidak bocor \n2. Bocor");
        super.setKebocoran(in.nextInt());
	System.out.println("Konsisi kerusakan ruangan : ");
        System.out.println("\n1. Tidak rusak \n2. Rusak");
	super.setKerusakan(in.nextInt());
	System.out.println("Kondisi Keausan Ruangan : ");
        System.out.println("\n1. Tidak aus \n2. Sudah aus");
	super.setKeausan(in.nextInt());
	}

	public String AnalisisKebisingan(){
		if(super.getKebisingan()==1)
			return("Tingkat Kebisingan = Sesuai");
		else
			return("Tingkat Kebisingan = Tidak Sesuai");
	}
	public String AnalisisBau(){
		if(super.getBau()==1)
			return("Bau Ruangan = Sesuai");
		else
			return("Bau Ruangan = tidak sesuai");
	}
	public String AnalisisKebocoran(){
		if(super.getKebocoran()==1)
			return("Tingkat Kebocoran = Sesuai");
		else
			return("Tingkat Kebocoran = Tidak Sesuai");
	}
	public String AnalisisKerusakan(){
		if(super.getKerusakan()==1)
			return("Tingkat Kerusakan = Sesuai");
		else
			return("Tingkat Kerusakan = Tidak Sesuai");
	}
	public String AnalisisKeausan(){
		if(super.getKeausan()==1)
			return("Tingkat Keausan = Sesuai");
		else
			return("Tingkat Keausan = Tidak Sesuai");
	}
    
}
