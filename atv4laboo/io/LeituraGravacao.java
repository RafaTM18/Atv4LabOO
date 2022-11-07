package laboo.atv4laboo.io;

import java.util.List;
import laboo.atv4laboo.classes.Despesa;
import laboo.atv4laboo.exception.ErroDeGravacaoException;
import laboo.atv4laboo.exception.ErroDeLeituraException;

public interface LeituraGravacao {
    
    public abstract void gravarDados(List<Despesa> listDespesas) throws ErroDeGravacaoException;
    
    public abstract List<Despesa> lerDados() throws ErroDeLeituraException;
}

