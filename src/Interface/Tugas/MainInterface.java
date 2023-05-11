package Interface.Tugas;

public class MainInterface {
    
    public static void main(String[] args) {
        Lingkaran li1 = new Lingkaran("Lingkaran OA", 7);
        Lingkaran li2 = new Lingkaran("Lingkaran OB", 7);
        Lingkaran li3 = new Lingkaran("Lingkaran OC", 7);

        PersegiPanjang pp1 = new PersegiPanjang("Persegi Panjang ABCD", 10, 2);
        PersegiPanjang pp2 = new PersegiPanjang("Persegi Panjang EFGH", 5, 4);

        Segitiga se1 = new Segitiga("Segitiga ABC", 10, 5);
        Segitiga se2 = new Segitiga("Segitiga ABC", 12, 5);

        Trapesium tra1 = new Trapesium("Trapesium STUV", 10, 15, 5);

        Layang la1 = new Layang("Layang-layang HIJK", 10, 5, 6, 10);

        BangunDatar.printSemuaInfo();
        
        BangunDatar.printDetailBangunDatar();
    }
}
