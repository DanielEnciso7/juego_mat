package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class problem extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public JLabel imagen2, imagen1, imagen3, label_2;
	public int opcion;
	public JRadioButton radioButton, radioButton_1,radioButton_2;
	public int i=1;
	public static int emp;
	static board tablero=new board();
	public ButtonGroup grupo;
	static inicio dialog = new inicio();
	public static int correcto=0, incorrecto=0;
	public static String numero1, numero2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
					problem frame = new problem();
					tablero.setVisible(true);
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
	public problem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_1 = new JLabel("Encuentra la derivada de:");
		label_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		label_1.setBounds(137, 78, 231, 19);
		contentPane.add(label_1);
		
		label_2 = new JLabel("");
		label_2.setForeground(new Color(0, 0, 128));
		label_2.setFont(new Font("Century Gothic", Font.BOLD, 23));
		label_2.setBounds(162, 108, 149, 57);
		label_2.setIcon(new ImageIcon(problem.class.getResource("/images/ejem1.png")));
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(problem.class.getResource("/images/dinoazul.png")));
		label_3.setBounds(313, 179, 335, 444);
		contentPane.add(label_3);
		
		
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				if(i==1)
				{
					if (radioButton.isSelected())
					{
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met1.setVisible(true);
						incorrecto++;
						
						i++;
						
						
						
					}
					else if(radioButton_1.isSelected())
					{
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex1.setVisible(true);
						correcto++;
						
						i++;
						
						
					}
					else if(radioButton_2.isSelected())
					{
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met1.setVisible(true);
						incorrecto++;
						
						i++;
						
						
					}
					
					grupo.clearSelection();
					
				}
				
				if(i==2)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/images/ejem2.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/images/error2.1.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/images/error2.2.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/images/res2.png")));
					
					if (radioButton.isSelected())
					{
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met2.setVisible(true);
						incorrecto++;
						
						i++;
						
						
					}
					else if(radioButton_1.isSelected())
					{
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met2.setVisible(true);
						incorrecto++;
						i++;
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex2.setVisible(true);
						correcto++;
						i++;
						
						
					}
					grupo.clearSelection();
					
				}
				if(i==3)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/images/ejem3.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/images/res3.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/images/error3.1.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/images/error3.2.png")));
					
					if (radioButton.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex3.setVisible(true);
						correcto++;
						i++;
						
						
					}
					else if(radioButton_1.isSelected())
					{
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met3.setVisible(true);
						incorrecto++;
						i++;
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met3.setVisible(true);
						incorrecto++;
						i++;
						
						
						
					}
					grupo.clearSelection();
					
					
				}
				
				if(i==4)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema4/ejem1.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema4/res1.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema4/error1.1.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema4/error1.2.png")));
					
					if (radioButton.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex4.setVisible(true);
						correcto++;
						i++;
						
						
					}
					else if(radioButton_1.isSelected())
					{
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met4.setVisible(true);
						incorrecto++;
						i++;
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met4.setVisible(true);
						incorrecto++;
						i++;
						
						
						
					}
					grupo.clearSelection();
					
					
				}
				if(i==5)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema5/ejem2.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema5/erroe2.1.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema5/erroe2.2.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema5/res2.png")));
					
					if (radioButton.isSelected())
					{
						
						
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met5.setVisible(true);
						incorrecto++;
						i++;
						
						
					}
					else if(radioButton_1.isSelected())
					{
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met5.setVisible(true);
						incorrecto++;
						i++;
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex5.setVisible(true);
						correcto++;
						i++;
						
						
					}
					grupo.clearSelection();
					
					
				}
				
				if(i==6)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema6/ejem3.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema6/ejem3.1.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema6/res3.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema6/ejem3.2.png")));
					
					if (radioButton.isSelected())
					{
						

						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met6.setVisible(true);
						incorrecto++;
						i++;
						
						
					}
					else if(radioButton_1.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex6.setVisible(true);
						correcto++;
						i++;
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met6.setVisible(true);
						incorrecto++;
						i++;
						
						
					}
					grupo.clearSelection();
					
					
				}
				
				if(i==7)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema7/ejem1.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema7/error1.1.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema7/error1.2.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema7/res1.png")));
					
					if (radioButton.isSelected())
					{
						

						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met7.setVisible(true);
						incorrecto++;
						i++;
						
						
					}
					else if(radioButton_1.isSelected())
					{
						
						
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met7.setVisible(true);
						incorrecto++;
						i++;
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex7.setVisible(true);
						correcto++;
						i++;
						
						
					}
					grupo.clearSelection();
					
					
				}
				
				if(i==8)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema8/ejem2.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema8/res2.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema8/error2.1.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema8/error2.2.png")));
					
					if (radioButton.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex8.setVisible(true);
						correcto++;
						i++;
						
						
						
					}
					else if(radioButton_1.isSelected())
					{
						
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met8.setVisible(true);
						incorrecto++;
						i++;
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met8.setVisible(true);
						incorrecto++;
						i++;
						
						
					}
					grupo.clearSelection();
					
					
				}
				
				if(i==9)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema9/ejem3.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema9/error3.1.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema9/error3.2.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema9/res3.png")));
					
					if (radioButton.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met9.setVisible(true);
						incorrecto++;
						i++;
						
						
						
					}
					else if(radioButton_1.isSelected())
					{
						
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met9.setVisible(true);
						incorrecto++;
						i++;
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex9.setVisible(true);
						correcto++;
						i++;
						
						
					}
					grupo.clearSelection();
					
					
				}
				
				if(i==10)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema10/ejem1.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema10/error1.1.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema10/res1.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema10/error1.2.png")));
					
					if (radioButton.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met10.setVisible(true);
						incorrecto++;
						i++;
						
						
						
					}
					else if(radioButton_1.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex10.setVisible(true);
						correcto++;
						i++;
						
						
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met10.setVisible(true);
						incorrecto++;
						i++;
						
						
						
					}
					grupo.clearSelection();
					
				}
				
				if(i==11)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema11/ejem2.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema11/error2.1.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema11/res2.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema11/error2.2.png")));
					
					if (radioButton.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met11.setVisible(true);
						incorrecto++;
						i++;
						
						
						
					}
					else if(radioButton_1.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex11.setVisible(true);
						correcto++;
						i++;
						
						
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met11.setVisible(true);
						incorrecto++;
						i++;
						
						
						
					}
					grupo.clearSelection();
					
				}
				
				if(i==12)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema12/ejem3.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema12/res3.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema12/error3.1.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema12/error3.2.png")));
					
					if (radioButton.isSelected())
					{
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex12.setVisible(true);
						correcto++;
						i++;
						
						
						
						
					}
					else if(radioButton_1.isSelected())
					{
						
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met12.setVisible(true);
						incorrecto++;
						i++;
						
						
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met12.setVisible(true);
						incorrecto++;
						i++;
						
						
						
					}
					grupo.clearSelection();
					
				}
				
				if(i==13)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema13/ejem1.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema13/error1.1.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema13/res1.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema13/error1.2.png")));
					
					if (radioButton.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met13.setVisible(true);
						incorrecto++;
						i++;
						
						
						
					}
					else if(radioButton_1.isSelected())
					{
						
						
						
						
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex13.setVisible(true);
						correcto++;
						i++;
						
						
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met13.setVisible(true);
						incorrecto++;
						i++;
						
						
						
					}
					grupo.clearSelection();
					
				}
				
				if(i==14)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema14/ejem2.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema14/error2.1.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema14/error2.2.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema14/res2.png")));
					
					if (radioButton.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met14.setVisible(true);
						incorrecto++;
						i++;
						
						
						
					}
					else if(radioButton_1.isSelected())
					{
						
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met14.setVisible(true);
						incorrecto++;
						i++;
						
						
						
						
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex14.setVisible(true);
						correcto++;
						i++;
						
						
						
						
						
					}
					grupo.clearSelection();
					
				}
				
				if(i==15)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema15/ejem3.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema15/res3.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema15/error3.1.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema15/error3.2.png")));
					
					if (radioButton.isSelected())
					{
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex15.setVisible(true);
						correcto++;
						i++;
						
			
					}
					else if(radioButton_1.isSelected())
					{
						
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met15.setVisible(true);
						incorrecto++;
						i++;
						
				
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met15.setVisible(true);
						incorrecto++;
						i++;
						
					
					}
					grupo.clearSelection();
					
				}
				
				if(i==16)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema16/ejem1.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema16/error1.1.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema16/error1.2.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema16/res1.png")));
					
					if (radioButton.isSelected())
					{
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met16.setVisible(true);
						incorrecto++;
						i++;
						
			
					}
					else if(radioButton_1.isSelected())
					{
						
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met16.setVisible(true);
						incorrecto++;
						i++;
						
				
						
					}
					else if(radioButton_2.isSelected())
					{
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex16.setVisible(true);
						correcto++;
						i++;
						
						
						
					
					}
					grupo.clearSelection();
					
				}
				
				if(i==17)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema17/ejem2.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema17/error2.1.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema17/error2.1.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema17/res2.png")));
					
					if (radioButton.isSelected())
					{
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met17.setVisible(true);
						incorrecto++;
						i++;
						
			
					}
					else if(radioButton_1.isSelected())
					{
						
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met17.setVisible(true);
						incorrecto++;
						i++;
						
				
						
					}
					else if(radioButton_2.isSelected())
					{
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex17.setVisible(true);
						correcto++;
						i++;
						
						
						
					
					}
					grupo.clearSelection();
					
				}
				
				if(i==18)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema18/ejem3.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema18/error3.2.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema18/res3.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema18/error3.1.png")));
					
					if (radioButton.isSelected())
					{
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met18.setVisible(true);
						incorrecto++;
						i++;
						
			
					}
					else if(radioButton_1.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex18.setVisible(true);
						correcto++;
						i++;
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met18.setVisible(true);
						incorrecto++;
						i++;
						
						
					
					}
					grupo.clearSelection();
					
				}
				
				if(i==19)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema19/ejem2.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema19/res2.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema19/error2.1.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema19/error2.2.png")));
					
					if (radioButton.isSelected())
					{
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex19.setVisible(true);
						correcto++;
						i++;
						
			
					}
					else if(radioButton_1.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met19.setVisible(true);
						incorrecto++;
						i++;
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met19.setVisible(true);
						incorrecto++;
						i++;
						
						
					
					}
					grupo.clearSelection();
					
				}
				
				if(i==20)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema20/ejem2.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema20/res2.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema20/error2.1.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema20/error2.2.png")));
					
					if (radioButton.isSelected())
					{
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex20.setVisible(true);
						correcto++;
						i++;
						
			
					}
					else if(radioButton_1.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met20.setVisible(true);
						incorrecto++;
						i++;
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met20.setVisible(true);
						incorrecto++;
						i++;
						
						
					
					}
					grupo.clearSelection();
					
				}
				
				if(i==21)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema21/ejem3.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema21/error3.1.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema21/res3.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema21/error3.2.png")));
					
					if (radioButton.isSelected())
					{
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex21.setVisible(true);
						correcto++;
						i++;
						
			
					}
					else if(radioButton_1.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met21.setVisible(true);
						incorrecto++;
						i++;
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met21.setVisible(true);
						incorrecto++;
						i++;
						
						
					
					}
					grupo.clearSelection();
					
				}
				
				if(i==22)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema22/ejem2.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema22/error2.1.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema22/error2.2.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema22/res2.png")));
					
					if (radioButton.isSelected())
					{
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex22.setVisible(true);
						correcto++;
						i++;
						
			
					}
					else if(radioButton_1.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met22.setVisible(true);
						incorrecto++;
						i++;
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met22.setVisible(true);
						incorrecto++;
						i++;
						
						
					
					}
					grupo.clearSelection();
					
				}
				if(i==23)
				{
					label_2.setIcon(new ImageIcon(problem.class.getResource("/problema23/ejem2.png")));
					imagen1.setIcon(new ImageIcon(problem.class.getResource("/problema23/erro2.2.png")));
					imagen2.setIcon(new ImageIcon(problem.class.getResource("/problema23/res2.png")));
					imagen3.setIcon(new ImageIcon(problem.class.getResource("/problema23/error2.1.png")));
					
					if (radioButton.isSelected())
					{
						JOptionPane.showMessageDialog(null, "¡Correcto!");
						
						tablero.rex23.setVisible(true);
						correcto++;
						i++;
						
						
						inicio resultados=new inicio();
						resultados.setVisible(true);
						
			
					}
					else if(radioButton_1.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met23.setVisible(true);
						incorrecto++;
						i++;
						
						
						inicio resultados=new inicio();
						resultados.setVisible(true);
						
						
					}
					else if(radioButton_2.isSelected())
					{
						
						JOptionPane.showMessageDialog(null, "Incorrecto");
						
						tablero.met23.setVisible(true);
						incorrecto++;
						i++;
						
						
						inicio resultados=new inicio();
						resultados.setVisible(true);
						
						
					
					}
					grupo.clearSelection();
					
					
					
				}
				if(i==24)
				{
					numero1=Integer.toString(getresultado1());
					numero2=Integer.toString(getresultado2());
					dialog.correcto.setText(numero1);
					dialog.incorrecto.setText(numero2);
					dialog.setVisible(true);
				}
				
			}
		});
		btnComprobar.setBounds(362, 108, 89, 23);
		contentPane.add(btnComprobar);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(179, 176, 231, 117);
		contentPane.add(panel);
		
		radioButton = new JRadioButton("1");
		buttonGroup.add(radioButton);
		radioButton.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		radioButton.setBackground(Color.WHITE);
		radioButton.setBounds(0, 7, 33, 23);
		panel.add(radioButton);
		
		radioButton_1 = new JRadioButton("2");
		buttonGroup.add(radioButton_1);
		radioButton_1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		radioButton_1.setBackground(Color.WHITE);
		radioButton_1.setBounds(0, 33, 33, 23);
		panel.add(radioButton_1);
		
		radioButton_2 = new JRadioButton("3");
		buttonGroup.add(radioButton_2);
		radioButton_2.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		radioButton_2.setBackground(Color.WHITE);
		radioButton_2.setBounds(0, 59, 33, 23);
		panel.add(radioButton_2);
		
		
		imagen1 = new JLabel("");
		imagen1.setBounds(39, 7, 153, 30);
		panel.add(imagen1);
		imagen1.setIcon(new ImageIcon(problem.class.getResource("/images/def_error1.png")));
		
		imagen2 = new JLabel("");
		imagen2.setBounds(48, 33, 153, 30);
		panel.add(imagen2);
		imagen2.setIcon(new ImageIcon(problem.class.getResource("/images/def_res1.png")));
		
		
		imagen3 = new JLabel("");
		imagen3.setBounds(39, 65, 153, 30);
		panel.add(imagen3);
		imagen3.setIcon(new ImageIcon(problem.class.getResource("/images/def_error2.png")));
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(problem.class.getResource("/images/question.png")));
		label.setBounds(0, 0, 564, 379);
		contentPane.add(label);
		
		grupo=new ButtonGroup();
		grupo.add(radioButton);
		grupo.add(radioButton_1);
		grupo.add(radioButton_2);
		
		
		
		
	}
	
	
	
	public int getresultado1()
	{
		return this.correcto;
		
	}
	
	public int getresultado2()
	{
		return this.incorrecto;
		
	}
	
	
}
