/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert6;

/**
 *
 * @author chris
 */
public class transaksiLaundry extends Laundry {
     private String kode, namaPelanggan, tglCuci, tglAmbil;
    private static final int BIAYA_EXPRESS = 5000;
    private int berat;
    public transaksiLaundry(String jenisCuci, String metode, int harga, String kode, String namaPelanggan, String tglCuci, String tglAmbil, int berat) {
        super(jenisCuci, metode, harga);
        this.kode = kode;
        this.namaPelanggan = namaPelanggan;
        this.tglCuci = tglCuci;
        this.tglAmbil = tglAmbil;
        this.berat = berat;
    }
    public String getKode() {
        return kode;
    }
    public String getNamaPelanggan() {
        return namaPelanggan;
    }
    public String getTglCuci() {
        return tglCuci;
    }
    public String getTglAmbil() {
        return tglAmbil;
    }
    public int getBerat() {
        return berat;
    }
    //method tambahan --> getTotal, overloading method
    public int getTotal(){
        //hitung subtotal jasa cuci
        //ditambah super u/ kasih tau ambilnya di class laundry
        return getBerat() * super.getHarga();
    }
    //overloading --> metode statis
    //searching data --> tau dulu kode transaksinya
    public void transaksi(){
        System.out.println("Nama pelanggan: " +getNamaPelanggan());
        System.out.println("Jenis cuci: " +getJenisCuci());
        System.out.println("Metode (Reguler/Express): " +getMetode());
        System.out.println("Harga jasa: " +getHarga());
        System.out.println("Tanggal cuci: " +getTglCuci());
        System.out.println("Tanggal ambil: " +getTglAmbil());
        System.out.println("Berat cucian: " +getBerat());
        System.out.println("Sub Total: " +getTotal()); // subtotal (hrg*berat)
        System.out.println("Total: " +cuciExpress()); // tambah jasa express
    }
    public void transaksi(String kode){
        System.out.println("Nama pelanggan: " +getNamaPelanggan());
        System.out.println("Jenis cuci: " +getJenisCuci());
        System.out.println("Metode (Reguler/Express): " +getMetode());
        System.out.println("Harga jasa: " +getHarga());
        System.out.println("Tanggal cuci: " +getTglCuci());
        System.out.println("Tanggal ambil: " +getTglAmbil());
        System.out.println("Berat cucian: " +getBerat());
        System.out.println("Sub Total: " +getTotal()); // subtotal (hrg*berat)
        System.out.println("Total: " +cuciExpress()); // tambah jasa express
    }
    //overriding --> metode dinamis
    @Override
    public int cuciExpress() {
        int total = getTotal();
        if (getMetode().equalsIgnoreCase("express")) {
            total += BIAYA_EXPRESS;
        }
        return total;
    }
}
