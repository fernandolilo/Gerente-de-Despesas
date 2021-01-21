/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rcell Asus
 */
public final class SelectTabela extends AbstractTableModel {
    
    private ArrayList Linhas = null;
    private String [] Colunas = null;
    
    public SelectTabela(ArrayList lin, String [] col){
     
        setLinhas(lin);
        setColunas(col);
        
    }
    public ArrayList getLinhas(){
        return Linhas;
    }
    public final void setLinhas(ArrayList dados){
        Linhas = dados;
    }
    public String [] getColunas(){
        return Colunas;
    }
    public void setColunas(String [] nomes){
        Colunas = nomes;
    }

    /**
     *
     * @return
     */
    @Override
    public int getColumnCount(){
        return Colunas.length;
    }
    @Override
    public int getRowCount(){
        return Linhas.size();
    }
    @Override
    public String getColumnName(int numCol){
        return Colunas[numCol];
    }
    @Override
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
}
