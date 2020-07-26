 
import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class mi_modelo extends AbstractTableModel {

    private String[] columnas;
    private Object[][] filas;
    
    public mi_modelo(){}
    
    public mi_modelo(Object[][] data, String[] nombrecolumnas){
        this.columnas=nombrecolumnas;
        this.filas= data;
        
        
    }
    public Class getColumnClass(int col){
        
        if(col == 8){
            return Icon.class;
        }else{
            return getValueAt(0,col).getClass();
        }
    }
    
    
    
    @Override
    public int getRowCount() {
        return this.filas.length;
    }

    @Override
    public int getColumnCount() {
       return this.columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       return this.filas[rowIndex][columnIndex];
    }
    
       @Override
    public String getColumnName(int col){
        return this.columnas[col];
    }
    
    
}
