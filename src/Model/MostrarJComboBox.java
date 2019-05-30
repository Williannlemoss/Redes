/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import JDBC.ConnectionFactory;
import ViewsFinais.ViewCadastroServico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author willi
 */
public class MostrarJComboBox {

    public MostrarJComboBox() {

    }

    public void mostrarServico(javax.swing.JComboBox jComboBoxServico) {
        new Thread(() -> {
            jComboBoxServico.removeAllItems();
            jComboBoxServico.addItem("Selecione");
            Connection con;
            try {
                con = ConnectionFactory.getConnection();
                String query = ("select nome_servico from servico");
                PreparedStatement cnd = con.prepareStatement(query);
                ResultSet rs = cnd.executeQuery();
                if (rs.next()) {
                    jComboBoxServico.addItem(rs.getString("nome_servico"));
                    while (rs.next()) {
                        jComboBoxServico.addItem(rs.getString("nome_servico"));
                    }
                    cnd.close();
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ViewCadastroServico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
    }

    public void mostrarSetor(javax.swing.JComboBox jComboBoxSetor) {
        new Thread(() -> {
            jComboBoxSetor.removeAllItems();
            jComboBoxSetor.addItem("Selecione");
            Connection con;
            try {
                con = ConnectionFactory.getConnection();
                String query = ("select nome_setor from setor");
                PreparedStatement cnd = con.prepareStatement(query);
                ResultSet rs = cnd.executeQuery();
                if (rs.next()) {
                    jComboBoxSetor.addItem(rs.getString("nome_setor"));
                    while (rs.next()) {
                        jComboBoxSetor.addItem(rs.getString("nome_setor"));
                    }
                    cnd.close();
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ViewCadastroServico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
    }

    public void mostrarCargo(javax.swing.JComboBox jComboBoxCargo) {
        new Thread(() -> {
            jComboBoxCargo.removeAllItems();
            jComboBoxCargo.addItem("Selecione");
            Connection con;
            try {
                con = ConnectionFactory.getConnection();
                String query = ("select nome_cargo from cargo");
                PreparedStatement cnd = con.prepareStatement(query);
                ResultSet rs = cnd.executeQuery();
                if (rs.next()) {
                    jComboBoxCargo.addItem(rs.getString("nome_cargo"));
                    while (rs.next()) {
                        jComboBoxCargo.addItem(rs.getString("nome_cargo"));
                    }
                    cnd.close();
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ViewCadastroServico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
    }

    public void mostrarCategoria(javax.swing.JComboBox jComboBoxCategoria) {
        new Thread(() -> {
            jComboBoxCategoria.removeAllItems();
            jComboBoxCategoria.addItem("Selecione");
            Connection con;
            try {
                con = ConnectionFactory.getConnection();
                String query = ("select nome_categoria from categoria_produto");
                PreparedStatement cnd = con.prepareStatement(query);
                ResultSet rs = cnd.executeQuery();
                if (rs.next()) {
                    jComboBoxCategoria.addItem(rs.getString("nome_categoria"));
                    while (rs.next()) {
                        jComboBoxCategoria.addItem(rs.getString("nome_categoria"));
                    }
                    cnd.close();
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ViewCadastroServico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
    }

    public void mostrarProduto(javax.swing.JComboBox jComboBoxCategoria) {
        new Thread(() -> {
            jComboBoxCategoria.removeAllItems();
            jComboBoxCategoria.addItem("Selecione");
            Connection con;
            try {
                con = ConnectionFactory.getConnection();
                String query = ("select nome_produto from produto");
                PreparedStatement cnd = con.prepareStatement(query);
                ResultSet rs = cnd.executeQuery();
                if (rs.next()) {
                    jComboBoxCategoria.addItem(rs.getString("nome_produto"));
                    while (rs.next()) {
                        jComboBoxCategoria.addItem(rs.getString("nome_produto"));
                    }
                    cnd.close();
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ViewCadastroServico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
    }

    public void mostrarFuncionario(javax.swing.JComboBox jComboBoxCategoria) {
        new Thread(() -> {
            jComboBoxCategoria.removeAllItems();
            jComboBoxCategoria.addItem("Selecione");
            Connection con;
            try {
                con = ConnectionFactory.getConnection();
                String query = ("select nome_reduzido from funcionario");
                PreparedStatement cnd = con.prepareStatement(query);
                ResultSet rs = cnd.executeQuery();
                if (rs.next()) {
                    jComboBoxCategoria.addItem(rs.getString("nome_reduzido"));
                    while (rs.next()) {
                        jComboBoxCategoria.addItem(rs.getString("nome_reduzido"));
                    }
                    cnd.close();
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ViewCadastroServico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
    }

}
