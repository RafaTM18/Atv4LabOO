package laboo.atv4laboo.classes;

public class Servico extends Despesa{
    
    private String cnpj;
    private String descricao;

    public Servico(String cnpj, String descricao, String data, double valor) {
        super(data, valor);
        this.cnpj = cnpj;
        this.descricao = descricao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        String str = "Despesa (Serviço):\nCNPJ = " + cnpj + "\nDescrição = " + descricao + "\nData = " + super.getData() + "\nValor = " + super.getValor() + "\n";
        str += "===========================\n";
        return str;
    }
    
    
    
}
