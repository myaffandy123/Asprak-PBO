package Inherit.Kasus;

public class Sejarah extends Buku {
    
    private String bahasan;
    private String tahunBahasan;

    public Sejarah(String judul, String penulis, String isbn, int tahunTerbit, String bahasan, String tahunBahasan) {
        super(judul, penulis, isbn, tahunTerbit, "Sejarah");
        this.bahasan = bahasan;
        this.tahunBahasan = tahunBahasan;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Bahasan        : " + bahasan);
        System.out.println("Tahun bahasan  : " + tahunBahasan);
    }

    public String getBahasan() {
        return bahasan;
    }

    public void setBahasan(String bahasan) {
        this.bahasan = bahasan;
    }

    public String getTahunBahasan() {
        return tahunBahasan;
    }

    public void setTahunBahasan(String tahunBahasan) {
        this.tahunBahasan = tahunBahasan;
    }
}
