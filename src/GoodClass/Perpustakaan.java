package GoodClass;

public class Perpustakaan {
    
    private String nama;
    private String lokasi;
    private String rating;
    private int jumlahBuku;
    private String[] staff;
    private Buku[] buku;

    public Perpustakaan() {
        this("Trumpbry", "Florida", "4.8", 3, 10);
    }

    public Perpustakaan(String nama, String lokasi, String rating) {
        this(nama, lokasi, rating, 3, 10);
    }
    
    private Perpustakaan(String nama, String lokasi, String rating, int maxStaff, int maxBuku) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.rating = rating;
        this.jumlahBuku = 0;
        this.staff = new String[maxStaff];
        this.buku = new Buku[maxBuku];
    }
    
    public void printIdentitas() {
        System.out.printf("%-18s: %s\n", "Nama Perpustakaan", nama);
        System.out.printf("%-18s: %s\n", "Lokasi", lokasi);
        System.out.printf("%-18s: %s\n", "Rating", rating);
        System.out.printf("%-18s: %d\n", "Jumlah Buku", jumlahBuku);
    }
    
    public void printStaff() {
        System.out.println("Nama Staff :");
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null) {
                System.out.printf("%d. %s\n", i + 1, staff[i]);
            }
        }
    }
    
    public void printBuku() {
        for (int i = 0; i < buku.length; i++) {
            if (buku[i] != null) {
                System.out.println("Data Buku ke-" + (i + 1));
                System.out.printf(" - %-15s: %s\n", "Judul Buku", buku[i].judul);
                System.out.printf(" - %-15s: %s\n", "Penulis", buku[i].getPenulis());
                System.out.printf(" - %-15s: %s\n", "Tahun Terbit", buku[i].getTahunTerbit());
                System.out.printf(" - %-15s: %s\n", "kategori", buku[i].getKategori());
            }
        }
    }
    
    public void tambahBuku(Buku buku) {
        for (int i = 0; i < this.buku.length; i++) {
            if (this.buku[i] == null) {
                this.buku[i] = buku;
                jumlahBuku++;
                return;
            }
        }
    }

    public void tambahBuku(String judul, String penulis, String tahunTerbit, String kategori) {
        for (int i = 0; i < this.buku.length; i++) {
            if (this.buku[i] == null) {
                this.buku[i] = new Buku(judul, penulis, tahunTerbit, kategori);
                jumlahBuku++;
                return;
            }
        }
    }

    public void tambahStaff(String nama) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] == null) {
                staff[i] = nama;
                return;
            }
        }
    }

    public void printAll() {
        printIdentitas();
        printStaff();
        printBuku();
    }
}
