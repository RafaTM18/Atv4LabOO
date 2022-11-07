package laboo.atv4laboo.funcoesGerais;

import java.text.NumberFormat;
import java.text.ParseException;

public class ParseCurrency {
    //Passa do formato R$x,xx para um valor double
    public static double toDouble(String moeda){
        NumberFormat format = NumberFormat.getCurrencyInstance();
        double num = 0;
        try {
            num = format.parse(moeda).doubleValue();
        } catch (ParseException ex) {
            //Não cai aqui, confia
        }
        return num;
    }
    //Passa do valor double para um formato R$x,xx
    public static String toReal(double num){
        NumberFormat format = NumberFormat.getCurrencyInstance();
        String moeda = format.format(num);
        return moeda;
    }
}
