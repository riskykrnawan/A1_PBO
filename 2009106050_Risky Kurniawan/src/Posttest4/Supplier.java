
package Posttest4;

import java.util.UUID;

public class Supplier {
    private String nama, alamat, noTelepon, email;
    private final UUID uuid = UUID.randomUUID();
    private final String id = "Gudang-" + uuid.toString();
    
    public Supplier(
       String nama,
       String alamat,
       String noTelepon,
       String email
    ) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.email = email;
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
    public String getNoTelepon(){
        return noTelepon;
    }
    public String getEmail(){
        return email;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
