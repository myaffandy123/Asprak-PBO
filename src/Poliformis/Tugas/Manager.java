package Poliformis.Tugas;

public class Manager extends Karyawan {
    
    private String proyek;
    private int jumlahTim;

    public Manager() {
        this("Nathan", "33333", 30, 40000, "Master Ninja Gear", 10);
    }

    public Manager(String nama, String id, int usia, int gaji, String proyek, int jumlahTim) {
        super(nama, id, usia, gaji);
        this.proyek = proyek;
        this.jumlahTim = jumlahTim;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Proyek         : " + proyek);
        System.out.println("Jumlah Tim     : " + jumlahTim);
    }

    public String getProyek() {
        return proyek;
    }

    public void setProyek(String proyek) {
        this.proyek = proyek;
    }

    public int getJumlahTim() {
        return jumlahTim;
    }

    public void setJumlahTim(int jumlahTim) {
        this.jumlahTim = jumlahTim;
    }

    
}
