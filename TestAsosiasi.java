import java.util.ArrayList;

public class TestAsosiasi {
    public static void main(String args[]) {
        Mhs mhs1, mhs2, mhs3, mhs4;
        mhs1 = new Mhs("A11.2023.15093", "Aditya Ulil Albab");
        mhs2 = new Mhs("A11.2023.15094", "Muhammad Husnaya");
        mhs3 = new Mhs("A11.2023.15098", "Afzal Asnu Muhammad Ivano");
        mhs4 = new Mhs("A11.2023.15116", "Bintang Rifky Ananta");

        Matakuliah mk1, mk2, mk3, mk4, mk5;
        mk1 = new Matakuliah("100", "Matematika Diskrit", 3);
        mk2 = new Matakuliah("101", "Kalkulus", 4);
        mk3 = new Matakuliah("102", "Dasar Pemrograman", 3);
        mk4 = new Matakuliah("103", "Basis Data", 4);
        mk5 = new Matakuliah("104", "Rekayasa Perangkat Lunak", 3);

        Jadwal jad1, jad2, jad3, jad4, jad5, jad6, jad7;
        jad1 = mk1.jadwalKuliah("Senin", "07:00-08:40", "H.3.1");
        jad2 = mk1.jadwalKuliah("Senin", "07:00-08:40", "H.3.2");
        jad3 = mk2.jadwalKuliah("Senin", "08:40-10:20", "H.3.1");
        jad4 = mk2.jadwalKuliah("Senin", "08:40-10:20", "H.3.2");

        jad1.daftar(mhs1);
        jad1.daftar(mhs2);
        jad2.daftar(mhs3);
        jad2.daftar(mhs4);
        jad3.daftar(mhs1);
        jad3.daftar(mhs2);
        jad4.daftar(mhs3);
        jad4.daftar(mhs4);

        jad1.display();
        jad2.display();
        mhs1.display();
        mhs2.display();
    }
}
