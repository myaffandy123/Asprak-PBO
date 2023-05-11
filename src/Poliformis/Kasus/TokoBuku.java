package Poliformis.Kasus;

public class TokoBuku {

    private String namaToko;
    private String lokasi;
    private Buku[] listbuku;
    private int totalBuku;
    private int totalHarga;

    public TokoBuku(String namaToko, String lokasi) {
        this.namaToko = namaToko;
        this.lokasi = lokasi;
        listbuku = new Buku[10];
    }

    public void tambahBuku(Buku buku) {
        for (int i = 0; i < listbuku.length; i++) {
            if (listbuku[i] == null) {
                listbuku[i] = buku;
                totalBuku += buku.getStok();
                totalHarga += buku.getHarga() * buku.getStok();
                return;
            }
        }
    }

    public void jualBuku(String namaPembeli, String judul, int jumlah) {
        boolean ada = false;
        for (int i = 0; i < listbuku.length; i++) {
            if (listbuku[i] != null && listbuku[i].getJudul().equalsIgnoreCase(judul)) {
                Buku bukuJual = listbuku[i];
                ada = true;
                if (bukuJual.getStok() >= jumlah) {
                    System.out.println(namaPembeli + " membeli buku " + bukuJual.getJudul());
                    System.out.println("Berjumlah " + jumlah);
                    totalBuku -= jumlah;
                    totalHarga -= jumlah * bukuJual.getHarga();
                    bukuJual.kurangiStok(jumlah);
                } else {
                    System.out.println("Buku " + judul + " kekurangan stok");
                }
                return;
            }
        }
        if (!ada) {
            System.out.println("Buku tidak ditemukan");
        }
    }

    public void printData() {
        System.out.println("=================================");
        System.out.println("Nama Toko : " + namaToko);
        System.out.println("Lokasi Toko : " + lokasi);
        System.out.println("Total Buku : " + totalBuku);
        System.out.println("Total Harga : " + totalHarga);
        System.out.println("================================");
        System.out.println("List Buku :");
        for (int i = 0; i < listbuku.length; i++) {
            if (listbuku[i] != null) {
                listbuku[i].printBuku();
                System.out.println("================================");
            }
        }
        // System.out.println("================================");
    }
}
