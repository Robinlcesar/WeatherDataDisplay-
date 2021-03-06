package com.mycompany.weatherdatadisplay.presenter;
import com.mycompany.weatherdatadisplay.principal;
import com.mycompany.weatherdatadisplay.model.dado;
import com.mycompany.weatherdatadisplay.view.TelaMain;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Robinson
 */
public class atualizarTela {
   
    
    public static void atualizarMedia (String data, float temperatura, float umidade, float pressao){
        
        TelaMain tela = principal.getTela();
        
        
        tela.getMedioTemperatura().setText(Float.toString(temperatura));
        tela.getMedioUmidade().setText(Float.toString(umidade));
        tela.getMedioPressao().setText(Float.toString(pressao));

    }
    
    public static void numeroLeituras (int numLeituras){
        TelaMain tela = principal.getTela();
        tela.getMedioRegistros().setText(Integer.toString(numLeituras));
    }

     public static void atualizarUltima(String data, float temperatura, float umidade, float pressao){
        TelaMain tela = principal.getTela();
        
        tela.getUltimaData().setText(data);
        tela.getUltimaTemperatura().setText(Float.toString(temperatura));
        tela.getUltimaUmidade().setText(Float.toString(umidade));
        tela.getUltimaPressao().setText(Float.toString(pressao));
    }
    
    public static void atualizarTabela(dado dado){
        
        JTable registroTabela = principal.getTela().getRegistroTabela();
        
        DefaultTableModel model = (DefaultTableModel) registroTabela.getModel();
        model.addRow(new Object[]{dado.getData(), dado.getTemperatura(), dado.getUmidade(), dado.getPressao()});
    }
}
