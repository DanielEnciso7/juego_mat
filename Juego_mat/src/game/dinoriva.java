package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class dinoriva extends JFrame {

	private JPanel contentPane;
	public static JLabel rex0, rex1, rex2,rex3,rex4,rex5,rex6,rex7,rex8,rex9,rex10,rex11,rex12,rex13,rex14,rex15,rex16,rex17,rex18,rex19,rex20,rex21,rex22,rex23;
	public static JLabel met1,met2,met3,met4,met5,met6,met7,met8,met9,met10,met11,met12,met13,met14,met15,met16,met17,met18,met19,met20,met21,met22,met23;
	public static int[] resultados;
	static int i=1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dinoriva frame = new dinoriva();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public dinoriva() {
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
			}
	}

