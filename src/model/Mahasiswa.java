/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lenovo
 */
public class Mahasiswa {
    
    private String namaMhs;
    private String nim;
    private int angkatan;
    private String kode_jurusan;
    
    public Mahasiswa(){}
    
    public Mahasiswa(String namaMhs, String nim, int angkatan, String kode_jurusan) {
        this.namaMhs = namaMhs;
        this.nim = nim;
        this.angkatan = angkatan;
        this.kode_jurusan = kode_jurusan;
    }

    public String getNamaMhs() {
        return namaMhs;
    }

    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public String getKode_jurusan() {
        return kode_jurusan;
    }

    public void setKode_jurusan(String kode_jurusan) {
        this.kode_jurusan = kode_jurusan;
    }
    
    
    
}
