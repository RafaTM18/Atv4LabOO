package laboo.atv4laboo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import laboo.atv4laboo.classes.Despesa;
import laboo.atv4laboo.exception.ErroDeGravacaoException;
import laboo.atv4laboo.exception.ErroDeLeituraException;

public class LeitorGravadorObjetos implements LeituraGravacao{
    
    @Override
    public void gravarDados(List<Despesa> listDespesas) throws ErroDeGravacaoException {
        File dir = new File("./dados");
        if(!dir.exists()) {
            dir.mkdir();
        }
        
        ObjectOutputStream out = null;
        
        try {
            out = new ObjectOutputStream(new FileOutputStream("./dados/despesas.dat"));
            out.writeObject(listDespesas);
        } catch (IOException e) {
            throw new ErroDeGravacaoException();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                throw new ErroDeGravacaoException();
            }
        }
    }

    @Override
    public List<Despesa> lerDados() throws ErroDeLeituraException {
        File arq = new File("./dados/despesas.dat");
	if(!arq.exists()) {
	    return new ArrayList<>();
	}
	
	ObjectInputStream in = null;
	try {
	    in = new ObjectInputStream(new FileInputStream(arq));
            return (ArrayList<Despesa>) in.readObject();
	} catch (IOException ex) {
	    throw new ErroDeLeituraException();
	} catch (ClassNotFoundException ex) {
	    throw new ErroDeLeituraException();
	} finally {
	    try {
		in.close();
	    } catch (IOException ex) {
		throw new ErroDeLeituraException();
	    }
	}
    }
    
}
