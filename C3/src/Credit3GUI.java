import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Credit3GUI {

	private JFrame frame;
	private JTextField LN;
	private JTextField FN;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credit3GUI window = new Credit3GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Credit3GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 0));
		panel.setBounds(0, 11, 434, 185);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel FNL = new JLabel("First Name");
		FNL.setForeground(Color.BLACK);
		FNL.setBounds(10, 27, 58, 39);
		panel.add(FNL);
		
		JLabel LNL = new JLabel("Last Name");
		LNL.setForeground(Color.BLACK);
		LNL.setBounds(10, 83, 58, 39);
		panel.add(LNL);
		
		LN = new JTextField();
		LN.setBounds(67, 92, 86, 20);
		panel.add(LN);
		LN.setColumns(10);
		
		FN = new JTextField();
		FN.setBounds(67, 36, 86, 20);
		panel.add(FN);
		FN.setColumns(10);
		
		JLabel Ag = new JLabel("Age");
		Ag.setForeground(Color.BLACK);
		Ag.setBounds(10, 135, 58, 39);
		panel.add(Ag);
		
		
		JLabel dis = new JLabel("");
		dis.setBounds(10, 205, 368, 45);
		frame.getContentPane().add(dis);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(67, 144, 86, 20);
		panel.add(textField_2);
		
		JButton BN = new JButton("Submit");
		BN.setBackground(new Color(255, 105, 180));
		BN.setForeground(Color.MAGENTA);
		BN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String FNL = FN.getText();
				String LNL = LN.getText();
				
				dis.setText("First Name: "+ FNL + "Last Name: "+ LNL);
				
			}
		});
		BN.setBounds(274, 4, 121, 85);
		panel.add(BN);
		
		JButton RS = new JButton("RESET");
		RS.setBackground(new Color(255, 69, 0));
		RS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		RS.setForeground(Color.RED);
		RS.setBounds(274, 100, 121, 85);
		panel.add(RS);
		
		
	}
}
