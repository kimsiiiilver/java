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
			// thread가 null인 경우에만 아래의 코드를 실행합니다. 이는 스레드가 아직 실행되지 않은 경우에만 스레드를 생성하고 시작하기
			// 위함입니다.

			// this의 의미는 Runnable이 구현된 객체를 뜻함(DigitalClock)
			thread = new Thread(this);
			thread.start();
		}
		add(label);
		// label을 프레임에 추가합니다. 이로써 디지털 시계의 시간이 표시되는 라벨이 화면에 나타납니다.
		setBounds(100, 100, 400, 100);
		// 프레임의 위치와 크기를 설정합니다. (100, 100)은 프레임의 위치를 나타내고, (400, 100)은 프레임의 폭과 높이를 나타냅니다.
		setVisible(true);
		// 프레임을 화면에 표시합니다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 프레임이 닫힐 때 프로그램을 종료하도록 설정합니다.
	}

	public void run() {
		while (true) {
			Calendar cal = Calendar.getInstance();
			String lunarDate=calculateLunarDate(cal);
			String timeInfo = getTimeInfo(cal);
			String finalInfo = timeInfo + "<br>" + lunarDate;
            label.setText("<html>" + finalInfo + "</html>");
            
			// Calendar 클래스의 getInstance() 메서드를 사용하여 현재 시간을 나타내는 cal 객체를 생성합니다.
			String week = "";
			switch (cal.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				week = "일";
				break;
			case 2:
				week = "월";
				break;
			case 3:
				week = "화";
				break;
			case 4:
				week = "수";
				break;
			case 5:
				week = "목";
				break;
			case 6:
				week = "금";
				break;
			case 7:
				week = "토";
				break;
			}
			String ampm = "오전 ";
			if (cal.get(Calendar.AM_PM) == 1) {
				ampm = "오후 ";
			}

			String now = "<html>" + cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 "
					+ cal.get(Calendar.DATE) + "일 " + week + "요일 " + "<br>&nbsp;&nbsp;&nbsp;&nbsp;" + ampm
					+ cal.get(Calendar.HOUR) + "시 " + cal.get(Calendar.MINUTE) + "분 " + cal.get(Calendar.SECOND) + "초 "
					+ "</html>";
			// cal 객체에서 현재 연도, 월, 일, 시, 분, 초를 가져와 now 문자열에 저장합니다. 이렇게 생성된 문자열은 디지털 시계의 현재
			// 시간을 표시합니다.
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

		// 음력 계산
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

		return lunarYear + "년 " + lunarMonthStr + "월 " + lunarDayStr + "일";
	}
	private String getTimeInfo(Calendar cal) {
        String week = "";
        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                week = "일";
                break;
            case 2:
                week = "월";
                break;
            case 3:
                week = "화";
                break;
            case 4:
                week = "수";
                break;
            case 5:
                week = "목";
                break;
            case 6:
                week = "금";
                break;
            case 7:
                week = "토";
                break;
        }

        String amPm = "오전 ";
        if (cal.get(Calendar.AM_PM) == 1) {
            amPm = "오후 ";
        }

        return cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 "
                + cal.get(Calendar.DATE) + "일 " + week + "요일 " + "<br>&nbsp;&nbsp;&nbsp;&nbsp;" + amPm
                + cal.get(Calendar.HOUR) + "시 " + cal.get(Calendar.MINUTE) + "분 " + cal.get(Calendar.SECOND) + "초";
    }
}


