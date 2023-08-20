package sec01;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DigitalClockApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        JLabel timeLabel = new JLabel();
        frame.add(timeLabel);

        frame.setVisible(true);

        updateTime(timeLabel);
    }

    private static void updateTime(JLabel timeLabel) {
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

        thread.start();
    }
}
