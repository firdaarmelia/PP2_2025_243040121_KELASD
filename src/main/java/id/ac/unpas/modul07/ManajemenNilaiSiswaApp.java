/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul07;


/**
 *
 * @author firda
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class ManajemenNilaiSiswaApp extends JFrame{
   private JTextField txtNama;
   private JTextField txtNilai;
   private JComboBox<String> cmbMatkul;
   private JTable tableData;
   private DefaultTableModel tableModel;
   private JTabbedPane tabbedPane;
   
   //Method untuk membuat desain Tab Input
   private JPanel createInputPanel(){
       JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
       panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20) );
       
       //Komponen Nama
       panel.add(new JLabel("Nama Siswa:"));
       txtNama = new JTextField();
       panel.add(txtNama);
       
       //Komponen Matkul (Combo Box)
       panel.add(new JLabel("Mata Pelajaran"));
       String[] matkul = {"Matematika Dasar", "Bahasa Indonesia", "Algoritma"
               + "dan Pemrograman I", "Praktikum Pemrograman II"};
       cmbMatkul = new JComboBox<>(matkul);
       panel.add(cmbMatkul);
       
       //Komponen Nilai
       panel.add(new JLabel("Nilai (0-100):"));
       txtNilai = new JTextField();
       panel.add (txtNilai);
       
       //Tombol Simpan
       JButton btnSimpan = new JButton("Simpan Data");
       panel.add(new JLabel(""));
       panel.add(btnSimpan);
       
       //Event handling tombol simpann
       btnSimpan.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               prosesSimpan();
           }
       });
       
            return panel;
   }
   
   private JPanel createTablePanel () {
      JPanel panel = new JPanel(new BorderLayout());
      
      String[] kolom = {"Nama Siswa", "Mata Pelajaran", "Nilai", "Grade"};
      tableModel = new DefaultTableModel(kolom, 0);
      tableData = new JTable(tableModel);
      
      JScrollPane scrollPane = new JScrollPane(tableData);
      panel.add(scrollPane, BorderLayout.CENTER);
      
      return panel;
   }
   //Logika Validasi dan penyimpanan Data
   private void prosesSimpan(){
       //1.Ambil data dari input 
       String nama = txtNama.getText();
       String matkul = (String) cmbMatkul.getSelectedItem();
       String strNilai = txtNilai.getText();
       
       //2.Validasi Input
       //Validasi 1:Cek apakah nama kosong
       if (nama.trim().isEmpty()) {
           JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!",
                   "Error Validasi", JOptionPane.ERROR_MESSAGE);
           return;//hentikan proses
       }
       //Validasi 2:Cek apakah nilai berupa angka dan dalam range valid
       int nilai;
       try {
           nilai = Integer.parseInt (strNilai);
           if (nilai <0 || nilai > 100) {
               JOptionPane.showMessageDialog(this, "Nilai harus berupa angka!",
                       "Error Validasi", JOptionPane.WARNING_MESSAGE);
               return;
           }
       } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(this, "Nilai harus berupa angka!",
                   "Error Valaidasi", JOptionPane.ERROR_MESSAGE);
           return;
       }
       //3.Logika Bisnis (Menentukan Grade)
       String grade;
       if (nilai >= 80) grade ="A";
       else if (nilai >= 70) grade ="AB";
       else if (nilai >= 60) grade ="B";
       else if (nilai >= 50) grade ="BC";
       else if (nilai >= 40) grade ="C";
       else if (nilai >= 30) grade ="D";
       else grade = "E";
       
       //Masukkan ke Tabel(Update Model)
       Object[] dataBaris ={nama, matkul, nilai, grade};
       tableModel.addRow(dataBaris);
       
       //Reset Form dan Pindah Tab
       txtNama.setText("");
       txtNilai.setText("");
       cmbMatkul.setSelectedIndex(0);
       
       JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
       tabbedPane.setSelectedIndex(1);
   }
   public ManajemenNilaiSiswaApp() {
       //1.Konfigurasi Frame Utama
       setTitle("Aplikasi Manajemen Nilai Siswa");
       setSize(500, 400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);//posisi ditengah layar
       
       //2.Inisialisasi tabbed pane
       tabbedPane = new JTabbedPane();
       
       //3.Membuat panel utk tab 1(form input)
       JPanel panelInput = createInputPanel();
       tabbedPane.addTab("Input Data", panelInput);
       
       //4. Membuat panel utk tab 2 (tabel data)
       JPanel panelTable = createTablePanel();
       tabbedPane.addTab("Daftar Nilai", panelTable);
       
       //menambahkan tabbedpane ke frame
       add(tabbedPane);
   }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ManajemenNilaiSiswaApp().setVisible(true);
        });
    }        
 }
      
