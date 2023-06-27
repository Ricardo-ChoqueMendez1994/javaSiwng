import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Ventana7 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana7 window = new Ventana7();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ventana7() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel etiTexto = new JLabel("           RICHIE");
		etiTexto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		etiTexto.setBounds(134, 40, 144, 23);
		frame.getContentPane().add(etiTexto);
		
		//BOTON LETRA AZUL
		
		JButton btnAzul = new JButton("Azul");
		btnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnAzul) {
					etiTexto.setForeground(Color.BLUE);
				}
			}
		});
		btnAzul.setBounds(64, 106, 110, 23);
		frame.getContentPane().add(btnAzul);
		
		//BOTON LETRA ROJO
		
		JButton btnRojo = new JButton("Rojo");
		btnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnRojo) {
					etiTexto.setForeground(Color.RED);
				}
			}
		});
		btnRojo.setBounds(64, 140, 110, 23);
		frame.getContentPane().add(btnRojo);
		
		//BOTON LETRA VERDE
		
		JButton btnVerde = new JButton("Verde");
		btnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnVerde) {
					etiTexto.setForeground(Color.GREEN);
				}
			}
		});
		btnVerde.setBounds(64, 173, 110, 23);
		frame.getContentPane().add(btnVerde);
		
		//BOTON TRASNSPARENTE
		
		JButton btnTransparente = new JButton("Transparente");
		btnTransparente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnTransparente) {
					etiTexto.setOpaque(true);
				}
			}
		});
		btnTransparente.setBounds(64, 207, 110, 23);
		frame.getContentPane().add(btnTransparente);
		
		//BOTON FONDO AZUL
		
		JButton btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnFondoAzul) {
					etiTexto.setOpaque(true);
					etiTexto.setBackground(Color.BLUE);
				}
			}
		});
		btnFondoAzul.setBounds(261, 106, 110, 23);
		frame.getContentPane().add(btnFondoAzul);
		
		//BOTON FONDO ROJO
		
		JButton btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnFondoRojo) {
					etiTexto.setOpaque(true);
					etiTexto.setBackground(Color.RED);
				}
			}
		});
		btnFondoRojo.setBounds(261, 140, 110, 23);
		frame.getContentPane().add(btnFondoRojo);
		
		//BOTON FONDO VERDE
		
		JButton btnFondoVerde = new JButton("Fondo Verde");
		btnFondoVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnFondoVerde) {
					etiTexto.setOpaque(true);
					etiTexto.setBackground(Color.green);
				}
			}
		});
		btnFondoVerde.setBounds(261, 173, 110, 23);
		frame.getContentPane().add(btnFondoVerde);
		
		//BOTON OPACA
		
		JButton btnOpcaca = new JButton("Opcaca");
		btnOpcaca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnOpcaca) {
					etiTexto.setOpaque(false);
				}
			}
		});
		btnOpcaca.setBounds(261, 207, 110, 23);
		frame.getContentPane().add(btnOpcaca);
	}

}
