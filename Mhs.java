import java.util.ArrayList;
import java.util.Collection;

public class Mhs {
    private String nim;
    private String nama;
    private ArrayList<Jadwal> mendaftar;

    public Mhs(String nim, String nama) {
        setNim(nim);
        setNama(nama);
        mendaftar = new ArrayList<Jadwal>();
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void display() {
        System.out.println("Info MHS");
        System.out.println("\tNIM   : " + getNim());
        System.out.println("\tNama  : " + getNama());
        System.out.println("");
        this.displayJadwal();
    }

    public String toString() {
        return getNim() + " ; " + getNama();
    }

    public void addMatkul(Jadwal j) {
        mendaftar.add(j);
    }

    public void dropMatkul(Jadwal j) {
        mendaftar.remove(j);
    }

    public Collection<Jadwal> getMatkul() {
        return mendaftar;
    }

    public void displayJadwal() {
        System.out.println("Jadwal : " + this.getNama());
        for (Jadwal j : mendaftar) {
            System.out.println("\tKelas      : " + j.getMatakuliah().getKode() + "-" + j.getKodeJadwal());
            System.out.println("\tMatakuliah : " + j.getMatakuliah().getNama());
            System.out.println("\tJadwal     : " + j.getHari() + "-" + j.getWaktu() + "-" + j.getRuang());
            System.out.println("\t--------------------------------------------------------");
        }
    }
}
