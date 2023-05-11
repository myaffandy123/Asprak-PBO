package Poliformis.Kasus;

public class Kamus extends Buku {

    private String bahasa;
    private int jumlahKata;

    public Kamus() {
        this("Kamusku Jawa", "Kamu Kamu", 50000, 5, "Jawa", 1000);
    }

    public Kamus(String judul, String penulis, int harga, int stok, String bahasa, int jumlahKata) {
        super(judul, penulis, harga, stok);
        this.bahasa = bahasa;
        this.jumlahKata = jumlahKata;
    }

    public void printBuku() {
        super.printBuku();
        System.out.println("Bahasa : " + bahasa);
        System.out.println("jumlah Kata : " + jumlahKata);
    }

    public String getBahasa() {
        return bahasa;
    }

    public int getJumlahKata() {
        return jumlahKata;
    }

    
}
