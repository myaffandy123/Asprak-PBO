package Inherit.Kasus;

public class Kamus extends Buku {

    private String bahasa;
    private int banyakKata;

    public Kamus(String judul, String penulis, String isbn, int tahunTerbit, String bahasa, int banyakKata) {
        super(judul, penulis, isbn, tahunTerbit, "Kamus");
        this.bahasa = bahasa;
        this.banyakKata = banyakKata;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Bahasa         : " + bahasa);
        System.out.println("Banyak kata    : " + banyakKata);
    }

    public String getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public int getBanyakKata() {
        return banyakKata;
    }

    public void setBanyakKata(int banyakKata) {
        this.banyakKata = banyakKata;
    }
}
