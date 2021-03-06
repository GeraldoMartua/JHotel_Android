package test.jhotel_android_geraldomartua;

public class Hotel {
    private int id;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    public Hotel(String nama, Lokasi lokasi, int bintang, int id){
        this.nama=nama;
        this.lokasi=lokasi;
        this.bintang=bintang;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public Lokasi getLokasi() {
        return lokasi;
    }

    public int getBintang() {
        return bintang;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }

    public void setBintang(int bintang) {
        this.bintang = bintang;
    }
}
