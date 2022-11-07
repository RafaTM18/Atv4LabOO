package laboo.atv4laboo.io;

import java.util.List;
import laboo.atv4laboo.classes.Despesa;
import laboo.atv4laboo.exception.ErroDeGravacaoException;

public class Gravador {
    
    public static void gravarDados(LeituraGravacao arq, List<Despesa> listDespesas) throws ErroDeGravacaoException {
	arq.gravarDados(listDespesas);
    }

}
