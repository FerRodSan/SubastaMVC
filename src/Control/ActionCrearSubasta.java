package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionCrearSubasta implements ActionListener {

	private ParaUi paraui;

	public ActionCrearSubasta(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (paraui.productoVacio()) {
			paraui.mensajeError();
		} else {
			paraui.subastar();
			paraui.ponerProductoMensaje();
			paraui.actualizarComboPujadores();
		}
	}
}
