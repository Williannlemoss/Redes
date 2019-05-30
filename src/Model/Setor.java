package Model;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Setor {

    private int id;
    private String nomeSetor;

    public Setor() {
    }

    public Setor(int id, String nomeSetor) {
        this.setId(id);
        this.setNomeSetor(nomeSetor);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public void cadastra(String nome) {
        try {
            Connection con = ConnectionFactory.getConnection();
            String query;
            query = "insert into setor (nome_setor) values (?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, nome);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showOptionDialog(null, "Cadastro Realizado com Sucesso", "Confirmação!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, "ok");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

}
