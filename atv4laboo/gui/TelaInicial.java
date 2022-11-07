package laboo.atv4laboo.gui;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import laboo.atv4laboo.classes.Despesa;
import laboo.atv4laboo.exception.ErroDeGravacaoException;
import laboo.atv4laboo.io.Gravador;
import laboo.atv4laboo.io.LeitorGravadorObjetos;
import laboo.atv4laboo.shared.Relogio;

public class TelaInicial extends javax.swing.JFrame {
    
    private String dataAtual;
    private List listDespesa;

    public TelaInicial(List listDespesa) {
        this.listDespesa = listDespesa;
        initComponents();
        
        loadDateTime();
        
        this.setTitle("Gerenciador de Despesas");
	this.setLocationRelativeTo(null);
	this.setVisible(true);
    }
    
    public void loadDateTime() {
        Date data = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        this.dataAtual = formato.format(data);
        this.lData.setText(this.dataAtual);
        
        Relogio relogio = new Relogio(this.lRelogio);
        relogio.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pRelogio = new javax.swing.JPanel();
        lRelogio = new javax.swing.JLabel();
        pData = new javax.swing.JPanel();
        lData = new javax.swing.JLabel();
        lMenu = new javax.swing.JLabel();
        pButtons = new javax.swing.JPanel();
        bLancar = new javax.swing.JButton();
        bRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closingWindow(evt);
            }
        });

        pRelogio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lRelogio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lRelogio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lRelogio.setText("00:00:00");

        javax.swing.GroupLayout pRelogioLayout = new javax.swing.GroupLayout(pRelogio);
        pRelogio.setLayout(pRelogioLayout);
        pRelogioLayout.setHorizontalGroup(
            pRelogioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
            .addGroup(pRelogioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRelogioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lRelogio, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pRelogioLayout.setVerticalGroup(
            pRelogioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pRelogioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pRelogioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lRelogio)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        pData.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lData.setText("00/00/0000");

        javax.swing.GroupLayout pDataLayout = new javax.swing.GroupLayout(pData);
        pData.setLayout(pDataLayout);
        pDataLayout.setHorizontalGroup(
            pDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
            .addGroup(pDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDataLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lData, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pDataLayout.setVerticalGroup(
            pDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(pDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pDataLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lData)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        lMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lMenu.setText("Menu");

        pButtons.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bLancar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bLancar.setText("Lançar Despesa");
        bLancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLancarActionPerformed(evt);
            }
        });

        bRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bRelatorio.setText("Relatório de Despesa");
        bRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pButtonsLayout = new javax.swing.GroupLayout(pButtons);
        pButtons.setLayout(pButtonsLayout);
        pButtonsLayout.setHorizontalGroup(
            pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bLancar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pButtonsLayout.setVerticalGroup(
            pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bLancar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pRelogio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pRelogio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLancarActionPerformed
        new LancarDespesa(this.listDespesa);
    }//GEN-LAST:event_bLancarActionPerformed

    private void bRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRelatorioActionPerformed
        new RelatorioDespesa(this.listDespesa);
    }//GEN-LAST:event_bRelatorioActionPerformed

    private void closingWindow(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closingWindow
        try {
            LeitorGravadorObjetos arq = new LeitorGravadorObjetos();
            Gravador.gravarDados(arq, this.listDespesa);
        } catch (ErroDeGravacaoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "SYSDESPESA", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_closingWindow

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLancar;
    private javax.swing.JButton bRelatorio;
    private javax.swing.JLabel lData;
    private javax.swing.JLabel lMenu;
    private javax.swing.JLabel lRelogio;
    private javax.swing.JPanel pButtons;
    private javax.swing.JPanel pData;
    private javax.swing.JPanel pRelogio;
    // End of variables declaration//GEN-END:variables
}
