package UTP;

public class Karyawan {
    
    private String nama;
    private String id;
    private int usia;
    private int gaji;
    private Proyek proyek;

    public Karyawan() {
        this("Yusuf", "12345", 21, 10000);
    }

    public Karyawan(String nama, String id, int usia, int gaji) {
        this.nama = nama;
        this.id = id;
        this.usia = usia;
        this.gaji = gaji;
    }

    public void print() {
        System.out.println("Nama           : " + nama);
        System.out.println("ID             : " + id);
        System.out.println("Usia           : " + usia);
        System.out.println("Gaji           : Rp" + gaji);
        if (proyek != null) {
            System.out.println("Proyek         : " + proyek.getNama());
        } else {
            System.out.println("Proyek         : (Tidak ada)");
        }
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

    public Proyek getProyek() {
        return proyek;
    }

    public void setProyek(Proyek proyek) {
        this.proyek = proyek;
    }
    
}
