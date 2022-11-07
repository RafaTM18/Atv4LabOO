package laboo.atv4laboo.gui;

import java.util.List;
import javax.swing.JOptionPane;
import laboo.atv4laboo.classes.Despesa;
import laboo.atv4laboo.classes.EnergiaEletrica;
import laboo.atv4laboo.classes.Produtos;
import laboo.atv4laboo.classes.Servico;
import laboo.atv4laboo.exception.CampoVazioExcepction;
import laboo.atv4laboo.exception.DataInvalidaException;
import laboo.atv4laboo.exception.ValorInvalidoException;
import laboo.atv4laboo.validator.CheckDate;
import laboo.atv4laboo.validator.CheckValor;

public class LancarDespesa extends javax.swing.JDialog {
    
    private List<Despesa> listDespesa;

    public LancarDespesa(List<Despesa> listDespesa) {
        this.listDespesa = listDespesa;
        initComponents();
        
        //Por padrão, o radioButton selecionado é o de Serviços, dessa forma os seguintes campos devem ser desativados
        this.tQtd.setEnabled(false);
        
        
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setVisible(true);
    }
    
    private void clearTextFields() {
        this.tCNPJ.setText("");
        this.tData.setText("");
        this.tDesc.setText("");
        this.tQtd.setText("");
        this.tValor.setText("");
    }
    
    private void validaCampos() throws DataInvalidaException, ValorInvalidoException {
        String data = tData.getText();
        String valor = tValor.getText();
        
        if (!CheckDate.validate(data))
            throw new DataInvalidaException();
        
        if (!CheckValor.validate(valor))
            throw new ValorInvalidoException();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipo = new javax.swing.ButtonGroup();
        lTipo = new javax.swing.JLabel();
        pTipo = new javax.swing.JPanel();
        rbServico = new javax.swing.JRadioButton();
        rbProduto = new javax.swing.JRadioButton();
        rbEnergia = new javax.swing.JRadioButton();
        lDados = new javax.swing.JLabel();
        pDados = new javax.swing.JPanel();
        lData = new javax.swing.JLabel();
        tData = new javax.swing.JTextField();
        lCNPJ = new javax.swing.JLabel();
        tCNPJ = new javax.swing.JTextField();
        tDesc = new javax.swing.JTextField();
        lDesc = new javax.swing.JLabel();
        lQtd = new javax.swing.JLabel();
        tQtd = new javax.swing.JTextField();
        lValor = new javax.swing.JLabel();
        tValor = new javax.swing.JTextField();
        bCancelar = new javax.swing.JButton();
        bLancar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lTipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lTipo.setText("Tipo de Despesa");

        pTipo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bgTipo.add(rbServico);
        rbServico.setSelected(true);
        rbServico.setText("Serviços");
        rbServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbServicoActionPerformed(evt);
            }
        });

        bgTipo.add(rbProduto);
        rbProduto.setText("Produtos");
        rbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProdutoActionPerformed(evt);
            }
        });

        bgTipo.add(rbEnergia);
        rbEnergia.setText("Energia Elétrica");
        rbEnergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnergiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pTipoLayout = new javax.swing.GroupLayout(pTipo);
        pTipo.setLayout(pTipoLayout);
        pTipoLayout.setHorizontalGroup(
            pTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbProduto)
                .addGap(55, 55, 55)
                .addComponent(rbEnergia)
                .addGap(18, 18, 18))
        );
        pTipoLayout.setVerticalGroup(
            pTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbServico)
                    .addComponent(rbProduto)
                    .addComponent(rbEnergia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lDados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lDados.setText("Dados da Despesa");

        pDados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lData.setText("Data:");

        lCNPJ.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lCNPJ.setText("CNPJ:");

        lDesc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lDesc.setText("Descrição:");

        lQtd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lQtd.setText("Qtd:");

        lValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lValor.setText("Valor:");

        javax.swing.GroupLayout pDadosLayout = new javax.swing.GroupLayout(pDados);
        pDados.setLayout(pDadosLayout);
        pDadosLayout.setHorizontalGroup(
            pDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pDadosLayout.createSequentialGroup()
                        .addComponent(lData, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tData))
                    .addGroup(pDadosLayout.createSequentialGroup()
                        .addComponent(lCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tCNPJ))
                    .addGroup(pDadosLayout.createSequentialGroup()
                        .addComponent(lDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tDesc))
                    .addGroup(pDadosLayout.createSequentialGroup()
                        .addComponent(lQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tQtd))
                    .addGroup(pDadosLayout.createSequentialGroup()
                        .addComponent(lValor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tValor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pDadosLayout.setVerticalGroup(
            pDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lData)
                    .addComponent(tData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCNPJ)
                    .addComponent(tCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDesc)
                    .addComponent(tDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lQtd)
                    .addComponent(tQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lValor)
                    .addComponent(tValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bLancar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bLancar.setText("Lançar");
        bLancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLancarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lTipo)
                            .addComponent(lDados))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bLancar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bLancar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void rbServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbServicoActionPerformed
        clearTextFields();
        
        this.tCNPJ.setEnabled(true);
        this.tDesc.setEnabled(true);
        this.tQtd.setEnabled(false);
    }//GEN-LAST:event_rbServicoActionPerformed

    private void rbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProdutoActionPerformed
        clearTextFields();
        
        this.tCNPJ.setEnabled(false);
        this.tDesc.setEnabled(true);
        this.tQtd.setEnabled(true);
    }//GEN-LAST:event_rbProdutoActionPerformed

    private void rbEnergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnergiaActionPerformed
        clearTextFields();
        
        this.tCNPJ.setEnabled(false);
        this.tDesc.setEnabled(false);
        this.tQtd.setEnabled(false);
    }//GEN-LAST:event_rbEnergiaActionPerformed

    private void bLancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLancarActionPerformed
        try {
            Despesa desp = null;
        
            if ( rbServico.isSelected() ) {
                if ( this.tCNPJ.getText().isBlank() ||
                     this.tDesc.getText().isBlank() ||
                     this.tData.getText().isBlank() ||
                     this.tValor.getText().isBlank() ) 
                    throw new CampoVazioExcepction();

                validaCampos();
                
                String cnpj = this.tCNPJ.getText();
                String desc = this.tDesc.getText();
                String data = this.tData.getText();
                double valor = Double.parseDouble(this.tValor.getText());

                desp = new Servico(cnpj, desc, data, valor);
            } else if ( rbProduto.isSelected() ) {
                if ( this.tQtd.getText().isBlank() ||
                     this.tDesc.getText().isBlank() ||
                     this.tData.getText().isBlank() ||
                     this.tValor.getText().isBlank() ) 
                    throw new CampoVazioExcepction();
                
                validaCampos();
                
                String desc = this.tDesc.getText();
                String data = this.tData.getText();
                double valor = Double.parseDouble(this.tValor.getText());
                int qtd = Integer.parseInt(this.tQtd.getText());

                desp = new Produtos(qtd, desc, data, valor);
            } else {
                if ( this.tData.getText().isBlank() ||
                     this.tValor.getText().isBlank() ) 
                    throw new CampoVazioExcepction();
                
                validaCampos();
                
                String data = this.tData.getText();
                double valor = Double.parseDouble(this.tValor.getText());

                desp = new EnergiaEletrica(data, valor);
            }
            
            this.listDespesa.add(desp);
            
            int op = JOptionPane.showConfirmDialog(null, "Deseja lançar outra despesa?", "SYSDESPESA", JOptionPane.YES_NO_OPTION);
            if (op == JOptionPane.YES_OPTION) {
                clearTextFields();
            } else {
                this.dispose();
            }

        } catch (Exception e) {
            String msg = "Falha ao lançar despesa!\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, msg, "SYSDESPESA", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_bLancarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bLancar;
    private javax.swing.ButtonGroup bgTipo;
    private javax.swing.JLabel lCNPJ;
    private javax.swing.JLabel lDados;
    private javax.swing.JLabel lData;
    private javax.swing.JLabel lDesc;
    private javax.swing.JLabel lQtd;
    private javax.swing.JLabel lTipo;
    private javax.swing.JLabel lValor;
    private javax.swing.JPanel pDados;
    private javax.swing.JPanel pTipo;
    private javax.swing.JRadioButton rbEnergia;
    private javax.swing.JRadioButton rbProduto;
    private javax.swing.JRadioButton rbServico;
    private javax.swing.JTextField tCNPJ;
    private javax.swing.JTextField tData;
    private javax.swing.JTextField tDesc;
    private javax.swing.JTextField tQtd;
    private javax.swing.JTextField tValor;
    // End of variables declaration//GEN-END:variables
}
