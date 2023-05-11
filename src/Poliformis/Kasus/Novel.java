package Poliformis.Kasus;

public class Novel extends Buku {

    private String genre;
    private String ending;

    public Novel() {
        this("Langit", "Alan", 70000, 10, "Romance", "Good Ending");
    }

    public Novel(String judul, String penulis, int harga, int stok, String genre, String ending) {
        super(judul, penulis, harga, stok);
        this.genre = genre;
        this.ending = ending;
    }

    public void printBuku() {
        super.printBuku();
        System.out.println("Genre : " + genre);
        System.out.println("Ending : " + ending);
    }

    public String getGenre() {
        return genre;
    }

    public String getEnding() {
        return ending;
    }

}
