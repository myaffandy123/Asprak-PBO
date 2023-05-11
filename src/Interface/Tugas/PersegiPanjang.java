package Interface.Tugas;

public class PersegiPanjang extends BangunDatar {

    private double panjang;
    private double lebar;

    private static int jumlahPersegiPanjang = 0;

    public PersegiPanjang(String nama, double panjang, double lebar) {
        super(nama);
        this.panjang = panjang;
        this.lebar = lebar;
        jumlahPersegiPanjang++;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public double hitungSpesial() {
        return Math.sqrt(Math.pow(panjang, 2) + Math.pow(lebar, 2));
    }

    @Override
    public void print() {
        System.out.println("==============================================");
        System.out.printf("%-20s : %s\n", "Nama bangun datar", getNama());
        System.out.printf("%-20s : %.1f\n", "Panjang", panjang);
        System.out.printf("%-20s : %.1f\n", "Lebar", lebar);
        System.out.printf("%-20s : %.2f\n", "Luas", hitungLuas());
        System.out.printf("%-20s : %.2f\n", "Keliling", hitungKeliling());
        System.out.printf("%-20s : %.2f\n", "Nilai spesial", hitungSpesial());
    }

    public static int getJumlahPersegiPanjang() {
        return jumlahPersegiPanjang;
    }

    public static void printJumlahPersegiPanjang() {
        System.out.printf("%-25s : %d\n", "Jumlah persegi panjang", jumlahPersegiPanjang);
    }
}
