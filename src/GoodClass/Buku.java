package GoodClass;

public class Buku {

    public String judul;
    public String penulis;
    public String tahunTerbit;
    public String kategori;

    public Buku() {
        this("Contoh Judul", "Contoh Penulis", "2023", "Horror");
    }

    public Buku(String judul, String penulis, String tahunTerbit, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public String getKategori() {
        return kategori;
    }

    public void print() {
        System.out.println("Judul : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("kategori : " + kategori);
    }

}
