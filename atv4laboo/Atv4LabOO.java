package laboo.atv4laboo;

import java.util.List;
import javax.swing.JOptionPane;
import laboo.atv4laboo.classes.Despesa;
import laboo.atv4laboo.gui.TelaInicial;
import laboo.atv4laboo.io.Carregador;
import laboo.atv4laboo.io.LeitorGravadorObjetos;

public class Atv4LabOO {

    public static void main(String[] args) {
        try {
            List<Despesa> listDespesa = Carregador.carregarDados(new LeitorGravadorObjetos());
            telaInicialGUI(listDespesa);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "SYSDESPESA", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void telaInicialGUI(List<Despesa> listDespesa) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial(listDespesa);
            }
        });
    }
}
