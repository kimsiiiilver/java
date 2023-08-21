package sec01;

import java.awt.*;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class test extends JFrame implements Runnable {

	private Thread thread;
	private JLabel label;

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new test();

	}

	public test() {
		setLayout((LayoutManager) new FlowLayout());
		label = new JLabel();
		label.setFont(new Font("Serif", Font.PLAIN, 20));

		if (thread == null) {
			// thread�� null�� ��쿡�� �Ʒ��� �ڵ带 �����մϴ�. �̴� �����尡 ���� ������� ���� ��쿡�� �����带 �����ϰ� �����ϱ�
			// �����Դϴ�.

			// this�� �ǹ̴� Runnable�� ������ ��ü�� ����(DigitalClock)
			thread = new Thread(this);
			thread.start();
		}
		add(label);
		// label�� �����ӿ� �߰��մϴ�. �̷ν� ������ �ð��� �ð��� ǥ�õǴ� ���� ȭ�鿡 ��Ÿ���ϴ�.
		setBounds(100, 100, 400, 100);
		// �������� ��ġ�� ũ�⸦ �����մϴ�. (100, 100)�� �������� ��ġ�� ��Ÿ����, (400, 100)�� �������� ���� ���̸� ��Ÿ���ϴ�.
		setVisible(true);
		// �������� ȭ�鿡 ǥ���մϴ�.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// �������� ���� �� ���α׷��� �����ϵ��� �����մϴ�.
	}

	public void run() {
		while (true) {
			Calendar cal = Calendar.getInstance();
			String lunarDate=calculateLunarDate(cal);
			String timeInfo = getTimeInfo(cal);
			String finalInfo = timeInfo + "<br>" + lunarDate;
            label.setText("<html>" + finalInfo + "</html>");
            
			// Calendar Ŭ������ getInstance() �޼��带 ����Ͽ� ���� �ð��� ��Ÿ���� cal ��ü�� �����մϴ�.
			String week = "";
			switch (cal.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				week = "��";
				break;
			case 2:
				week = "��";
				break;
			case 3:
				week = "ȭ";
				break;
			case 4:
				week = "��";
				break;
			case 5:
				week = "��";
				break;
			case 6:
				week = "��";
				break;
			case 7:
				week = "��";
				break;
			}
			String ampm = "���� ";
			if (cal.get(Calendar.AM_PM) == 1) {
				ampm = "���� ";
			}

			String now = "<html>" + cal.get(Calendar.YEAR) + "�� " + (cal.get(Calendar.MONTH) + 1) + "�� "
					+ cal.get(Calendar.DATE) + "�� " + week + "���� " + "<br>&nbsp;&nbsp;&nbsp;&nbsp;" + ampm
					+ cal.get(Calendar.HOUR) + "�� " + cal.get(Calendar.MINUTE) + "�� " + cal.get(Calendar.SECOND) + "�� "
					+ "</html>";
			// cal ��ü���� ���� ����, ��, ��, ��, ��, �ʸ� ������ now ���ڿ��� �����մϴ�. �̷��� ������ ���ڿ��� ������ �ð��� ����
			// �ð��� ǥ���մϴ�.
			label.setText(now);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private String calculateLunarDate(Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);

		// ���� ���
		int lunarYear = year - 2000;
		int lunarMonth = (year - 2000) * 12 + month - 1;

		String lunarMonthStr = Integer.toString(lunarMonth);
		String lunarDayStr = Integer.toString(day);

		if (lunarMonthStr.length() == 1) {
			lunarMonthStr = "0" + lunarMonthStr;
		}
		if (lunarDayStr.length() == 1) {
			lunarDayStr = "0" + lunarDayStr;
		}

		return lunarYear + "�� " + lunarMonthStr + "�� " + lunarDayStr + "��";
	}
	private String getTimeInfo(Calendar cal) {
        String week = "";
        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                week = "��";
                break;
            case 2:
                week = "��";
                break;
            case 3:
                week = "ȭ";
                break;
            case 4:
                week = "��";
                break;
            case 5:
                week = "��";
                break;
            case 6:
                week = "��";
                break;
            case 7:
                week = "��";
                break;
        }

        String amPm = "���� ";
        if (cal.get(Calendar.AM_PM) == 1) {
            amPm = "���� ";
        }

        return cal.get(Calendar.YEAR) + "�� " + (cal.get(Calendar.MONTH) + 1) + "�� "
                + cal.get(Calendar.DATE) + "�� " + week + "���� " + "<br>&nbsp;&nbsp;&nbsp;&nbsp;" + amPm
                + cal.get(Calendar.HOUR) + "�� " + cal.get(Calendar.MINUTE) + "�� " + cal.get(Calendar.SECOND) + "��";
    }
}


