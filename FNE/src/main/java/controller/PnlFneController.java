/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import view.FrmFne;

/**
 *
 * @author Sistemas-08
 */
public class PnlFneController {
    private FrmFne frmFne;
    private DefaultTableModel tblViewModel;
    //private String[] HEADERS = new String[]{""};

    public PnlFneController(FrmFne frmFne) throws FileNotFoundException, IOException {
        this.frmFne = frmFne;
        initComponents();
        
    }
     private void initComponents() throws IOException{
         loadTable();
    }
     
     private void loadTable() throws IOException{              
    }
    
}
