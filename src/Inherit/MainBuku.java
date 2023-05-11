package Inherit;

import Inherit.Kasus.*;

public class MainBuku {

    public static void main(String[] args) {
        Buku buku1 = new Buku("How to Cheat with ChatGPT", "Anonymous", "C-12-M", 2023);
        Kamus buku2 = new Kamus("Kamus BIN", "Nathan", "ID-20", 2020, "Indonesia", 100000);
        Komik buku3 = new Komik("Naruto", "Iqbal", "A-21-J", 2007, "Anime", 36000);
        Sejarah buku4 = new Sejarah("Majapahit", "Gajah Mada", "M-15-GM", 1999, "Kerajaan", "1500 - 1700");

        System.out.println("===========================================");
        buku1.print();
        System.out.println("===========================================");
        buku2.print();
        System.out.println("===========================================");
        buku3.print();
        System.out.println("===========================================");
        buku4.print();
        System.out.println("===========================================");
    }
}
