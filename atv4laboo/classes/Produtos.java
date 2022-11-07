package laboo.atv4laboo.classes;

public class Produtos extends Despesa{
    
    private int qtd;
    private String descricao;

    public Produtos(int qtd, String descricao, String data, double valor) {
        super(data, valor * qtd);
        this.qtd = qtd;
        this.descricao = descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        String str = "Despesa (Produtos):\nDescrição = " + descricao + "\nQuantidade = "  + qtd + "\nData = " + super.getData() + "\nValor = " + super.getValor() + "\n";
        str += "===========================\n";
        return str;
    }
    
}
