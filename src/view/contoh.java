/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author lenovo
 */
public class contoh implements ActionListener{
JFrame contoh = new JFrame();



public contoh(){
    contoh = new JFrame("Contoh");
    contoh.setSize(1000,1000);
    contoh.setLayout(null);
    contoh.setVisible(true);
}

    
@Override
public void actionPerformed(ActionEvent e){

}
    
}
