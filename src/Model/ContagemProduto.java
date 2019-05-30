package Model;

public class ContagemProduto {

    private String id_produto;
    private String quant;

    public String getId_produto() {
        return id_produto;
    }

    public void setId_produto(String id_produto) {
        this.id_produto = id_produto;
    }

    public String getQuant() {
        return quant;
    }

    public void setQuant(String quant) {
        this.quant = quant;
    }

    public ContagemProduto(String id_produto, String quant) {
        this.id_produto = id_produto;
        this.quant = quant;
    }
    
    
    
}
