
package br.com.principal;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel{

    
    private List<Dados> dados;
    private String[] colunas = {"id" , "nome" ,"telefone","rua", "numero", 
        "cep", "bairro", "plano", "valor", "inicio", "fim"};

    
    
    
    public ModeloTabela() {
        this.dados = new ArrayList<>();
    }
    
    
    @Override
    public boolean isCellEditable(int linha, int coluna) {
    return false;
    }
    
    public void addRow(Dados d){
        this.dados.add(d);
        this.fireTableDataChanged();
    }
 
    public void removeRow(int linha){
    this.dados.remove(linha);
    this.fireTableRowsDeleted(linha, linha);
}
    
    
    public Dados get(int linha){
    return this.dados.get(linha);
}
    
    public String getColumnName(int num){
        return this.colunas[num];
    }
 
    @Override
    public int getRowCount() {
        return dados.size();
    }
 
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
 
    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0: return dados.get(linha).getId();
            case 1: return dados.get(linha).getNome();
            case 2: return dados.get(linha).getTelefone();
            case 3: return dados.get(linha).getRua();
            case 4: return dados.get(linha).getNumero();
            case 5: return dados.get(linha).getCep();
            case 6: return dados.get(linha).getBairro();
            case 7: return dados.get(linha).getPlano();  
            case 8: return dados.get(linha).getValor();
            case 9: return dados.get(linha).getInicio();
            case 10: return dados.get(linha).getFim();
        }   
        return null;
    }
    
}
