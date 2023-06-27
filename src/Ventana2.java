import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 {

	private JFrame frame;
	private JTextField txtTexto;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Ventana2() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(121, 26, 187, 20);
		frame.getContentPane().add(txtTexto);
		txtTexto.setColumns(10);
		
		JLabel etiTexto1 = new JLabel("");
		etiTexto1.setBounds(177, 69, 46, 14);
		frame.getContentPane().add(etiTexto1);
		
		JLabel etiTexto2 = new JLabel("");
		etiTexto2.setBounds(177, 94, 46, 14);
		frame.getContentPane().add(etiTexto2);
		
		JButton btnTraspasa1 = new JButton("Traspasa1");
		btnTraspasa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnTraspasa1) {
					
					etiTexto1.setText(txtTexto.getText());
					
				}
			}
		});
		
		
		btnTraspasa1.setBounds(153, 134, 143, 23);
		frame.getContentPane().add(btnTraspasa1);
		
		JButton btnTraspasa2 = new JButton("Traspasa2");
		btnTraspasa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnTraspasa2) {
					
					etiTexto2.setText(txtTexto.getText());
					
				}
			}
		});
		
		
		btnTraspasa2.setBounds(153, 181, 143, 23);
		frame.getContentPane().add(btnTraspasa2);
	}
}
