package GoodClass;

import java.util.*;

public class Mahasiswa {

    private String nama;
    private String nim;
    private String prodi;
    private String[] mataKuliah;
    public Buku buku;

    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.mataKuliah = new String[5];
    }

    public void tambahMataKuliah(String namaMataKuliah) {
        for (int i = 0; i < mataKuliah.length; i++) {
            if (mataKuliah[i] == null) {
                mataKuliah[i] = namaMataKuliah;
                return;
            }
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

}
