package Control;

import Modelo.Usuario;

public interface ParaUiable {
	
	public void actualizarListaPujadoresSubasta();
	
	public void agregarUsuarioPuja();
	
	public boolean comprobarTxtVacio();

	public void mostrarGanador(Usuario mayorPostor);

}
