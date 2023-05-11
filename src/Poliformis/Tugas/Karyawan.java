package Poliformis.Tugas;

public abstract class Karyawan {
    
    private String nama;
    private String id;
    private int usia;
    private int gaji;

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
    }

    public void meetingProyek(Karyawan karyawanLain) {
        if (karyawanLain instanceof Artist) {
            System.out.println("Si " + nama + " meeting dengan Artist " + karyawanLain.nama);
        } else if (karyawanLain instanceof Programmer) {
            System.out.println("Si " + nama + " meeting dengan Programmer " + karyawanLain.nama);
        } else if (karyawanLain instanceof Manager) {
            System.out.println("Si " + nama + " meeting dengan Manajer " + karyawanLain.nama);
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
    
}
