
package Posttest4;

import java.util.UUID;

public class Gudang {
    private String nama, alamat;
    private final UUID uuid = UUID.randomUUID();
    private final String id = "Gudang-" + uuid.toString();

    // constructor
    public Gudang(
        String nama,
        String alamat
    ){
        this.nama = nama;
        this.alamat = alamat;
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
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
