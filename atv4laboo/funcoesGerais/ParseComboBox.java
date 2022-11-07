package laboo.atv4laboo.funcoesGerais;

import javax.swing.JComboBox;

public class ParseComboBox {
    
    public static int toMonthValue(JComboBox cbMes) {
        int monthValue;
        
        monthValue = cbMes.getSelectedIndex() + 1;
        
        return monthValue;
    }
}
