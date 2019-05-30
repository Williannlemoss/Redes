package Model;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Produto {
    private int id;
    private String nomeProduto;
    private Tipo tipo;
    private CategoriaProduto categoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }
    
    public void cadastrar(String nomeProduto, int tipo , String peso, int idCategoria){
        try {
                Connection con = ConnectionFactory.getConnection();
                String query;
                query = "insert into produto (nome_produto, tipo, ativo, peso, id_categoria) values (?,?,1,?,?)";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setString(1, nomeProduto);
                stmt.setInt(2, tipo);
                stmt.setString(3, peso);
                stmt.setInt(4, idCategoria);
                stmt.executeUpdate();
                stmt.close();
                con.close();
                JOptionPane.showOptionDialog(null, "Cadastro Realizado com Sucesso", "Confirmação!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, "ok");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
    }
    
}
