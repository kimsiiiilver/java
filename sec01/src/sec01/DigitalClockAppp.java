package sec01;

import javax.swing.*;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import java.util.Calendar;

public class DigitalClockAppp {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 150);
		frame.setLayout(new FlowLayout());

		JLabel timeLabel = new JLabel();
		frame.add(timeLabel);

		frame.setVisible(true);

		updateTime1(timeLabel);
	}

	private static void updateTime1(JLabel timeLabel) {
		Thread thread = new Thread(() -> {
			while (true) {
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd EEE HH:mm:ss");
				String currentTime = dateFormat.format(new Date());
				timeLabel.setText(currentTime);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		thread.start();}
		
		private static void updateTime(JLabel timeLabel) {
	        Thread thread = new Thread(() -> {
	            while (true) {
	                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd EEE || HH:mm:ss");
	                Calendar calendar = Calendar.getInstance();

	                // 음력 달력, 공휴일 등 정보 설정
	                LunarCalendar lunarCalendar = new LunarCalendar();
	                String lunarInfo = getLunarInfo(lunarCalendar);
	                String holidayInfo = getHolidayInfo(calendar);

	                String currentTime = dateFormat.format(new Date());
	                String fullTime = currentTime + " " + lunarInfo + " " + holidayInfo;
	                timeLabel.setText(fullTime);

	                try {
	                    Thread.sleep(1000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        thread.start();
	    }

	    private static String getLunarInfo(LunarCalendar lunarCalendar) {
	        // 음력 정보를 가져와서 표시하는 로직 구현
	        return "...";
	    }

	    private static String getHolidayInfo(Calendar calendar) {
	        // 공휴일, 명절, 복날 등 정보를 가져와서 표시하는 로직 구현
	        return "...";
	    }
	}

	class LunarCalendar {
	    // 음력 달력 계산을 위한 클래스 정의
	    // (여기서는 단순히 클래스를 나타내는 예시입니다.)
	
	}
