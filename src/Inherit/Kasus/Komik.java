package Inherit.Kasus;

public class Komik extends Buku {

    private String style;
    private int banyakGambar;

    public Komik(String judul, String penulis, String isbn, int tahunTerbit, String style, int jumlahGambar) {
        super(judul, penulis, isbn, tahunTerbit, "Komik");
        this.style = style;
        this.banyakGambar = jumlahGambar;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Style          : " + style);
        System.out.println("Banyak gambar  : " + banyakGambar);
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String stule) {
        this.style = stule;
    }

    public int getBanyakGambar() {
        return banyakGambar;
    }

    public void setBanyakGambar(int jumlahGambar) {
        this.banyakGambar = jumlahGambar;
    }

}
