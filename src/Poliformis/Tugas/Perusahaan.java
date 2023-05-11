package Poliformis.Tugas;

public class Perusahaan {
    
    private String nama;
    private String lokasi;
    private Karyawan[] listKaryawan;
    private int jumlahKaryawan;
    private int jumlahGaji;

    public Perusahaan(String nama, String lokasi) {
        this.nama = nama;
        this.lokasi = lokasi;
        listKaryawan = new Karyawan[10];
        jumlahKaryawan = 0;
        jumlahGaji = 0;
    }

    public void tambahKaryawan(Karyawan karyawan) {
        listKaryawan[jumlahKaryawan] = karyawan;
        jumlahKaryawan++;
        jumlahGaji += karyawan.getGaji();
    }

    public void printDataPerusahaan() {
        System.out.println("         DETAIL PERUSAHAAN");
        System.out.println("=====================================");
        System.out.println("Nama Perusahaan     : " + nama);
        System.out.println("Lokasi Perusahaan   : " + lokasi);
        System.out.println("Jumlah Karyawan     : " + jumlahKaryawan);
        System.out.println("Nama-nama Karyawan  : ");
        for (int i = 0; i < listKaryawan.length; i++) {
            if (listKaryawan[i] != null) {
                System.out.println("  " + (i + 1) + ". " + listKaryawan[i].getNama());
            }
        }
        System.out.println("Jumlah Gaji         : Rp" + jumlahGaji);
        System.out.println("=====================================");
    }

    public void printDetailKaryawan() {
        System.out.println("         DETAIL KARYAWAN");
        System.out.println("=====================================");
        for (Karyawan karyawan : listKaryawan) {
            if (karyawan != null) {
                karyawan.print();
                System.out.println("=====================================");
            }
        }
    }
}
