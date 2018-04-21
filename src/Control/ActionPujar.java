package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionPujar implements ActionListener{
	
	private ParaUi paraui;

	public ActionPujar(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (paraui.comprobarPuja()) {
			paraui.mensajeError();
		} else {
			paraui.crearPuja();
			paraui.actualizarListaPujadoresSubasta();
		}
	}
}
