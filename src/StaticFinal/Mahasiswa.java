package StaticFinal;

import java.util.*;

public class Mahasiswa extends Manusia {

    private String nim;
    private String prodi;

    public static int jumlahMahasiswaStatic = 0;
    public int jumlahMahasiswa = 0;

    public Mahasiswa() {
        this("Iqbal", "Laki-laki", "12345", "TIF");
    }

    public Mahasiswa(String nama, String gender, String nim, String prodi) {
        super(nama, gender);
        this.nim = nim;
        this.prodi = prodi;
        jumlahMahasiswaStatic++;
        jumlahMahasiswa++;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void print() {
        System.out.println(getNama());
        System.out.println(getGender());
    }

    public static void printStatic(Mahasiswa mahasiswa) {
        System.out.println(mahasiswa.getNama());
        System.out.println(mahasiswa.getGender());
    }

    public static void tesA() {
        System.out.println(jumlahMahasiswaStatic);
    }

    public void tesB() {
        System.out.println(jumlahMahasiswaStatic);
    }

    // @Override
    // public final void tesFinal() {
    // System.out.println("Ini method final");
    // }

    // @Override
    public static void tesFinal() {
        System.out.println("Ini method child");
    }
}
