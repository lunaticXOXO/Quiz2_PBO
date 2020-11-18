/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.Jurusan;

/**
 *
 * @author lenovo
 */
public class LihatJurusan implements ActionListener {
    JFrame frame = new JFrame("Quiz");
    JLabel judul;
    JButton tombol;
    JTable jt;
    
    public LihatJurusan(){
        judul = new JLabel("Lihat Jurusan");
        judul.setFont(new Font("Consolas", Font.PLAIN, 32));
        judul.setBounds(600,20,500,100);
        
        ArrayList<Jurusan> jurusan = Controller.lihatJurusan();
        jt = new JTable();
        jt.setBounds(270,150,500,500);
        DefaultTableModel model = new DefaultTableModel();
        Object[] namaKolom = new Object[2];
        namaKolom[0] = "ID Rute";
        namaKolom[1] = "Kota Asal";
        model.setColumnIdentifiers(namaKolom);
        Object[] dataKolom = new Object[2];
        for (int i = 0; i < jurusan.size(); i++) {
            dataKolom[0] = jurusan.get(i).getKodeJurusan();
            dataKolom[1] = jurusan.get(i).getNamaJurusan();
            model.addRow(dataKolom);
        }
        jt.setModel(model);
        
        tombol = new JButton("Main Menu");
        tombol.setBounds(400, 360, 250, 30);
        tombol.setEnabled(true);
        tombol.addActionListener(this);
        
        frame.add(jt);
        frame.add(judul);
        frame.add(tombol);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Main Menu")){
            new MainMenu();
            frame.dispose();
        }
    }
    
}
