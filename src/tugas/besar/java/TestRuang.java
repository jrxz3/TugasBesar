package tugas.besar.java;

public class TestRuang {
    
    public static void main(String[] args){
      AdminRuang[] a = new AdminRuang[1];

      KondisiSarana [] b = new KondisiSarana[1];
		KeamananKlas [] c = new KeamananKlas[1];
		KebersihanKlas[] d = new KebersihanKlas[1];
		KenyamananKlas [] e = new KenyamananKlas[1];
		KondisiKlas [] f = new KondisiKlas[1];
		LingkunganKlas [] g = new LingkunganKlas[1];
		Tampil apa = new Tampil();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = new AdminRuang();
			a[i].InsertData();
		}
		for (int i = 0; i < f.length; i++){
			f[i] = new KondisiKlas();
			f[i].KondisiKlas();
			f[i].HitungLuas();
			f[i].BentukRuang();
			f[i].RasioLuas();
			f[i].AnalisisJendela();
			f[i].AnalisisPintu();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = new KondisiSarana();
			b[i].KondisiSarana();
			b[i].AnalisisKelistrikan();
			b[i].AnalisisLCD();
			b[i].AnalisisLampu();
			b[i].AnalisisKipas();
			b[i].AnalisisAC();
			b[i].AnalisisInternet();
			b[i].AnalisisCCTV();
		}
		for (int i = 0; i < g.length; i++){
			g[i] = new LingkunganKlas();
			g[i].LingkunganKlas();
			g[i].AnalisisKebersihan();
		}
		for (int i = 0; i < d.length; i++){
			d[i] = new KebersihanKlas();
			d[i]. KebersihanKlas();
			d[i]. AnalisisSirkulasiUdara();
			d[i]. AnalisisKelembapan();
			d[i]. AnalisisPencahayaan();
			d[i].AnalisisSirkulasiUdara();
			d[i].AnalisisSuhu();
		}
		for (int i = 0; i < e.length; i++){
			e[i] = new KenyamananKlas();
			e[i].KenyamananKlas();
			e[i].AnalisisKebisingan();
			e[i].AnalisisBau();
			e[i].AnalisisKebocoran();
			e[i].AnalisisKerusakan();
			e[i].AnalisisKeausan();
		}
		for (int i = 0; i < c.length; i++) {
			c[i] = new KeamananKlas();
			c[i].KeamananKlas();
			c[i].AnalisisKekokohan();
			c[i].AnalisisKunciJendela();
			c[i].AnalisisKunciPintu();
			c[i].AnalisisKeamananRuang();
		}
		apa.ListInputan();
		}
	}
