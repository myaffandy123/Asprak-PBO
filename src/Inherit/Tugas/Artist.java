package Inherit.Tugas;

public class Artist extends Karyawan {

    private String style;
    private String media;

    public Artist() {
        this("Jasmine", "22222", 18, 30000, "Anime", "Figma");
    }

    public Artist(String nama, String id, int usia, int gaji, String style, String media) {
        super(nama, id, usia, gaji, "Front-End");
        this.style = style;
        this.media = media;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Style          : " + style);
        System.out.println("Media          : " + media);
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

}
