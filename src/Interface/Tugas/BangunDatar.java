package Interface.Tugas;

public abstract class BangunDatar implements Hitung {

    private String nama;

    private static BangunDatar[] listBangunDatar = new BangunDatar[10];
    private static int jumlahBangunDatar = 0;

    public BangunDatar(String nama) {
        this.nama = nama;
        listBangunDatar[jumlahBangunDatar] = this;
        jumlahBangunDatar++;
    }

    public abstract void print();

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static int getJumlahBangunDatar() {
        return jumlahBangunDatar;
    }

    public static void printJumlahBangunDatar() {
        System.out.printf("%-25s : %d\n", "Jumlah bangun datar", jumlahBangunDatar);
    }

    public static void printDetailBangunDatar() {
        for (int i = 0; i < listBangunDatar.length; i++) {
            if (listBangunDatar[i] != null) {
                listBangunDatar[i].print();
            } else {
                break;
            }
        }
    }

    public static void printSemuaInfo() {
        System.out.println("==============================================");
        printJumlahBangunDatar();
        Lingkaran.printJumlahLingkaran();
        PersegiPanjang.printJumlahPersegiPanjang();
        Layang.printJumlahLayang();
        Trapesium.printJumlahTrapesium();
        
        System.out.println("==============================================");
        System.out.println("Nama-nama bangun datar :");
        for (int i = 0; i < listBangunDatar.length; i++) {
            if (listBangunDatar[i] != null) {
                System.out.println("  " + (i+1) + ". " + listBangunDatar[i].nama);
            } else {
                break;
            }
        }
    }
}
