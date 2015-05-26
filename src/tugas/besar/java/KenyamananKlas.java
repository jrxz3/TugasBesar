package tugas.besar.java;

import java.util.Scanner;

public class KenyamananKlas extends Ruang {
    Scanner in = new Scanner(System.in);

    /**
     *
     */
    @Override
    public void KenyamananKlas() {
        System.out.println("Kondisi Kebisingan : ");
        System.out.println("\n1. tidak bising \n2. bising");
	super.setKebisingan(in.nextInt());
	System.out.println("\n");
	System.out.println("kondisi bau ruangan : ");
        System.out.println("\n1. tidak bau \n2. bau");
	super.setBau(in.nextInt());
	System.out.println("\n");
	System.out.println("Kondisi Kebocoran ruangan : ");
        System.out.println("\n1. tidak bocor \n2. bocor");
	super.setKebocoran(in.nextInt());
	System.out.println("\n");
	System.out.println("Konsisi kerusakan ruangan : ");
        System.out.println("\n1. tidak rusak \n2. rusak");
	super.setKerusakan(in.nextInt());
	System.out.println("\n");
	System.out.println("Kondisi Keausan Ruangan : ");
        System.out.println("\n1.tidak aus \n2. sudah aus");
	super.setKeausan(in.nextInt());
	System.out.println("\n");
	}

	public String AnalisisKebisingan(){
		if(super.getKebisingan()==1)
			return("Tingkat Kebisingan = Sesuai");
		else
			return("Tingkat Kebisingan = tidak sesuai");
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
			return("Tingkat Kebocoran = tidak sesuai");
	}
	public String AnalisisKerusakan(){
		if(super.getKerusakan()==1)
			return("Tingkat Kerusakan = Sesuai");
		else
			return("Tingkat Kerusakan = tidak sesuai");
	}
	public String AnalisisKeausan(){
		if(super.getKeausan()==1)
			return("Tingkat Keausan = Sesuai");
		else
			return("Tingkat Keausan = tidak sesuai");
	}
    
}
