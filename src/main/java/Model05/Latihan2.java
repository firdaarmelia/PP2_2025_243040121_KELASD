/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model05;

import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JFrame;
/**
 *
 * @author firda
 */
public class Latihan2 {
    public static void main(String[]args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                JFrame frame = new JFrame ("Jendela dengan Label");
                frame.setSize(400,300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel label = new JLabel("Ini adalah JLabel.");
                frame.add(label);
                frame.setVisible(true);
                    }
        });
    }
    
}
