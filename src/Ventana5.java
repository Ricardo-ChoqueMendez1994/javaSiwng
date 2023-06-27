import java.awt.Color;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana5 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana5 window = new Ventana5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ventana5() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel etiPal1 = new JLabel("     Palabra1");
		etiPal1.setBounds(143, 35, 94, 24);
		frame.getContentPane().add(etiPal1);
		
		JLabel etiPal2 = new JLabel("     Palabra2");
		etiPal2.setBounds(143, 70, 94, 24);
		frame.getContentPane().add(etiPal2);
		
		JLabel etiPal3 = new JLabel("     Palabra3");
		etiPal3.setBounds(143, 112, 94, 24);
		frame.getContentPane().add(etiPal3);
		
		JLabel etipal4 = new JLabel("     Palabra4");
		etipal4.setBounds(143, 147, 94, 24);
		frame.getContentPane().add(etipal4);
		
		JLabel etiOcultar = new JLabel("        Ocultar");
		etiOcultar.setBounds(143, 182, 94, 40);
		etiOcultar.setOpaque(true);
		etiOcultar.setBackground(Color.BLACK);
		etiOcultar.addMouseListener(new MouseListener() {

			@Override
			public void mouseEntered(MouseEvent e) {
				if (e.getSource() == etiOcultar) {
					etiPal1.setVisible(false);
					etiPal2.setVisible(false);
					etiPal3.setVisible(false);
					etipal4.setVisible(false);
				}
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (e.getSource() == etiOcultar) {
					etiPal1.setVisible(true);
					etiPal2.setVisible(true);
					etiPal3.setVisible(true);
					etipal4.setVisible(true);
				}
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		frame.getContentPane().add(etiOcultar);
	}

}
