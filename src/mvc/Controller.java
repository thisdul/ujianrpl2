/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;
/**
 *
 * @author asus
 */
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Controller {
    ArrayList<Model> ArrayData;
    DefaultTableModel tabelModel;
    
    public Controller(){
        ArrayData = new ArrayList<Model>();
    }
    
    public void InsertData(String nama, String harga, String jumlah, boolean kategori){
        Model mhs = new Model(nama, harga, jumlah, kategori);
        ArrayData.add(mhs);
    }
    
    public DefaultTableModel showData(){
        String[] kolom = {"NAMA PRODUK", "HARGA", "JUMLAH", "KATEGORI"};
        Object[][] objData = new Object[ArrayData.size()][4];
        int i = 0;
        
        for(Model n : ArrayData){
            String[] arrData = {n.getNama(), n.getHarga(), n.getJumlah(), (n.isKategori()) ? "Makanan" : "Minuman"};
            objData[i] = arrData;
            i++;
        }
        
        tabelModel = new DefaultTableModel(objData, kolom){
            public boolean isCellEdittable(int rowIndex, int colIndex){
                return false;
            }
        };
        
        return tabelModel;        
    }
    
    public static void main(String[] args) {
    }
    
}
