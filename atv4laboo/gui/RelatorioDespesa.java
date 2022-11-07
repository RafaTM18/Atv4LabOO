package laboo.atv4laboo.gui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import laboo.atv4laboo.classes.Despesa;
import laboo.atv4laboo.funcoesGerais.ChangeLabel;
import laboo.atv4laboo.funcoesGerais.ParseComboBox;
import laboo.atv4laboo.funcoesGerais.ParseSet;

public class RelatorioDespesa extends javax.swing.JDialog {
    
    private List<Despesa> listDespesa;
    private List<Despesa> listDespesaFiltrada;

    public RelatorioDespesa(List<Despesa> listDespesa) {
        this.listDespesa = listDespesa;
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lPeriodo = new javax.swing.JLabel();
        pPeriodo = new javax.swing.JPanel();
        lMes = new javax.swing.JLabel();
        lAno = new javax.swing.JLabel();
        cbMes = new javax.swing.JComboBox<>();
        sAno = new javax.swing.JSpinner();
        bBuscar = new javax.swing.JButton();
        lLista = new javax.swing.JLabel();
        pLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tLista = new javax.swing.JTable();
        lTotal = new javax.swing.JLabel();
        lValorTotal = new javax.swing.JLabel();
        lFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lPeriodo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lPeriodo.setText("Período da Despesa");

        pPeriodo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lMes.setText("Mês:");

        lAno.setText("Ano:");

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        sAno.setModel(new javax.swing.SpinnerNumberModel(2022, 2010, 2100, 1));

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pPeriodoLayout = new javax.swing.GroupLayout(pPeriodo);
        pPeriodo.setLayout(pPeriodoLayout);
        pPeriodoLayout.setHorizontalGroup(
            pPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPeriodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbMes, 0, 1, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lAno)
                .addGap(18, 18, 18)
                .addComponent(sAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(pPeriodoLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        pPeriodoLayout.setVerticalGroup(
            pPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPeriodoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMes)
                    .addComponent(lAno)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bBuscar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lLista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lLista.setText("Lista de Despesa");

        pLista.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Descrição", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tLista.getTableHeader().setResizingAllowed(false);
        tLista.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tLista);

        lTotal.setText("Total:");

        lValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lValorTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lValorTotal.setText("0,00");

        javax.swing.GroupLayout pListaLayout = new javax.swing.GroupLayout(pLista);
        pLista.setLayout(pListaLayout);
        pListaLayout.setHorizontalGroup(
            pListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pListaLayout.createSequentialGroup()
                        .addComponent(lTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pListaLayout.setVerticalGroup(
            pListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(pListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(lTotal))
                .addContainerGap())
        );

        lFechar.setText("Fechar");
        lFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lPeriodo)
                            .addComponent(lLista))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lFechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lPeriodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lFechar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_lFecharActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        int mes = ParseComboBox.toMonthValue(cbMes);
        int ano = (int)sAno.getValue();
        this.listDespesaFiltrada = new ArrayList<>();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        for (Despesa desp : this.listDespesa) {
            LocalDate data = LocalDate.parse(desp.getData(), formato);
            
            if ( mes == data.getMonthValue() && ano == data.getYear()) {
                this.listDespesaFiltrada.add(desp);
            }
        }
        
        Collections.sort(this.listDespesaFiltrada);
        ParseSet.toTable(listDespesaFiltrada, tLista);
        ChangeLabel.getTotal(listDespesaFiltrada, lValorTotal);
    }//GEN-LAST:event_bBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lAno;
    private javax.swing.JButton lFechar;
    private javax.swing.JLabel lLista;
    private javax.swing.JLabel lMes;
    private javax.swing.JLabel lPeriodo;
    private javax.swing.JLabel lTotal;
    private javax.swing.JLabel lValorTotal;
    private javax.swing.JPanel pLista;
    private javax.swing.JPanel pPeriodo;
    private javax.swing.JSpinner sAno;
    private javax.swing.JTable tLista;
    // End of variables declaration//GEN-END:variables
}
