package Model;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Servico {

    private int id;
    private String nomeServico;
    private Setor setor;

    public Servico() {
    }

    public Servico(int id, String nomeServico, Setor setor) {
        this.setId(id);
        this.setNomeServico(nomeServico);
        this.setSetor(setor);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public void cadastro(String nome, int setor) {
        try {
            Connection con = ConnectionFactory.getConnection();
            String query;
            query = "insert into servico (nome_servico, id_setor) values (?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, nome);
            stmt.setInt(2, setor);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showOptionDialog(null, "Cadastro Realizado com Sucesso", "Confirmação!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, "ok");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

}
