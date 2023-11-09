/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert6;

/**
 *
 * @author chris
 */
public class Laundry {
    //ATRIBUT: jenis cuci, metode
    private String jenisCuci, metode;
    private int harga;

    //constructor
    public Laundry(String jenisCuci, String metode, int harga) {
        this.jenisCuci = jenisCuci;
        this.metode = metode;
        this.harga = harga;
    }

    //getter
    public String getJenisCuci() {
        return jenisCuci;
    }

    public String getMetode() {
        return metode;
    }

    public int getHarga() {
        return harga;
    }

    //method tambahan --> overriding
    public int cuciExpress() {
        //set harga express 5000
        return 5000;

    }
}
