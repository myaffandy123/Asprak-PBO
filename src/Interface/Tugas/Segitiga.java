package Interface.Tugas;

public class Segitiga extends BangunDatar {

    private double alas;
    private double tinggi;

    private static int jumlahSegitiga = 0;

    public Segitiga(String nama, double alas, double tinggi) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
        jumlahSegitiga++;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return hitungSpesial() + alas + tinggi;
    }

    @Override
    public double hitungSpesial() {
        return Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi,2));
    }

    @Override
    public void print() {
        System.out.println("==============================================");
        System.out.printf("%-20s : %s\n", "Nama bangun datar", getNama());
        System.out.printf("%-20s : %.1f\n", "Alas", alas);
        System.out.printf("%-20s : %.1f\n", "Tinggi", tinggi);
        System.out.printf("%-20s : %.2f\n", "Luas", hitungLuas());
        System.out.printf("%-20s : %.2f\n", "Keliling", hitungKeliling());
        System.out.printf("%-20s : %.2f\n", "Nilai spesial", hitungSpesial());
    }

    public static int getJumlahSegitiga() {
        return jumlahSegitiga;
    }

    public static void printJumlahSegitiga() {
        System.out.printf("%-25s : %d\n", "Jumlah segitiga", jumlahSegitiga);
    }
}
