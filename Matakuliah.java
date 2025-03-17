import java.util.ArrayList;

public class Matakuliah {
    private String kode;
    private String nama;
    private ArrayList<Jadwal> listJadwal;
    private int sks;

    public Matakuliah(String kode, String nama, int sks) {
        this.setKode(kode);
        this.setNama(nama);
        this.setSks(sks);
        listJadwal = new ArrayList<Jadwal>();
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getSks() {
        return sks;
    }

    public void display() {
        System.out.println("Informasi Matakuliah");
        System.out.println("\tKode : " + this.getKode());
        System.out.println("\tNama : " + this.getNama());
        System.out.println("\tSKS  : " + this.getSks());
        System.out.println("");
    }

    public String toString() {
        return this.getKode() + " (" + this.getNama() + ") [" + this.getSks() + "]";
    }

    public Jadwal jadwalKuliah(String hari, String waktu, String ruang) {
        int i = 0;
        Jadwal j = new Jadwal(listJadwal.size()+1, hari, waktu, this, ruang);
        addJadwal(j);
        return j;
    }

    public void addJadwal(Jadwal j) {
        listJadwal.add(j);
    }
}
