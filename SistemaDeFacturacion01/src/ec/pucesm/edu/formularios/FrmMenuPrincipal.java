package ec.pucesm.edu.formularios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class FrmMenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JDesktopPane desktopPane;

	private boolean clienteAbierto = false;
    private boolean listaClienteAbierto = false;
	
	public FrmMenuPrincipal() {
		setTitle("Sistema de facturacion - Hernandez Axel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCliente = new JMenu("Cliente");
		mnCliente.setFont(new Font("Uni Neue Bold", Font.BOLD, 14));
		menuBar.add(mnCliente);
		
		JMenuItem mntmAgregarCliente = new JMenuItem("Agregar Cliente");
		mntmAgregarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!clienteAbierto) {
                    FrmCrearCliente frmCliente = new FrmCrearCliente();
                    frmCliente.setVisible(true);
                    desktopPane.add(frmCliente);
                    clienteAbierto = true; 
                } else {
                    System.out.println("La ventana 'Agregar Cliente' ya está abierta.");
                }	
			}
		});
		mntmAgregarCliente.setFont(new Font("Uni Neue Regular", Font.PLAIN, 14));
		mnCliente.add(mntmAgregarCliente);
		
		JMenuItem mntmListaCliente = new JMenuItem("ListaCliente");
		mntmListaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if (!listaClienteAbierto) {
                    FrmListaClientes frmListaCliente = new FrmListaClientes();
                    frmListaCliente.setVisible(true);
                    desktopPane.add(frmListaCliente);
                    listaClienteAbierto = true;
                } else {
                    System.out.println("La ventana 'Lista Cliente' ya está abierta.");
                }
            }
		});
		mntmListaCliente.setFont(new Font("Uni Neue Regular", Font.PLAIN, 14));
		mnCliente.add(mntmListaCliente);
		
		JMenu mnSalir = new JMenu("Salir");
		mnSalir.setFont(new Font("Uni Neue Bold", Font.BOLD, 14));
		menuBar.add(mnSalir);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnSalir.add(mntmSalir);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0,0));
		
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane);
	}
	public void resetVentanas() {
        clienteAbierto = false;
        listaClienteAbierto = false;
    }
}
