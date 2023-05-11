package StaticFinal;

public class Manusia {

    private String nama;
    private final String gender;

    public Manusia() {
        this("Yusuf", "Laki-laki");
    }

    public Manusia(String nama, String gender) {
        this.nama = nama;
        this.gender = gender;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    // public void setGender(String gender) {
    //     this.gender = gender;
    // }

    public static void tesFinal() {
        System.out.println("Ini method parent");
    }

}
