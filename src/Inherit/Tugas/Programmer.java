package Inherit.Tugas;

public class Programmer extends Karyawan {

    private String progLang;
    private String platform;

    public Programmer() {
        this("Iqbal", "44444", 22, 20000, "Javascript", "PC");
    }

    public Programmer(String nama, String id, int usia, int gaji, String progLang, String platform) {
        super(nama, id, usia, gaji, "Full-Stack");
        this.progLang = progLang;
        this.platform = platform;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Bahasa Program : " + progLang);
        System.out.println("Platform       : " + platform);
    }

    public String getProgLang() {
        return progLang;
    }

    public void setProgLang(String progLang) {
        this.progLang = progLang;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

}
