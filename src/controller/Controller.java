/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Jurusan;
import model.Mahasiswa;

/**
 *
 * @author lenovo
 */
public class Controller {
    
    static DataBaseHandler dbh = new DataBaseHandler();
    public static boolean insertMahasiswa(){
        dbh.connect();
        Mahasiswa mhs = new Mahasiswa();
        String query = "INSERT INTO mahasiswa(namaMhs,nim,angkatan,kode_Jurusan)"
                + "VALUES(?,?,?,?)";
       
        
        try{
            PreparedStatement stmt = dbh.con.prepareStatement(query);
            stmt.setString(1,mhs.getNamaMhs());
            stmt.setString(2,mhs.getNim());
            stmt.setInt(3, mhs.getAngkatan());
            stmt.setString(4,mhs.getKode_jurusan());
            stmt.close();
            return true;
        }
        catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }   
    }
    
    public static boolean insertJurusan(String kodeJurusan,String namaJurusan){
    dbh.connect();
    Jurusan jur = new Jurusan();
     String query = "INSERT INTO jurusan jurusan VALUES(?,?)";
     try{
            PreparedStatement stmt = dbh.con.prepareStatement(query);
            stmt.setString(1,namaJurusan);
            stmt.setString(2,kodeJurusan);
            stmt.close();
            return true;
        }
        catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }   
    }
    
   public static ArrayList<Jurusan> lihatJurusan(){
       dbh.connect();
       ArrayList<Jurusan>jur = new ArrayList<>();
       String query = "SELECT * FROM jurusan";
       try{
            Statement stmt = dbh.con.createStatement();
          ResultSet rs = stmt.executeQuery(query);
          while(rs.next()){
             Jurusan jurusan = new Jurusan();
              jurusan.setNamaJurusan(rs.getString("namaJursan"));
              jurusan.setKodeJurusan("kodeJurusan");
              jur.add(jurusan);
       }
   }
       catch(SQLException ex){
           ex.printStackTrace();
           
       }
   return jur;
   }
    
    public static ArrayList<Mahasiswa> lihatMahasiswa(String kodeJurusan){
    dbh.connect();
   ArrayList<Mahasiswa>mhs = new ArrayList<>();
    String query = "SELECT * FROM mahasiswa WHERE kode_Jurusan = '"+kodeJurusan+"'";
    
    try{
          Statement stmt = dbh.con.createStatement();
          ResultSet rs = stmt.executeQuery(query);
          while(rs.next()){
              Mahasiswa mahasiswa = new Mahasiswa();
              mahasiswa.setNamaMhs(rs.getString("namaMhs"));
              mahasiswa.setNim(rs.getString("nim"));
              mahasiswa.setAngkatan(rs.getInt("angkatan"));
              mahasiswa.setKode_jurusan(rs.getString("kode_Jurusan"));
              mhs.add(mahasiswa);
              
          }
      }
      catch(SQLException ex){
          ex.printStackTrace();
      }
      return mhs;
    
    }
    
}
