package Interface.Tugas;

public class Layang extends BangunDatar {

    private double diagonal1;
    private double diagonal2;
    private double sisiMiring1;
    private double sisiMiring2;

    private static int jumlahLayang = 0;

    public Layang(String nama, double diagonal1, double diagonal2, double sisiMiring1, double sisiMiring2) {
        super(nama);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiMiring1 = sisiMiring1;
        this.sisiMiring2 = sisiMiring2;
        jumlahLayang++;
    }

    @Override
    public double hitungLuas() {
        return diagonal1 * diagonal2 / 2;
    }

    @Override
    public double hitungKeliling() {
        return (sisiMiring1 + sisiMiring2) * 2;
    }

    @Override
    public double hitungSpesial() {
        double tinggi = Math.sqrt(Math.pow(Math.min(sisiMiring1, sisiMiring2), 2) - Math.pow(Math.min(diagonal1, diagonal2) / 2, 2));
        return Math.min(diagonal1, diagonal2) * tinggi / 2;
    }

    public void print() {
        System.out.println("==============================================");
        System.out.printf("%-20s : %s\n", "Nama bangun datar", getNama());
        System.out.printf("%-20s : %.1f\n", "Diagonal 1", diagonal1);
        System.out.printf("%-20s : %.1f\n", "Diagonal 2", diagonal2);
        System.out.printf("%-20s : %.1f\n", "Sisi miring 1", sisiMiring1);
        System.out.printf("%-20s : %.1f\n", "Sisi miring 2", sisiMiring2);
        System.out.printf("%-20s : %.2f\n", "Luas", hitungLuas());
        System.out.printf("%-20s : %.2f\n", "Keliling", hitungKeliling());
        System.out.printf("%-20s : %.2f\n", "Nilai spesial", hitungSpesial());
    }

    public static int getJumlahLayang() {
        return jumlahLayang;
    }

    public static void printJumlahLayang() {
        System.out.printf("%-25s : %d\n", "Jumlah layang-layang", jumlahLayang);
    }
}
