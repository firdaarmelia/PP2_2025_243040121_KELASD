/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul08;

import modul08.controller.PersegiPanjangController;
import modul08.view.PersegiPanjangView;
import modul08.model.PersegiPanjangModel;

/**
 *
 * @author firda
 */
public class Main {
    public static void main(String[] args) {
        //instansiasi model
        PersegiPanjangModel model= new PersegiPanjangModel();
        
        //instansiasi view
        PersegiPanjangView view = new PersegiPanjangView();
        
        //instansiasi controller (hubungkan model&view)
        PersegiPanjangController controller = new PersegiPanjangController(model, view);
        
        //tampilkan view
        view.setVisible(true);
    }
    
}
