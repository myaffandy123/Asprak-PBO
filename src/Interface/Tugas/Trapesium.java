package Interface.Tugas;

public class Trapesium extends BangunDatar {

    private double alasAtas;
    private double alasBawah;
    private double tinggi;

    private static int jumlahTrapesium = 0;

    public Trapesium(String nama, double alasAtas, double alasBawah, double tinggi) {
        super(nama);
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;
        jumlahTrapesium++;
    }

    @Override
    public double hitungLuas() {
        return (alasAtas + alasBawah) * tinggi / 2;
    }

    @Override
    public double hitungKeliling() {
        double sisiMiringSegitiga = Math.sqrt(Math.pow(Math.abs(alasBawah - alasAtas) / 2, 2) + Math.pow(tinggi, 2));
        return alasAtas + alasBawah + sisiMiringSegitiga * 2;
    }

    @Override
    public double hitungSpesial() {
        return Math.min(alasBawah, alasAtas) * tinggi;
    }

    @Override
    public void print() {
        System.out.println("==============================================");
        System.out.printf("%-20s : %s\n", "Nama bangun datar", getNama());
        System.out.printf("%-20s : %.1f\n", "Alas atas", alasAtas);
        System.out.printf("%-20s : %.1f\n", "Alas bawah", alasBawah);
        System.out.printf("%-20s : %.1f\n", "Tinggi", tinggi);
        System.out.printf("%-20s : %.2f\n", "Luas", hitungLuas());
        System.out.printf("%-20s : %.2f\n", "Keliling", hitungKeliling());
        System.out.printf("%-20s : %.2f\n", "Nilai spesial", hitungSpesial());
    }

    public static int getJumlahTrapesium() {
        return jumlahTrapesium;
    }

    public static void printJumlahTrapesium() {
        System.out.printf("%-25s : %d\n", "Jumlah persegi panjang", jumlahTrapesium);
    }
}
