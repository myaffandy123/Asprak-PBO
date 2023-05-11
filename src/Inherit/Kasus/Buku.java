package Inherit.Kasus;

public class Buku {

    protected String judul;
    protected String penulis;
    protected String isbn;
    protected int tahunTerbit;
    protected String jenisBuku;

    public Buku(String judul, String penulis, String isbn, int tahunTerbit) {
        this(judul, penulis, isbn, tahunTerbit, "Buku Biasa");
    }

    protected Buku(String judul, String penulis, String isbn, int tahunTerbit, String jenisBuku) {
        this.judul = judul;
        this.penulis = penulis;
        this.isbn = isbn;
        this.tahunTerbit = tahunTerbit;
        this.jenisBuku = jenisBuku;
    }

    public void print() {
        System.out.println("Judul          : " + judul);
        System.out.println("Penulis        : " + penulis);
        System.out.println("ISBN           : " + isbn);
        System.out.println("Tahun terbit   : " + tahunTerbit);
        System.out.println("Jenis buku     : " + jenisBuku);
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getJenisBuku() {
        return jenisBuku;
    }

    public void setJenisBuku(String jenisBuku) {
        this.jenisBuku = jenisBuku;
    }
    
}
