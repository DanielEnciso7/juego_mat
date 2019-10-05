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

public class board extends JFrame {

	private JPanel contentPane;
	public static JLabel rex0, rex1, rex2,rex3,rex4,rex5,rex6,rex7,rex8,rex9,rex10,rex11,rex12,rex13,rex14,rex15,rex16,rex17,rex18,rex19,rex20,rex21,rex22,rex23;
	public static JLabel met0,met1,met2,met3,met4,met5,met6,met7,met8,met9,met10,met11,met12,met13,met14,met15,met16,met17,met18,met19,met20,met21,met22,met23;
	public static int[] resultados;
	static int i=1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					board frame = new board();
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
	public board() {
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		met0 = new JLabel("");
		met0.setIcon(new ImageIcon(board.class.getResource("/images/metd.png")));
		met0.setBounds(-14, 517, 121, 133);
		contentPane.add(met0);
		
		rex0 = new JLabel("");
		rex0.setIcon(new ImageIcon(board.class.getResource("/images/rexd.png")));
		rex0.setBounds(61, 620, 121, 133);
		contentPane.add(rex0);
		
		met1 = new JLabel("");
		met1.setIcon(new ImageIcon(board.class.getResource("/images/metd.png")));
		met1.setBounds(250, 404, 121, 133);
		met1.setVisible(false);
		contentPane.add(met1);
		
		rex1 = new JLabel("");
		rex1.setIcon(new ImageIcon(board.class.getResource("/images/rexd.png")));
		rex1.setBounds(285, 503, 121, 133);
		rex1.setVisible(false);
		contentPane.add(rex1);
		
		met2 = new JLabel("");
		met2.setIcon(new ImageIcon(board.class.getResource("/images/metd.png")));
		met2.setBounds(406, 429, 121, 133);
		met2.setVisible(false);
		contentPane.add(met2);
		
		rex2 = new JLabel("");
		rex2.setIcon(new ImageIcon(board.class.getResource("/images/rexd.png")));
		rex2.setBounds(406, 474, 121, 133);
		rex2.setVisible(false);
		contentPane.add(rex2);
		
		met3 = new JLabel("");
		met3.setIcon(new ImageIcon(board.class.getResource("/images/metd.png")));
		met3.setBounds(517, 418, 121, 133);
		met3.setVisible(false);
		contentPane.add(met3);
		
		rex3 = new JLabel("");
		rex3.setIcon(new ImageIcon(board.class.getResource("/images/rexd.png")));
		rex3.setBounds(540, 493, 121, 133);
		rex3.setVisible(false);
		contentPane.add(rex3);
		
		met4 = new JLabel("");
		met4.setIcon(new ImageIcon(board.class.getResource("/images/metd.png")));
		met4.setBounds(648, 453, 121, 133);
		met4.setVisible(false);
		contentPane.add(met4);
		
		rex4 = new JLabel("");
		rex4.setIcon(new ImageIcon(board.class.getResource("/images/rexd.png")));
		rex4.setBounds(648, 537, 121, 133);
		rex4.setVisible(false);
		contentPane.add(rex4);
		
		met5 = new JLabel("");
		met5.setIcon(new ImageIcon(board.class.getResource("/images/metd.png")));
		met5.setBounds(752, 503, 121, 133);
		met5.setVisible(false);
		contentPane.add(met5);
		
		rex5 = new JLabel("");
		rex5.setIcon(new ImageIcon(board.class.getResource("/images/rexd.png")));
		rex5.setBounds(752, 571, 121, 133);
		rex5.setVisible(false);
		contentPane.add(rex5);
		
		met6 = new JLabel("");
		met6.setIcon(new ImageIcon(board.class.getResource("/images/metd.png")));
		met6.setBounds(848, 493, 121, 133);
		met6.setVisible(false);
		contentPane.add(met6);
		
		rex6 = new JLabel("");
		rex6.setIcon(new ImageIcon(board.class.getResource("/images/rexd.png")));
		rex6.setBounds(865, 599, 121, 133);
		rex6.setVisible(false);
		contentPane.add(rex6);
		
		met7 = new JLabel("");
		met7.setIcon(new ImageIcon(board.class.getResource("/images/metd.png")));
		met7.setBounds(929, 453, 121, 133);
		met7.setVisible(false);
		contentPane.add(met7);
		
		rex7 = new JLabel("");
		rex7.setIcon(new ImageIcon(board.class.getResource("/images/rexd.png")));
		rex7.setBounds(981, 558, 121, 133);
		rex7.setVisible(false);
		contentPane.add(rex7);
		
		met8 = new JLabel("");
		met8.setIcon(new ImageIcon(board.class.getResource("/images/meti.png")));
		met8.setBounds(1178, 311, 121, 133);
		met8.setVisible(false);
		contentPane.add(met8);
		
		met9 = new JLabel("");
		met9.setIcon(new ImageIcon(board.class.getResource("/images/meti.png")));
		met9.setBounds(1062, 205, 121, 133);
		met9.setVisible(false);
		contentPane.add(met9);
		
		rex8 = new JLabel("");
		rex8.setIcon(new ImageIcon(board.class.getResource("/images/rexd.png")));
		rex8.setBounds(1086, 493, 121, 133);
		rex8.setVisible(false);
		contentPane.add(rex8);
		
		rex9 = new JLabel("");
		rex9.setIcon(new ImageIcon(board.class.getResource("/images/rexi.png")));
		rex9.setBounds(1043, 349, 121, 133);
		rex9.setVisible(false);
		contentPane.add(rex9);
		
		met10 = new JLabel("");
		met10.setIcon(new ImageIcon(board.class.getResource("/images/meti.png")));
		met10.setBounds(912, 150, 121, 133);
		met10.setVisible(false);
		contentPane.add(met10);
		
		rex10 = new JLabel("");
		rex10.setIcon(new ImageIcon(board.class.getResource("/images/rexi.png")));
		rex10.setBounds(929, 247, 121, 133);
		rex10.setVisible(false);
		contentPane.add(rex10);
		
		met11 = new JLabel("");
		met11.setIcon(new ImageIcon(board.class.getResource("/images/meti.png")));
		met11.setBounds(779, 150, 121, 133);
		met11.setVisible(false);
		contentPane.add(met11);
		
		rex11 = new JLabel("");
		rex11.setIcon(new ImageIcon(board.class.getResource("/images/rexi.png")));
		rex11.setBounds(763, 214, 121, 133);
		rex11.setVisible(false);
		contentPane.add(rex11);
		
		met12 = new JLabel("");
		met12.setIcon(new ImageIcon(board.class.getResource("/images/meti.png")));
		met12.setBounds(648, 150, 121, 133);
		met12.setVisible(false);
		contentPane.add(met12);
		
		rex12 = new JLabel("");
		rex12.setIcon(new ImageIcon(board.class.getResource("/images/rexi.png")));
		rex12.setBounds(648, 229, 121, 133);
		rex12.setVisible(false);
		contentPane.add(rex12);
		
		met13 = new JLabel("");
		met13.setIcon(new ImageIcon(board.class.getResource("/images/meti.png")));
		met13.setBounds(527, 194, 121, 133);
		met13.setVisible(false);
		contentPane.add(met13);
		
		rex13 = new JLabel("");
		rex13.setIcon(new ImageIcon(board.class.getResource("/images/rexi.png")));
		rex13.setBounds(517, 273, 121, 133);
		rex13.setVisible(false);
		contentPane.add(rex13);
		
		met14 = new JLabel("");
		met14.setIcon(new ImageIcon(board.class.getResource("/images/meti.png")));
		met14.setBounds(406, 214, 121, 133);
		met14.setVisible(false);
		contentPane.add(met14);
		
		rex14 = new JLabel("");
		rex14.setIcon(new ImageIcon(board.class.getResource("/images/rexi.png")));
		rex14.setBounds(406, 311, 121, 133);
		rex14.setVisible(false);
		contentPane.add(rex14);
		
		
		met15 = new JLabel("");
		met15.setIcon(new ImageIcon(board.class.getResource("/images/meti.png")));
		met15.setBounds(319, 194, 121, 133);
		met15.setVisible(false);
		contentPane.add(met15);
		
		rex15 = new JLabel("");
		rex15.setIcon(new ImageIcon(board.class.getResource("/images/rexi.png")));
		rex15.setBounds(285, 291, 121, 133);
		rex15.setVisible(false);
		contentPane.add(rex15);
		
		met16 = new JLabel("");
		met16.setIcon(new ImageIcon(board.class.getResource("/images/metd.png")));
		met16.setBounds(61, 41, 121, 133);
		met16.setVisible(false);
		contentPane.add(met16);
		
		rex16 = new JLabel("");
		rex16.setIcon(new ImageIcon(board.class.getResource("/images/rexi.png")));
		rex16.setBounds(175, 229, 121, 133);
		rex16.setVisible(false);
		contentPane.add(rex16);
		
		met17 = new JLabel("");
		met17.setIcon(new ImageIcon(board.class.getResource("/images/metd.png")));
		met17.setBounds(162, -38, 121, 133);
		met17.setVisible(false);
		contentPane.add(met17);
		
		rex17 = new JLabel("");
		rex17.setIcon(new ImageIcon(board.class.getResource("/images/rexd.png")));
		rex17.setBounds(189, 106, 121, 133);
		rex17.setVisible(false);
		contentPane.add(rex17);
		
		met18 = new JLabel("");
		met18.setIcon(new ImageIcon(board.class.getResource("/images/metd.png")));
		met18.setBounds(340, -36, 121, 133);
		met18.setVisible(false);
		contentPane.add(met18);
		
		rex18 = new JLabel("");
		rex18.setIcon(new ImageIcon(board.class.getResource("/images/rexd.png")));
		rex18.setBounds(319, 0, 121, 133);
		rex18.setVisible(false);
		contentPane.add(rex18);
		
		met19 = new JLabel("");
		met19.setIcon(new ImageIcon(board.class.getResource("/images/metd.png")));
		met19.setBounds(450, -36, 121, 133);
		met19.setVisible(false);
		contentPane.add(met19);
		
		rex19 = new JLabel("");
		rex19.setIcon(new ImageIcon(board.class.getResource("/images/rexd.png")));
		rex19.setBounds(467, 0, 121, 133);
		rex19.setVisible(false);
		contentPane.add(rex19);
		
		met20 = new JLabel("");
		met20.setIcon(new ImageIcon(board.class.getResource("/images/metd.png")));
		met20.setBounds(581, -36, 121, 133);
		met20.setVisible(false);
		contentPane.add(met20);
		
		rex20 = new JLabel("");
		rex20.setIcon(new ImageIcon(board.class.getResource("/images/rexd.png")));
		rex20.setBounds(581, 6, 121, 133);
		rex20.setVisible(false);
		contentPane.add(rex20);
		
		met21 = new JLabel("");
		met21.setIcon(new ImageIcon(board.class.getResource("/images/metd.png")));
		met21.setBounds(725, 0, 121, 133);
		met21.setVisible(false);
		contentPane.add(met21);
		
		rex21 = new JLabel("");
		rex21.setIcon(new ImageIcon(board.class.getResource("/images/rexd.png")));
		rex21.setBounds(725, 24, 121, 133);
		rex21.setVisible(false);
		contentPane.add(rex21);
		
		met22 = new JLabel("");
		met22.setIcon(new ImageIcon(board.class.getResource("/images/metd.png")));
		met22.setBounds(831, -36, 121, 133);
		met22.setVisible(false);
		contentPane.add(met22);
		
		rex22 = new JLabel("");
		rex22.setIcon(new ImageIcon(board.class.getResource("/images/rexd.png")));
		rex22.setBounds(865, 70, 121, 133);
		rex22.setVisible(false);
		contentPane.add(rex22);
		
		met23 = new JLabel("");
		met23.setIcon(new ImageIcon(board.class.getResource("/images/metd.png")));
		met23.setBounds(944, -36, 121, 133);
		met23.setVisible(false);
		contentPane.add(met23);
		
		rex23 = new JLabel("");
		rex23.setIcon(new ImageIcon(board.class.getResource("/images/rexd.png")));
		rex23.setBounds(981, 24, 121, 133);
		rex23.setVisible(false);
		contentPane.add(rex23);
		
		JLabel board = new JLabel("");
		board.setIcon(new ImageIcon(board.class.getResource("/images/board.png")));
		board.setBounds(-14, 0, 1366, 768);
		contentPane.add(board);
	}
	}

