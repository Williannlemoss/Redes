/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import JDBC.ConnectionFactory;
import Model.MostrarJComboBox;
import java.sql.*;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author willi
 */
public class ViewCadastroProducao extends javax.swing.JDialog {

    private final MostrarJComboBox jcombobox = new MostrarJComboBox();

    public ViewCadastroProducao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.formatarCampos();
        this.model = (DefaultTableModel) jTableProducao.getModel();
        jcombobox.mostrarServico(jComboBoxServico);
        jcombobox.mostrarFuncionario(jComboBoxFunc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxServico = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jButtonCadastar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBoxFunc = new javax.swing.JComboBox<>();
        jFormattedTextFielddataP = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldDataL = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProducao = new javax.swing.JTable();
        jButtonCadastar1 = new javax.swing.JButton();
        jButtonVoltar1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Id");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Serviço");

        jComboBoxServico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Serviço 1 ", "Serviço 2", " " }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Produção");

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonCadastar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCadastar.setText("Cadastrar");
        jButtonCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastarActionPerformed(evt);
            }
        });

        jComboBoxFunc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Setor 1", "Setor 2", " " }));

        jFormattedTextFielddataP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Data Pagamento");

        jFormattedTextFieldDataL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Data lançamento");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Funcionario");

        jTextFieldId.setEditable(false);
        jTextFieldId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTableProducao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Produto", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(jTableProducao);
        if (jTableProducao.getColumnModel().getColumnCount() > 0) {
            jTableProducao.getColumnModel().getColumn(0).setResizable(false);
            jTableProducao.getColumnModel().getColumn(1).setResizable(false);
            jTableProducao.getColumnModel().getColumn(2).setResizable(false);
        }

        jButtonCadastar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCadastar1.setText("Inserir produto");
        jButtonCadastar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastar1ActionPerformed(evt);
            }
        });

        jButtonVoltar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonVoltar1.setText("Remover produto");
        jButtonVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldDataL, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextFielddataP, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxServico, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonCadastar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButtonVoltar1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                            .addComponent(jButtonCadastar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jFormattedTextFielddataP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldDataL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCadastar1)
                        .addGap(19, 19, 19)
                        .addComponent(jButtonVoltar1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonCadastar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        ViewPrincipal vl = new ViewPrincipal(null, true);
        vl.setTitle("Principal");
        this.dispose();
        vl.setResizable(false);
        vl.setLocationRelativeTo(null);
        vl.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastarActionPerformed

        if (this.verifica()) {
            try {
                Connection con = ConnectionFactory.getConnection();
                String query = "";
                String anoInverso = this.jFormattedTextFieldDataL.getText().substring(6, 10) + this.jFormattedTextFieldDataL.getText().substring(2, 6) + this.jFormattedTextFieldDataL.getText().substring(0, 2);
                query = "insert into registro_producao(data,pagar,id_funcionario,id_servico) values(?,0,?,?)";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setString(1, anoInverso);
                stmt.setInt(2, this.jComboBoxFunc.getSelectedIndex());
                stmt.setInt(3, this.jComboBoxServico.getSelectedIndex());
                stmt.executeUpdate();

                //--------------------------------------------------
                query = "select count(*) from registro_producao";
                stmt = con.prepareStatement(query);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                String id = rs.getString("count(*)");

                //--------------------------------------------------
                query = "insert into registro_produto(id_produto,quantidade,id_registro) values(?,?," + id + ")";
                for (int i = 0; i < jTableProducao.getRowCount(); i++) {
                    stmt = con.prepareStatement(query);
                    stmt.setInt(1, (int) jTableProducao.getValueAt(i, 0));
                    stmt.setString(2, (String) jTableProducao.getValueAt(i, 2));
                    stmt.executeUpdate();
                }

                stmt.close();
                con.close();
                JOptionPane.showOptionDialog(null, "Cadastro Realizado com Sucesso", "Confirmação!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, "ok");
                this.jComboBoxFunc.setSelectedIndex(0);
                this.jComboBoxServico.setSelectedIndex(0);
                this.jFormattedTextFieldDataL.setText("");
                this.jFormattedTextFielddataP.setText("");

                while (jTableProducao.getRowCount() > 0) {
                    DefaultTableModel model = (DefaultTableModel) this.jTableProducao.getModel();
                    model.removeRow(0);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonCadastarActionPerformed

    private void jButtonCadastar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastar1ActionPerformed
        ViewADDProdutor vl = new ViewADDProdutor(null, true, this.jTableProducao);
        vl.setTitle("Principal");
        vl.setFocusableWindowState(true);
        vl.setResizable(false);
        vl.setLocationRelativeTo(null);
        vl.setVisible(true);
    }//GEN-LAST:event_jButtonCadastar1ActionPerformed

    private void jButtonVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltar1ActionPerformed
        if (this.jTableProducao.getSelectedRow() >= 0) {
            DefaultTableModel model = (DefaultTableModel) this.jTableProducao.getModel();
            model.removeRow(this.jTableProducao.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(this, "Selecione Uma linha");
        }
    }//GEN-LAST:event_jButtonVoltar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroProducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroProducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroProducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroProducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewCadastroProducao dialog = new ViewCadastroProducao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public boolean verifica() {
        if (this.jFormattedTextFieldDataL.getText().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Nome Setor");
            this.jFormattedTextFieldDataL.requestFocus();
            return false;
        }
        if (this.jComboBoxFunc.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione o campo Setor");
            this.jComboBoxFunc.requestFocus();
            return false;
        }
        if (this.jComboBoxServico.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione o campo Serviço");
            this.jComboBoxServico.requestFocus();
            return false;
        }
        return true;
    }
    private final DefaultTableModel model;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastar;
    private javax.swing.JButton jButtonCadastar1;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JButton jButtonVoltar1;
    private javax.swing.JComboBox<String> jComboBoxFunc;
    private javax.swing.JComboBox<String> jComboBoxServico;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataL;
    private javax.swing.JFormattedTextField jFormattedTextFielddataP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableProducao;
    private javax.swing.JTextField jTextFieldId;
    // End of variables declaration//GEN-END:variables

    private void formatarCampos() {
        try {
            MaskFormatter mask = new MaskFormatter("##/##/####");
            MaskFormatter mask1 = new MaskFormatter("##/##/####");
            mask.install(jFormattedTextFieldDataL);
            mask1.install(jFormattedTextFielddataP);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possivel formatar o texto");
        }
    }
}