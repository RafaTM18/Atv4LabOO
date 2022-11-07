package laboo.atv4laboo.classes;

import java.io.Serializable;

public abstract class Despesa implements Serializable, Comparable<Despesa>{
    
    private String data;
    private double valor;

    public Despesa(String data, double valor) {
        this.data = data;
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String Data) {
        this.data = Data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double Valor) {
        this.valor = Valor;
    }

    @Override
    public int compareTo(Despesa outraDesp) {
        if (this.valor < outraDesp.getValor()) {
            return 1;
        } else if (this.valor > outraDesp.getValor()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    
}
