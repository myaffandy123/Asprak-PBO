package Interface.Tugas;

public class Lingkaran extends BangunDatar {

    private double jari;

    private static int jumlahLingkaran = 0;

    public Lingkaran(String nama, double radius) {
        super(nama);
        this.jari = radius;
        jumlahLingkaran++;
    }

    @Override
    public double hitungLuas() {
        return PI * jari * jari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * PI * jari;
    }

    @Override
    public double hitungSpesial() {
        return (hitungLuas() / 4) - (jari * jari / 2);
    }

    @Override
    public void print() {
        System.out.println("==============================================");
        System.out.printf("%-20s : %s\n", "Nama bangun datar", getNama());
        System.out.printf("%-20s : %.1f\n", "Jari-jari", jari);
        System.out.printf("%-20s : %.2f\n", "Luas", hitungLuas());
        System.out.printf("%-20s : %.2f\n", "Keliling", hitungKeliling());
        System.out.printf("%-20s : %.2f\n", "Nilai spesial", hitungSpesial());
    }

    public static int getJumlahLingkaran() {
        return jumlahLingkaran;
    }

    public static void printJumlahLingkaran() {
        System.out.printf("%-25s : %d\n", "Jumlah lingkaran", jumlahLingkaran);
    }

}
