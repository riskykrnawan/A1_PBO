package Posttest4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void template(String str) {
        System.out.println("1. LIHAT DATA " + str);
        System.out.println("2. TAMBAH DATA " + str);
        System.out.println("3. UBAH DATA " + str);
        System.out.println("4. HAPUS DATA " + str);
    }

//  Karyawan
    static String mapKaryawan(Karyawan n, int i) {
        i+=1;
        return
            """      
            [""" + i + "]"  + "\n" +
            "ID      : " + n.getId() + "\n" +
            "Nama    : " + n.getNama() + "\n" +
            "Alamat  : " + n.getAlamat() + "\n" +
            "Jabatan : " + n.getJabatan() + "\n" +
            "No Telp : " + n.getNoTelp() + "\n" +
            "Gaji    : " + n.getGaji() + "\n";
    }

    static void fetchKaryawan(ArrayList<Karyawan> dataKaryawan) {
        if (dataKaryawan.isEmpty()) {
            System.out.println("DATA KOSONG!");
        }
        for (int i = 0; i < dataKaryawan.size(); i++) {
            System.out.println(
                    mapKaryawan(dataKaryawan.get(i), i)
            );
        }
    }

    static Karyawan addKaryawan() {
        String nama, alamat, jabatan, noTelp;
        int gaji;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukkan Nama    : ");
        nama = myObj.nextLine();
        System.out.print("Masukkan Alamat  : ");
        alamat = myObj.nextLine();
        System.out.print("Masukkan Jabatan : ");
        jabatan = myObj.nextLine();
        System.out.print("Masukkan No Telp : ");
        noTelp = myObj.nextLine();
        System.out.print("Masukkan Gaji    : ");
        gaji = myObj.nextInt();
        return new Karyawan(nama, alamat, jabatan, noTelp, gaji);
    }

//  Kapal
    static String mapKapal(Kapal n, int i) {
        i+=1;
        return
            """

            [""" + i + "]"  + "\n" +
            "ID                 : " + n.getId() + "\n" +
            "Nama               : " + n.getNama() + "\n" +
            "Jenis              : " + n.getJenis() + "\n" +
            "Warna              : " + n.getWarna() + "\n" +
            "Tanggal Pembuatan  : " + n.getTanggalPembuatan() + "\n" +
            "Kapasitas Maksimum : " + n.getKapasitasMaksimum() + "\n" +
            "Biaya Pembuatan    : " + n.getBiayaPembuatan() + "\n";
    }

    static void fetchKapal(ArrayList<Kapal> dataKapal) {
        if (dataKapal.isEmpty()) {
            System.out.println("DATA KOSONG!");
        }
        for (int i = 0; i < dataKapal.size(); i++) {
            System.out.println(
                    mapKapal(dataKapal.get(i), i)
            );
        }
    }

    static Kapal addKapal() {
        String nama, jenis, warna, tanggalPembuatan, kapasitasMaksimum;
        int biayaPembuatan;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukkan Nama               : ");
        nama = myObj.nextLine();
        System.out.print("Masukkan Jenis              : ");
        jenis = myObj.nextLine();
        System.out.print("Masukkan Warna              : ");
        warna = myObj.nextLine();
        System.out.print("Masukkan Tanggal Pembuatan  : ");
        tanggalPembuatan = myObj.nextLine();
        System.out.print("Masukkan Kapasitas Maksimum : ");
        kapasitasMaksimum = myObj.nextLine();
        System.out.print("Masukkan Biaya Pembuatan    : ");
        biayaPembuatan = myObj.nextInt();
        return new Kapal(nama, jenis, warna, tanggalPembuatan, kapasitasMaksimum, biayaPembuatan);
    }
        
//  KapalTanker
    static String mapKapalTanker(KapalTanker n, int i) {
        i+=1;
        return
            """

            [""" + i + "]"  + "\n" +
            "ID                 : " + n.getId() + "\n" +
            "Nama               : " + n.getNama() + "\n" +
            "Jenis              : " + n.getJenis() + "\n" +
            "Warna              : " + n.getWarna() + "\n" +
            "Tanggal Pembuatan  : " + n.getTanggalPembuatan() + "\n" +
            "Kapasitas Maksimum : " + n.getKapasitasMaksimum() + "\n" +
            "Biaya Pembuatan    : " + n.getBiayaPembuatan() + "\n" +
            "Berat Muatan       : " + n.getBeratMuatan() + "\n";
    }

    static void fetchKapalTanker(ArrayList<KapalTanker> dataKapalTanker) {
        if (dataKapalTanker.isEmpty()) {
            System.out.println("DATA KOSONG!\n");
        }
        for (int i = 0; i < dataKapalTanker.size(); i++) {
            System.out.println(
                    mapKapal(dataKapalTanker.get(i), i)
            );
        }
    }

    static KapalTanker addKapalTanker() {
        String nama, warna, tanggalPembuatan, kapasitasMaksimum;
        int biayaPembuatan, beratMuatan;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukkan Nama               : ");
        nama = myObj.nextLine();
        System.out.print("Masukkan Warna              : ");
        warna = myObj.nextLine();
        System.out.print("Masukkan Tanggal Pembuatan  : ");
        tanggalPembuatan = myObj.nextLine();
        System.out.print("Masukkan Kapasitas Maksimum : ");
        kapasitasMaksimum = myObj.nextLine();
        System.out.print("Masukkan Biaya Pembuatan    : ");
        biayaPembuatan = myObj.nextInt();
        System.out.print("Masukkan Berat Muatan    : ");
        beratMuatan = myObj.nextInt();
        return new KapalTanker(nama, "Kapal Tanker", warna, tanggalPembuatan, kapasitasMaksimum, biayaPembuatan, beratMuatan);
    }
        
//  KapalTongkang
    static String mapKapalTongkang(KapalTongkang n, int i) {
        i+=1;
        return
            """

            [""" + i + "]"  + "\n" +
            "ID                 : " + n.getId() + "\n" +
            "Nama               : " + n.getNama() + "\n" +
            "Jenis              : " + n.getJenis() + "\n" +
            "Warna              : " + n.getWarna() + "\n" +
            "Tanggal Pembuatan  : " + n.getTanggalPembuatan() + "\n" +
            "Kapasitas Maksimum : " + n.getKapasitasMaksimum() + "\n" +
            "Biaya Pembuatan    : " + n.getBiayaPembuatan() + "\n" +
            "Berat Muatan       : " + n.getBeratMuatan() + "\n";
    }

    static void fetchKapalTongkang(ArrayList<KapalTongkang> dataKapalTongkang) {
        if (dataKapalTongkang.isEmpty()) {
            System.out.println("DATA KOSONG!\n");
        }
        for (int i = 0; i < dataKapalTongkang.size(); i++) {
            System.out.println(
                    mapKapal(dataKapalTongkang.get(i), i)
            );
        }
    }

    static KapalTongkang addKapalTongkang() {
        String nama, warna, tanggalPembuatan, kapasitasMaksimum;
        int biayaPembuatan, beratMuatan;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukkan Nama               : ");
        nama = myObj.nextLine();
        System.out.print("Masukkan Warna              : ");
        warna = myObj.nextLine();
        System.out.print("Masukkan Tanggal Pembuatan  : ");
        tanggalPembuatan = myObj.nextLine();
        System.out.print("Masukkan Kapasitas Maksimum : ");
        kapasitasMaksimum = myObj.nextLine();
        System.out.print("Masukkan Biaya Pembuatan    : ");
        biayaPembuatan = myObj.nextInt();
        System.out.print("Masukkan Berat Muatan    : ");
        beratMuatan = myObj.nextInt();
        return new KapalTongkang(nama, "Kapal Tongkang", warna, tanggalPembuatan, kapasitasMaksimum, biayaPembuatan, beratMuatan);
    }
    
//  Gudang
    static String mapGudang(Gudang n, int i) {
        i+=1;
        return
            """
            
            [""" + i + "]"  + "\n" +
            "ID      : " + n.getId() + "\n" +
            "Nama    : " + n.getNama() + "\n" +
            "Alamat  : " + n.getAlamat() + "\n";
    }
    
    static void fetchGudang(ArrayList<Gudang> dataGudang) {
        if (dataGudang.isEmpty()) {
            System.out.println("DATA KOSONG!");
        }
        for (int i = 0; i < dataGudang.size(); i++) {
            System.out.println(
                mapGudang(dataGudang.get(i), i)
            );
        }
    }
    static Gudang addGudang() {
        String nama, alamat;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukkan Nama    : ");
        nama = myObj.nextLine();
        System.out.print("Masukkan Alamat  : ");
        alamat = myObj.nextLine();
        return new Gudang(nama, alamat);
    }
    
//  Supplier
    static String mapSupplier(Supplier n, int i) {
        i+=1;
        return
            """
            
            [""" + i + "]"  + "\n" +
            "ID          : " + n.getId() + "\n" +
            "Nama        : " + n.getNama() + "\n" +
            "Alamat      : " + n.getAlamat() + "\n" +
            "No Telepon  : " + n.getNoTelepon() + "\n" + 
            "Email       : " + n.getEmail() + "\n" ;
    }
    
    static void fetchSupplier(ArrayList<Supplier> dataSupplier) {
        if (dataSupplier.isEmpty()) {
            System.out.println("DATA KOSONG!");
        }
        for (int i = 0; i < dataSupplier.size(); i++) {
            System.out.println(
                mapSupplier(dataSupplier.get(i), i)
            );
        }
    }
    
    static Supplier addSupplier() {
        String nama, alamat, noTelp, email;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukkan Nama    : ");
        nama = myObj.nextLine();
        System.out.print("Masukkan Alamat  : ");
        alamat = myObj.nextLine();
        System.out.print("Masukkan No Telp : ");
        noTelp = myObj.nextLine();
        System.out.print("Masukkan Email    : ");
        email = myObj.nextLine();
        return new Supplier(nama, alamat, noTelp, email);
    }

//  Pembeli
    static String mapPembeli(Pembeli n, int i) {
        i+=1;
        return
            """
            
            [""" + i + "]"  + "\n" +
            "ID      : " + n.getId() + "\n" +
            "Nama    : " + n.getNama() + "\n" +
            "Alamat  : " + n.getAlamat() + "\n" +
            "No Telp : " + n.getNoTelp() + "\n" +
            "Gaji    : " + n.getEmail() + "\n";
    }

    static void fetchPembeli(ArrayList<Pembeli> dataPembeli) {
        if (dataPembeli.isEmpty()) {
            System.out.println("DATA KOSONG!");
        }
        for (int i = 0; i < dataPembeli.size(); i++) {
            System.out.println(
                    mapPembeli(dataPembeli.get(i), i)
            );
        }
    }

    static Pembeli addPembeli() {
        String nama, alamat, noTelp, email;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukkan Nama    : ");
        nama = myObj.nextLine();
        System.out.print("Masukkan Alamat  : ");
        alamat = myObj.nextLine();
        System.out.print("Masukkan No Telp : ");
        noTelp = myObj.nextLine();
        System.out.print("Masukkan Email    : ");
        email = myObj.nextLine();
        return new Pembeli(nama, alamat, noTelp, email);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // arrayList
        ArrayList<Karyawan> dataKaryawan = new ArrayList<>();
        ArrayList<Kapal> dataKapal = new ArrayList<>();
        ArrayList<KapalTanker> dataKapalTanker = new ArrayList<>();
        ArrayList<KapalTongkang> dataKapalTongkang = new ArrayList<>();
        ArrayList<Pembeli> dataPembeli = new ArrayList<>();
        ArrayList<Gudang> dataGudang = new ArrayList<>();
        ArrayList<Supplier> dataSupplier = new ArrayList<>();

        // default element
        Karyawan risky = new Karyawan(
            "Risky Kurniawan",
            "Sebulu, Kutai Kartanegara",
            "Manajer",
            "082158317722",
            1000
        );
        dataKaryawan.add(risky);

        Kapal sumberRisky = new Kapal(
            "Sumber Risky",
            "Pesiar",
            "Oranye",
            "22-12-2021",
            "15ton",
            200000
        );
        dataKapal.add(sumberRisky);

        Pembeli riskyKurniawan = new Pembeli(
            "Risky Kurniawan",
            "Sebulu, Kutai Kartanegara 75552",
            "082158317722",
            "riskykrnawan@gmail.com"
        );
        dataPembeli.add(riskyKurniawan);

        boolean repeat = true;
        String pil, pil2, pil3, pil4;

        while(repeat) {
            System.out.println("===== GALANGAN KAPAL PT. RISKY SEJAHTERA =====");
            System.out.println("1. DATA KARYAWAN");
            System.out.println("2. DATA KAPAL");
            System.out.println("3. DATA GUDANG");
            System.out.println("4. DATA SUPPLIER");
            System.out.println("5. DATA PEMBELI");
            System.out.println("6. EXIT");
            System.out.println("==============================================");
            System.out.print("Masukkan Pilihan: ");
            
            pil = myObj.nextLine();
            
            switch (pil) {
                case "1" -> {
                    template("KARYAWAN");
                    System.out.print("Masukkan Pilihan: ");
                    pil2 = myObj.nextLine();
                    System.out.println("\n");
                    switch (pil2) {
                        case "1" -> fetchKaryawan(dataKaryawan);
                        case "2" -> dataKaryawan.add(addKaryawan());
                        case "3" -> {
                            fetchKaryawan(dataKaryawan);
                            System.out.print("Masukkan Index Karyawan Yang ingin anda ubah:");
                            pil3 = myObj.nextLine();
                            dataKaryawan.set(Integer.parseInt(pil3) - 1, addKaryawan());
                    }
                        case "4" -> {
                            fetchKaryawan(dataKaryawan);
                            System.out.print("Masukkan Index Karyawan Yang ingin anda hapus:");
                            pil3 = myObj.nextLine();
                            dataKaryawan.remove(Integer.parseInt(pil3) - 1);
                    }
                        default -> System.out.println("Mohon maaf, Input anda salah!");
                    }
                }
                case "2" -> {
                    template("KAPAL");
                    System.out.print("Masukkan Pilihan: ");
                    pil2 = myObj.nextLine();
                    System.out.println("\n");
                    switch (pil2) {
                        case "1" -> {
                            System.out.println("--- Kapal Tanker ---");
                            fetchKapalTanker(dataKapalTanker);
                            System.out.println("--- Kapal Tongkang ---");
                            fetchKapalTongkang(dataKapalTongkang);
                            System.out.println("--- Kapal Lainnya ---");
                            fetchKapal(dataKapal);
                        }
                        case "2" -> {
                            System.out.println("Jenis Kapal yang akan dimasukkan: ");
                            System.out.println("1. Kapal Tanker");
                            System.out.println("2. Kapal Tongkang");
                            System.out.println("3. Kapal Lainnya");
                            System.out.print("Masukkan Pilihan: ");
                            pil3 = myObj.nextLine();
                            switch (pil3) {
                                case "1" -> dataKapalTanker.add(addKapalTanker());
                                case "2" -> dataKapalTongkang.add(addKapalTongkang());
                                default -> dataKapal.add(addKapal());                            
                            }                            
                        }
                        case "3" -> {
                            System.out.println("Jenis Kapal yang akan diubah: ");
                            System.out.println("1. Kapal Tanker");
                            System.out.println("2. Kapal Tongkang");
                            System.out.println("3. Kapal Lainnya");
                            System.out.print("Masukkan Pilihan: ");
                            pil3 = myObj.nextLine();
                            switch (pil3) {
                                case "1" -> {
                                    System.out.println("--- Kapal Tanker ---");
                                    fetchKapalTanker(dataKapalTanker);
                                    System.out.print("Masukkan Index Kapal Yang ingin anda ubah:");
                                    pil4 = myObj.nextLine();
                                    dataKapalTanker.set(Integer.parseInt(pil4) - 1, addKapalTanker());
                                }
                                case "2" -> {
                                    System.out.println("--- Kapal Tongkang ---");
                                    fetchKapalTongkang(dataKapalTongkang);
                                    System.out.print("Masukkan Index Kapal Yang ingin anda ubah:");
                                    pil4 = myObj.nextLine();
                                    dataKapalTongkang.set(Integer.parseInt(pil4) - 1, addKapalTongkang());
                                }
                                case "3" -> {
                                    System.out.println("--- Kapal Lainnya ---");
                                    fetchKapal(dataKapal);
                                    System.out.print("Masukkan Index Kapal Yang ingin anda ubah:");
                                    pil4 = myObj.nextLine();
                                    dataKapal.set(Integer.parseInt(pil4) - 1, addKapal());
                                }
                            }
                        }
                        case "4" -> {
                            System.out.println("Jenis Kapal yang akan dihapus: ");
                            System.out.println("1. Kapal Tanker");
                            System.out.println("2. Kapal Tongkang");
                            System.out.println("3. Kapal Lainnya");
                            System.out.print("Masukkan Pilihan: ");
                            pil3 = myObj.nextLine();
                            switch (pil3) {
                                case "1" -> {
                                    System.out.println("--- Kapal Tanker ---");
                                    fetchKapalTanker(dataKapalTanker);
                                    System.out.print("Masukkan Index Kapal Yang ingin anda HAPUS:");
                                    pil4 = myObj.nextLine();
                                    dataKapalTanker.remove(Integer.parseInt(pil4) - 1);
                                }
                                case "2" -> {
                                    System.out.println("--- Kapal Tongkang ---");
                                    fetchKapalTongkang(dataKapalTongkang);
                                    System.out.print("Masukkan Index Kapal Yang ingin anda HAPUS:");
                                    pil4 = myObj.nextLine();
                                    dataKapalTongkang.remove(Integer.parseInt(pil4) - 1);
                                }
                                case "3" -> {
                                    System.out.println("--- Kapal Lainnya ---");
                                    fetchKapal(dataKapal);
                                    System.out.print("Masukkan Index Kapal Yang ingin anda HAPUS:");
                                    pil4 = myObj.nextLine();
                                    dataKapal.remove(Integer.parseInt(pil4) - 1);
                                }
                            }
                        }
                        default -> System.out.println("Mohon maaf, Input anda salah!");
                    }
                }
                case "3" -> {
                    template("GUDANG");
                    System.out.print("Masukkan Pilihan: ");
                    pil2 = myObj.nextLine();
                    System.out.println("\n");
                    switch (pil2) {
                        case "1" -> fetchGudang(dataGudang);
                        case "2" -> dataGudang.add(addGudang());
                        case "3" -> {
                            fetchGudang(dataGudang);
                            System.out.print("Masukkan Index Supplier Yang ingin anda ubah:");
                            pil3 = myObj.nextLine();
                            dataGudang.set(Integer.parseInt(pil3) - 1, addGudang());
                        }
                        case "4" -> {
                            fetchGudang(dataGudang);
                            System.out.print("Masukkan Index Supplier Yang ingin anda hapus:");
                            pil3 = myObj.nextLine();
                            dataGudang.remove(Integer.parseInt(pil3) - 1);
                        }
                        default -> System.out.println("Mohon maaf, Input anda salah!");
                    }
                }

                case "4" -> {
                    template("SUPPLIER");
                    System.out.print("Masukkan Pilihan: ");
                    pil2 = myObj.nextLine();
                    System.out.println("\n");
                    switch (pil2) {
                        case "1" -> fetchSupplier(dataSupplier);
                        case "2" -> dataSupplier.add(addSupplier());
                        case "3" -> {
                            fetchSupplier(dataSupplier);
                            System.out.print("Masukkan Index Supplier Yang ingin anda ubah:");
                            pil3 = myObj.nextLine();
                            dataSupplier.set(Integer.parseInt(pil3) - 1, addSupplier());
                        }
                        case "4" -> {
                            fetchSupplier(dataSupplier);
                            System.out.print("Masukkan Index Supplier Yang ingin anda hapus:");
                            pil3 = myObj.nextLine();
                            dataSupplier.remove(Integer.parseInt(pil3) - 1);
                        }
                        default -> System.out.println("Mohon maaf, Input anda salah!");
                    }
                }

                case "5" -> {
                    template("PEMBELI");
                    System.out.print("Masukkan Pilihan: ");
                    pil2 = myObj.nextLine();
                    System.out.println("\n");
                    switch (pil2) {
                        case "1" -> fetchPembeli(dataPembeli);
                        case "2" -> dataPembeli.add(addPembeli());
                        case "3" -> {
                            fetchPembeli(dataPembeli);
                            System.out.print("Masukkan Index Kapal Yang ingin anda ubah:");
                            pil3 = myObj.nextLine();
                            dataPembeli.set(Integer.parseInt(pil3) - 1, addPembeli());
                        }
                        case "4" -> {
                            fetchPembeli(dataPembeli);
                            System.out.print("Masukkan Index Kapal Yang ingin anda hapus:");
                            pil3 = myObj.nextLine();
                            dataPembeli.remove(Integer.parseInt(pil3) - 1);
                        }
                        default -> System.out.println("Mohon maaf, Input anda salah!");
                    }
                }

                case "6" -> repeat = false;
                default -> System.out.println("Mohon maaf, Input anda salah!");
            }
        }
    }
}
