package laboo.atv4laboo.funcoesGerais;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import laboo.atv4laboo.classes.Despesa;
import laboo.atv4laboo.classes.Produtos;
import laboo.atv4laboo.classes.Servico;

public class ParseSet {
    
    public static void toTable(List<Despesa> list, JTable tabela){
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        String tipo = "";
        String desc = "";
        String valor = "";
        model.setRowCount(0); //Zera a info anterior
        for(Despesa desp : list){
            if (desp instanceof Servico) {
                tipo = "Serviço";
                desc = ((Servico) desp).getDescricao();
                valor = ParseCurrency.toReal(desp.getValor());
            } else if (desp instanceof Produtos) {
                tipo = "Produtos";
                desc = ((Produtos) desp).getDescricao();
                valor = ParseCurrency.toReal(desp.getValor());
            } else {
                tipo = "Energia Elétrica";
                desc = "Energia Elétrica";
                valor = ParseCurrency.toReal(desp.getValor());
            }
            
            Object[] dados = {
                tipo,
                desc,
                valor
            };
            model.addRow(dados);
        }
        tabela.setModel(model);
    }
    
}
