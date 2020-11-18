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
public class Jurusan {
    
    private String namaJurusan;
    private String kodeJurusan;
    
    public Jurusan(){}
    
    public Jurusan(String namaJurusan, String kodeJurusan) {
        this.namaJurusan = namaJurusan;
        this.kodeJurusan = kodeJurusan;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public String getKodeJurusan() {
        return kodeJurusan;
    }

    public void setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }
    
    
    
    
}
