/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model06;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author firda
 */
public class ContohBorderLayout {
    public static void main(String[]args){
        JFrame frame = new JFrame("BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        
        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
       frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);
        
        frame.setVisible(true);
}   
}
