/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author willi
 */
public class ViewVisualizarProdutos extends javax.swing.JDialog {

    /**
     * Creates new form ViewVisualizarProdutos
     */
    public ViewVisualizarProdutos(java.awt.Frame parent, boolean modal, String id) {
        super(parent, modal);
        initComponents();
        this.model = (DefaultTableModel) this.jTableProducao.getModel();
        this.model.setNumRows(0);
        this.mostrar(id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProducao = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableProducao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Produto", "Quantidade", "Quantidade a ser pago", "Pago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProducao);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Pagar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("selecione os produtos que deseja pagar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1)
                        .addGap(0, 92, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int Cont = 0;
        double soma = 0.0;
        for (int i = 0; i < jTableProducao.getRowCount(); i++) {
            if ((boolean) jTableProducao.getValueAt(i, 4)) {
                Cont++;
                String quant1 = (String) jTableProducao.getValueAt(i, 2);
                String quant2 = (String) jTableProducao.getValueAt(i, 3);
                double quantidade1 = Double.parseDouble(quant1.replace(',', '.'));
                String conv = "";
                int cont = 0;
                for (int j = 0; j < quant2.length(); j++) {
                    if (quant2.charAt(j) == ',') {
                        conv = conv + ".";
                        cont++;
                    }
                }
                if (cont > 1) {
                    JOptionPane.showMessageDialog(null, "Quantidade informada possui mais de uma virgula");
                    break;
                }
            }
        }
        if (Cont > 0) {
            ViewPagamento vp = new ViewPagamento(null, true);
            vp.setResizable(false);
            vp.setLocationRelativeTo(null);
            vp.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione ao menos um serviço a ser pago");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewVisualizarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVisualizarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVisualizarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVisualizarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewVisualizarProdutos dialog = new ViewVisualizarProdutos(new javax.swing.JFrame(), true, "");
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

    private void mostrar(String id) {
        Connection con;
        try {
            con = ConnectionFactory.getConnection();
            String query = ("select * from registro_produto where id_registro = " + id);
            PreparedStatement cnd = con.prepareStatement(query);
            ResultSet rs = cnd.executeQuery();
            if (rs.next()) {
                String quan = rs.getString("quantidade").replace(".", ",");
                model.addRow(new Object[]{
                    rs.getString("id_produto"),
                    this.mostraProduto(rs.getString("id_produto")),
                    quan,
                    "",
                    false});
                while (rs.next()) {
                    quan = rs.getString("quantidade").replace(".", ",");
                    model.addRow(new Object[]{
                        rs.getString("id_produto"),
                        this.mostraProduto(rs.getString("id_produto")),
                        quan,
                        "",
                        false});
                }
                cnd.close();
                con.close();
            }

        } catch (SQLException ex) {

        }
    }

    private String mostraProduto(String id) {
        Connection con;
        try {
            con = ConnectionFactory.getConnection();
            String query = ("select nome_produto from produto where id = " + id);
            PreparedStatement cnd = con.prepareStatement(query);
            ResultSet rs = cnd.executeQuery();
            rs.next();
            return rs.getString("nome_produto");
        } catch (SQLException ex) {
            return "";
        }
    }

    private DefaultTableModel model;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableProducao;
    // End of variables declaration//GEN-END:variables
}
