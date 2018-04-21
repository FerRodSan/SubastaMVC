package Vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextPane;
import java.awt.Insets;
import java.awt.Font;

public class UiExplicacion extends JPanel {

	/**
	 * Create the panel.
	 */
	public UiExplicacion() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblExplicacion = new JLabel("Explicacion:");
		lblExplicacion.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblExplicacion = new GridBagConstraints();
		gbc_lblExplicacion.anchor = GridBagConstraints.WEST;
		gbc_lblExplicacion.fill = GridBagConstraints.VERTICAL;
		gbc_lblExplicacion.insets = new Insets(0, 0, 5, 0);
		gbc_lblExplicacion.gridx = 0;
		gbc_lblExplicacion.gridy = 0;
		add(lblExplicacion, gbc_lblExplicacion);

		JTextPane txtpnElObjetivoDe = new JTextPane();
		txtpnElObjetivoDe.setText(
				"El objetivo de los ejercicios es implementar un sistema de subastas donde los clientes pueden subastar sus propios articulos o pujar por articulos de otros susuarios. Para ello solo hacen falta dos pasos que explicamos a continuacion :    ");
		GridBagConstraints gbc_txtpnElObjetivoDe = new GridBagConstraints();
		gbc_txtpnElObjetivoDe.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnElObjetivoDe.fill = GridBagConstraints.BOTH;
		gbc_txtpnElObjetivoDe.gridx = 0;
		gbc_txtpnElObjetivoDe.gridy = 1;
		add(txtpnElObjetivoDe, gbc_txtpnElObjetivoDe);

		JLabel lblPrimero = new JLabel("Primero:");
		lblPrimero.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblPrimero = new GridBagConstraints();
		gbc_lblPrimero.anchor = GridBagConstraints.WEST;
		gbc_lblPrimero.insets = new Insets(0, 0, 5, 0);
		gbc_lblPrimero.gridx = 0;
		gbc_lblPrimero.gridy = 2;
		add(lblPrimero, gbc_lblPrimero);

		JTextPane txtpnSeDebernAadir = new JTextPane();
		txtpnSeDebernAadir.setText(
				"Se deber\u00E1n a\u00F1adir todos los usuarios presentes en la sala, anotando su nombre y su credito disponible en la cuenta bancaria. Cuuando ya no se anoten mas usuarios pasaremos a la subasta.");
		GridBagConstraints gbc_txtpnSeDebernAadir = new GridBagConstraints();
		gbc_txtpnSeDebernAadir.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnSeDebernAadir.fill = GridBagConstraints.BOTH;
		gbc_txtpnSeDebernAadir.gridx = 0;
		gbc_txtpnSeDebernAadir.gridy = 3;
		add(txtpnSeDebernAadir, gbc_txtpnSeDebernAadir);

		JLabel lblSegundo = new JLabel("Segundo:");
		lblSegundo.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblSegundo = new GridBagConstraints();
		gbc_lblSegundo.anchor = GridBagConstraints.WEST;
		gbc_lblSegundo.insets = new Insets(0, 0, 5, 0);
		gbc_lblSegundo.gridx = 0;
		gbc_lblSegundo.gridy = 4;
		add(lblSegundo, gbc_lblSegundo);

		JTextPane txtpnLoPrimeroEs = new JTextPane();
		txtpnLoPrimeroEs.setText(
				"Lo primero es anotar el producto que se va a subastar y quien es el propietario de ese producto. Despues empieza la subasta a\u00F1adiendo cada puja de cada uno de los usuarios interesados. Acabamos la subasta diciendo el ganador, con su respestctivo aumente de credito");
		GridBagConstraints gbc_txtpnLoPrimeroEs = new GridBagConstraints();
		gbc_txtpnLoPrimeroEs.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnLoPrimeroEs.fill = GridBagConstraints.BOTH;
		gbc_txtpnLoPrimeroEs.gridx = 0;
		gbc_txtpnLoPrimeroEs.gridy = 5;
		add(txtpnLoPrimeroEs, gbc_txtpnLoPrimeroEs);

	}

}
