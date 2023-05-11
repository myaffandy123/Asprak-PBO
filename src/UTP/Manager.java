package UTP;

public class Manager {
    
    private String nama;
    private String id;
    private int usia;
    private int gaji;
    private String tahunPengalaman;
    
    public Manager() {
        this("Nathan", "M-123", 30, 40000, "2 tahun");
    }
    
    public Manager(String nama, String id, int usia, int gaji, String tahunPengalaman) {
        this.nama = nama;
        this.id = id;
        this.usia = usia;
        this.gaji = gaji;
        this.tahunPengalaman = tahunPengalaman;
    }
    
    public void print() {
        System.out.println("Nama           : " + nama);
        System.out.println("ID Manager     : " + id);
        System.out.println("Usia           : " + usia);
        System.out.println("Gaji           : Rp" + gaji);
        System.out.println("Pengalaman     : " + tahunPengalaman);
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
