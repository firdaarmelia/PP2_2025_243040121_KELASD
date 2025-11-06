/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model06;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author firda
 */
public class ContohActionListener {
    public static void main(String[] args) {
       JFrame frame = new JFrame("Contoh ActionListener");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,150);
       frame.setLayout(new FlowLayout());
       
       JLabel label = new JLabel("Hallo,Klik tombol di bawah ini!");
       JButton button = new JButton("Klik saya!");
       
       ActionListener listener = new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              label.setText("Tombol telah di klik!");
       }
         };
    button.addActionListener(listener);
    frame.add(label);
    frame.add(button);
    frame.setVisible(true);
    }
}
