/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pert6;

/**
 *
 * @author chris
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pert6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //instance of class
        Laundry master = new Laundry("", "", 0);
        transaksiLaundry trans = new transaksiLaundry("", "", 0, "", "", "", "", 0);
        //deklarasi var
        String jenis, nama, kode, metode, tglCuci, tglAmbil;
        int harga, berat;
        //loop
        do {
            System.out.println("Transaksi Laundry");
            System.out.println("1. Menu Utama");
            System.out.println("2. Menu Transaksi");
            System.out.println("3. Menu Cari Data");
            System.out.println("4. Menu Keluar");
            System.out.println("Pilihan[1-4]: ");
            int menu = Integer.parseInt(br.readLine());
            switch (menu) {
                case 1:
                    System.out.println("1. Menu Master");
                    //input --> class laundry
                    System.out.println("Entri jenis cucian: ");
                    jenis = br.readLine();
                    System.out.println("Entri harga: ");
                    harga = Integer.parseInt(br.readLine());
                    System.out.println("Entri metode: ");
                    metode = br.readLine();
                    master = new Laundry(jenis, metode, harga);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("2. Menu Transaksi");
                    System.out.println("Entri kode: ");
                    kode = br.readLine();
                    System.out.println("Entri nama: ");
                    nama = br.readLine();
                    System.out.println("Entri jenis cuci \n Cuci Setrika/Cuci Kering: ");
                    jenis = br.readLine();
                    System.out.println("Entri metode (reguler/express): ");
                    metode = br.readLine();
                    System.out.println("Entri berat: ");
                    berat = Integer.parseInt(br.readLine());
                    System.out.println("Entri tanggal cuci: ");
                    tglCuci = br.readLine();
                    System.out.println("Entri tanggal ambil: ");
                    tglAmbil = br.readLine();
                    trans = new transaksiLaundry(jenis, metode, master.getHarga(), kode, nama, tglCuci, tglAmbil, berat);
                    break;
                case 3:
                    System.out.println("---3. Menu Cari Data---");
                    System.out.println("Entri kode transaksi yang dicari : ");
                    kode = br.readLine();

                    // Cek apakah transaksi sudah dilakukan
                    if (trans.getKode() != null && kode.equalsIgnoreCase(trans.getKode())) {
                        trans.transaksi(kode);
                    } else {
                        System.out.println("Data tidak ada");
                    }
                    break;
                default:
                    System.exit(0);
            }
        } while(true);
    }
}
