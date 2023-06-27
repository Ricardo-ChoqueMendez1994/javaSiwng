import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Venatana9 {

	private JFrame frame;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Venatana9 window = new Venatana9();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Venatana9() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel etiTexto = new JLabel("");
		etiTexto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		etiTexto.setBounds(124, 106, 191, 34);
		frame.getContentPane().add(etiTexto);
		
		JButton btnConcatena = new JButton("Concatena");
		btnConcatena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnConcatena) {
					etiTexto.setText(txtPalabra1.getText()+txtPalabra2.getText());
				}
			}
		});
		btnConcatena.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnConcatena.setBounds(150, 176, 154, 42);
		frame.getContentPane().add(btnConcatena);
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtPalabra1.setText("       REY");
		txtPalabra1.setBounds(21, 21, 111, 34);
		frame.getContentPane().add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setText("  UNIVERSAL");
		txtPalabra2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtPalabra2.setColumns(10);
		txtPalabra2.setBounds(302, 21, 111, 34);
		frame.getContentPane().add(txtPalabra2);
	}

}
