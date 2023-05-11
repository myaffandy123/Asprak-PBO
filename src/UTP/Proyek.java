package UTP;

public class Proyek {

    private String nama;
    private String lokasi;
    private String durasi;

    public Proyek(String nama, String lokasi, String durasi) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.durasi = durasi;
    }

    public void print() {
        System.out.println("Nama           : " + nama);
        System.out.println("Lokasi         : " + lokasi);
        System.out.println("Durasi         : " + durasi);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

}
