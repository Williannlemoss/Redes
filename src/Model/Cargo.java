package Model;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Cargo {

    private int id;
    private String nomeCargo;
    private String nomeReduzido;
    private Servico servicos;

    public Cargo() {
    }
    
    /**
     *
     * @param id
     * @param nomeCargo
     * @param nomeReduzido
     * @param servicos
     */
    public Cargo(int id, String nomeCargo, String nomeReduzido, Servico servicos) {
        this.setId(id);
        this.setNomeCargo(nomeCargo);
        this.setNomeReduzido(nomeReduzido);
        this.setServicos(servicos);
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public String getNomeReduzido() {
        return nomeReduzido;
    }

    public void setNomeReduzido(String nomeReduzido) {
        this.nomeReduzido = nomeReduzido;
    }

    public Servico getServicos() {
        return servicos;
    }

    public void setServicos(Servico servicos) {
        this.servicos = servicos;
    }

    public void cadastrar(String nome,int setor,int servico){
        try {
                Connection con = ConnectionFactory.getConnection();
                String query;
                query = "insert into cargo (nome_cargo, id_setor, id_servico) values (?,?,?)";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setString(1, nome);
                stmt.setInt(2, setor);
                stmt.setInt(3, servico);
                        stmt.executeUpdate();
                stmt.close();
                con.close();
                JOptionPane.showOptionDialog(null, "Cadastro Realizado com Sucesso", "Confirmação!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, "ok");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
    }
}
