package tugas.besar.java;

public class Ruang {

    private String NamaRuang;
    private String LokasiRuang;
    private String Studi;
    private String Fakultas;
    private int Panjang;
    private int Lebar;
    private int JumlahKursi;
    private int JumlahPintu;
    private int JumlahJendela;
    private int JumlahStopKontak;
    private int KondisiStopKontak;
    private int PosisiStopKontak;
    private int JumlahKabelLcd;
    private int KondisiKabelLcd;
    private int PosisiKabelLcd;
    private int JumlahLampu;
    private int KondisiLampu;
    private int PosisiLampu;
    private int JumlahKipasAngin;
    private int KondisiKipasAngin;
    private int PosisiKipasAngin;
    private int JumlahAC;
    private int KondisiAC;
    private int PosisiAC;
    private int SSID;
    private int Login;
    private int Bandwidth;
    private int JumlahCCTV;
    private int KondisiCCTV;
    private int PosisiCCTV;
    private int KondisiLantai;//lingkungan
    private int KondisiDinding;
    private int KondisiAtap;
    private int KondisiPintu;
    private int KondisiJendela;
    private int SirkulasiUdara;//kebersihan kelas
    private int NilaiPencahayaan;//kebersihan kelas
    private int Kelembapan;//kebersihan kelas
    private int Suhu;//kebersihan kelas
    private int Kebisingan;
    private int Bau;
    private int Kebocoran;
    private int Kerusakan;
    private int Keausan;
    private int Kekokohan;
    private int KunciPintu;
    private int KunciJendela;
    private int Bahaya;

    public void setNamaRuang(String NamaRuang) {
        this.NamaRuang = NamaRuang;
    }

    public void setLokasiRuang(String LokasiRuang) {
        this.LokasiRuang = LokasiRuang;
    }

    public void setStudi(String Studi) {
        this.Studi = Studi;
    }

    public void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }

    public void setPanjang(int Panjang) {
        this.Panjang = Panjang;
    }

    public void setLebar(int Lebar) {
        this.Lebar = Lebar;
    }

    public void setJumlahKursi(int JumlahKursi) {
        this.JumlahKursi = JumlahKursi;
    }

    public void setJumlahPintu(int JumlahPintu) {
        this.JumlahPintu = JumlahPintu;
    }

    public void setJumlahJendela(int JumlahJendela) {
        this.JumlahJendela = JumlahJendela;
    }

    public void setJumlahStopKontak(int JumlahStopKontak) {
        this.JumlahStopKontak = JumlahStopKontak;
    }

    public void setKondisiStopKontak(int KondisiStopKontak) {
        this.KondisiStopKontak = KondisiStopKontak;
    }

    public void setPosisiStopKontak(int PosisiStopKontak) {
        this.PosisiStopKontak = PosisiStopKontak;
    }

    public void setJumlahKabelLcd(int JumlahKabelLcd) {
        this.JumlahKabelLcd = JumlahKabelLcd;
    }

    public void setKondisiKabelLcd(int KondisiKabelLcd) {
        this.KondisiKabelLcd = KondisiKabelLcd;
    }

    public void setPosisiKabelLcd(int PosisiKabelLcd) {
        this.PosisiKabelLcd = PosisiKabelLcd;
    }

    public void setJumlahLampu(int JumlahLampu) {
        this.JumlahLampu = JumlahLampu;
    }

    public void setKondisiLampu(int KondisiLampu) {
        this.KondisiLampu = KondisiLampu;
    }

    public void setPosisiLampu(int PosisiLampu) {
        this.PosisiLampu = PosisiLampu;
    }

    public void setJumlahKipasAngin(int JumlahKipasAngin) {
        this.JumlahKipasAngin = JumlahKipasAngin;
    }

    public void setKondisiKipasAngin(int KondisiKipasAngin) {
        this.KondisiKipasAngin = KondisiKipasAngin;
    }

    public void setPosisiKipasAngin(int PosisiKipasAngin) {
        this.PosisiKipasAngin = PosisiKipasAngin;
    }

    public void setJumlahAC(int JumlahAC) {
        this.JumlahAC = JumlahAC;
    }

    public void setKondisiAC(int KondisiAC) {
        this.KondisiAC = KondisiAC;
    }

    public void setPosisiAC(int PosisiAC) {
        this.PosisiAC = PosisiAC;
    }

    public void setSSID(int SSID) {
        this.SSID = SSID;
    }

    public void setLogin(int Login) {
        this.Login = Login;
    }

    public void setBandwidth(int Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public void setJumlahCCTV(int JumlahCCTV) {
        this.JumlahCCTV = JumlahCCTV;
    }

    public void setKondisiCCTV(int KondisiCCTV) {
        this.KondisiCCTV = KondisiCCTV;
    }

    public void setPosisiCCTV(int PosisiCCTV) {
        this.PosisiCCTV = PosisiCCTV;
    }

    public void setKondisiLantai(int KondisiLantai) {
        this.KondisiLantai = KondisiLantai;
    }

    public void setKondisiDinding(int KondisiDinding) {
        this.KondisiDinding = KondisiDinding;
    }

    public void setKondisiAtap(int KondisiAtap) {
        this.KondisiAtap = KondisiAtap;
    }

    public void setKondisiPintu(int KondisiPintu) {
        this.KondisiPintu = KondisiPintu;
    }

    public void setKondisiJendela(int KondisiJendela) {
        this.KondisiJendela = KondisiJendela;
    }

    public void setSirkulasiUdara(int SirkulasiUdara) {
        this.SirkulasiUdara = SirkulasiUdara;
    }

    public void setNilaiPencahayaan(int NilaiPencahayaan) {
        this.NilaiPencahayaan = NilaiPencahayaan;
    }

    public void setKelembapan(int Kelembapan) {
        this.Kelembapan = Kelembapan;
    }

    public void setSuhu(int Suhu) {
        this.Suhu = Suhu;
    }

    public void setKebisingan(int Kebisingan) {
        this.Kebisingan = Kebisingan;
    }

    public void setBau(int Bau) {
        this.Bau = Bau;
    }

    public void setKebocoran(int Kebocoran) {
        this.Kebocoran = Kebocoran;
    }

    public void setKerusakan(int Kerusakan) {
        this.Kerusakan = Kerusakan;
    }

    public void setKeausan(int Keausan) {
        this.Keausan = Keausan;
    }

    public void setKekokohan(int Kekokohan) {
        this.Kekokohan = Kekokohan;
    }

    public void setKunciPintu(int KunciPintu) {
        this.KunciPintu = KunciPintu;
    }

    public void setKunciJendela(int KunciJendela) {
        this.KunciJendela = KunciJendela;
    }

    public void setBahaya(int Bahaya) {
        this.Bahaya = Bahaya;
    }

    public String getNamaRuang() {
        return NamaRuang;
    }

    public String getLokasiRuang() {
        return LokasiRuang;
    }

    public String getStudi() {
        return Studi;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public int getPanjang() {
        return Panjang;
    }

    public int getLebar() {
        return Lebar;
    }

    public int getJumlahKursi() {
        return JumlahKursi;
    }

    public int getJumlahPintu() {
        return JumlahPintu;
    }

    public int getJumlahJendela() {
        return JumlahJendela;
    }

    public int getJumlahStopKontak() {
        return JumlahStopKontak;
    }

    public int getKondisiStopKontak() {
        return KondisiStopKontak;
    }

    public int getPosisiStopKontak() {
        return PosisiStopKontak;
    }

    public int getJumlahKabelLcd() {
        return JumlahKabelLcd;
    }

    public int getKondisiKabelLcd() {
        return KondisiKabelLcd;
    }

    public int getPosisiKabelLcd() {
        return PosisiKabelLcd;
    }

    public int getJumlahLampu() {
        return JumlahLampu;
    }

    public int getKondisiLampu() {
        return KondisiLampu;
    }

    public int getPosisiLampu() {
        return PosisiLampu;
    }

    public int getJumlahKipasAngin() {
        return JumlahKipasAngin;
    }

    public int getKondisiKipasAngin() {
        return KondisiKipasAngin;
    }

    public int getPosisiKipasAngin() {
        return PosisiKipasAngin;
    }

    public int getJumlahAC() {
        return JumlahAC;
    }

    public int getKondisiAC() {
        return KondisiAC;
    }

    public int getPosisiAC() {
        return PosisiAC;
    }

    public int getSSID() {
        return SSID;
    }

    public int getLogin() {
        return Login;
    }

    public int getBandwidth() {
        return Bandwidth;
    }

    public int getJumlahCCTV() {
        return JumlahCCTV;
    }

    public int getKondisiCCTV() {
        return KondisiCCTV;
    }

    public int getPosisiCCTV() {
        return PosisiCCTV;
    }

    public int getKondisiLantai() {
        return KondisiLantai;
    }

    public int getKondisiDinding() {
        return KondisiDinding;
    }

    public int getKondisiAtap() {
        return KondisiAtap;
    }

    public int getKondisiPintu() {
        return KondisiPintu;
    }

    public int getKondisiJendela() {
        return KondisiJendela;
    }

    public int getSirkulasiUdara() {
        return SirkulasiUdara;
    }

    public int getNilaiPencahayaan() {
        return NilaiPencahayaan;
    }

    public int getKelembapan() {
        return Kelembapan;
    }

    public int getSuhu() {
        return Suhu;
    }

    public int getKebisingan() {
        return Kebisingan;
    }

    public int getBau() {
        return Bau;
    }

    public int getKebocoran() {
        return Kebocoran;
    }

    public int getKerusakan() {
        return Kerusakan;
    }

    public int getKeausan() {
        return Keausan;
    }

    public int getKekokohan() {
        return Kekokohan;
    }

    public int getKunciPintu() {
        return KunciPintu;
    }

    public int getKunciJendela() {
        return KunciJendela;
    }

    public int getBahaya() {
        return Bahaya;
    }

}
