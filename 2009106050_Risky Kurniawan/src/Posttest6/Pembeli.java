package Posttest6;
import java.util.UUID;

public class Pembeli {
    private String nama, alamat, noTelp, email;
    private final UUID uuid = UUID.randomUUID();
    private final String id = "Pembeli-" + uuid.toString();

    Pembeli(
            String nama,
            String alamat,
            String noTelp,
            String email
    ) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
    }
    public String pembeliTertarik(){
        return "Pembelii tertarik membeli sebuah kapal";
    }
    public String pembeliTidakTertarik(){
        return "Pembelii tidak tertarik membeli sebuah kapal";
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
    public String getNoTelp(){
        return noTelp;
    }
    public String getEmail() { return email; }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
