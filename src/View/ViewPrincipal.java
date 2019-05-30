package View;

import ViewsFinais.ViewCadastroSetor;
import ViewsFinais.ViewCadastroServico;
import ViewsFinais.ViewCadastroProduto;
import ViewsFinais.ViewCadastroFuncionario;
import ViewsFinais.ViewCadastroCategoriaProduto;
import ViewsFinais.ViewCadastroCargo;

public class ViewPrincipal extends javax.swing.JDialog {

    public ViewPrincipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemArtesao = new javax.swing.JMenuItem();
        jMenuItemProduto = new javax.swing.JMenuItem();
        jMenuItemServico = new javax.swing.JMenuItem();
        jMenuItemCargo = new javax.swing.JMenuItem();
        jMenuItemCP = new javax.swing.JMenuItem();
        jMenuItemSetor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemProducao = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastrar");

        jMenuItemArtesao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemArtesao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-plus-math-30.png"))); // NOI18N
        jMenuItemArtesao.setText("Funcionario");
        jMenuItemArtesao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemArtesaoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemArtesao);

        jMenuItemProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItemProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-plus-math-30.png"))); // NOI18N
        jMenuItemProduto.setText("Produto");
        jMenuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemProduto);

        jMenuItemServico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItemServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-plus-math-30.png"))); // NOI18N
        jMenuItemServico.setText("Serviço");
        jMenuItemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemServicoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemServico);

        jMenuItemCargo.setText("Cargo");
        jMenuItemCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCargoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCargo);

        jMenuItemCP.setText("Categoria Produto");
        jMenuItemCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCPActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCP);

        jMenuItemSetor.setText("Setor");
        jMenuItemSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSetorActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSetor);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Registro");

        jMenuItemProducao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItemProducao.setText("Produção");
        jMenuItemProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProducaoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemProducao);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemArtesaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemArtesaoActionPerformed
        this.dispose();
        ViewCadastroFuncionario vl = new ViewCadastroFuncionario();
        vl.setTitle("Funcionario");
        vl.setResizable(false);
        vl.setLocationRelativeTo(null);
        vl.setVisible(true);
    }//GEN-LAST:event_jMenuItemArtesaoActionPerformed

    private void jMenuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoActionPerformed
        this.dispose();
        ViewCadastroProduto vl = new ViewCadastroProduto();
        vl.setTitle("Produto");
        vl.setResizable(false);
        vl.setLocationRelativeTo(null);
        vl.setVisible(true);
    }//GEN-LAST:event_jMenuItemProdutoActionPerformed

    private void jMenuItemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemServicoActionPerformed
        this.dispose();
        ViewCadastroServico vl = new ViewCadastroServico();
        vl.setTitle("Servico");
        vl.setResizable(false);
        vl.setLocationRelativeTo(null);
        vl.setVisible(true);
    }//GEN-LAST:event_jMenuItemServicoActionPerformed

    private void jMenuItemProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProducaoActionPerformed

    }//GEN-LAST:event_jMenuItemProducaoActionPerformed

    private void jMenuItemCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCargoActionPerformed
        this.dispose();
        ViewCadastroCargo vl = new ViewCadastroCargo();
        vl.setTitle("Cargo");
        vl.setResizable(false);
        vl.setLocationRelativeTo(null);
        vl.setVisible(true);

    }//GEN-LAST:event_jMenuItemCargoActionPerformed

    private void jMenuItemCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCPActionPerformed
        this.dispose();
        ViewCadastroCategoriaProduto vl = new ViewCadastroCategoriaProduto();
        vl.setTitle("Categoria Produto");
        vl.setResizable(false);
        vl.setLocationRelativeTo(null);
        vl.setVisible(true);

        
    }//GEN-LAST:event_jMenuItemCPActionPerformed

    private void jMenuItemSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSetorActionPerformed
        this.dispose();
        ViewCadastroSetor vl = new ViewCadastroSetor();
        vl.setTitle("Cargo");
        vl.setResizable(false);
        vl.setLocationRelativeTo(null);
        vl.setVisible(true);

    }//GEN-LAST:event_jMenuItemSetorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemArtesao;
    private javax.swing.JMenuItem jMenuItemCP;
    private javax.swing.JMenuItem jMenuItemCargo;
    private javax.swing.JMenuItem jMenuItemProducao;
    private javax.swing.JMenuItem jMenuItemProduto;
    private javax.swing.JMenuItem jMenuItemServico;
    private javax.swing.JMenuItem jMenuItemSetor;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
