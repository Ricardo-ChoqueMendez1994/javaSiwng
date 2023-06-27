import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 {

	private JFrame frame;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 window = new Ventana1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Ventana1() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNombre = new JLabel("    Richie");
		lblNombre.setBounds(165, 28, 86, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblCiudad = new JLabel("    Calarca");
		lblCiudad.setBounds(165, 53, 86, 14);
		frame.getContentPane().add(lblCiudad);
		
		
		
		JButton btnMostrarN = new JButton("    Mostrar nombre");
		btnMostrarN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnMostrarN) {
					lblNombre.setVisible(true);
				}
			}
		});
		
		
		btnMostrarN.setBounds(162, 89, 121, 23);
		frame.getContentPane().add(btnMostrarN);
		
		JButton btnMostrarC = new JButton("    Mostrar Ciudad");
		btnMostrarC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnMostrarC) {
					lblCiudad.setVisible(true);
				}
			}
		});
		
		
		btnMostrarC.setBounds(165, 123, 118, 23);
		frame.getContentPane().add(btnMostrarC);
		
		JButton btnOcultarN = new JButton("    Ocultar Nombre");
		btnOcultarN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnOcultarN) {
					lblNombre.setVisible(false);
				}
			}
		});
		
		
		btnOcultarN.setBounds(162, 157, 121, 23);
		frame.getContentPane().add(btnOcultarN);
		
		JButton btnOcultarC = new JButton("    Ocultar Cuidad");
		btnOcultarC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnOcultarC) {
					lblCiudad.setVisible(false);
				}
			}
		});
		
		
		btnOcultarC.setBounds(165, 192, 118, 23);
		frame.getContentPane().add(btnOcultarC);
	}
}
