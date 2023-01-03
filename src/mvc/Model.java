/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author asus
 */
public class Model {
    private String nama;
    private String harga;
    private String jumlah;
    private boolean kategori;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public boolean isKategori() {
        return kategori;
    }

    public void setKategori(boolean kategori) {
        this.kategori = kategori;
    }
    
    public Model(String nama, String harga, String jumlah, boolean kategori){
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
        this.kategori = kategori;
    }

}
