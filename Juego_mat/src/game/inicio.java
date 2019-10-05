package game;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inicio extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	
	
	public JLabel incorrecto, correcto;
	
	//private ButtonGroup bg = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
		 inicio dialog = new inicio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public inicio() {
		setBounds(100, 100, 580, 418);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel derivada = new JLabel("Resultados");
		derivada.setForeground(new Color(0, 0, 128));
		derivada.setFont(new Font("Century Gothic", Font.BOLD, 25));
		derivada.setBounds(225, 75, 141, 60);
		contentPanel.add(derivada);
		
		JButton button = new JButton("");
		button.setBackground(new Color(0, 0, 0));
		button.setBounds(288, 128, 3, 185);
		contentPanel.add(button);
		
		incorrecto = new JLabel("");
		incorrecto.setForeground(new Color(178, 34, 34));
		incorrecto.setFont(new Font("Century Gothic", Font.BOLD, 25));
		incorrecto.setBounds(342, 199, 141, 60);
		contentPanel.add(incorrecto);
		
		correcto = new JLabel("");
		correcto.setForeground(new Color(50, 205, 50));
		correcto.setFont(new Font("Century Gothic", Font.BOLD, 25));
		correcto.setBounds(196, 199, 141, 60);
		contentPanel.add(correcto);
		
		JLabel correcto_let = new JLabel("Correctas");
		correcto_let.setForeground(new Color(0, 100, 0));
		correcto_let.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		correcto_let.setBounds(160, 128, 141, 60);
		contentPanel.add(correcto_let);
		
		JLabel incorrecto_let = new JLabel("Incorrectas");
		incorrecto_let.setForeground(new Color(255, 0, 0));
		incorrecto_let.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		incorrecto_let.setBounds(313, 128, 141, 60);
		contentPanel.add(incorrecto_let);
		
		JLabel label = new JLabel("");
		label.setBounds(379, 208, 335, 444);
		contentPanel.add(label);
		label.setIcon(new ImageIcon(inicio.class.getResource("/images/dinoazul.png")));

		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(inicio.class.getResource("/images/question.png")));
		fondo.setBounds(0, 0, 608, 377);
		contentPanel.add(fondo);
	}
	
	
}
