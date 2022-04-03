package Posttest1;

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
            "\n" + "[" + i + "]"  + "\n" +
            "ID      : " + n.getId() + "\n" +
            "Nama    : " + n.getNama() + "\n" +
            "Alamat  : " + n.getAlamat() + "\n" +
            "Jabatan : " + n.getJabatan() + "\n" +
            "No Telp : " + n.getNoTelp() + "\n" +
            "Gaji    : " + n.getGaji() + "\n";
    }

    static void fetchKaryawan(ArrayList<Karyawan> dataKaryawan) {
        if (dataKaryawan.size() == 0) {
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
                "\n" + "[" + i + "]"  + "\n" +
                "ID                 : " + n.getId() + "\n" +
                "Nama               : " + n.getNama() + "\n" +
                "Jenis              : " + n.getJenis() + "\n" +
                "Warna              : " + n.getWarna() + "\n" +
                "Tanggal Pembuatan  : " + n.getTanggalPembuatan() + "\n" +
                "Kapasitas Maksimum : " + n.getKapasitasMaksimum() + "\n" +
                "Biaya Pembuatan    : " + n.getBiayaPembuatan() + "\n" +
                "Harga Jual         : " + n.getHargaJual() + "\n";
        }

        static void fetchKapal(ArrayList<Kapal> dataKapal) {
            if (dataKapal.size() == 0) {
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
            int biayaPembuatan, hargaJual;
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
            System.out.print("Masukkan Harga Jual         : ");
            hargaJual = myObj.nextInt();
            return new Kapal(nama, jenis, warna, tanggalPembuatan, kapasitasMaksimum, biayaPembuatan, hargaJual);
        }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // arrayList
        ArrayList<Karyawan> dataKaryawan = new ArrayList<>();
        ArrayList<Kapal> dataKapal = new ArrayList<>();

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
            "Kapal Minyak",
            "Oranye",
            "22-12-2021",
            "15ton",
            200000,
            250000
        );
        dataKapal.add(sumberRisky);

        boolean repeat = true;
        String pil, pil2, pil3;

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
                case "1":
                    template("KARYAWAN");
                    System.out.print("Masukkan Pilihan: ");
                    pil2 = myObj.nextLine();
                    System.out.println("\n");
                    switch (pil2) {
                        case "1":
                            fetchKaryawan(dataKaryawan);
                            break;
                        case "2":
                            dataKaryawan.add(addKaryawan());
                            break;
                        case "3":
                            fetchKaryawan(dataKaryawan);
                            System.out.print("Masukkan Index Karyawan Yang ingin anda ubah:");
                            pil3 = myObj.nextLine();
                            dataKaryawan.set(Integer.parseInt(pil3) - 1, addKaryawan());
                            break;
                        case "4":
                            fetchKaryawan(dataKaryawan);
                            System.out.print("Masukkan Index Karyawan Yang ingin anda hapus:");
                            pil3 = myObj.nextLine();
                            dataKaryawan.remove(Integer.parseInt(pil3) - 1);
                            break;
                        default:
                            System.out.println("Mohon maaf, Input anda salah!");
                            break;
                    }
                    break;
                case "2":
                    template("KAPAL");
                    System.out.print("Masukkan Pilihan: ");
                    pil2 = myObj.nextLine();
                    switch (pil2) {
                        case "1":
                            fetchKapal(dataKapal);
                            break;
                        case "2":
                            dataKapal.add(addKapal());
                            break;
                        case "3":
                            fetchKapal(dataKapal);
                            System.out.print("Masukkan Index Kapal Yang ingin anda ubah:");
                            pil3 = myObj.nextLine();
                            dataKapal.set(Integer.parseInt(pil3) - 1, addKapal());
                            break;
                        case "4":
                            fetchKapal(dataKapal);
                            System.out.print("Masukkan Index Kapal Yang ingin anda hapus:");
                            pil3 = myObj.nextLine();
                            dataKapal.remove(Integer.parseInt(pil3) - 1);
                            break;
                        default:
                            System.out.println("Mohon maaf, Input anda salah!");
                            break;
                    }
                    break;
                case "3":
                    template("GUDANG");
                    System.out.print("Masukkan Pilihan: ");
                    break;
                case "4":
                    template("SUPPLIER");
                    System.out.print("Masukkan Pilihan: ");
                    break;
                case "5":
                    template("PEMBELI");
                    System.out.print("Masukkan Pilihan: ");
                    break;
                case "6":
                    repeat = false;
                    break;
                default:
                    System.out.println("Mohon maaf, Input anda salah!");
                    break;
            }
        }
    }
}
