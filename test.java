package sec01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class test extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300,300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("JAVAPROJECT");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 10));
		lblNewLabel.setBounds(211, 0, 83, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uB144\uB3C4");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(86, 105, 31, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("08 \uC6D4  21 \uC77C");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(131, 97, 130, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("\uC77C   \uC6D4   \uD654   \uC218   \uBAA9   \uAE08   \uD1A0");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(23, 196, 238, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uC624\uC804");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(23, 43, 31, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\uC624\uD6C4");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(23, 68, 57, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_10 = new JLabel("\uC74C\uB825");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setBounds(86, 149, 31, 25);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("08 \uC6D4  07 \uC77C");
		lblNewLabel_11.setForeground(new Color(0, 128, 64));
		lblNewLabel_11.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		lblNewLabel_11.setBounds(131, 140, 130, 32);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_7 = new JLabel("09 : 22");
		lblNewLabel_7.setBackground(new Color(0, 0, 0));
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 45));
		lblNewLabel_7.setBounds(86, 23, 175, 60);
		contentPane.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(35, 108, 45, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("\u25CF");
		textField_1.setForeground(new Color(255, 0, 0));
		textField_1.setBackground(new Color(0, 0, 0));
		textField_1.setBounds(240, 216, 27, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
