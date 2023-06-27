import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class Ventana3 {

	private JFrame frame;
	private JTextField cuadroTexto;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3 window = new Ventana3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ventana3() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel etiTexto = new JLabel("");
		etiTexto.setBounds(142, 89, 162, 20);
		frame.getContentPane().add(etiTexto);
		
		cuadroTexto = new JTextField();
		cuadroTexto.setBounds(142, 44, 162, 20);
		frame.getContentPane().add(cuadroTexto);
		cuadroTexto.setColumns(10);
		cuadroTexto.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getSource() == cuadroTexto) {
					etiTexto.setText(cuadroTexto.getText());
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});

		
		JButton btnVaciar = new JButton("Vaciar");
		btnVaciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnVaciar) {
					etiTexto.setText(null);
				}
			}
		});
		
		
		btnVaciar.setBounds(142, 154, 162, 23);
		frame.getContentPane().add(btnVaciar);
	}

}

