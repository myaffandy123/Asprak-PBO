package StaticFinal;

public class MainStaticFinal {

    static int n = 10;

    public static void main(String[] args) {
        int n = 20;
        Mahasiswa a = new Mahasiswa("Iqbal", "Laki-laki", "11111", "TIF");
        Mahasiswa b = new Mahasiswa("Yusuf", "Laki-laki", "22222", "TEKKOM");
        Mahasiswa c = new Mahasiswa("Fandy", "Laki-laki", "33333", "SI");

        Manusia.tesFinal();
    }

    public static void tambahStatic(int a, int b) {
        System.out.println(a + b);
    }

    public void tambah(int a, int b) {
        System.out.println(a + b);
    }
}
