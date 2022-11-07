package laboo.atv4laboo.shared;

import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class Relogio extends Thread {
    
    private String horas;
    private JLabel componente;

    public Relogio(JLabel componente) {
	this.componente = componente;
    }

    @Override
    public void run() {
	SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
	while(true){
	    Date data = new Date();
	    this.horas = formato.format(data);
	    this.componente.setText(horas);
	    try {
		sleep(1000);
	    } catch(InterruptedException ex) {
		ex.printStackTrace();
	    }
	}
    }
    
}
