package Poliformis.Kasus;

public class Buku {

    private String judul;
    private String penulis;
    private int harga;
    private int stok;

    public Buku() {
        this("Buku Biasa", "Bjarne", 100000, 10);
    }

    public Buku(String judul, String penulis, int harga, int stok) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
        this.stok = stok;
    }

    public void printBuku() {
        System.out.println("Judul : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Harga : " + harga);
        System.out.println("Stok : " + stok);
    }

    public void kurangiStok(int jumlah) {
        this.stok -= jumlah;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

}
