package sec01;

import java.awt.*;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class test extends JFrame implements Runnable{
	
	private Thread thread;
	private JLabel label;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame.setDefaultLookAndFeelDecorated(true);
		new test();

	}
	
	public test() {
		super();
		setLayout((LayoutManager) new FlowLayout());
		label = new JLabel();
		label.setFont(new Font("Serif",Font.PLAIN, 20));
		
		if(thread == null){
            //thread가 null인 경우에만 아래의 코드를 실행합니다. 이는 스레드가 아직 실행되지 않은 경우에만 스레드를 생성하고 시작하기 위함입니다.

            //this의 의미는 Runnable이 구현된 객체를 뜻함(DigitalClock)
            thread = new Thread(this);
            thread.start();
        }
        add(label);
        //label을 프레임에 추가합니다. 이로써 디지털 시계의 시간이 표시되는 라벨이 화면에 나타납니다.
        setBounds(100,100,400,100);
        //프레임의 위치와 크기를 설정합니다. (100, 100)은 프레임의 위치를 나타내고, (400, 100)은 프레임의 폭과 높이를 나타냅니다.
        setVisible(true);
        //프레임을 화면에 표시합니다.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //프레임이 닫힐 때 프로그램을 종료하도록 설정합니다.
	}
	
	
	
	public void run(){
        while(true){
            Calendar cal = Calendar.getInstance();
            //Calendar 클래스의 getInstance() 메서드를 사용하여 현재 시간을 나타내는 cal 객체를 생성합니다.
            String now = cal.get(Calendar.YEAR)+"년"+
                    (cal.get(Calendar.MONTH)+1)+"월"+
                    cal.get(Calendar.DATE)+"일"+
                    cal.get(Calendar.HOUR)+"시"+
                    cal.get(Calendar.MINUTE)+"분"+
                    cal.get(Calendar.SECOND)+"초";
            //cal 객체에서 현재 연도, 월, 일, 시, 분, 초를 가져와 now 문자열에 저장합니다. 이렇게 생성된 문자열은 디지털 시계의 현재 시간을 표시합니다.
            label.setText(now);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
