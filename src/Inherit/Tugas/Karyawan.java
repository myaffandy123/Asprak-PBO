package Inherit.Tugas;

public class Karyawan {
    
    protected String nama;
    protected String id;
    protected int usia;
    protected int gaji;
    protected String jenisKaryawan;

    public Karyawan() {
        this("Yusuf", "12345", 21, 10000, "Karyawan Biasa");
    }

    public Karyawan(String nama, String id, int usia, int gaji, String jenisKaryawan) {
        this.nama = nama;
        this.id = id;
        this.usia = usia;
        this.gaji = gaji;
        this.jenisKaryawan = jenisKaryawan;
    }

    public void print() {
        System.out.println("Nama           : " + nama);
        System.out.println("ID             : " + id);
        System.out.println("Usia           : " + usia);
        System.out.println("Gaji           : Rp" + gaji);
        System.out.println("Jenis Karyawan : " + jenisKaryawan);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
}
