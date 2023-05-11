package Poliformis.Kasus;

public class Komik extends Buku {
    
    private String style;
    private int banyakGambar;

    public Komik() {
        this("Naruto", "Aku Aka", 2000, 10, "Anime", 5000);
    }

    public Komik(String judul, String penulis, int tahunTerbit, int stok, String style, int jumlahGambar) {
        super(judul, penulis, tahunTerbit, stok);
        this.style = style;
        this.banyakGambar = jumlahGambar;
    }

    public void printBuku() {
        super.printBuku();
        System.out.println("Style : " + style);
        System.out.println("Banyak Gambar : " + banyakGambar);
    }

    public String getStyle() {
        return style;
    }

    public int getBanyakGambar() {
        return banyakGambar;
    }
}
