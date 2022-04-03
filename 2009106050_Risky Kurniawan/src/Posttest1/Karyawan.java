package Posttest1;

import java.util.UUID;

public class Karyawan {
    private String nama, alamat, jabatan, noTelp;
    private int gaji;
    private final UUID uuid = UUID.randomUUID();
    private final String id = "Karyawan-" + uuid.toString();

    // constructor
    public Karyawan(
            String nama,
            String alamat,
            String jabatan,
            String noTelp,
            int gaji
    ) {
        this.nama = nama;
        this.alamat = alamat;
        this.jabatan = jabatan;
        this.noTelp = noTelp;
        this.gaji = gaji;
    }

    public String getId(){
        return id;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getJabatan(){
        return jabatan;
    }
    public String getNoTelp(){
        return noTelp;
    }
    public int getGaji() { return gaji; }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
}
