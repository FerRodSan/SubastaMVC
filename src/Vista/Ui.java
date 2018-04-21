package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ui extends JFrame {

	private JPanel cardPane;
	protected UiSubasta subasta = new UiSubasta();
	protected UiUsuario usuario = new UiUsuario();
	protected UiMenuInicial inicial = new UiMenuInicial();
	protected UiExplicacion explicacion = new UiExplicacion();

	/**
	 * Create the frame.
	 */
	public Ui() {

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnUsuario = new JMenu("Usuario");
		menuBar.add(mnUsuario);

		JMenuItem mntmAadirUsuario = new JMenuItem("A\u00F1adir Usuario");
		mnUsuario.add(mntmAadirUsuario);

		JMenu mnSubasta = new JMenu("Subasta");
		menuBar.add(mnSubasta);

		JMenuItem mntmEmpezarSubasta = new JMenuItem("Empezar Subasta");
		mnSubasta.add(mntmEmpezarSubasta);

		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);

		JMenuItem mntmExplicacion = new JMenuItem("Explicacion");
		mnAyuda.add(mntmExplicacion);

		setMinimumSize(new Dimension(700, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(menuBar);
		menuBar.add(mnUsuario);
		mnUsuario.add(mntmAadirUsuario);
		menuBar.add(mnSubasta);
		mnSubasta.add(mntmEmpezarSubasta);
		menuBar.add(mnAyuda);
		mnAyuda.add(mntmExplicacion);
		cardPane = new JPanel();
		cardPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cardPane);
		cardPane.setLayout(new CardLayout(0, 0));
		cardPane.add(subasta, "subasta");
		cardPane.add(usuario, "usuario");
		cardPane.add(inicial, "inicial");
		cardPane.add(explicacion, "explicacion");
		CardLayout layout = (CardLayout) cardPane.getLayout();
		layout.show(cardPane, "inicial");

		mntmExplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(cardPane, "explicacion");
			}
		});
		mntmEmpezarSubasta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(cardPane, "subasta");
			}
		});
		mntmAadirUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(cardPane, "usuario");
			}
		});
	}

	public JButton getbtnIrAusuario() {
		return usuario.getbtnAnadir();
	}

	public JButton getBtnIrCrearSubasta() {
		return subasta.getBtnCrearSubasta();
	}

	public JButton getBtnIrPujar() {
		return subasta.getBtnPuja();
	}

	public JTextField getNombreUsuario() {
		return usuario.getTxtNombre();
	}

	public JTextField getCreditoUsuario() {
		return usuario.getTxtCredito();
	}

	public JTextPane getListaUsuarios() {
		return usuario.getTxtListaUsuario();
	}

	public JComboBox getComboUsu() {
		return subasta.getComboUsuarios();
	}

	public JComboBox getComboPuj() {
		return subasta.getComboPujador();
	}

	public JTextField getProducto() {
		return subasta.getTxtProducto();
	}

	public JTextField getMensajeProducto() {
		return subasta.getTxtProductoSubastado();
	}

	public JTextField getApuesta() {
		return subasta.getTxtApuesta();
	}

	public JTextPane getListaPuja() {
		return subasta.getTxtListaPujas();
	}

	public JTextField getMensaje() {
		return subasta.getTxtGanador();
	}

	public JButton getBtnIrTerminar() {
		return subasta.getBtnTerminar();
	}
	
	public JTextField getTxtMensajeErrorUsuario() {
		return usuario.getTxtErrorUsuario();
	}
	public JTextField getTxtMensajeErrorPuja() {
		return subasta.getTxtErrorPuja();
	}

}
