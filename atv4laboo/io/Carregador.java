package laboo.atv4laboo.io;

import java.util.List;
import laboo.atv4laboo.classes.Despesa;
import laboo.atv4laboo.exception.ErroDeLeituraException;

public class Carregador {
    
    public static List<Despesa> carregarDados(LeituraGravacao arq) throws ErroDeLeituraException {
	return arq.lerDados();
    }
    
}
