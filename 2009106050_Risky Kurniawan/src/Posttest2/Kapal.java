package posttest2;

import java.util.UUID;

public class Kapal {
    private String nama, jenis, warna, tanggalPembuatan, kapasitasMaksimum;
    private int biayaPembuatan, hargaJual;
    private final UUID uuid = UUID.randomUUID();
    private final String id = "Kapal-" + uuid.toString();

    // constructor
    public Kapal(
        String nama,
        String jenis,
        String warna,
        String tanggalPembuatan,
        String kapasitasMaksimum,
        int biayaPembuatan,
        int hargaJual
    ) {
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
        this.tanggalPembuatan = tanggalPembuatan;
        this.kapasitasMaksimum = kapasitasMaksimum;
        this.biayaPembuatan = biayaPembuatan;
        this.hargaJual = hargaJual;
    }

    public String getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public String getJenis() {
        return jenis;
    }
    public String getWarna() {
        return warna;
    }
    public String getTanggalPembuatan() {
        return tanggalPembuatan;
    }
    public String getKapasitasMaksimum() {
        return kapasitasMaksimum;
    }
    public int getBiayaPembuatan() {
        return biayaPembuatan;
    }
    public int getHargaJual() {
        return hargaJual;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void setTanggalPembuatan(String tanggalPembuatan) {
        this.tanggalPembuatan = tanggalPembuatan;
    }
    public void setKapasitasMaksimum(String kapasitasMaksimum) {
        this.kapasitasMaksimum = kapasitasMaksimum;
    }
    public void setBiayaPembuatan(int biayaPembuatan) {
        this.biayaPembuatan = biayaPembuatan;
    }
    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }
}
