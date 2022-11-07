package laboo.atv4laboo.classes;

public class EnergiaEletrica extends Despesa{

    public EnergiaEletrica(String data, double valor) {
        super(data, valor);
    }

    @Override
    public String toString() {
        String str = "Despesa (Energia Elétrica):\nData = " + super.getData() + "\nValor = " + super.getValor() + "\n";
        str += "===========================\n";
        return str;
    }
    
    
    
}
