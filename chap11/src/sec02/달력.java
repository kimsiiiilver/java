package sec02;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class 달력 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요");
		int year = s.nextInt();
		
		System.out.println("월을 입력하세요");
		int month = s.nextInt();
		
		
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		
		start.set(year, month-1, 1);
		//시작 월 세팅, month-1을 해줘야 정확한 월을 인식함, 날짜는 1일로 세팅
		end.set(year, month,1 );
		//끝나는 월 세팅, 입력한 다음달의 1일로 세팅하고
		end.set(Calendar.DATE, -1);
		//마지막 날짜를 입력한 달에서 1을 뺀 날짜로 세팅
		
		
		
		System.out.println("");
		System.out.println("========["+month+"월]========");
		System.out.println(" 일 월 화 수 목 금 토");
		
		int dayweek = start.get(Calendar.DAY_OF_WEEK);
		
		//요일 번호 추출 일요일1 토요일7
		for(int i=1; i<dayweek; i++) {
			System.out.print("   ");
		} //요일 번호에 해당하는 만큼 공백 추가(1자리에 3칸)
		
		//j는 요일 표시
		for(int i=1, j=dayweek; i <=end.get(Calendar.DATE); i++, j++) {
			System.out.printf("%3d", i);
			//정렬을 위해 3자리에 맞춰서 날짜 출력(2자리는 날짜, 1자리는 사이 여백)
			
			if(j%7==0) { //요일 번호가 7 토요일이면 줄 바꿈
				System.out.println();
			}
			
			
		}
		

	}

}
