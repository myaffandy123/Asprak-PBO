package UTP;

public class Perusahaan {
    
    private String nama;
    private String lokasi;
    private Manager manager;
    private Karyawan[] listKaryawan;
    private Proyek[] listProyek;
    private int jumlahKaryawan;
    private int jumlahProyek;

    public Perusahaan(String nama, String lokasi) {
        this.nama = nama;
        this.lokasi = lokasi;
        listKaryawan = new Karyawan[50];
        listProyek = new Proyek[10];
        jumlahKaryawan = 0;
        jumlahProyek = 0;
    }

    public void sewaManager(Manager manager) {
        System.out.println("!!! SEWA MANAGER !!!");
        if (this.manager == null) {
            System.out.println("Berhasil menyewa manager " + manager.getNama());
        } else {
            System.out.println("Manager " + this.manager.getNama() + " digantikan oleh " + manager.getNama());
        }
        this.manager = manager;
        System.out.println();
    }
    
    public void pecatManager() {
        System.out.println("!!! PECAT MANAGER !!!");
        if (manager == null) {
            System.out.println("Tidak ada manager yang bisa dipecat");
        } else {
            System.out.println("Berhasil memecat manager " + manager.getNama());
            manager = null;
        }
        System.out.println();
    }
    
    public void rekrutKaryawan(Karyawan karyawan) {
        System.out.println("!!! REKRUT KARYAWAN !!!");
        if (manager != null) {
            System.out.println("Manager " + manager.getNama() + " merekrut karyawan bernama " + karyawan.getNama());
            listKaryawan[jumlahKaryawan] = karyawan;
            jumlahKaryawan++;
        } else {
            System.out.println("Tidak dapat merekrut karyawan karena tidak ada manager");
        }
        System.out.println();
    }
    
    public void pecatKaryawan(String nama) {
        System.out.println("!!! PECAT KARYAWAN !!!");
        for (Karyawan karyawan : listKaryawan) {
            if (karyawan != null && karyawan.getNama().equalsIgnoreCase(nama)) {
                System.out.println("Karyawan " + karyawan.getNama() + " telah dipecat oleh " + manager.getNama());
                System.out.println();
                karyawan = null;
                jumlahKaryawan--;
                return;
            }
        }
        System.out.println("Tidak ada karyawan yang dipecat");
        System.out.println();
    }
    
    public void tambahProyek(Proyek proyek) {
        System.out.println("!!! TAMBAH PROYEK !!!");
        if (manager == null) {

        }
        for (int i = 0; i < this.listProyek.length; i++) {
            if (this.listProyek[i] == null) {
                System.out.println("Manager " + manager.getNama() + " menambah proyek " + proyek.getNama());
                this.listProyek[i] = proyek;
                jumlahProyek++;
                System.out.println();
                return;
            }
        }
        System.out.println();
    }
    
    public void tugaskanProyek(String namaProyek, String namaKaryawan) {
        System.out.println("!!! TUGASKAN PROYEK !!!");
        if (manager == null) {
            System.out.println("Tidak dapat menugaskan proyek karena tidak ada manager");
            System.out.println();
            return;
        }
        Proyek proyekTemp = null;
        for (Proyek proyek : listProyek) {
            if (proyek != null && proyek.getNama().equalsIgnoreCase(namaProyek)) {
                proyekTemp = proyek;
                break;
            }
        }
        if (proyekTemp == null) {
            System.out.println("Proyek tidak ditemukan");
            System.out.println();
            return;
        }
        for (Karyawan karyawan : listKaryawan) {
            if (karyawan != null && karyawan.getNama().equalsIgnoreCase(namaKaryawan)) {
                System.out.println("Manager " + manager.getNama() + " menugaskan proyek " + proyekTemp.getNama() + " ke karyawan " + karyawan.getNama());
                System.out.println();
                karyawan.setProyek(proyekTemp);
                return;
            }
        }
        System.out.println("Karyawan tidak ditemukan");
        System.out.println();
    }

    public void printDataPerusahaan() {
        System.out.println("===========================================");
        System.out.println("            DETAIL PERUSAHAAN");
        System.out.println("===========================================");
        System.out.println("Nama Perusahaan     : " + nama);
        System.out.println("Lokasi Perusahaan   : " + lokasi);
        System.out.println("Nama Manager        : " + manager.getNama());
        System.out.println("Jumlah Karyawan     : " + jumlahKaryawan);
        System.out.println("Jumlah Proyek       : " + jumlahProyek);
        System.out.println("===========================================");
        System.out.println();
    }
    
    public void printSemuaKaryawan() {
        System.out.println("===========================================");
        System.out.println("            DETAIL MANAGER");
        System.out.println("===========================================");
        manager.print();
        System.out.println("===========================================");
        System.out.println("            DETAIL KARYAWAN");
        System.out.println("===========================================");
        for (Karyawan karyawan : listKaryawan) {
            if (karyawan != null) {
                karyawan.print();
                System.out.println("===========================================");
            }
        }
        System.out.println();
    }

    public void printSemuaProyek() {
        System.out.println("===========================================");
        System.out.println("            DETAIL PROYEK");
        System.out.println("===========================================");
        for (Proyek proyek : listProyek) {
            if (proyek != null) {
                proyek.print();
                System.out.println("===========================================");
            }
        }
        System.out.println();
    }
}
