package laboo.atv4laboo.funcoesGerais;

import java.util.List;
import javax.swing.JLabel;
import laboo.atv4laboo.classes.Despesa;

public class ChangeLabel {
    
    public static void getTotal(List<Despesa> list, JLabel lValorTotal) {
        double valorTotal = 0;
        for(Despesa desp : list) {
            valorTotal += desp.getValor();
        }
        
        lValorTotal.setText(ParseCurrency.toReal(valorTotal));
    }
}
