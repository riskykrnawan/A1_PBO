/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest6;

/**
 *
 * @author Lenovo-PC
 */
public class KapalTongkang extends Kapal implements KapalPengangkut{
    private int beratMuatan;
    KapalTongkang(String nama, 
            String jenis, 
            String warna, 
            String tanggalPembuatan, 
            String kapasitasMaksimum, 
            int biayaPembuatan, 
            int beratMuatan) {
        super(nama, 
                jenis, 
                warna, 
                tanggalPembuatan, 
                kapasitasMaksimum, 
                biayaPembuatan
        );
        this.beratMuatan = beratMuatan;
    }
    
    public int getBeratMuatan() {
        return this.beratMuatan;
    }
    
    public void setBeratMuatan(int beratMuatan) {
        this.beratMuatan = beratMuatan;
    }
    
    public final String angkutMuatan () {
        return "Kapal tongkang sedang mengangkut muatan";
    }
    public final String angkutMuatan (int beratMuatan) {
        return "Kapal tongkang sedang mengangkut muatan batu bara sebanyak " + beratMuatan + " ton";
    }
    public final String turunMuatan () {
        return "Kapal tongkang sedang menurunkan muatan";
    }
}
