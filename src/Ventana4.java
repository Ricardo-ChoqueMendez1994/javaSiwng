import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana4 {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtCiudad;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana4 window = new Ventana4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ventana4() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(155, 30, 132, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(155, 74, 132, 20);
		frame.getContentPane().add(txtCiudad);
		txtCiudad.setColumns(10);
		
		JLabel txtFrase = new JLabel("");
		txtFrase.setBounds(104, 105, 293, 20);
		frame.getContentPane().add(txtFrase);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnAceptar) {
					txtFrase.setText("Su nombre es " + txtNombre.getText() + " y es de " + txtCiudad.getText());
				}
			}
		});
		btnAceptar.setBounds(155, 136, 132, 23);
		frame.getContentPane().add(btnAceptar);
		
		JButton btnDesactivar = new JButton("Desactivar");
		btnDesactivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnDesactivar) {
					txtNombre.setEnabled(false);
					txtCiudad.setEnabled(false);
					txtFrase.setEnabled(false);
				}
			}
		});
		btnDesactivar.setBounds(155, 176, 132, 23);
		frame.getContentPane().add(btnDesactivar);
		
		JButton btnActivar = new JButton("Activar");
		btnActivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnActivar) {
					txtNombre.setEnabled(true);
					txtCiudad.setEnabled(true);
					txtFrase.setEnabled(true);
				}
			}
		});
		btnActivar.setBounds(155, 210, 132, 23);
		frame.getContentPane().add(btnActivar);
	}
}
