package com.example.menumakanan;

import java.io.Serializable;

public class Menu implements Serializable {
    protected String nama;
    protected String deskripsi;
    protected String tag;
    protected String bahan;
    protected String langkah;
    protected String tersedia;

    public Menu(String nama, String deskripsi, String tag, String bahan, String langkah, String tersedia) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.tag = tag;
        this.bahan = bahan;
        this.langkah = langkah;
        this.tersedia = tersedia;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getLangkah() {
        return langkah;
    }

    public void setLangkah(String langkah) {
        this.langkah = langkah;
    }

    public String getTersedia() {
        return tersedia;
    }

    public void setTersedia(String tersedia) {
        this.tersedia = tersedia;
    }
}



