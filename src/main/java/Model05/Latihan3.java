/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model05;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author firda
 */
public class Latihan3 {
    public static void main(String[]args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                JFrame frame = new JFrame("Label dan Tombol");
                frame.setSize(400,300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                frame.setLayout(new FlowLayout());
                
                JLabel label = new JLabel("Teks Awal");
                JButton button = new JButton("Klik saya!");
                
                button.addActionListener(e ->{
                    label.setText("Tombol berhasil diklik!");
                    
                });
                    frame.add(label);
                    frame.add(button);
                    frame.setVisible(true);    
            }
        });
    }
    
}
