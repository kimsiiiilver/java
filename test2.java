package sec01;

import java.awt.*;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import com.ibm.icu.util.ChineseCalendar;

public class test2 extends JFrame implements Runnable {

	private Thread thread;
	private JLabel label;
	private JTextField textField;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JPanel contentPane;

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new test2();
	}

	public test2() {
		super();
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		setLayout(new FlowLayout());
		// label = new JLabel();

		textField2 = new JTextField() {
			@Override
			public void setBorder(Border border) {

			}
		};
		textField2.setBounds(86, 23, 180, 60);
		textField2.setBackground(new Color(0, 0, 0));
		textField2.setForeground(new Color(255, 0, 0));
		textField2.setFont(new Font("���� ���", Font.PLAIN, 40));

		textField = new JTextField() {
			@Override
			public void setBorder(Border border) {

			}
		};
		textField.setBackground(new Color(0, 0, 0));
		textField.setForeground(new Color(255, 0, 0));
		textField.setBounds(43, 108, 40, 21);

		textField3 = new JTextField() {
			@Override
			public void setBorder(Border border) {

			}
		};
		textField3.setForeground(new Color(255, 0, 0));
		textField3.setBackground(new Color(0, 0, 0));
		textField3.setFont(new Font("���� ���", Font.PLAIN, 25));
		textField3.setBounds(131, 97, 130, 33);

		textField4 = new JTextField() {
			@Override
			public void setBorder(Border border) {

			}
		};
		textField4.setText("\u25CF");
		textField4.setForeground(new Color(255, 0, 0));
		textField4.setBackground(new Color(0, 0, 0));

		textField5 = new JTextField() {
			@Override
			public void setBorder(Border border) {

			}
		};
		textField5.setText("\u25CF");
		textField5.setForeground(new Color(255, 0, 0));
		textField5.setBackground(new Color(0, 0, 0));

		textField6 = new JTextField() {
			@Override
			public void setBorder(Border border) {

			}
		};
		textField6.setForeground(new Color(0, 128, 64));
		textField6.setFont(new Font("���� ���", Font.PLAIN, 20));
		textField6.setBounds(131, 140, 130, 32);
		textField6.setBackground(new Color(0, 0, 0));

		if (thread == null) {
			// thread�� null�� ��쿡�� �Ʒ��� �ڵ带 ����. �̴� �����尡 ���� ������� ���� ��쿡�� �����带 �����ϰ� �����ϱ� ����
			thread = new Thread(this);
			thread.start();
		}

		// label�� �����ӿ� �߰��մϴ�. �̷ν� ������ �ð��� �ð��� ǥ�õǴ� ���� ȭ�鿡 ��Ÿ���ϴ�.
		setBounds(100, 100, 300, 300);
		// �������� ��ġ�� ũ�⸦ �����մϴ�. (100, 100)�� �������� ��ġ�� ��Ÿ����, (400, 150)�� �������� ���� ���̸� ��Ÿ���ϴ�.
		setVisible(true);
		// �������� ȭ�鿡 ǥ���մϴ�.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// �������� ���� �� ���α׷��� �����ϵ��� �����մϴ�.

		lblNewLabel = new JLabel("JAVAPROJECT");
		lblNewLabel.setFont(new Font("���� ���", Font.BOLD, 10));
		lblNewLabel.setBounds(211, 0, 83, 25);
		add(lblNewLabel);

		lblNewLabel_1 = new JLabel("\uB144\uB3C4");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(86, 105, 31, 27);
		add(lblNewLabel_1);

		lblNewLabel_4 = new JLabel("\uC77C   \uC6D4   \uD654   \uC218   \uBAA9   \uAE08   \uD1A0");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("���� ���", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(23, 196, 238, 25);
		add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("\uC624\uC804");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(23, 43, 57, 15);
		add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("\uC624\uD6C4");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(23, 68, 57, 15);
		add(lblNewLabel_6);

		lblNewLabel_10 = new JLabel("\uC74C\uB825");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setBounds(86, 149, 31, 25);
		add(lblNewLabel_10);

		add(textField);
		textField.setColumns(10);

		add(textField2);
		textField2.setColumns(10);

		add(textField3);
		textField3.setColumns(10);

		add(textField4);
		textField4.setColumns(10);
		add(textField5);

		add(textField6);

	}

	public void run() {
		while (true) {
			Calendar cal = Calendar.getInstance();

			String yearInfo = getYEARInfo(cal);
			String realTime = getrealTime(cal);
			String dateInfo = getDateInfo(cal);
			// String finalInfo = timeInfo + "<br>" + lunarDate;

			textField.setText(yearInfo);
			textField2.setText(realTime);
			textField3.setText(dateInfo);
			if (getAmPmInfo(cal) == 1) {
				textField4.setBounds(53, 65, 27, 21); // pm
			} else {
				textField4.setBounds(53, 40, 27, 21); // am
			}

			getDay(cal);

			textField6.setText(calculateLunarDate(cal));

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private String calculateLunarDate(Calendar cal) {
		ChineseCalendar chinaCal = new ChineseCalendar();

		int Tyear = cal.get(1);
		int Tmonth = (cal.get(2) + 1);
		int Tday = cal.get(5);

		cal.set(Calendar.YEAR, Tyear);
		cal.set(Calendar.MONTH, Tmonth);
		cal.set(Calendar.DAY_OF_MONTH, Tday);
		chinaCal.setTimeInMillis(cal.getTimeInMillis());

		int chinaYY = chinaCal.get(ChineseCalendar.EXTENDED_YEAR) - 2637;
		int chinaMM = chinaCal.get(ChineseCalendar.MONTH);
		int chinaDD = chinaCal.get(ChineseCalendar.DAY_OF_MONTH) - 1;

		String chinaDate = ""; // ���� ��¥
		// chinaDate += chinaYY ; // ��
		// chinaDate += "�� " ; // ���� ������

		if (chinaMM < 10) // ��
			chinaDate += "0" + Integer.toString(chinaMM);
		else
			chinaDate += Integer.toString(chinaMM);

		chinaDate += "�� "; // ��¥ ������

		if (chinaDD < 10) // ��
			chinaDate += "0" + Integer.toString(chinaDD);
		else
			chinaDate += Integer.toString(chinaDD);

		chinaDate += "��";
		// System.out.println(chinaDate + "�� ") ;

		return chinaDate;
	}

	private String getYEARInfo(Calendar cal) {
		return "" + cal.get(Calendar.YEAR);
	}

	private String getrealTime(Calendar cal) {
		return "" + cal.get(Calendar.HOUR) + "�� " + cal.get(Calendar.MINUTE) + "�� ";
	}

	private String getDateInfo(Calendar cal) {
		return "" + (cal.get(Calendar.MONTH) + 1) + "�� " + cal.get(Calendar.DATE) + "�� ";
	}

	private int getAmPmInfo(Calendar cal) {
		return cal.get(Calendar.AM_PM);
	}

	private void getDay(Calendar cal) {
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			textField5.setBounds(23, 219, 27, 21);
			break;
		case 2:
			textField5.setBounds(60, 219, 27, 21);
			break;
		case 3:
			textField5.setBounds(95, 219, 27, 21);
			break;
		case 4:
			textField5.setBounds(130, 219, 27, 21);
			break;
		case 5:
			textField5.setBounds(167, 219, 27, 21);
			break;
		case 6:
			textField5.setBounds(205, 219, 27, 21);
			break;
		case 7:
			textField5.setBounds(240, 219, 27, 21);
			break;
		}
	}

}
