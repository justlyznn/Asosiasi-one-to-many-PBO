import java.util.ArrayList;
import java.util.HashMap;

public class Jadwal {
    private int kodeJadwal;
    private String hari;
    private String waktu;
    private String ruang;
    private Matakuliah matakuliah;
    private HashMap<String, Mhs> mhsTerdaftar;

    public Jadwal(int kodeJadwal, String hari, String waktu, Matakuliah matakuliah, String ruang) {
        setKodeJadwal(kodeJadwal);
        setHari(hari);
        setWaktu(waktu);
        setMatakuliah(matakuliah);
        setRuang(ruang);
        mhsTerdaftar = new HashMap<String, Mhs>();
    }

    public void setKodeJadwal(int kodeJadwal) {
        this.kodeJadwal = kodeJadwal;
    }

    public int getKodeJadwal() {
        return kodeJadwal;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getHari() {
        return hari;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setMatakuliah(Matakuliah m) {
        matakuliah = m;
    }

    public Matakuliah getMatakuliah() {
        return matakuliah;
    }

    public void setRuang(String r) {
        ruang = r;
    }

    public String getRuang() {
        return ruang;
    }

    public void display() {
        System.out.println("Info Jadwal:");
        System.out.println("\tKelas      : " + getMatakuliah().getKode() + "-" + getKodeJadwal());
        System.out.println("\tMatakuliah : " + getMatakuliah().getNama());
        System.out.println("\tSKS        : " + getMatakuliah().getSks());
        System.out.println("\tJadwal     : " + getHari() + " ; " + getWaktu() + " ; " + getRuang());
        displayListMhs();
        System.out.println("--------------------------------------------------------");
    }

    public void daftar(Mhs m) {
        mhsTerdaftar.put(m.getNim(), m);
        m.addMatkul(this);
    }

    public void drop(Mhs m) {
        mhsTerdaftar.remove(m.getNim());
        // Menjaga hubungan dua arah
        m.dropMatkul(this);
    }

    public void displayListMhs() {
        System.out.print("\tJumlah MHS terdaftar: " + getTotalMhs());
        if (getTotalMhs() == 0) {
            System.out.println(".");
        } else {
            System.out.println(", sbb:");
        }
        // Iterasi semua mahasiswa yang terdaftar
        for (Mhs m : mhsTerdaftar.values()) {
            System.out.println("\t\t" + m.getNama());
        }
    }

    public int getTotalMhs() {
        return mhsTerdaftar.size();
    }
}
