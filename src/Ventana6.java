import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class Ventana6 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana6 window = new Ventana6();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ventana6() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel etiNombre = new JLabel("     Ricardo");
		etiNombre.setBounds(183, 33, 67, 31);
		etiNombre.setOpaque(true);
		etiNombre.setBackground(Color.green);
		frame.getContentPane().add(etiNombre);
		
		// BOTON ESQUINA
		
		JButton btnEsquina = new JButton("Esquina");
		btnEsquina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnEsquina) {
					etiNombre.setLocation(355, 235);
				}
			}
		});
		btnEsquina.addMouseListener(new MouseListener() {

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

			@Override
			public void mouseEntered(MouseEvent e) {
				if (e.getSource() == btnEsquina) {
					btnEsquina.setSize(95, 30);
				}
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (e.getSource() == btnEsquina) {
					btnEsquina.setSize(85, 25);
				}
			}
			
		});
		btnEsquina.setBounds(49, 97, 89, 23);
		frame.getContentPane().add(btnEsquina);
		
		// BOTON CENTRO		
		
		JButton btnCentro = new JButton("Centro");
		btnCentro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnCentro) {
					etiNombre.setLocation(180, 120);
				}
			}
		});
		
		btnCentro.addMouseListener(new MouseListener() {

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

			@Override
			public void mouseEntered(MouseEvent e) {
				if (e.getSource() == btnCentro) {
					btnCentro.setSize(95, 30);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (e.getSource() == btnCentro) {
					btnCentro.setSize(85, 25);
				}
			}
			
		});
		btnCentro.setBounds(49, 152, 89, 23);
		frame.getContentPane().add(btnCentro);
		
		// BOTON AGRANDAR		
		
		JButton btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setBounds(300, 97, 89, 23);
		frame.getContentPane().add(btnAgrandar);
		btnAgrandar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnAgrandar) {
					etiNombre.setSize(70, 50);
				}
			}
		});
		
		btnAgrandar.addMouseListener(new MouseListener() {

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

			@Override
			public void mouseEntered(MouseEvent e) {
				if (e.getSource() == btnAgrandar) {
					btnAgrandar.setSize(95, 30);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (e.getSource() == btnAgrandar) {
					btnAgrandar.setSize(85, 25);
				}
			}
			
		});
		
		// BOTON ECHICAR
		
		JButton btnAchicar = new JButton("Achicar");
		btnAchicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnAchicar) {
					etiNombre.setSize(40, 25);
				}
			}
		});
		
		btnAchicar.addMouseListener(new MouseListener() {

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

			@Override
			public void mouseEntered(MouseEvent e) {
				if (e.getSource() == btnAchicar) {
					btnAchicar.setSize(95, 30);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (e.getSource() == btnAchicar) {
					btnAchicar.setSize(85, 25);
				}
			}
			
		});
		btnAchicar.setBounds(300, 152, 89, 23);
		frame.getContentPane().add(btnAchicar);
	}

}
