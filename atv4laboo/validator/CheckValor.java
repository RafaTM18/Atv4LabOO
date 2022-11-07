package laboo.atv4laboo.validator;

public class CheckValor {
    
    public static boolean validate(String valor) {
        try {
            Double.parseDouble(valor);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
