package vista;

import javax.swing.*;
import java.awt.*;

public class DialogReporteOperaciones extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JButton ok, cancel;
	public static final String OK = "Ok", CANCEL = "Cancel";
	
	public DialogReporteOperaciones()
	{
		setLayout(new GridLayout(1, 2));
		ok = new JButton("Aceptar y Guardar");
		cancel = new JButton("Cancelar y Descartar");
		
		add(ok);
		add(cancel);
		ok.setActionCommand(OK);
		cancel.setActionCommand(CANCEL);
	}

	public JButton getOk() {
		return ok;
	}

	public JButton getCancel() {
		return cancel;
	}

}
