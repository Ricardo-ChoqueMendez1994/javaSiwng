import java.awt.Color;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana8 {

	private JFrame frame;
	private JTextField txtPimerTrimestre;
	private JTextField textSegundoTrimestre;
	private JTextField textTercerTrimestre;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana8 window = new Ventana8();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ventana8() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		txtPimerTrimestre = new JTextField();
		txtPimerTrimestre.setBounds(33, 32, 86, 20);
		frame.getContentPane().add(txtPimerTrimestre);
		txtPimerTrimestre.setColumns(10);
		
		textSegundoTrimestre = new JTextField();
		textSegundoTrimestre.setColumns(10);
		textSegundoTrimestre.setBounds(33, 88, 86, 20);
		frame.getContentPane().add(textSegundoTrimestre);
		
		textTercerTrimestre = new JTextField();
		textTercerTrimestre.setColumns(10);
		textTercerTrimestre.setBounds(33, 155, 86, 20);
		frame.getContentPane().add(textTercerTrimestre);
		
		JLabel etiNotaFinal = new JLabel("");
		etiNotaFinal.setBounds(167, 58, 86, 20);
		frame.getContentPane().add(etiNotaFinal);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBounds(167, 127, 86, 20);
		frame.getContentPane().add(etiResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					double nota1, nota2, nota3;
					double promedio;
					
					if (e.getSource() == btnCalcular) {
						
						nota1 = Double.parseDouble(txtPimerTrimestre.getText());
						
						nota2 = Double.parseDouble(textSegundoTrimestre.getText());
						
						nota3 = Double.parseDouble(textTercerTrimestre.getText());
						
						promedio = ((nota1 + nota2 + nota3)/3);
						
						etiNotaFinal.setText("Nota Final " + promedio);
						
						if (promedio < 5) {
							etiResultado.setText("   SUSPENDIDO");
							etiResultado.setOpaque(true);
							etiResultado.setBackground(Color.RED);
						} else {
							etiResultado.setText("   APROVADO");
							etiResultado.setOpaque(true);
							etiResultado.setBackground(Color.GREEN);
						}
						
					}
				
			}
		});
		btnCalcular.setBounds(223, 192, 134, 33);
		frame.getContentPane().add(btnCalcular);
	}

}
