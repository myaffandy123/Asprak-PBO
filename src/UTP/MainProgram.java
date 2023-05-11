package UTP;

public class MainProgram {
    
    public static void main(String[] args) {
        System.out.println();
        Perusahaan perusahaan = new Perusahaan("Appled", "Kebun Belakang Rumah");

        perusahaan.rekrutKaryawan(new Karyawan("Muhammad Iqbal Rabani", "215150207111051", 20, 2000));
        perusahaan.sewaManager(new Manager("Muhammad Yusuf Affandy", "215150200111052", 20, 1000, "2 tahun"));
        perusahaan.rekrutKaryawan(new Karyawan("Muhammad Iqbal Rabani", "215150207111051", 20, 2000));

        perusahaan.tambahProyek(new Proyek("Iphone", "This Home", "1 tahun"));
        perusahaan.tugaskanProyek("Iphone", "Muhammad Iqbal Rabani");

        perusahaan.printDataPerusahaan();
        perusahaan.printSemuaKaryawan();
        perusahaan.printSemuaProyek();
    }
}
