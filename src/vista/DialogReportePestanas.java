package vista;

import javax.swing.*;
import java.awt.*;

public class DialogReportePestanas extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JTabbedPane pestanas;
	private DialogReporteBaloto baloto;
	private DialogReporteOhPolla ohpolla;
	private DialogReporteSuperAstro superastro;
	private DialogReporteTotales totales;
	
	public DialogReportePestanas()
	{
		setLayout(new GridLayout());
		pestanas = new JTabbedPane();
		baloto = new DialogReporteBaloto();
		ohpolla = new DialogReporteOhPolla();
		superastro = new DialogReporteSuperAstro();
		totales = new DialogReporteTotales();
		
		add(pestanas);
		pestanas.addTab("Baloto", baloto);
		pestanas.addTab("ohpolla", ohpolla);
		pestanas.addTab("SuperAstro", superastro);
		pestanas.addTab("Total", totales);
	}

	public DialogReporteBaloto getBaloto() {
		return baloto;
	}

	public DialogReporteOhPolla getOhpolla() {
		return ohpolla;
	}

	public DialogReporteSuperAstro getSuperastro() {
		return superastro;
	}

	public DialogReporteTotales getTotales() {
		return totales;
	}
}
