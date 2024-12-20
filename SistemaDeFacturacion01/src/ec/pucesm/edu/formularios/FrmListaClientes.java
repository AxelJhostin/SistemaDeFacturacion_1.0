package ec.pucesm.edu.formularios;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ec.edu.pucesm.clases.Cliente;

public class FrmListaClientes extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable tblCliente;
	private DefaultTableModel modelo;
	
	private boolean nuevoClienteAbierto = false;

	
	public FrmListaClientes() {
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setTitle("Lista de clientes");
		setBounds(100, 100, 734, 300);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 61, 650, 198);
		getContentPane().add(scrollPane);
		
		tblCliente = new JTable();
		tblCliente.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cedula", "Nombre", "Apellido", "Direccion", "Telefono", "Email","Boton"
			}
		));
		scrollPane.setViewportView(tblCliente);
		
		
		
		JButton btnAgregarNuevosClientes = new JButton("Agregar Nuevos Clientes");
		btnAgregarNuevosClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!nuevoClienteAbierto) {

                    FrmNuevoCliente frmNuevoCliente = new FrmNuevoCliente(FrmListaClientes.this);
                    frmNuevoCliente.setVisible(true);
                    nuevoClienteAbierto = true; 
                } else {
                    JOptionPane.showMessageDialog(FrmListaClientes.this, "La ventana para agregar un nuevo cliente ya está abierta.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
		});
		btnAgregarNuevosClientes.setBounds(33, 27, 196, 23);
		getContentPane().add(btnAgregarNuevosClientes);

		modelo = (DefaultTableModel) tblCliente.getModel();
		
	}
	public void cargarDatosEnTabla(Cliente cliente) {
        boolean existeCedula = false;
        
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String cedulaExistente = (String) modelo.getValueAt(i, 0);
            if (cedulaExistente.equals(cliente.getCedula())) {
                existeCedula = true;
                break; 
            }
        }
        
        if (existeCedula) {
            JOptionPane.showMessageDialog(this, "La cédula ya ha sido ingresada.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Object[] fila = new Object[7];
            fila[0] = cliente.getCedula();
            fila[1] = cliente.getNombre();
            fila[2] = cliente.getApellido();
            fila[3] = cliente.getDireccion();
            fila[4] = cliente.getTelefono();
            fila[5] = cliente.getEmail();
            fila[6] = new JButton("Editar");
            modelo.addRow(fila);
        }
    }
	
	public void actualizarDatosEnTabla(Cliente cliente) {
	    for (int i = 0; i < modelo.getRowCount(); i++) {
	        String cedulaExistente = (String) modelo.getValueAt(i, 0);
	        if (cedulaExistente.equals(cliente.getCedula())) {
	            modelo.setValueAt(cliente.getNombre(), i, 1);
	            modelo.setValueAt(cliente.getApellido(), i, 2);
	            modelo.setValueAt(cliente.getDireccion(), i, 3);
	            modelo.setValueAt(cliente.getTelefono(), i, 4);
	            modelo.setValueAt(cliente.getEmail(), i, 5);
	            break;
	        }
	    }
	}
	
	 public void resetVentanaNuevoCliente() {
	        nuevoClienteAbierto = false;
	    }

}	
