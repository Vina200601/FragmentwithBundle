package com.example.acer.bundle1;

import java.io.Serializable;

public class Pegawai implements Serializable {

    private String namanya;
    private String alamatnya;
    private  String nohpnya;
    private  String pekerjaan;
    private  String lamakerja;
    private String asalsekolah;
    private  String kompetensi;

    public Pegawai(String namanya, String alamatnya, String nohpnya, String pekerjaan, String lamakerja, String asalsekolah, String kompetensi) {
        this.namanya = namanya;
        this.alamatnya = alamatnya;
        this.nohpnya = nohpnya;
        this.pekerjaan = pekerjaan;
        this.lamakerja = lamakerja;
        this.asalsekolah = asalsekolah;
        this.kompetensi = kompetensi;
    }

    public String getNamanya() {
        return namanya;
    }

    public void setNamanya(String namanya) {
        this.namanya = namanya;
    }

    public String getAlamatnya() {
        return alamatnya;
    }

    public void setAlamatnya(String alamatnya) {
        this.alamatnya = alamatnya;
    }

    public String getNohpnya() {
        return nohpnya;
    }

    public void setNohpnya(String nohpnya) {
        this.nohpnya = nohpnya;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getLamakerja() {
        return lamakerja;
    }

    public void setLamakerja(String lamakerja) {
        this.lamakerja = lamakerja;
    }

    public String getAsalsekolah() {
        return asalsekolah;
    }

    public void setAsalsekolah(String asalsekolah) {
        this.asalsekolah = asalsekolah;
    }

    public String getKompetensi() {
        return kompetensi;
    }

    public void setKompetensi(String kompetensi) {
        this.kompetensi = kompetensi;
    }
}
