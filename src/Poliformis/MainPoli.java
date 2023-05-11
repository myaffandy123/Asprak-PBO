package Poliformis;

import Poliformis.Kasus.*;
import Poliformis.Tugas.*;

public class MainPoli {

    public static void main(String[] args) {
        TokoBuku toko = new TokoBuku("Trumper Store", "Surabaya");

        Kamus kamus = new Kamus();
        Komik komik = new Komik();
        Novel novel = new Novel();

        toko.tambahBuku(novel);
        toko.tambahBuku(komik);
        toko.tambahBuku(kamus);

        toko.printData();
        
        System.out.println();
        toko.jualBuku("Mas Iqbal", "Naruto", 5);
        System.out.println();
        toko.jualBuku("Mas Iqbal", "Naruto", 100);
        System.out.println();
        toko.jualBuku("Mas Iqbal", "One Piece", 1);
        System.out.println();


        toko.printData();
    }
}
